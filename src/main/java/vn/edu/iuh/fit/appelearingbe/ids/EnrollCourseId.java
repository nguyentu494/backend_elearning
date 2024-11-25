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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import vn.edu.iuh.fit.appelearingbe.models.Course;
import vn.edu.iuh.fit.appelearingbe.models.Student;
import vn.edu.iuh.fit.appelearingbe.models.User;

import java.io.Serializable;

@EqualsAndHashCode
@Embeddable
@NoArgsConstructor
@Getter @Setter
@AllArgsConstructor
@ToString
//@JsonIgnoreProperties({"student"})
public class EnrollCourseId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private Student student;
    @ManyToOne
    @JoinColumn(name = "course_id")
    @JsonBackReference
    private Course course;
}
