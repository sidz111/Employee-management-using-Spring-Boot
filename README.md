# Spring Boot Employee Management System

This is a simple Spring Boot application for managing employees. The application provides RESTful APIs to add, update, remove, and retrieve employee details.

## Features

- Add a new employee
- Update existing employee details
- Remove an employee
- Retrieve employee details by ID
- Retrieve all employees

## Technologies Used

- Spring Boot
- Spring Data JPA
- H2 Database (for development and testing)
- Maven

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven 3.6 or higher

### Installation

1. Clone the repository:

    ```sh
    git clone https://github.com/your-username/your-repo-name.git
    cd your-repo-name
    ```

2. Build the project using Maven:

    ```sh
    mvn clean install
    ```

3. Run the application:

    ```sh
    mvn spring-boot:run
    ```

The application will start on `http://localhost:8080`.

## API Endpoints

### Add a New Employee

- **URL:** `/add`
- **Method:** `POST`
- **Request Body:**

    ```json
    {
      "empId": 1,
      "name": "John Doe",
      "position": "Developer",
      "salary": 50000
    }
    ```

- **Response:**

    ```json
    "Employee added successfully"
    ```

### Update an Existing Employee

- **URL:** `/update`
- **Method:** `POST`
- **Request Body:**

    ```json
    {
      "empId": 1,
      "name": "John Doe",
      "position": "Senior Developer",
      "salary": 60000
    }
    ```

- **Response:**

    ```json
    "Employee updated successfully"
    ```

### Remove an Employee

- **URL:** `/remove`
- **Method:** `POST`
- **Request Parameter:**

    ```
    empId=1
    ```

- **Response:**

    ```json
    "Employee removed successfully"
    ```

### Find an Employee by ID

- **URL:** `/findByEmpId`
- **Method:** `GET`
- **Request Parameter:**

    ```
    empId=1
    ```

- **Response:**

    ```json
    {
      "empId": 1,
      "name": "John Doe",
      "position": "Senior Developer",
      "salary": 60000
    }
    ```

### Show All Employees

- **URL:** `/showAll`
- **Method:** `GET`
- **Response:**

    ```json
    [
      {
        "empId": 1,
        "name": "John Doe",
        "position": "Senior Developer",
        "salary": 60000
      },
      {
        "empId": 2,
        "name": "Jane Smith",
        "position": "Manager",
        "salary": 80000
      }
    ]
    ```

## Testing with Postman

To test the API endpoints, you can use [Postman](https://www.postman.com/), a popular tool for API testing.

1. **Install Postman:**
   - Download and install Postman from [here](https://www.postman.com/downloads/).

2. **Create a new request in Postman:**
   - Open Postman and create a new request.
   - Set the request method (GET, POST) and enter the URL (e.g., `http://localhost:8080/add`).

3. **Set Headers (if required):**
   - For POST requests, set the `Content-Type` header to `application/json`.

4. **Enter the request body:**
   - For POST requests, switch to the "Body" tab and select "raw".
   - Enter the JSON data in the body section.

5. **Send the request:**
   - Click on the "Send" button to send the request.
   - Check the response section for the API response.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [H2 Database](https://www.h2database.com/)
- [Postman](https://www.postman.com/)
![Screenshot (225)](https://github.com/sidz111/Employee-management-using-Spring-Boot/assets/119784108/77623e75-2bbd-4068-be26-63b1a3e7e113)
![Screenshot (226)](https://github.com/sidz111/Employee-management-using-Spring-Boot/assets/119784108/9a1d206a-c83c-4d4a-a2cc-47ecda50f117)
![Screenshot (227)](https://github.com/sidz111/Employee-management-using-Spring-Boot/assets/119784108/11379d4d-2e2b-46f9-94a7-17756dc26760)
