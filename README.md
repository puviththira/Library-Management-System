# Library Management System (Java Spring Backend)

This project is a backend implementation of a Library Management System using Java Spring Framework.

## Introduction

The Library Management System backend provides a robust API for managing library resources such as books, authors, and categories. It allows for easy integration with front-end applications or other systems.

## Features

- CRUD operations for books, authors, categories, and publishers
- Authentication and authorization
- Search and filtering functionalities
- Borrowing and returning books
- Fine calculation for overdue books

## Technologies Used

- Java
- Spring Framework (Spring Boot, Spring Data JPA)
- Spring Security
- MySQL (or your preferred database)
- Maven (for dependency management)

## Installation

### Prerequisites

- Java Development Kit (JDK) 8 or later
- Maven
- MySQL (or another database)

### Steps

1. **Clone the repository:**

    ```bash
    git clone https://github.com/puviththira/Library-Management-System.git
    ```

2. **Navigate to the project directory:**

    ```bash
    cd Library-Management-System
    ```

3. **Set up your MySQL database:**

    Create a MySQL database and update the `application.properties` file with your database configuration:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/librarydb
    spring.datasource.username=root
    spring.datasource.password=password
    ```

4. **Build the project using Maven:**

    ```bash
    mvn clean install
    ```

5. **Run the application:**

    ```bash
    java -jar target/Library-Management-System.jar
    ```

## Usage

Once the application is running, you can access the API endpoints using tools like Postman or integrate them into your front-end application.

## API Endpoints

The following are the main endpoints of the API:

- `/api/books`: CRUD operations for books
- `/api/authors`: CRUD operations for authors
- `/api/categories`: CRUD operations for categories
- `/api/publishers`: CRUD operations for publishers


## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For questions or feedback, feel free to contact the project maintainer:

Puviththira Paramaseelan 
Email: puvipuviththira111@gmail.com  
GitHub: [Puviththira Paramaseelan](https://github.com/puviththira)
