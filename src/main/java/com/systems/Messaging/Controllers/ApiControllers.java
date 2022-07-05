package com.systems.Messaging.Controllers;

import com.systems.Messaging.Models.Message;
import com.systems.Messaging.Repo.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {
    @Autowired
    private MessageRepo messageRepo;

    //    Write message
    @PostMapping(value = "/writeMessage")
    public String writeMessage(@RequestBody Message message){
        messageRepo.save(message);
        return "The message has been sent!";
    }

    //    Get all messages for a specific user
    @GetMapping(value = "/getMessages/{receiver}")
    public List<Message> getMessages(@PathVariable String receiver) {
        return messageRepo.findAllMessagesByReceiver(receiver);
    }

    //    Get all unread messages for a specific user
    @GetMapping(value = "/getUnreadMessages/{receiver}")
    public List<Message> getUnreadMessages(@PathVariable String receiver) {
        return messageRepo.findUnreadMessagesByReceiver(receiver);
    }

    //    Read one message and mark it as read
    @GetMapping(value = "/getAMessage/{id}")
    public Message getAMessage(@PathVariable long id) {
        Message readMessage = messageRepo.findById(id).get();
        readMessage.setReadOrUnread(true);
        messageRepo.save(readMessage);
        return readMessage;
    }

    //    Delete message (as owner or as receiver)
    @DeleteMapping(value = "/deleteMessage/{id}")
    public String deleteAMessage(@PathVariable long id) {
        if (messageRepo.findById(id).isPresent()) {
            Message messageToDelete = messageRepo.findById(id).get();
            messageRepo.delete(messageToDelete);
            return "message " + id + " has been deleted !";
        }
        else {return "there is no message with the id of " + id;}
    }


}
