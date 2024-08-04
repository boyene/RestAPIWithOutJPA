# 🌟 Student Management API 🌟

## 📋 Table of Contents
- [📖 Overview](#-overview)
- [🚀 Features](#-features)
- [🛠️ Tech Stack](#️-tech-stack)
- [⚙️ Setup & Installation](#️-setup--installation)
- [📚 API Endpoints](#-api-endpoints)
- [🔍 Screenshots](#-screenshots)
- [🙌 Contribution](#-contribution)
- [📞 Contact](#-contact)

## 📖 Overview
Welcome to the Student Management API! This application allows users to manage student data, including creating, retrieving, updating, and deleting student records. It provides a simple and efficient way to handle student information.

![Student Management API](https://res.cloudinary.com/dzmws75jp/image/upload/v1722791195/Screenshot_2024-08-04_220042_hwhzkn.png)
## 🚀 Features
- 🌟 Create and manage student records
- 📜 Retrieve a list of all students
- 🔍 Retrieve a student by ID
- ✏️ Update student information
- 🗑️ Delete a student record

## 🛠️ Tech Stack
- Backend: Spring Boot, Java
- Dependencies: Spring Web, Dev Tools
- Build Tool: Maven

## ⚙️ Setup & Installation
### Prerequisites
- Java 8 or higher
- Maven

### Steps
1. Clone the repository:
    ```bash
    git clone https://github.com/boyene/StudentManagementAPI.git
    cd StudentManagementAPI
    ```
2. Build the project:
    ```bash
    mvn clean install
    ```
3. Run the application:
    ```bash
    mvn spring-boot:run
    ```

## 📚 API Endpoints

### 📜 Retrieve All Students
- **URL:** `GET /api/v20/getAllStudents`
- **Example:**
    ```bash
    GET "http://localhost:8080/api/v20/getAllStudents"
    ```

### 🔍 Retrieve a Student by ID, Name, and Email
- **URL:** `GET /api/v20/{id}/{name}/{email}`
- **Path Variables:**
  - `id`: Integer
  - `name`: String
  - `email`: String
- **Example:**
    ```bash
    GET "http://localhost:8080/api/v20/1/YellaKrishna/yellakrishna@gmail.com"
    ```

### 🔎 Retrieve a Student by Request Params
- **URL:** `GET /api/v20/h`
- **Request Params:**
  - `id`: Integer
  - `name`: String
  - `email`: String
- **Example:**
    ```bash
    GET "http://localhost:8080/api/v20/h?id=2&name=Rahul&email=rahul@gmail.com"
    ```

### ✏️ Update a Student
- **URL:** `PUT /api/v20/{id}/update`
- **Path Variables:**
  - `id`: Integer
- **Request Body:** StudentModel JSON
- **Example:**
    ```bash
    PUT "http://localhost:8080/api/v20/2/update" -H "Content-Type: application/json" -d '{"id":2,"name":"Rahul","email":"rahul_updated@gmail.com"}'
    ```

### 🗑️ Delete a Student
- **URL:** `DELETE /api/v20/delete/{id}`
- **Path Variables:**
  - `id`: Integer
- **Example:**
    ```bash
    DELETE "http://localhost:8080/api/v20/delete/6"
    ```

## 🔍 Screenshots
Figure 1: API Usage Example

## 🙌 Contribution
Contributions are welcome! Feel free to open issues or submit pull requests. Make sure to follow the contribution guidelines.

## 📞 Contact
For any inquiries or support, please reach out:
- 📧 Email: boyeneyellakrishna@gmail.com
