/*
 * @ (#) TeacherController.java   1.0     19/11/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package vn.edu.iuh.fit.appelearingbe.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.appelearingbe.DTO.TeacherComponentPopular;
import vn.edu.iuh.fit.appelearingbe.models.Course;
import vn.edu.iuh.fit.appelearingbe.models.Teacher;
import vn.edu.iuh.fit.appelearingbe.repositories.TeacherRepository;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * @description:
 * @author: Tuss Nguyen
 * @date: 19/11/2024
 * @version: 1.0
 */
@RestController
@RequestMapping("/api/v1/teachers")
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping
    public ResponseEntity<List<Teacher>> getAllTeachers() {
        return ResponseEntity.ok(teacherRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable Long id) {
        return teacherRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/popular")
    public ResponseEntity<List<TeacherComponentPopular>> getTeacherPopular() {
        // Lấy tất cả giáo viên
        List<Teacher> teachers = teacherRepository.findAll();

        // Tính rating trung bình cho từng giáo viên
        List<TeacherComponentPopular> teacherComponentPopularList = teachers.stream()
                .map(teacher -> {
                    // Tính trung bình rating các khóa học
                    double averageRating = teacher.getCourses().stream()
                            .mapToDouble(Course::getRating) // Lấy rating từ mỗi khóa học
                            .average()
                            .orElse(0.0); // Trả về 0.0 nếu giáo viên không có khóa học

                    // Làm tròn đến 1 chữ số thập phân
                    double roundedRating = BigDecimal.valueOf(averageRating)
                            .setScale(1, RoundingMode.HALF_UP)
                            .doubleValue();

                    // Tạo đối tượng TeacherComponentPopular
                    return new TeacherComponentPopular(
                            teacher.getId(),
                            teacher.getName(),
                            teacher.getAvatar(),
                            roundedRating,
                            teacher.getSchool()
                    );
                })
                .sorted(Comparator.comparingDouble(TeacherComponentPopular::getRating).reversed()) // Sắp xếp giảm dần theo rating
                .limit(5) // Lấy top 5
                .toList();

        // Trả về danh sách top 5 giáo viên
        return ResponseEntity.ok(teacherComponentPopularList);
    }
}