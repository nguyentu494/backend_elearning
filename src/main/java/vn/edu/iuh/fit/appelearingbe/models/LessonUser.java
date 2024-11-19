/*
 * @ (#) LessonUser.java   1.0     17/11/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package vn.edu.iuh.fit.appelearingbe.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.edu.iuh.fit.appelearingbe.enums.StatusLesson;
import vn.edu.iuh.fit.appelearingbe.ids.LessonUserId;

/*
 * @description:
 * @author: Tuss Nguyen
 * @date: 17/11/2024
 * @version: 1.0
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class LessonUser {
    @EmbeddedId

    private LessonUserId id;
    private StatusLesson status;
}
