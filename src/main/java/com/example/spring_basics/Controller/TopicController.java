package com.example.spring_basics.Controller;

import com.example.spring_basics.Entity_Model.Topic;
import com.example.spring_basics.Service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopic();
    }
    @RequestMapping ("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @PostMapping("/topics")
    public String addTopics(@RequestBody Topic topic) {
         topicService.addTopic(topic);
         return "topic added";
    }

    @PostMapping("/topics")
    public String updateTopic(@RequestBody Topic topic) {
        
    }
}
