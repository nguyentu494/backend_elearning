/*
 * @ (#) Teacher.java   1.0     15/11/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package vn.edu.iuh.fit.appelearingbe.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
public class Teacher extends User{
    private int experience;
    private String school;
    @OneToMany(mappedBy = "teacher")
    private List<Course> courses;
}
