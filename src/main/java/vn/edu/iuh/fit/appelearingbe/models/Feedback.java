/*
 * @ (#) Feedback.java   1.0     15/11/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package vn.edu.iuh.fit.appelearingbe.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/*
 * @description:
 * @author: Tuss Nguyen
 * @date: 15/11/2024
 * @version: 1.0
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feedback_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;

    @ManyToOne
    @JoinColumn(name = "course_id")
    @JsonBackReference
    private Course course;

    private String comment;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
}
