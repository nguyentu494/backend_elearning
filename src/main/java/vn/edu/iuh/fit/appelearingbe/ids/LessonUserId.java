/*
 * @ (#) UserLessonId.java   1.0     17/11/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package vn.edu.iuh.fit.appelearingbe.ids;

/*
 * @description:
 * @author: Tuss Nguyen
 * @date: 17/11/2024
 * @version: 1.0
 */

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.edu.iuh.fit.appelearingbe.models.Lesson;
import vn.edu.iuh.fit.appelearingbe.models.User;

import java.io.Serializable;

@EqualsAndHashCode
@Embeddable
@NoArgsConstructor
@Getter
@Setter
public class LessonUserId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
