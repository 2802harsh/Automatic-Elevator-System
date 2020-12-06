# Automatic-Elevator-System
OOM Project 2020

### To Run this Project via Terminal / Command Line :
- Open the root directory
    ### Note: Do not Navigate to dist/, stay on the `/` root directory
- Type the following command: <br>
    `java -jar dist/OOMProject.jar`
- Press Enter

## ABOUT THE PROJECT

This Project is a GUI enabled Automatic Elevator System, with automatic door opening and closing mechanism which can detect an overload and prompt the passengers accordingly. We have developed a scheduling algorithm for simulating the moving elevator which is based on serving requests such that it is the fastest possible route. There is a mechanism which in case of Power Cut, immediately sends an Email to the Admin requesting Power Backup, and after receiving the Power Backup directs the elevator to the nearest floor based on which direction it was moving earlier.

Also, we have included a new feature of Emergency Requests, which ignores all other requests in case of an emergency ( say , a medical emergency ) and serves this request first, later resuming  to the normal elevator functionality. And for this purpose, only verified personnel (eg. Security Guards on each floor ) with valid Emergency IDs are allowed to call an emergency for someone. 




## Development Tools
- JDK 15.0.1 (latest)
- Java Swing
- Apache Netbeans 12.1

## APIs and External Libraries Used
- Java Mail API
- Java Activation(used with Java Mail)
- JCalender Library (to implement Date Picker for Log Screen)

## System Requirements
- Operating System: any
- JDK 15.0.1 preferred

**Please refer README.txt for details on how to run the project**

## UML DIAGRAMS

### State Diagram

