 
## TABLAMULTIPLICAR###. 
    This project allows to generate the multiplication table for a given number, multiplying from 1 to 12. This project is designed as a Spring Boot application and contains the necessary drivers and configurations to handle the table generation requests.
## Project Structures
    TABLAMULTIPLY/
    ├── .mvn/ # # Maven configurations. 
    ├─── src/
    │ ├─── main/
    │ │ ├─── java/com/multiply/multiply/ table_multiply/
    │ │ │ │ ├─── MultiplicacionTablaController.java # Main controller for the multiply table.
    │ │ │ │ ├─── ServletInitializer.java # Servlet configuration to initialize Spring Boot.
    │ │ │ │ └─└─ TableMultiplyApplication.java # Main class that initializes Spring Boot application.
    │ │ │ └─└─ resources/ # Directory for resource files.
    │ └└── test/ # Directory for tests
    ├─── target/ # Files generated after compilation.
    ├─── .gitignore # Files and folders to be ignored by Git.
    ├─── dockerfile # Docker file to build the application image.
    ├─── pom.xml # Maven configuration file.
    └└─── README.md # Project documentation.
## Requirements ##
    Java 8 or higher
    Spring Boot
    Maven
## Installation
1. Clone this repository:
   git clone 
2. Navigate to the project directory:
   cd TABLAMULTIPLATE
3. Build the project with Maven:
   mvn clean install
## Run the application:
   mvn spring-boot:run
## Usage
Once the application is running, access the endpoint to generate the multiplication table.
   Endpoint
   URL: http://localhost:8080/table/{number}
   HTTP Method: GET
## Parameter:
   number: Integer for which the multiplication table will be generated.
   Example
   If you want to get the multiplication table for the number 5, make a GET request to:
   
   http://localhost:8080/table/5
## Contributions
   If you wish to contribute to this project, feel free to make a fork and submit your changes via a pull request.
## Author
   Cristina Colcha
   This structure is visually nicer and uses a tree format to show the organization of the files in the project. hope you like it!



