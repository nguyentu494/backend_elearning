/*
 * @ (#) LessonUserController.java   1.0     22/11/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package vn.edu.iuh.fit.appelearingbe.resources;

/*
 * @description:
 * @author: Tuss Nguyen
 * @date: 22/11/2024
 * @version: 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.appelearingbe.enums.StatusLesson;
import vn.edu.iuh.fit.appelearingbe.ids.LessonUserId;
import vn.edu.iuh.fit.appelearingbe.models.Course;
import vn.edu.iuh.fit.appelearingbe.models.Lesson;
import vn.edu.iuh.fit.appelearingbe.models.LessonUser;
import vn.edu.iuh.fit.appelearingbe.models.Section;
import vn.edu.iuh.fit.appelearingbe.repositories.LessonRepository;
import vn.edu.iuh.fit.appelearingbe.repositories.LessonUserRepository;
import vn.edu.iuh.fit.appelearingbe.repositories.StudentRepository;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/lesson-user")
public class LessonUserController {
    @Autowired
    private LessonUserRepository lessonUserRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private LessonRepository lessonRepository;

    // Phương thức PUT để cập nhật status
    @PutMapping("/update-status")
    public ResponseEntity<String> updateStatus(@RequestBody Map<String, String> body) {
        String idLesson = body.get("lessonId");
        String idUser = body.get("userId");
//        String status = body.get("status");
        LessonUserId id = new LessonUserId(lessonRepository.findById(Long.parseLong(idLesson)), studentRepository.findById(Long.parseLong(idUser)));
        int lessonUser = lessonUserRepository.updateById(id, new LessonUser(id, StatusLesson.COMPLETED));
        if(lessonUser == 1){


            return ResponseEntity.ok("ok");
        }
        return ResponseEntity.ok("fail");

    }

    @GetMapping("/status/{userId}/{lessonId}")
    public ResponseEntity<String> getLessonStatus(@PathVariable String userId, @PathVariable String lessonId) {
        System.out.println(userId + " " + lessonId);
        String status = lessonUserRepository.findById_Lesson_IdAndId_Student_Id(Long.parseLong(lessonId),Long.parseLong(userId)).getStatus().toString();
//        List<LessonUser> lessonUser = lessonUserRepository.findAll();
        System.out.println(status);
        return ResponseEntity.ok(status.toLowerCase());
    }
}
