Currency Converter API

A simple and reliable Java Spring Boot application that handles currency conversions accurately using BigDecimal, keeps a transaction history, and automates testing and security checks via GitHub Actions. Built as part of my DevOps module project at ATU Letterkenny.

ABOUT ME & COLLABORATION

Developer: Heidi Ruth Musoke
University: Atlantic Technological University (ATU) Letterkenny
Program: BSc (Hons) in Computer Science

Working Hours:
Monday to Friday, 09:00 – 17:00

Project Rules & Code Reviews:
- Branching Strategy: Trunk-based development using the trunk branch.
- Review Policy: All feature branches are reviewed via Pull Requests. Code is only merged into trunk when unit tests and automated pipeline checks pass.
- Commit Style: Commits reference their GitHub issue number


TECH STACK

- Java 17 & Spring Boot 3 for the core REST API
- Maven to manage dependencies and build the project
- JUnit 5 & Mockito for testing
- JaCoCo to track test coverage
- Docker for containerization
- GitHub Actions for CI/CD builds and security scanning


RUNNING THE APP

Option 1: Run with Maven

git clone https://github.com/YOUR_USERNAME/currency-converter-api.git
cd currency-converter-api
mvn clean verify
mvn spring-boot:run




LICENSE
This project is licensed under the MIT License.