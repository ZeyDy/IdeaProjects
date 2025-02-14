# CarXBack

`CarXBack` is the backend component of a car management system, featuring a REST API for handling car data. The project is built using Spring Boot.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

🔧 **Key Challenge:** Handling real-time appointment bookings when multiple users request the same slot.
💡 **Solution:** Implemented **optimistic locking and event-driven updates** using **DynamoDB conditional writes**.

🚀 The system is now fully operational, providing seamless scheduling with high scalability!

---

## **🛠️ Manual Tests for Login & Register**

| **Test Scenario**          | **Test Case**                                 | **Pre-Condition**                 | **Test Steps**                                              | **Expected Result**                                      |
|----------------------------|---------------------------------------------|----------------------------------|------------------------------------------------------------|----------------------------------------------------------|
| **User Registration**      | Register with valid credentials            | User must not be registered      | 1. Navigate to registration page  <br> 2. Enter valid username, email, and password <br> 3. Click "Register" <br> 4. Verify success message <br> 5. Login with registered credentials | User successfully registers and can log in. |
|                            | Register with existing email               | User email already registered   | 1. Navigate to registration page <br> 2. Enter an already registered email <br> 3. Click "Register" | System should display an error. |
|                            | Register with invalid email format         | None                             | 1. Navigate to registration page <br> 2. Enter an invalid email format <br> 3. Click "Register" | System should reject the input. |
|                            | Register with weak password                | None                             | 1. Navigate to registration page <br> 2. Enter weak password (e.g., "1234") <br> 3. Click "Register" | System should prompt for a stronger password. |
| **User Login**             | Login with valid credentials               | User must already be registered  | 1. Navigate to login page <br> 2. Enter correct username and password <br> 3. Click "Login" | User successfully logs in and is redirected to dashboard. |
|                            | Login with incorrect password              | User must already be registered  | 1. Navigate to login page <br> 2. Enter incorrect password <br> 3. Click "Login" | System should show an "Invalid Credentials" message. |
|                            | Login with unregistered user               | None                             | 1. Navigate to login page <br> 2. Enter an unregistered email/username <br> 3. Click "Login" | System should not allow access. |
|                            | Login with empty username or password      | None                             | 1. Navigate to login page <br> 2. Leave username or password empty <br> 3. Click "Login" | System should prevent submission. |

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






