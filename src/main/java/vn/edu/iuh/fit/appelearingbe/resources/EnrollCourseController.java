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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.appelearingbe.repositories.EnrollCourseRepository;

@RestController
@RequestMapping("/api/enroll-course")
public class EnrollCourseController {

    @Autowired
    private EnrollCourseRepository enrollCourseRepository;

}
