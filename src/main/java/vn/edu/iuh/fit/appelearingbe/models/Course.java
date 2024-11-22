/*
 * @ (#) Course.java   1.0     15/11/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package vn.edu.iuh.fit.appelearingbe.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
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
@ToString
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Long id;
    private Double rating;
    private String image;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    private String title;
    private String description;
    private Double price;
    private int view;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonIgnoreProperties("courses")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties("courses")
    private Teacher teacher;

    private StatusCourse status;

    @OneToMany(mappedBy = "course")
    @JsonIgnoreProperties("course")
    @ToString.Exclude
    private List<Section> sections;

    @OneToMany(mappedBy = "course")
    @JsonIgnoreProperties("course")
    @ToString.Exclude
    private List<Feedback> feedbacks;

    @OneToMany(mappedBy = "id.course")
    @JsonIgnoreProperties("course")
    @ToString.Exclude
    private List<EnrollCourse> enrollCourses;
}