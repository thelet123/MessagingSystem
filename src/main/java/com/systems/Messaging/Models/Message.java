package com.systems.Messaging.Models;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.w3c.dom.Text;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @CreatedDate
    @Column
    private Date creationDate;
    @Column
    private String sender;
    @Column
    private String receiver;
    @Column
    private String messageSubject;
    @Column (columnDefinition="TEXT")
    private String messageContent;
    @Column(columnDefinition = "BOOLEAN", nullable = false)
    private boolean readOrUnread;

//    getters
    public long getId() {
        return id;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getMessageSubject() {
        return messageSubject;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public boolean isReadOrUnread() {
        return readOrUnread;
    }

    //    setters
    public void setId(long id) {
        this.id = id;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setMessageSubject(String messageSubject) {
        this.messageSubject = messageSubject;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public void setReadOrUnread(boolean readOrUnread) {
        this.readOrUnread = readOrUnread;
    }

}
