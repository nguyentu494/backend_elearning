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
import vn.edu.iuh.fit.appelearingbe.enums.StatusUserFirstUpdate;
import vn.edu.iuh.fit.appelearingbe.models.User;
import vn.edu.iuh.fit.appelearingbe.repositories.UserRepository;

import java.util.Map;
import java.util.Objects;

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
        System.out.println(user);
//        System.out.println(email + " " + password);
        if (user == null) {
            return ResponseEntity.ok("Login failed");
        }
        return ResponseEntity.ok(userRepository.findByEmailAndPassword(email, password));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable Long id) {
        return userRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    //add new user
    @PostMapping(value = "/register", produces = "application/json")
    public ResponseEntity<?> addUser(@RequestBody Map<String, String> body) {
        String email = body.get("email");
        String password = body.get("password");
        boolean teacher = Boolean.parseBoolean(body.get("role"));
        System.out.println(teacher);
        User user1 = userRepository.findByEmail(email);
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        //status 0: chưa cập nhật thông tin
        //status 1: đã cập nhật thông tin
        user.setStatus(StatusUserFirstUpdate.NO);
        if (user1 != null) {
            return ResponseEntity.ok("Account already exists");
        } else {
            return ResponseEntity.ok(userRepository.save(user));
        }
    }

    //    //update user
    @PutMapping(value = "/update", produces = "application/json")
    public ResponseEntity<?> updateUser(@RequestBody User body) {
        // Log the user's name (for debugging purposes)
//        System.out.println(body);

        // Find the user by ID
        User user = userRepository.findById(body.getId()).orElse(null);

        // If user not found, return a response
        if (user == null) {
            return ResponseEntity.ok("User not found");
        } else {
            // Assuming getStatus() returns an enum (e.g., StatusUserFirstUpdate)
            // If the status is 'YES', map it to 0; otherwise, map it to 1
//            int statusValue = body.getStatus().equals(StatusUserFirstUpdate.YES) ? 0 : 1;
//
//            System.out.println(statusValue);

            // Call the repository method to update the user and return the result
            return ResponseEntity.ok(userRepository.updateAvatarAndNameAndDescriptionAndPhoneAndDate_of_birthById(
                    body.getAvatar(),
                    body.getName(),
                    body.getDescription(),
                    body.getPhone(),
                    body.getDate_of_birth(),
                    body.getStatus(), // Pass the mapped status (0 or 1)
                    body.getEmail_contact(),
                    body.getId()
            ));
        }
    }

}
