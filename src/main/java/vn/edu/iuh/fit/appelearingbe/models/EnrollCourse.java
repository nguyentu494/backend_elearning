/*
 * @ (#) EnrollCourse.java   1.0     15/11/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package vn.edu.iuh.fit.appelearingbe.models;

/*
 * @description:
 * @author: Tuss Nguyen
 * @date: 15/11/2024
 * @version: 1.0
 */

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.edu.iuh.fit.appelearingbe.ids.EnrollCourseId;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class EnrollCourse {
    @EmbeddedId
    @Column(name = "enroll_course_id")
    private EnrollCourseId id;
    private LocalDateTime enrolledDate;
    private int progress;
    private LocalDateTime completedDate;
}
