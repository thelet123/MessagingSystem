# MessagingSystem
A simple restful API application with GET POST DELETE reqsusts and costomized queries. using spring boot's WEB, JPA, SQL dependencies 

This application doesnt have client side and it can be accessed from PostMan. 
The code is running on an heroku server thats connect MySql db as well using clearDB addon.
The server address: https://app-messaging-system.herokuapp.com 


PostMan tutorial:

POST request 
Write A message - the creation date and ID are being given automaticly 
url:
https://app-messaging-system.herokuapp.com/writeMessage

in body -> raw -> json format insert the following json 

{
    "sender": "SENDER_NAME",
    "receiver": "RECIVER_NAME",
    "messageSubject": "MESSAGE_SUBJECT",
    "messageContent": "MESSAGE_CONTENT"
}

GET request 
Get all unread messages for a specific user  - at the end of url insert a reciever name 
url:
https://app-messaging-system.herokuapp.com/getUnreadMessages/{RECIVER_NAME}

GET request 
Get all messages for a specific user - at the end of url insert a reciever name 
url:
https://app-messaging-system.herokuapp.com/getMessages/{RECIVER_NAME}

GET request 
Read A message by ID - at the end of url insert a message id 
url:
https://app-messaging-system.herokuapp.com/getAMessage/{ID}

DELETE request 
Delete A message by ID  - at the end of url insert a message id  
url:
https://app-messaging-system.herokuapp.com/deleteMessage/{ID}
