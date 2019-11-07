# FullstackProject

My project mimics a Hotel Reservation system. My goal is to have a user be able to reserve a room.
The technologies used: 
- Backend: Java Springboot and IntelliJ
- Frontend: React JS and Atom

My initial Database Schema:
![Imgur](https://i.imgur.com/Xlxrv6k.png)

A customer would be able to make a reservation to hotels(implying many locations). I decided to simplify this idea and remove the reservation and hotel tables meaning that the customer can book a room at this specific hotel.

The updated Database Schema:
![Imgur](https://i.imgur.com/h6raQCE.png)

My plan for my frontend is to have users signup/login first. For signup it requires needs first name, last name, email and password. While login will take email and password. The next page will be the reservation page where a date will be entered then it will load the available rooms. 
![Imgur](https://i.imgur.com/HapYyw0.jpg)

Hurdles I experienced:
- Build failures in my microservice: I researched for solutions to the errors I got and once I made the changes, the errors changed and still encountered build failures. 

