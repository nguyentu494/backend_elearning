/*
 * @ (#) User.java   1.0     15/11/2024
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

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;
    private String name;
    private String email;
    private String password;
    private String avatar;
    private String description;
    private String phone;
    private LocalDateTime date_of_birth;

    public User(String name, String email, String password, String avatar, String description) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.avatar = avatar;
        this.description = description;
    }
}
