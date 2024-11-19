/*
 * @ (#) enrollCourseId.java   1.0     16/11/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package vn.edu.iuh.fit.appelearingbe.ids;

/*
 * @description:
 * @author: Tuss Nguyen
 * @date: 16/11/2024
 * @version: 1.0
 */

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.edu.iuh.fit.appelearingbe.models.Course;
import vn.edu.iuh.fit.appelearingbe.models.Student;
import vn.edu.iuh.fit.appelearingbe.models.User;

import java.io.Serializable;

@EqualsAndHashCode
@Embeddable
@NoArgsConstructor
@Getter @Setter
public class EnrollCourseId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
