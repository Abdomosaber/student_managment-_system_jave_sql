CREATE DATABASE StudentManagementDB;
GO

USE StudentManagementDB;
GO

CREATE TABLE Users (
    UserID INT PRIMARY KEY IDENTITY(1,1),
    Username VARCHAR(50) NOT NULL UNIQUE,
    Password VARCHAR(255) NOT NULL,
    Role VARCHAR(20) NOT NULL
);

CREATE TABLE Students (
    StudentID INT PRIMARY KEY IDENTITY(1,1),
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Sex VARCHAR(10),
    BirthDate DATE,
    Phone VARCHAR(20),
    Address VARCHAR(255),
    CreatedAt DATETIME DEFAULT GETDATE(),
    UpdatedAt DATETIME DEFAULT GETDATE()
);

CREATE TABLE Courses (
    CourseID INT PRIMARY KEY IDENTITY(1,1),
    CourseName VARCHAR(100) NOT NULL,
    CourseHours INT NOT NULL,
    Description TEXT,
    CreatedAt DATETIME DEFAULT GETDATE()
);

CREATE TABLE Scores (
    ScoreID INT PRIMARY KEY IDENTITY(1,1),
    StudentID INT,
    CourseID INT,
    Score DECIMAL(5,2),
    SemesterTerm VARCHAR(20),
    CreatedAt DATETIME DEFAULT GETDATE(),
    FOREIGN KEY (StudentID) REFERENCES Students(StudentID),
    FOREIGN KEY (CourseID) REFERENCES Courses(CourseID)
);

-- Insert default admin user
INSERT INTO Users (Username, Password, Role)
VALUES ('admin', 'admin123', 'ADMIN');
