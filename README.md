# STS
# Read Me First
The following was discovered as part of building this project:

# User Management API

This is a simple REST API for managing users with basic CRUD operations. The API is built using Spring Boot and H2 Database (in-memory).

## Prerequisites

- Java 11 or higher
- Maven or Gradle
- Spring Boot

## Project Setup

1. Clone this repository or download the zip file.
2. Open the project in your preferred IDE (IntelliJ IDEA, Eclipse, etc.).
3. Build and run the project using `mvn spring-boot:run` or from within your IDE.

## API Endpoints

### 1. Create a User (POST)

**URL:** `/api/users`  
**Method:** `POST`  
**Request Body:**
```json
{
 "name": "sagar Patil",
  "email": "sagarp@example.com"
}
Response:

json
Copy
{
  "id": 1,
 "name": "sagar Patil",
  "email": "sagarp@example.com"
}

###2. Get All Users (GET)
URL: '/api/users'
Method: GET
Response:

json
Copy
[
  {
    "id": 1,
  "name": "sagar Patil",
  "email": "sagarp@example.com"
  }
]
### 3. Get User by ID (GET)
URL: /api/users/{id}
Method: GET
Response:

json
Copy
{
  "id": 1,
  "name": "sagar Patil",
  "email": "sagarp@example.com"
}
### 4. Update User (PUT)
URL: /api/users/{id}
Method: PUT
Request Body:

json
Copy
{
   "name": "sagar Updated",
  "email": "sagarpdated@example.com"
}
Response:

json
Copy
{
  "id": 1,
  "name": "sagar Updated",
  "email": "sagarpdated@example.com"
}
### 5. Delete User (DELETE)
URL: /api/users/{id}
Method: DELETE

Response: ok 201
10. Run the Application
Run the application using the main class DemoApplication. The application will be accessible at http://localhost:8080.
