/*
 * @ (#) BillController.java   1.0     26/11/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package vn.edu.iuh.fit.appelearingbe.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.appelearingbe.enums.StatusBill;
import vn.edu.iuh.fit.appelearingbe.enums.StatusLesson;
import vn.edu.iuh.fit.appelearingbe.ids.EnrollCourseId;
import vn.edu.iuh.fit.appelearingbe.ids.LessonUserId;
import vn.edu.iuh.fit.appelearingbe.models.*;
import vn.edu.iuh.fit.appelearingbe.repositories.*;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;

/*
 * @description:
 * @author: Tuss Nguyen
 * @date: 26/11/2024
 * @version: 1.0
 */
@RestController
@RequestMapping("/api/v1/bills")
public class BillController {

    @Autowired
    private BillRepository billRepository;
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private LessonUserRepository lessonUserRepository;
    @Autowired
    private EnrollCourseRepository enrollCourseRepository;

    @PostMapping
    public ResponseEntity<String> saveBill(@RequestBody Map<String, String> bill) {
        try {
//            Bill savedBill = billRepository.save(bill);
            System.out.println(bill.toString());
            long userId = Long.parseLong(bill.get("userId"));
            long courseId = Long.parseLong(bill.get("courseId"));
            String status = bill.get("status");
            String createdDate = bill.get("createdDate");
//            System.out.println(createdDate);
            Instant instant = Instant.parse(createdDate);
            LocalDateTime localDateTime = instant.atZone(ZoneOffset.UTC).toLocalDateTime();

//            System.out.println("Parsed LocalDateTime: " + localDateTime);
            EnrollCourseId enrollCourseId = new EnrollCourseId();

            Course course = courseRepository.findById(courseId);
//            System.out.println(course.toString());
            enrollCourseId.setCourse(course);
            Student student = studentRepository.findById(userId);
            enrollCourseId.setStudent(student);

            System.out.println(enrollCourseId);

            Bill savedBill = new Bill();
            long paymentId = Long.parseLong(bill.get("paymentId"));
            savedBill.setPayment(paymentRepository.findById(paymentId));
            savedBill.setId(enrollCourseId);
            savedBill.setStatus(status.equalsIgnoreCase("paid")? StatusBill.PAID: StatusBill.UNPAID);
            savedBill.setCreatedDate(localDateTime);
            System.out.println(savedBill.toString());
            billRepository.save(savedBill);

            EnrollCourse enrollCourse = new EnrollCourse();
            enrollCourse.setId(enrollCourseId);
            enrollCourse.setEnrolledDate(localDateTime);
            enrollCourse.setProgress(0);
            enrollCourseRepository.save(enrollCourse);

            List<Section> sections = course.getSections();
            for(Section section : sections) {
                List<Lesson> lessons = section.getLessons();
                for(Lesson lesson : lessons) {
                    LessonUser lessonUser = new LessonUser();
                    lessonUser.setId(new LessonUserId(lesson, student));
                    lessonUser.setStatus(StatusLesson.UNCOMPLETED);
                    lessonUserRepository.save(lessonUser);
                }
            }

            return ResponseEntity.status(HttpStatus.CREATED).body("Oke");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}