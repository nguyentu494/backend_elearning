/*
 * @ (#) Student.java   1.0     15/11/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package vn.edu.iuh.fit.appelearingbe.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@NoArgsConstructor
@Getter @Setter
@ToString
public class Student extends User{
    private String school;
    private String grade;

    @OneToMany(mappedBy = "id.student")
    @JsonIgnoreProperties("student")
    @ToString.Exclude
    private List<EnrollCourse> enrollCourses;
}
