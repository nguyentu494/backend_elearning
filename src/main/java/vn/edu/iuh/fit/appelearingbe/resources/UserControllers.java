/*
 * @ (#) UserControllers.java   1.0     18/11/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package vn.edu.iuh.fit.appelearingbe.resources;

/*
 * @description:
 * @author: Tuss Nguyen
 * @date: 18/11/2024
 * @version: 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.appelearingbe.models.User;
import vn.edu.iuh.fit.appelearingbe.repositories.UserRepository;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/users")
public class UserControllers {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "/login", produces = "application/json")
    public ResponseEntity<?> checkLogin(@RequestBody Map<String, String> body) {
        String email = body.get("email");
        String password = body.get("password");
        User user = userRepository.findByEmailAndPassword(email, password);
        System.out.println(email + " " + password);
        if (user == null) {
            return ResponseEntity.ok("Login failed");
        }
        return ResponseEntity.ok(userRepository.findByEmailAndPassword(email, password));
    }
//@PostMapping(value = "login", produces = "application/json")
//public ResponseEntity<?> checkLogin(@RequestParam String email, @RequestParam String password) {
//    User user = userRepository.findByEmailAndPassword(email, password);
//    System.out.println(email + " " + password);
//    if (user == null) {
//        return ResponseEntity.ok("Login failed");
//    }
//    return ResponseEntity.ok(userRepository.findByEmailAndPassword(email, password));
//}
}
