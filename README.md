
DICE GAME
DESCRIPTION:
The Dice Game is a two-player web-based application that simulates a dice rolling competition. Developed using HTML, CSS, and JavaScript for the frontend, and Java with Servlets for the backend, this interactive game allows users to engage in a series of matches, each involving the random rolling of a six-sided die for two players.	
Upon loading the page, users are greeted with a visually appealing interface that includes two dice displays for each player, a dynamic score tracker, and buttons to initiate and control the game. Players take turns rolling the dice, with the results displayed in real-time. The game intelligently tracks the outcomes, determining the winner of each match based on the higher dice roll. Additionally, it records the number of losses and draws for each player throughout the gameplay.
The use of Eclipse version 4.26.0 for development and MySQL for the database highlights the robustness of the technological stack. Each module and servlet plays a crucial role, from user registration and login to the main gameplay and final result submission.

TOOLS:
This section gives the details of the software that are used for the development. 
ECLIPSE
ECLIPSE VERSION 4.26.0
Database : MYSQL

MODULES
UserChoice.html
This HTML document creates a stylish Game Portal webpage with a background image. It features a centered container with login and registration options, styled with a dark background, rounded corners, and hover effects. The design aims for a visually appealing and user-friendly interface for accessing game-related functionalities. 




Register.html    
The form includes fields for the user's name, email, password, and phone number. The styling features a white background, rounded corners, and a subtle box shadow.The form action is set to "Demo5Servlet," indicating that the form data will be submitted to a server-side servlet for further processing.
Login.html
The user enters their name and password into the respective input fields, following the clear and organized structure of the form.After filling in the required information, the user clicks the login button, which triggers a POST request to the server-side "LoginServlet" for processing.
The server processes the submitted data, authenticates the user's credentials, and performs any necessary validation, handling the login logic on the server.Based on the server's response, the user is either granted access to the system or receives an appropriate error message, providing a seamless and secure login workflow for the web page.
LoginServlet.java
This Java servlet named LoginServlet handles user login functionality. Upon receiving a POST request with user credentials (name and password) from an HTML form, it instantiates a Login object and checks the credentials using the compare method. If the credentials are valid, it redirects the user to the "main.html" success page; otherwise, it redirects to the "userCh.html" error page. The servlet follows a standard workflow for processing login requests and responding with appropriate redirections based on the authentication result.
Login.java
This Java class named "Login" handles the authentication process for a web page. It establishes a connection to a MySQL database using JDBC, checks the user-provided name and password against the "student_table" in the "ngpdb" database. The class is initialized with the user's name and password. The "compare()" method executes a SQL query to retrieve a result set based on the provided credentials. If the result set has a next record, indicating a successful login, it returns true; otherwise, it returns false. The class encapsulates database connectivity, query execution, and result processing, adhering to a typical workflow for user authentication
Main.html
This HTML document creates a Two-Player Dice Game with a dynamic and interactive user interface. The game is designed to run in a web browser, featuring a background image and centered content. The structure consists of a container holding dice elements, a score display, and buttons for initiating matches, rolling dice, and submitting results.
The workflow begins by prompting the user to input the number of matches they want to play. Upon entering a valid number, the game initializes, and players take turns rolling dice by clicking the respective buttons. The dice outcomes are randomly generated and displayed in the designated areas for Player 1 and Player 2. The game dynamically updates the score, keeps track of the number of matches played, and determines the winner of each match based on the higher dice value. After completing the specified number of matches, the "Submit Results" button becomes active, allowing users to submit the overall results, including scores, losses, and draws, to a server-side servlet ("DiceServlet").
The HTML document incorporates JavaScript to handle the game logic, ensuring a smooth and engaging user experience. It includes functions for rolling dice, starting matches, and submitting results, maintaining a dynamic display of scores and match outcomes throughout the gameplay.
DiceServlet.java
This Servlet, named "DiceServlet," is designed to handle both GET and POST requests. In the GET method, it responds with a simple message indicating that it has been served at the specified context path. In the POST method, it retrieves parameters such as matches, player scores, losses, and draws from the submitted form. The servlet then creates an instance of the "DiceGameDatabase" class, assuming it has a suitable constructor for storing game-related data. After storing the data using the "store()" method, it forwards the request and response to "final.html" using a RequestDispatcher, allowing the user to view the final results. The "doGet" method is also invoked to ensure any GET requests are processed. The servlet is mapped to the "/DiceServlet" URL pattern using the @WebServlet annotation.
Final.html
This HTML document creates a simple web page with a background image. It contains a flex-container centered both horizontally and vertically, featuring two attractive buttons styled with a blue color theme. The buttons are designed with rounded corners and a hover effect. One button links to "main.html" for playing again, and the other links to "exit.html." The background image covers the entire viewport, ensuring a visually appealing backdrop.
Exit.html
This HTML document creates an exit page for a Dice Game. The container includes a gratitude message thanking the player for participating in the game and encouraging them to return for more fun in the future.




ARCHITECTURE DIAGRAM:
![image](https://github.com/TaniaPaulson/Dice-game/assets/138148075/e6f5580b-ea45-4390-bffb-aebee9022c5d)

 
CONCLUSION:
In conclusion, The Dice Game showcases a technically robust architecture, combining HTML, CSS, and JavaScript for an interactive frontend, complemented by Java Servlets and MySQL for a powerful backend. The seamless integration of Eclipse and MySQL underscores the application's scalability and reliability. Each module, from user authentication to dynamic gameplay, contributes to a cohesive and responsive user experience.





