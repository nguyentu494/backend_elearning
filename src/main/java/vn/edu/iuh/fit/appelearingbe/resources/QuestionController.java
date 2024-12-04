/*
 * @ (#) QuestionControllr.java   1.0     04/12/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package vn.edu.iuh.fit.appelearingbe.resources;

/*
 * @description:
 * @author: Tuss Nguyen
 * @date: 04/12/2024
 * @version: 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.appelearingbe.models.Question;
import vn.edu.iuh.fit.appelearingbe.repositories.QuestionRepository;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/questions")
public class QuestionController {
    @Autowired
    private QuestionRepository questionRepository;

    @PostMapping("/register")
    public ResponseEntity<Question> createQuestion(@RequestBody Question question) {
        System.out.println(question);
        Question question1 = new Question();
        return ResponseEntity.ok(question);
    }

}
