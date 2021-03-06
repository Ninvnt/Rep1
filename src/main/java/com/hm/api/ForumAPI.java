package com.hm.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

@RestController
@RequestMapping("/forum")
public class ForumAPI {

    public static HashMap<String, Topic> topics = new HashMap<>();

    @RequestMapping("/login")
    public ResponseEntity login (@RequestParam("login") String login, @RequestParam("pass") String pass) {
        return ResponseEntity.ok(UserHolder.search(login, pass));
    }

    @RequestMapping("/createTopic")
    public ResponseEntity createTopic (@RequestParam("name") String name) {
        Topic topic = new Topic();
        topic.setName(name);
        topics.put(name, topic);
        return ResponseEntity.ok(topic);
    }

    @RequestMapping({"/getTopics", "/getForums"})
    public Collection<Topic> getTopics() {
        return topics.values();
    }

    @RequestMapping("/getTopic/{name}")
    public ResponseEntity getTopic (@PathVariable("name") String name) {
        return ResponseEntity.ok(topics.get(name));
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public ResponseEntity post (@RequestParam("name") String name,
                                @RequestParam("text") String text,
                                @RequestParam("login") String login,
                                @RequestParam("pass") String pass){
        User user = UserHolder.search(login, pass);
        if(user == null) {
            return ResponseEntity.status(403).body("Need authorize");
        }
        Post post = new Post();
        post.setMessage(text);
        post.setuserLogin(user.getLogin());
        topics.get(name).getPosts().add(text);
        return ResponseEntity.ok(getTopic(name));
    }
}
