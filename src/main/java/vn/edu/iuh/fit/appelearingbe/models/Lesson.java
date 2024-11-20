/*
 * @ (#) Lesson.java   1.0     15/11/2024
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

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lesson_id")
    private Long id;
    @Column(name = "lesson_number")
    private Integer lessonNumber;
    private String title;
    private String url;
    private String time;
    private Long view;
    @ManyToOne
    @JoinColumn(name = "section_id")
    @JsonBackReference
    private Section section;
}
