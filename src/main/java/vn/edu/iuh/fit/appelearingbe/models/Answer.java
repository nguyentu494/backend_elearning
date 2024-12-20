/*
 * @ (#) Answer.java   1.0     15/11/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package vn.edu.iuh.fit.appelearingbe.models;

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
@Getter @Setter
@NoArgsConstructor
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
    @ManyToOne
    @JoinColumn(name = "user_id")
    @ToString.Exclude
    private User user;
    private String comment;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
}
