### Role-Based Access Control (RBAC) System**

## Project Description **

This project implements a Role-Based Access Control (RBAC) system using Spring Boot and PostgreSQL.
It provides secure authentication and authorization by enforcing role-based access for APIs. 
The system leverages JWT (JSON Web Tokens) for secure, stateless authentication and role management.
Key features include user registration, login, role-based access control, and the assignment of various permissions to users based on their roles.
This project is perfect for organizations looking to implement a secure system for managing users and access rights based on predefined roles (e.g., Admin, User).

## Technologies Used **
  Java 17: The main programming language used for backend logic.
 Spring Boot: Framework used to simplify application development and create production-ready applications.
 PostgreSQL: Open-source relational database used to store user, role, and permission data.
 JWT (JSON Web Token): Used for secure token-based user authentication, ensuring stateless communication.
 Maven: A build automation tool used to manage project dependencies and build the application.
 Spring Security: For securing endpoints and ensuring proper authentication and authorization.
 Lombok: To reduce boilerplate code (e.g., getters, setters, constructors).

### Features** 
 Secure User Authentication: JWT authentication ensures that users are securely logged in without storing session data.
 Role-Based Authorization: Users can be assigned roles (Admin, User), and each role has its own set of permissions, allowing fine-grained access control.
 API Security: Protects sensitive API endpoints by validating user roles before allowing access.
 Easy Role Management: Admin users can assign roles and manage permissions easily.
 Token Expiry and Refresh: JWT tokens are time-limited, and users can refresh tokens to maintain their session.
 Error Handling: Centralized exception handling for API error responses.

### Prerequisites**
Java 17 or higher installed (to run the application).
PostgreSQL installed and running with a configured database.
IntelliJ IDEA (or any preferred IDE) installed for development.
Maven installed for dependency management.

### Setup Instructions **
To get the project up and running locally, follow these steps:

## 1. Clone the Repository
 Clone the repository from GitHub to your local machine:
 git clone https://github.com/SANTHOSHKUMARKATTIRI/My_Project_RBACUI.git
 cd My_Project_RBACUI** 

# 2. Configure PostgreSQL Database**

Install and start PostgreSQL if it’s not already running.
Create a database (e.g., rba_system) to store the user, role, and permission data.

## Update the application.properties file with your database credentials: properties **
spring.datasource.url=jdbc:postgresql://localhost:5432/rba_system
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update
spring.datasource.driverClassName=org.postgresql.Driver

## 3. Build and Run the Application**
You can either build and run the application using Maven or directly through your IDE.
## Using Maven:
bash
Copy code
: mvn clean install
 : mvn spring-boot:run


## Using IntelliJ IDEA:** 
Open the project in IntelliJ.
Right-click on the Application.java class and select Run.

## 4. Test the Application**

You can test the API endpoints using Postman or cURL. Ensure that the endpoints are secure and JWT tokens are being generated upon login.
 API Endpoints
# POST /api/auth/signup

 Registers a new user with the provided username and password.*
 Request Body:
 json
 Copy code
{
  "username": "new_user",
  "password": "password123"
}
# POST /api/auth/login
 Logs in a user and returns a JWT token.
 Request Body:
 json
Copy code
{
  "username": "new_user",
  "password": "password123"
}
 Response:
 json
Copy code
{
  "accessToken": "jwt_token_here",
  "tokenType": "Bearer"
}
# GET /api/user

Fetches user details. Only accessible to users with the "USER" role.
Authorization: Bearer JWT token.
# GET /api/admin

Fetches admin-related data. Only accessible to users with the "ADMIN" role.
Authorization: Bearer JWT token.
### Testing **
 This project includes basic tests for user authentication and role-based access control. You can run the tests using the following command:
bash
Copy code
# mvn test
Deployment Instructions
To deploy the application for production, follow these steps:

## 1. Build the Application
bash
Copy code
: mvn clean install

### License ***
This project is licensed under the MIT License - see the LICENSE file for details.

### This version of the README.md includes the complete setup, testing, deployment, and API endpoint details, ready for you to use in your project.***
