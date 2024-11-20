/*
 * @ (#) CourseDetail.java   1.0     20/11/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package vn.edu.iuh.fit.appelearingbe.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import vn.edu.iuh.fit.appelearingbe.models.Course;

/*
 * @description:
 * @author: Tuss Nguyen
 * @date: 20/11/2024
 * @version: 1.0
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CourseDetail {
    private Course course;
    private String teacherName;
    private int totalLesson;
    private int totalRegister;
}
