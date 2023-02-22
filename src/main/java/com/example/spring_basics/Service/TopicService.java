package com.example.spring_basics.Service;

import com.example.spring_basics.Entity_Model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics= new ArrayList<>( Arrays.asList(
                new Topic("1", "first", "it was first"),
                new Topic("2", "second", "it was my second"),
                new Topic("3", "third", "this is my third")
                ));

    public List<Topic> getAllTopic() {
        return topics;
    }

    public Topic getTopic(String id) {
       return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }


    public void updateTopic(String id, Topic topic) {

        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void remove(String id) {
        topics.removeIf(topic -> topic.getId().equals(id));
    }
}