![image](https://user-images.githubusercontent.com/58396239/101282021-8c49dc80-37f8-11eb-9854-8c33778d7766.png)

### Class Diagram

![image](https://user-images.githubusercontent.com/58396239/101282039-a2579d00-37f8-11eb-8aa1-9c48f281b51b.png)

### UseCase Diagram

![image](https://user-images.githubusercontent.com/58396239/101282049-b13e4f80-37f8-11eb-9be7-eb2491025be1.png)

## PROJECT SIMULATION AND INSTRUCTIONS

Please follow the instructions in README.txt before executing the project

When the project is executed, this is the first screen that appears:
![image](https://user-images.githubusercontent.com/58396239/101281183-bd73de00-37f3-11eb-8a86-fd2201262b9d.png)


- First of all, the Admin is required to Configure the setting for the elevator. For this, click on the Configure button. Then the Configure window would open up, where the Admin can set the threshold values for Number of People and Weight.

- Also, Admin has to set a valid Email Id where the email will be sent in the case of Power Cut.

- Further, the Emergency IDs (without which emergency elevator request cannot be called ) can be added or removed in the configure window.

#### See the steps below:



### CONFIGURE SCREEN
![image](https://user-images.githubusercontent.com/58396239/101281204-cfee1780-37f3-11eb-8b36-edeabd272d71.png)

- The default values for Maximum Number of People and Weight are 5 and 800 respectively.

- There are validators set on Maximum weight and Mail ID. See below: 

![image](https://user-images.githubusercontent.com/58396239/101281208-d41a3500-37f3-11eb-97d7-c4d93fc0b2d3.png)
![image](https://user-images.githubusercontent.com/58396239/101281251-0af04b00-37f4-11eb-8309-7d2518a20e25.png)
![image](https://user-images.githubusercontent.com/58396239/101281262-13488600-37f4-11eb-8965-986740089433.png)


- Mail Id is validated as well: 

![image](https://user-images.githubusercontent.com/58396239/101281271-1e9bb180-37f4-11eb-9367-d33eea37c653.png)
![image](https://user-images.githubusercontent.com/58396239/101281279-23f8fc00-37f4-11eb-9249-28062420928f.png)


- Now let’s add some emergency IDs( Their use will be made clear later ), Click on Edit Here.

A window would open up.

![image](https://user-images.githubusercontent.com/58396239/101281283-28bdb000-37f4-11eb-91f0-1bb34d5c62bf.png)

To add new ID, enter the string and click on +

![image](https://user-images.githubusercontent.com/58396239/101281290-2d826400-37f4-11eb-8077-d9cbfdd3c205.png)

To remove an ID, select it and click on -


Now click on Update, and the information would be updated .

![image](https://user-images.githubusercontent.com/58396239/101281330-4db22300-37f4-11eb-8bea-7d1e8dce1e1e.png)


### INITIATE SCREEN

Now back in the main screen, Click on Initiate button to initiate the Automatic Elevator.

![image](https://user-images.githubusercontent.com/58396239/101281349-763a1d00-37f4-11eb-9746-8ffdcafcb2ff.png)


#### We cannot initiate elevator before setting Admin’s Mail Id.


Here, you have two options :

- **NORMAL REQUEST TO ELEVATOR**

- Click on Generate Floor Request. You can see in the terminal, a random floor request would be generated. You can generate as many requests as you want, the algorithm will take care of it accordingly.
Let us generate three floor requests almost simultaneously and see how its taken care of (the floor requests can be seen in the terminal)

![image](https://user-images.githubusercontent.com/58396239/101281562-9dddb500-37f5-11eb-9c96-3ff675998273.png)

![image](https://user-images.githubusercontent.com/58396239/101281362-82be7580-37f4-11eb-984f-f74289472c72.png)



 
- The elevator reaches floor 9 first, now you are prompted with a screen:	


![image](https://user-images.githubusercontent.com/58396239/101281370-87832980-37f4-11eb-8bab-28a83a68d223.png)

- We enter 1 person (person's weight is randomly added ), now the destination floor for this person would also be randomly generated (in this case 0)
This floor is also added to our elevator queue and next requests are served similarly
Elevator first goes to floor 12 (as it was going up previously), then 0. 

![image](https://user-images.githubusercontent.com/58396239/101281373-8ce07400-37f4-11eb-8199-4ca8df919c9e.png)

- The overall status of Elevator is also updated according to the situation. See an example below:

![image](https://user-images.githubusercontent.com/58396239/101281377-91a52800-37f4-11eb-8275-67f28e141c34.png)

- Now let us set max people to 10 and max weight to 500 (and cause a condition of overload ) 

![image](https://user-images.githubusercontent.com/58396239/101281387-97027280-37f4-11eb-8cd4-db8739659024.png)
![image](https://user-images.githubusercontent.com/58396239/101281916-ed24e500-37f7-11eb-984a-ab085e5892fd.png)


**Also, while overload, there is a constant alert sound, until you remove a certain number of persons so that it is not overloaded now. The doors will also remain open until then.**

- **EMERGENCY FLOOR REQUEST**

- This is a new feature. Let’s say there is an emergency, (you can call it by clicking Emergency Floor Request ) .

- This is where those Emergency IDs will be used. To validate an emergency request, you need an ID.
![image](https://user-images.githubusercontent.com/58396239/101281398-a7b2e880-37f4-11eb-94ee-5aa5583d7aa8.png)
![image](https://user-images.githubusercontent.com/58396239/101281402-ac779c80-37f4-11eb-8a3b-e447be22f0c6.png)


- As soon an emergency is called, the elevator ignores the normal requests and first completes the emergency request.
Now, to simulate the POWER CUT, there is a Toggle Button named Power Cut, click on it.

- A Power Cut has occurred now, to see how the elevator responds, see the following situation:

- We have added our mail id as Admin mail in configure.
There is a request at floor 9
Let us click POWER CUT on its way from floor 5 to floor 6

![image](https://user-images.githubusercontent.com/58396239/101281436-d204a600-37f4-11eb-9226-9e8d0fb30b10.png)

- An email is sent at that address:

![image](https://user-images.githubusercontent.com/58396239/101281697-8c48dd00-37f6-11eb-9014-57f2de687ac8.png)

- When we release the POWER CUT button, the elevator goes to floor 6, rather than 9 because it is the nearest floor as of now and there was a Power Cut.

![image](https://user-images.githubusercontent.com/58396239/101281437-d6c95a00-37f4-11eb-9e17-073f9d84b3f8.png)

### LOG SCREEN

On the main screen, click on the Log Button

![image](https://user-images.githubusercontent.com/58396239/101281943-29f0dc00-37f8-11eb-9396-bdb7dc46aa98.png)

You first need to set a valid date:

The Log is now generated: 

![image](https://user-images.githubusercontent.com/58396239/101281448-e779d000-37f4-11eb-9a58-3f1a70fc187d.png)

There are validation checks on Date as well:

![image](https://user-images.githubusercontent.com/58396239/101281452-ec3e8400-37f4-11eb-950b-86c71d76d860.png)


### FUTURE SCOPE
Following the new feature of Emergency Requests, we can incorporate a mechanism for ID cards using “Scan and Go” rather than entering IDs for verification every time. Also, once this mechanism is in place, it can further be used to add a new feature in the Elevator System for restricted floors for Staff Personnel only, using their staff ID Cards.


