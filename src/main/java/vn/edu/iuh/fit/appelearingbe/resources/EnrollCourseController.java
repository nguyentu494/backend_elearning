/*
 * @ (#) EnrollCourseController.java    1.0    11/20/2024
 *
 *
 */

package vn.edu.iuh.fit.appelearingbe.resources;
/*
 * @Description:
 * @Author: Nguyen Thanh Thuan
 * @Date: 11/20/2024
 * @Version: 1.0
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.appelearingbe.DTO.EnrollCourseDTO;
import vn.edu.iuh.fit.appelearingbe.models.EnrollCourse;
import vn.edu.iuh.fit.appelearingbe.repositories.EnrollCourseRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/enroll-courses")
public class EnrollCourseController {

    @Autowired
    private EnrollCourseRepository enrollCourseRepository;

    @GetMapping
    public ResponseEntity<List<EnrollCourse>> getAllEnrollCourses() {
        return ResponseEntity.ok(enrollCourseRepository.findAll());
    }
}
