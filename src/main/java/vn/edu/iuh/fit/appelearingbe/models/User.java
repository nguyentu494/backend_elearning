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

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import vn.edu.iuh.fit.appelearingbe.enums.StatusUserFirstUpdate;

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
    @JsonIgnore
    private String email;
    @JsonIgnore
    private String password;
    private String avatar;
    private String description;
    private String phone;
    private String date_of_birth;
    private StatusUserFirstUpdate status;
    private String email_contact;

    public User(String name, String email, String password, String avatar, String description, String phone, String date_of_birth, StatusUserFirstUpdate status, String email_contact) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.avatar = avatar;
        this.description = description;
        this.phone = phone;
        this.date_of_birth = date_of_birth;
        this.status = status;
        this.email_contact = email_contact;
    }
}
