# CarXBack

`CarXBack` is the backend component of a car management system, featuring a REST API for handling car data. The project is built using Spring Boot.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

🔧 **Key Challenge:** Handling real-time appointment bookings when multiple users request the same slot.
💡 **Solution:** Implemented **optimistic locking and event-driven updates** using **DynamoDB conditional writes**.

🚀 The system is now fully operational, providing seamless scheduling with high scalability!

---

## **🛠️ Manual Tests for Login & Register**

## 🛠 Manual Testing: Login & Register

| **Test Scenario**         | **Test Case**                              | **Pre-Condition**               | **Input**                                  | **Test Steps**                                               | **Expected Result**                                | **Actual Result** |
|--------------------------|------------------------------------------|--------------------------------|--------------------------------|-----------------------------------------------------------|--------------------------------------------------|------------------|
| **User Registration**    | Register with valid details              | User must not be registered    | username: testdoctor, email: testdoctor@example.com, firstname: John,
    lastname: Doe,
    password: securePassword123 | 1. Navigate to registration page  <br> 2. Enter valid details <br> 3. Click "Register" <br> 4. Verify success message <br> 5. Login with registered credentials | User successfully registers and can log in. | |
|            Registration successful              | Register with existing email             | Email already used             | Existing email, new password | 1. Navigate to registration page <br> 2. Enter an already registered email <br> 3. Click "Register" | System displays an error: "Email already in use!" |Failed to register: Request failed with status code 409 |
| **User Login**           | Login with valid details                 | User must be registered        | Correct username and password | 1. Enter correct details <br> 2. Click "Login" | User successfully logs in. | |
|            Logged in successfully              | Login with incorrect password            | User must be registered        | Correct username, wrong password | 1. Enter wrong password <br> 2. Click "Login" | System displays an error: "Invalid Credentials" | Failed to login: Bad credentials|

---

🎯 **Conclusion:** These manual tests ensure that the **Login & Register functionality works correctly, handles edge cases, and prevents security loopholes** before implementing automation. 🚀



### Prerequisites

Before installing, ensure your system meets the following requirements:

- Java 17 or newer
- Maven 3.6 or newer
- MySQL Server

### Installation

To set up this project locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/ZeyDy/carX.git

2. Navigate to the project directory.
3. Create the database schema on your MySQL server.
4. Configure the database connection details in src/main/resources/application.properties.
5. Start the project using Maven.

This will launch the API on the designated port (usually 8080 by default).

API Endpoints
The API provides the following endpoints:

GET /api/mycars - Retrieves a list of all cars.
POST /api/createcar - Creates a new car.
PUT /api/update/{id} - Updates an existing car.
DELETE /api/delete/{id} - Deletes a car.

Support
If you need assistance with the project, contact zydrunasdauksas302pk@gmail.com.

Authors
Your Name – GitHub: ZeyDY
License
This project is licensed under the MIT License - see the LICENSE.md file for details.

Acknowledgments
Thanks to everyone who contributed to this project!
Special thanks to mentors and community members who helped with technical challenges.
markdown
Copy code

### Additional Tips:
- Dependencies used in the project:
   <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-data-jpa</artifactId>
   </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
  	<dependency>
  		<groupId>com.mysql</groupId>
  		<artifactId>mysql-connector-j</artifactId>
  		<scope>runtime</scope>
  	</dependency>
  	<dependency>
  		<groupId>org.projectlombok</groupId>
  		<artifactId>lombok</artifactId>
  		<optional>true</optional>
  	</dependency>
  	<dependency>
  		<groupId>org.springframework.boot</groupId>
  		<artifactId>spring-boot-starter-test</artifactId>
  		<scope>test</scope>
  	</dependency>
  	<dependency>
  		<groupId>org.junit.jupiter</groupId>
  		<artifactId>junit-jupiter-api</artifactId>
  		<version>5.10.2</version>
  		<scope>test</scope>
  	</dependency>
  	<dependency>
  		<groupId>org.springframework.boot</groupId>
  		<artifactId>spring-boot-starter-security</artifactId>
  	</dependency>
  	<dependency>
  		<groupId>io.jsonwebtoken</groupId>
  		<artifactId>jjwt</artifactId>
  		<version>0.12.5</version>
  	</dependency>






