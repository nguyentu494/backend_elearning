/*
 * @ (#) StudentController.java    1.0    11/21/2024
 *
 *
 */

package vn.edu.iuh.fit.appelearingbe.resources;
/*
 * @Description:
 * @Author: Nguyen Thanh Thuan
 * @Date: 11/21/2024
 * @Version: 1.0
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.appelearingbe.models.Student;
import vn.edu.iuh.fit.appelearingbe.repositories.StudentRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(studentRepository.findAll());
    }
}
