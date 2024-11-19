/*
 * @ (#) Course.java   1.0     15/11/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package vn.edu.iuh.fit.appelearingbe.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.edu.iuh.fit.appelearingbe.enums.StatusCourse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/*
 * @description:
 * @author: Tuss Nguyen
 * @date: 15/11/2024
 * @version: 1.0
 */
@Entity
@Getter @Setter
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Long id;
    private String rating;
    private String image;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    private String title;
    private String description;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Teacher teacher;

    private StatusCourse status;

    @OneToMany(mappedBy = "course")
    private List<Section> sections;

}