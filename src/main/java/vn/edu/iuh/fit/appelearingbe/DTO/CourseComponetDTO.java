/*
 * @ (#) CourseComponetDTO.java    1.0    11/22/2024
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

@Getter @Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class CourseComponetDTO {
    private Long courseId;
    private String courseName;
    private String courseImage;
    private String teacherName;
    private int totalFeedback;
    private Double rating;
    private String status;

    private String nameCategory;
    private int progress;
    private int totalLesson;
    private int totalLessonComplete;
    private int total_time_spent;

    private int totalStudent;
}
