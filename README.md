# Currency Converter API

A simple and reliable Java Spring Boot application that handles currency conversions accurately using BigDecimal, keeps a transaction history, and automates testing and security checks via GitHub Actions. Built as part of my DevOps module project at ATU Letterkenny.

## ABOUT ME & COLLABORATION

* **Developer:** Heidi Ruth Musoke
* **University:** Atlantic Technological University (ATU) Letterkenny
* **Program:** BSc (Hons) in Computer Science

Working Hours:
Monday to Friday, 09:00 – 17:00

## Project Rules & Code Reviews:
- **Branching Strategy:** Trunk-based development using the trunk branch. I personally preferred this approach because it felt more straight-forward than managing multiple long-life branches. Keeping one main branch makes it easier to manage one main code base and makes it easier to catch conflicts early.
- **Review Policy:** All feature branches are reviewed via Pull Requests. Code is only merged into trunk when unit tests and automated pipeline checks pass.
- **Commit Style:** Semantic commits referencing their GitHub issue number 


## TECH STACK

* **Java 17 & Spring Boot 3:** Chosen for building a clean, reliable REST API with strong long-term support and built-in dependency injection, making it straightforward to structure endpoints and business logic.
* **Maven:** Used to standardize dependency management and automate the build lifecycle across both local development and CI environments.
* **JUnit 5 & Mockito:** JUnit 5 gives clear lifecycle annotations like `@BeforeEach`, parameterized tests (`@ParameterizedTest`) for checking multiple currency pairs without repetitive code, and grouped assertions (`assertAll`) to inspect multiple outcomes at once—while Mockito lets me isolate conversion logic and test it predictably without relying on external dependencies.
* **JaCoCo:** Integrated into the Maven build to measure line and branch test coverage, ensuring core financial calculations are thoroughly verified.
* **Docker:** Packages the application and its runtime environment into a consistent container so it runs the same way locally and in deployment.
* **GitHub Actions:** Automates testing, code coverage checks, and security scanning on every Pull Request before anything merges into `trunk`.

**Development Notes and Lessons Learned**

Earlier in development, I overcomplicated the repository layout, which caused the folder structure to diverge between my local workspace and GitHub. That led to merge conflicts when trying to sync changes, forcing me to step back, untangle the directory structure, and use a force push to align the remote repository with a clean local state.

Sticking to a straightforward trunk-based workflow helped keep things under control after that. Working in small iterations with short-lived branches and Pull Request checks makes feedback faster, stops branches from drifting out of sync, and keeps remote and local histories aligned.

## Running the App

Clone the repository, verify the build and tests, and run the application locally:

```bash
git clone https://github.com/heidimusoke/Currency-Converter.git
cd Currency-Converter
mvn clean verify
mvn spring-boot:run
```

----
### LICENSE
This project is licensed under the MIT License.
