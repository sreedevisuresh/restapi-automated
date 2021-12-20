README.md

Eclipse-Maven-TestNG This is a java project to set up Eclipse with Maven and TestNG There is a pom.xml file and testng.xml.

Assignment   

Using the API given below create an automated test with the listed acceptance criteria:   API = https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false   Acceptance Criteria:
* Name = "Carbon credits"
* CanRelist = true
* The Promotions element with Name = "Gallery" has a Description that contains the text "Good position in category"
* 
Solution:

Prerequisites:

Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
Version: 2021-09 (4.21.0) Build id: 20210910-1417

Java version : jdk-11.0.12

How to run the test?
Import project  to your IDE.
>Git
>>>Projects from Git(with smart import)
>>> Clone URI
>>>  (https://github.com/sreedevisuresh/restapi-automated.git)

follow the steps to finish

Wait for dependencies to be downloaded.

Run the test.
The test can be run by selecting APITest.java - Run AS TESTNGTest


I used Java language with and RestAssured library.
To build project I have used Maven.
For matchers in assertions I used hamcrest matchers.
