# MessagingSystem
A simple restful API application with GET POST DELETE reqsusts and costomized queries. using spring boot's WEB, JPA, SQL dependencies 

* The code is running on an heroku server thats connect MySql db as well using clearDB addon.
* The server address: https://app-messaging-system.herokuapp.com 
* This application doesnt have client side and it can be accessed from PostMan. 
* The PostMan collection link: https://go.postman.co/workspace/New-Team-Workspace~1faa93ed-acee-42a2-8628-09ad5ce043fa/collection/21771026-771cc50d-04f5-4322-9024-eab5ad2e10b4?action=share&creator=21771026

PostMan tutorial (use the collection link for built in requests):
	
	POST request Write A message - the creation date and ID are being given automaticly 
		url:
		https://app-messaging-system.herokuapp.com/writeMessage

		in body -> raw -> json format insert the following json 

		{
		    "sender": "SENDER_NAME",
		    "receiver": "RECIVER_NAME",
		    "messageSubject": "MESSAGE_SUBJECT",
		    "messageContent": "MESSAGE_CONTENT"
		}

	GET request Get all unread messages for a specific user  - at the end of url insert a reciever name 
		url:
		https://app-messaging-system.herokuapp.com/getUnreadMessages/{RECIVER_NAME}

	GET request Get all messages for a specific user - at the end of url insert a reciever name 
		url:
		https://app-messaging-system.herokuapp.com/getMessages/{RECIVER_NAME}

	GET request Read A message by ID - at the end of url insert a message id 
		url:
		https://app-messaging-system.herokuapp.com/getAMessage/{ID}

	DELETE request Delete A message by ID  - at the end of url insert a message id  
		url:
		https://app-messaging-system.herokuapp.com/deleteMessage/{ID}



Connect to MySQL DB on heroku tutorial : 
mysql server 8.0+ on the computer is a must for this part 
	
	• In CMD enter to mysql server (with the path of bin)
		○ For example in my computer- Cd C:\Program Files\MySQL\MySQL Server 8.0\bin
	• After that connect to my public DB user (which is used by addon cleardb mysql on heroku) with the following commends
		○ mysql -u bd897affe6cd42 -peee87443 -h us-cdbr-east-06.cleardb.net
		○  connect heroku_f07dbcbb5a7db4f;
	• Then you can see all tables 
		○ show tables;
	• Or see the columns with values in the relevant table 
		○  select * from message;

