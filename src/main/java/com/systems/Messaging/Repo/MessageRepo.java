package com.systems.Messaging.Repo;

import com.systems.Messaging.Models.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MessageRepo extends JpaRepository<Message, Long> {

    @Query("FROM Message WHERE receiver = ?1")
    List<Message> findAllMessagesByReceiver(String receiver);

    @Query("FROM Message WHERE receiver = ?1 AND readOrUnread = false ")
    List<Message> findUnreadMessagesByReceiver(String receiver);



}
