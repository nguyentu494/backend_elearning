/*
 * @ (#) Bill.java   1.0     15/11/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package vn.edu.iuh.fit.appelearingbe.models;

import jakarta.persistence.*;
import vn.edu.iuh.fit.appelearingbe.enums.StatusBill;
import vn.edu.iuh.fit.appelearingbe.ids.EnrollCourseId;

import java.time.LocalDate;
import java.time.LocalDateTime;

/*
 * @description:
 * @author: Tuss Nguyen
 * @date: 15/11/2024
 * @version: 1.0
 */
@Entity
public class Bill {
    @EmbeddedId
    private EnrollCourseId id;
    @ManyToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;
    private StatusBill status;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
}
