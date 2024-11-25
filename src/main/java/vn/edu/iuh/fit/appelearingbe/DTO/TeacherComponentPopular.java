/*
 * @ (#) TeacherComponentPopular.java    1.0    11/22/2024
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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TeacherComponentPopular {
    private Long teacherId;
    private String teacherName;
    private String teacherAvatar;
    private Double rating;
    private String school;
}
