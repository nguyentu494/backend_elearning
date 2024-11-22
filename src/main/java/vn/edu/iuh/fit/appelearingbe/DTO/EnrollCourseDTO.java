/*
 * @ (#) EnrollCourseDTO.java    1.0    11/22/2024
 *
 *
 */

package vn.edu.iuh.fit.appelearingbe.DTO;
/*
 * @Description:
 * @Author: Nguyen Thanh Thuan
 * @Date: 11/22/2024
 * @Version: 1.0
 *
 */

import lombok.*;
import vn.edu.iuh.fit.appelearingbe.models.Course;

import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EnrollCourseDTO {
    private Long studentId;
    private Course course;
    private LocalDateTime enrolledDate;
    private int progress;
    private LocalDateTime completedDate;
    private int totalLesson;
    private int totalLessonComplete;

}
