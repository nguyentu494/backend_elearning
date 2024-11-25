/*
 * @ (#) CourseController.java   1.0     19/11/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package vn.edu.iuh.fit.appelearingbe.resources;

/*
 * @description:
 * @author: Tuss Nguyen
 * @date: 19/11/2024
 * @version: 1.0
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.appelearingbe.DTO.CourseComponetDTO;
import vn.edu.iuh.fit.appelearingbe.DTO.CourseDetail;
import vn.edu.iuh.fit.appelearingbe.enums.StatusLesson;
import vn.edu.iuh.fit.appelearingbe.models.Course;
import vn.edu.iuh.fit.appelearingbe.models.Lesson;
import vn.edu.iuh.fit.appelearingbe.models.Section;
import vn.edu.iuh.fit.appelearingbe.repositories.CourseRepository;
import vn.edu.iuh.fit.appelearingbe.repositories.EnrollCourseRepository;
import vn.edu.iuh.fit.appelearingbe.repositories.LessonRepository;
import vn.edu.iuh.fit.appelearingbe.repositories.SectionRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private SectionRepository sectionRepository;
    @Autowired
    private LessonRepository lessonRepository;
    @Autowired
    private EnrollCourseRepository enrollCourseRepository;

    @GetMapping
    public ResponseEntity<List<CourseComponetDTO>> getAllCategories() {
        List<CourseComponetDTO> courseComponetPopularDTOList = new ArrayList<>();
        List<Course> courses = courseRepository.findAll();
        courses.forEach(course -> {
            CourseComponetDTO courseComponetPopularDTO = new CourseComponetDTO();
            courseComponetPopularDTO.setCourseId(course.getId());
            courseComponetPopularDTO.setCourseName(course.getTitle());
            courseComponetPopularDTO.setCourseImage(course.getImage());
            courseComponetPopularDTO.setRating(course.getRating());
            courseComponetPopularDTO.setTeacherName(course.getTeacher().getName());
            courseComponetPopularDTO.setTotalFeedback(course.getFeedbacks().size());
            courseComponetPopularDTO.setStatus(course.getStatus().name().equals("HOT") ? "Hot" : course.getStatus().name().equals("NEW") ? "New" : course.getStatus().name().equals("BEST_SELLER") ? "Best Seller" : "");
            courseComponetPopularDTOList.add(courseComponetPopularDTO);
        });
        return ResponseEntity.ok(courseComponetPopularDTOList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable Long id) {
        return courseRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        return ResponseEntity.status(HttpStatus.CREATED).body(courseRepository.save(course));
    }

    @GetMapping("/top/{top}")
    public ResponseEntity<List<CourseDetail>> getTopCourses(@PathVariable int top) {
        List<CourseDetail> courseDetail = new ArrayList<>();
        List<Course> courses = courseRepository.findByRatingGreaterThanEqual((double) top);
        courses.forEach(course -> {
            CourseDetail detail = new CourseDetail();
            detail.setCourse(course);
            detail.setTeacherName(course.getTeacher().getName());
            List<Section> sections = sectionRepository.findByCourseId(course.getId());
            int totalSum = 0;
            int totalSeconds = 0;
            for (Section section : sections) {
                totalSum += lessonRepository.countBySectionId(section.getId());
                for (Lesson lesson : section.getLessons()) {
                    String[] timeParts = lesson.getTime().split(":");
                    int minutes = Integer.parseInt(timeParts[0]);
                    int seconds = Integer.parseInt(timeParts[1]);
                    totalSeconds += minutes + seconds/60;
                }
            }
            detail.setTotalLesson(totalSum);
            detail.setTotalRegister(enrollCourseRepository.countById_Course_Id(course.getId()));
            detail.setTotalMinutes(totalSeconds);
            courseDetail.add(detail);
        });
        return ResponseEntity.ok(courseDetail);
    }

    @GetMapping("/teacher/{id}")
    public ResponseEntity<List<Course>> getCourseByTeacher(@PathVariable Long id) {
        return ResponseEntity.ok(courseRepository.findByTeacherId(id));
    }

    @GetMapping("/search")
    public ResponseEntity<List<CourseDetail>> searchCourse(@RequestParam String name) {
        List<Course> courses = courseRepository.findTop9ByCategory_NameContainsIgnoreCaseOrTeacher_NameContainsIgnoreCaseOrTitleContainsIgnoreCase(name, name, name);
        List<CourseDetail> courseDetail = new ArrayList<>();
        courses.forEach(course -> {
            CourseDetail detail = new CourseDetail();
            detail.setCourse(course);
            detail.setTeacherName(course.getTeacher().getName());
            List<Section> sections = sectionRepository.findByCourseId(course.getId());
            int totalSum = 0;
            int totalSeconds = 0;
            for (Section section : sections) {
                totalSum += lessonRepository.countBySectionId(section.getId());
                for (Lesson lesson : section.getLessons()) {
                    String[] timeParts = lesson.getTime().split(":");
                    int minutes = Integer.parseInt(timeParts[0]);
                    int seconds = Integer.parseInt(timeParts[1]);
                    totalSeconds += minutes + seconds/60;
                }
            }
            detail.setTotalLesson(totalSum);
            detail.setTotalRegister(enrollCourseRepository.countById_Course_Id(course.getId()));
            detail.setTotalMinutes(totalSeconds);
            courseDetail.add(detail);
        });
        return ResponseEntity.ok(courseDetail);
    }
    @GetMapping("/popular")
    public ResponseEntity<List<CourseComponetDTO>> getCourseTop5() {
        List<CourseComponetDTO> courseComponetPopularDTOList = new ArrayList<>();
        List<Course> courses = courseRepository.findTop5ByOrderByViewDesc();
        courses.forEach(course -> {
            CourseComponetDTO courseComponetPopularDTO = new CourseComponetDTO();
            courseComponetPopularDTO.setCourseId(course.getId());
            courseComponetPopularDTO.setCourseName(course.getTitle());
            courseComponetPopularDTO.setCourseImage(course.getImage());
            courseComponetPopularDTO.setRating(course.getRating());
            courseComponetPopularDTO.setTeacherName(course.getTeacher().getName());
            courseComponetPopularDTO.setTotalFeedback(course.getFeedbacks().size());
            courseComponetPopularDTO.setStatus(course.getStatus().name().equals("HOT") ? "Hot" : course.getStatus().name().equals("NEW") ? "New" : course.getStatus().name().equals("BEST_SELLER") ? "Best Seller" : "");
            courseComponetPopularDTOList.add(courseComponetPopularDTO);
        });
        return ResponseEntity.ok(courseComponetPopularDTOList);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<List<CourseComponetDTO>> getCourseByStudent(@PathVariable Long id) {
        List<CourseComponetDTO> courseComponetDTOList = new ArrayList<>();
        List<Course> courses = courseRepository.findByEnrollCourses_Id_Student_Id(id);
        courses.forEach(course -> {
            CourseComponetDTO courseComponetDTO = new CourseComponetDTO();
            courseComponetDTO.setCourseId(course.getId());
            courseComponetDTO.setCourseName(course.getTitle());
            courseComponetDTO.setCourseImage(course.getImage());
            courseComponetDTO.setRating(course.getRating());
            courseComponetDTO.setNameCategory(course.getCategory().getName());
            courseComponetDTO.setTotal_time_spent(0);
            courseComponetDTO.setProgress(course.getEnrollCourses().stream().filter(enrollCourse ->
                    enrollCourse.getId().getCourse().getId().equals(course.getId()) && enrollCourse.getId().getStudent().getId() == id).findFirst().get().getProgress());
            courseComponetDTO.setTotalLesson(course.getSections()
                    .stream().reduce(0, (subtotal, section) ->
                            subtotal + section.getLessons().size(), Integer::sum));
            courseComponetDTO.setTotalLessonComplete(course.getSections().stream().mapToInt(section ->
                    (int) section.getLessons().stream().filter(lesson ->
                            lesson.getLessonUsers().stream().anyMatch(lessonUser ->
                                    (lessonUser.getId().getStudent().getId() == id && lessonUser.getStatus().equals(StatusLesson.COMPLETED))
                            )).count()).sum());
            courseComponetDTOList.add(courseComponetDTO);
        });
        return ResponseEntity.ok(courseComponetDTOList);
    }
}
