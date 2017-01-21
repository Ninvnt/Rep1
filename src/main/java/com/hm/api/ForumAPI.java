package com.hm.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/forum")
public class ForumAPI {
    public ResponseEntity login (@RequestParam("login") String login, @RequestParam("pass") String pass) {
        return ResponseEntity.ok(UserHolder.search(login, pass));
    }

}
