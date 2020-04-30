<!-- ![API Testing using REST Assured Library, Java]("API Testing using Rest Assured Library, Java") -->

# API Testing using REST Assured Library, Java, Maven Setup Guide

## To Get Started
* Setup the tech stack as below:
* JAVA as the programming language for writing test code
* TestNg as the framework
* Maven as the build tool
* Eclipse as the preferred IDE for writing Java test code.

### Pre-requisites
* Install JDK 1.8
* Install Eclipse or Install IntelliJ (Community edition is fine) IDE
* Install Maven
* Install TestNG 

### Configure the test framework
* Create a Maven project for the API Testing
* Create a package under src/test/java
* Add the test code inside the Package in a Java class file
* Add required dependencies for REST Assured, TestNG, JSON-Simple (For passing POST Request Body).
* Add Maven compiler plugin in the pom.xml file and Save.
* If the APIs are authenticated then create a utils folder and add the access_key and access_token.

### How to Run Test
* You can run the tests directly from the Eclipse, by right-clicking and Run TestNG test.
* For Linux/Mac users cd to the directory of pom.xml: mvn test -DfailIfNoTests=false -Dtest=<Java Class File>#<TestNGAnnoationsTag> -e
* For Windows users dir to the directory of pom.xml: mvn test -DfailIfNoTests=false -Dtest=<Java Class File>#<TestNGAnnoationsTag> -e
* Or execute command from the directory of pom.xml: mvn test
  
###
Generate comprehensive HTML reports using HTML test report for Rest Assured.
