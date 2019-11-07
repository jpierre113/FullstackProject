# FullstackProject

My project mimics a Hotel Reservation system. My goal is to have a user be able to reserve a room.
The technologies used: 
- Backend: Java Springboot and Postgres
- Frontend: React JS 

My initial Database Schema:
![Imgur](https://i.imgur.com/Xlxrv6k.png)

A customer would be able to make a reservation to hotels(implying many locations). I decided to simplify this idea and remove the reservation and hotel tables meaning that the customer can book a room at this specific hotel.

The updated Database Schema:
![Imgur](https://i.imgur.com/h6raQCE.png)

My plan for my frontend is to have users signup/login first. For signup it requires needs first name, last name, email and password. While login will take email and password. The next page will be the reservation page where a date will be entered then it will load the available rooms. 
![Imgur](https://i.imgur.com/HapYyw0.jpg)

User Stories:

As a visitor to this country, I want to book a room at a hotel so I have somewhere to stay for a short time.

As a hotel owner, I want to have a reservation system so I can keep track of guests who book our hotel.

As a hotel staff member, I want a record of the people who stay at our hotel to keep up with the mantainence of the rooms.

Hurdles I experienced:
- Build failures in my microservice: I researched for solutions to the errors I got and once I made the changes, the errors changed and still encountered build failures. 

