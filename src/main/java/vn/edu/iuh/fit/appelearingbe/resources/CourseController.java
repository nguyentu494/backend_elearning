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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.appelearingbe.DTO.CourseDetail;
import vn.edu.iuh.fit.appelearingbe.models.Course;
import vn.edu.iuh.fit.appelearingbe.repositories.CourseRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        return ResponseEntity.ok(courseRepository.findAll());
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
            System.out.println(detail);
            courseDetail.add(detail);
        });
        return ResponseEntity.ok(courseDetail);
    }

}
