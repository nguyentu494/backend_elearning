/*
 * @ (#) Section.java   1.0     15/11/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package vn.edu.iuh.fit.appelearingbe.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

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
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "section_id")
    private Long id;
    @Column(name = "section_number")
    private Integer sectionNumber;
    private String title;
    @ManyToOne
    @JoinColumn(name = "course_id")
    @JsonBackReference
    private Course course;
    @OneToMany(mappedBy = "section")
    @JsonManagedReference
    @ToString.Exclude
    private List<Lesson> lessons;
}
