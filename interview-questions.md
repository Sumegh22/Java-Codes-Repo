# Must prepare Interview Questions

**Core Java :**
1) Write a program for custome ArrayList class with int[] as member variable. And implement size,add,remove etc functions.
2) Write/explain the unit tests for the same class
3) What is immutable class and what are its advantages in multithreading environment. Also write a custom immutable class
4) Exception handling - Checked vs Unchecked and try,catch,finally examples
5) How to create thread in java? Interthread communication, deadlock , Executor framework


**Spring Boot :**
1) Annotations used
2) REST annotations and HTTP methods
3) Springboot starter dependecies
4) How can we use Factory pattern to autowire the beans at runtime
5) JPA working, Entity classes  and entity casceding
6) How to debug a production issue e.g slowness of application when there is no recent deployment done
7) Dependency injection
8) Bean lifecycle


**Devops :**
 Deployment steps and tools used

----------------------------------------------------------------------

Given an array, rotate the array to the right by k steps where k can be negative
* Java 8 features 

**Streams problems:**
- find the list of employee whose age is greated than 25 and salary greater than 30000
- sort list by name and salary
- return only list of employee name
1. Remove epmployee from list of epmployees whose age is greater than 30 without creating new list
2. an we use employee class as key to hashmap?
3. What changes do we need to do to use employee class as hashmap key
4. How can we make class immutable?
5. Why do we need to make variables final if we are not providing setters?
6. Where else we need immutable classes other than hashmap key? 
7. Can two different threads access two different objects of same class?
8. What is synchronisation and how we can use?
9. Synchronized method lock on object, or method?

----------------------------------------------------------------------

**General Interview Questions**
1. Previous Project Flow?.
2. Difference between @Controller and @Service
3. Can we add Normal Method in Controller
4. Difference between FlatMap and Map
5. Differnce between HashTable HashMap & Concurrent HashMap Executor Framework
6. How will a 5 task with 2 threads occur in executor framework
7. How to make one thread execute after another
8.  How will you test API
9. What is your Procedure for devloping API
10. How do you handle Failure in MicroServices architecture
11. How will you control segments in Concurrent hashMap?
----------------------------------------------------------------------
## Scenario Based
**A. Scenario 1**
 1. Suppose you need to Read csv file from sftp server & store that data into json file How will you design this?
 How will be your Structure (Classes)
 2. What if files are as huge as 28gb and your server ram is only 3gb what will be issues in reading file and how will you handle those
 3. what if a flie is left unread in the middle
----------------------------------------------------------------------

1. Program to print fibonacci number series
2. Programming question - We have a list of balls of different colors, write a program to find balls of each color
3. Programming question - There is list of Employees and EmployeeDetails, write a program to combine the employee details of each employees
4. Basics concepts of Kafka
5. Sql query question to sort employees on their age
6. Basics questions regarding Multithreading
7. Hash map and concerent hash map?
8. why concernt hash map is slow?
9. if you have 10 microservices how you snynconize?
10. Disadvantage of microservices architecture
11. Print the following pattern !..

		0 0 0 1
		0 0 1 0
		0 0 0 0
		0 0 0 0
		
		1 1 1 1 
		1 1 1 1
		0 0 1 1
		0 0 1 1
			
		0 0 0
		0 1 0
		0 0 0

----------------------------------------------------------------------

Sl. No	Coding Question
1.	Write a predicate in lambda function for odd numbers along with the interface.
2.	There is an employee table there are 2 columns-empid,name and sal table-empid,sal,month
 
 Write hibernate entity for same.
3.	Design producer and consumer
4.	Given an integer array of natural numbers, write a function so it returns an array which contain number incremented by one,

cover all boundary conditions.

Write JUnit test cases? for all possible scenarios?

for example

int [] input = {1,0,1}; {9,9,9}

int [] result = {1,0,2}; {1,0,0,0}

5. Program to print fibonacci number series.
6. We have a list of balls of different colors, write a program to find balls of each color.
7. There is list of Employees and Employee Details, write a program to combine the employee details of each employees.

6.Find Count of each color ball from basket using Java 7.

String[] basket = {"red","blue","white","white","red"};

7.How can we combine inputs from 2 different sources to one entity?

Cases:
When can we use Map for final output.
When can we use List for final output.

Java, java8, Design principles/patterns

Q- You get a call from L2 team that you there is a performance issue with a stored procedure which was working fine
till yesterday and there were no new deployments.How will you resolve this issue?
Q- Predicate in java.Give a live example.

Q- When is bidirectional association mandatory?
Q- What is cascading?
Q- How will u handle that when an emp leaves the data should be deleted from emp table but not from salary table.

Q-What is thread safety?
Q-How we can achieve thread safety?

Q-What is singleton design pattern?

Q-What is the use of singleton pattern in practical scenarios?

Q-What is immutable class?

Q-what is the use of immutable class? Practical examples from java

Q-Are immutable classes thread safe? do they need to be synchronized?

Q-What is composition? Explain with an example?

 design patterns

REST API - Patch, POST, PUT, Idempotent , demo code for writing API

Microservices- Design pattern, architeture, adv and disadvantages, load balancer, API gateway

Q- Questions on multithreading, run 4 threads, then coagulates results from all thread into single output.

Q- Use of custom Objects as key in Hash Map.

Q- Difference between Array List and Linked List and their usage.

Q- About Concurrent Hash Map.

--------------------------------------------

1. Tell something about technical back ground and day to day task.
2. Explain architecture of previous application.
3. How can we identify issues in stored sprocedure involve with large data table.
4. How DB connections created in Java application.
5. How Java application packages are structured.
6. Annotations used in Spring and sping boot.
7. How beans are created in spring vs in springboot.
8. What is difference between spring and Springboot.
9. How Springboot better than spring.
10. How Objects are saved using hibernate.
------------------------------------------------

1.sorting list of employee with respect to age using java8
2.JAVA 8 features
3.Diff synch collection and concurrunt hashmap
4.Exception handling in springboot
5.SOLID principles
6.Singletone class. how to create
7.why string are immutable
8.how we create immutable class
9.way to breake immutablility in java8
10.Diff comparable and comparator
11.SADA Design pattern and implementation
12.working CICD pipeline
13.API gateway
14.Eureka registery
15.Load Balancing in Microservices
16.Scope of beans
17.Diff @Controller and @RestController
18.Diff @Service and @Componant
19.JPA methods
20.Angular JS and javascript
21.SQL query using Group by
22.SQL Joins 

-------------------------------------------

Java 17 features and use case in your project
Explain about your project and architecture ? Few questions around this ?
What is Branching strategy ? Some scenario based questions on this and git ?
How to handle OutOfMemoryException and StackOverFlow Issues ? What are all the approach ?
Difference between Spring and Spring boot ?
Bean Scope ? What is boundary of singleton bean scope ? How it is managed ?
How Maven resolve dependency ? Suppose we have 2 dependency one is Log4j 1 and other is Log4j 2 in pom.xml, What will happen ?
What is trade of between ordered array and unordered array ?
Can we overload static method in java ?
How marker interface work ? How to create custom marker interface ? How compiler handle marker interface ?
Difference between super and this ? can we use both ?
Scenario based questions around try cath finally and system.exit ?
How to enable caching in spring boot ?
How @ cacheable works ?
How can we maintain cache synchronization in distributed environment ?
How can we achieve transaction management ? 
In case we are using multiple db, How to manage transaction management in spring boot ?

--------------------------------------------------
* What is default inmplementation of equals and hashcode method.
    
      class Vehicle { 
      Integer number;
      String name;
      }
       
      
      v1 = new Vehicle(12345,"truck");
       
      v2 = new Vehicle(12345,"truck");
       
      v1 == v2  // What will be the output
      v1.equals(v2) // What will be the output
       
      Map<Vehicle,String> = new HashMap<>();
       
      map.put(v1,"NH4");
      map.put(v2,"NH100");
       
      v3 = new Vehicle(12345,"truck");
      map.get(v3); // What will be the output
 
 
* What you should do so that this custom vehicle class will act as good key for hashmap ,
bascially they are expecting how will you override equals and hashcode method.
 
* How hashcode works internally ?
 
 
output of this :
 
    try {
    	...
    	return 10;
    } catch (Exception e){
    	...
    	return 20;
    } finally {
    	return 30;
    }
 
---------------
What is immutabe class , it advantages and disadvantages ?
 
    class Employee {
    	String name;
    	int age;
    	Date dob;
    	List<String> addresses;
    }
 
Make this class immutabe , considering all boundry conditions
 
 
----------------------------
 
    @Component
    class Car implements vehicle{}
    @Component
    class Bike implements Vehicle{}
    class processor{
    @Autowire
    Vehicle vehicle;
    }
 
Q : What is issue with this inmplementation, how would you fix this .
---------------------------------------
 
* Different annotation you have used in Spring and Spring Boot.
 
* Difference between @RestController and @Controller
 
* How would you handle exception in your Rest controller.
 
* Exception hierarchy in JAVA.
 
* What are the different Errors we have in JAVA , when they may araise ?
 
* SOLID principle with example.
 
* What is deadlock in Java , write an example to illustare the deadlock in Java.
 
* How will you come to know that deadlock happened , what is thread dump , how would you analyze thread dump in java.
 
  
Q : ['a', 'b', 'd', 'c', 'b', 'a', 'd']
 
Find the 1st repeating character from this array.

----------------------------------

1. How does the CI/CD pipeline work?
2. Optional usage, along with methods of utilization.
3. Find all pairs in the given array where the sum equals the expected sum, ensuring that all pairs are distinct.
int[] nums = {2, 8, 10, 14, 15, 17, 18};
expectedSum= 20;
4. Find the maximum integer using Java 8.
5. Explain Semaphore and provide code for ExecutorService.
6. Implement the Runnable class.
7. Find the employee name with the department name having the maximum sum of all salaries in SQL and Hibernate code.
   A. emp (id, departid, empName, salary, month) B.  department (id, deptname)
8. Types of ID generation.
9. Mapping with embedded ID annotation.
10. Explain the usage of the @Async annotation.
11. SplitIterator and its purpose.
12. Have you worked on caching mechanisms?
13. How to handle transactions using the @Transaction annotation.
14. Make an operation mandatory within a transaction.
----------------------------------

1. How Polymorphism works in Spring?
2.Which Command is used to  rename  file name in Linux?
3.How to view file in Linux?
4.How to convert  SQL objects into jpa object?
5.Write SQL query to find out the employee whose salary is greater than 30000 and age is greater than 30 years from each each department?
6. Find all unique pairs to find out given sum from given arraylist using Stream api.
-----------------------------------
1. how to download starter project using sprinboot in corporate?
2. Spring vs Sprinboot?
3. Configuration in spring vs Springboot?
4. Types of DI?
5. what is POM.xml file?
6. how to write log4j dependepncy in pom.xml file?
7. where log4j dependency file is created?
8. what are default values of POM.xml?
9. @Autowired annotation?
10. Which centralized repository you are using in your current project?
11. How to maintain Central repository?
12. How to create  simple spring boot application?
13. How to Connect db in hibernate?
14. How to insert row in hibernate?
15. what are minimum parameters to connect db in hibernate?
16. what is Spring MVC?
17. what is Exception handling in java?
18. what is compile time and run time excpetions in java?
19. what is the main purpose of exception handling?
20. What happen if you don't handle null pointer exception in java?

------------------------------------------------

Explain last project architecture. 
Explain security implementation in last project.
Explain day to day tasks performed at last project.
Explain Multithreading, explain any project related example how was it implemented.
Executerservice in java, Write program.
What is Future.
Thread lifecycle, how executerservice manages threads.
explain Synchronized keyword.
Difference between scopes protected and private.

#Write program for below scenario.

Create BankAccount class which has below params.

class BankAccount {
    List<User> users;
    BigDecimal balanceAmount;
}

1. List of users for that account.
2. Bankbalance

Functions.
1. Withdraw function
2. Deposit function
3. check balance

Implementation should be compatible with multithreaded environment.
Check balance function should wait for other operations to be completed before checking balance.
Bankaccount should be immutable.
Each function should expect user object, if user is present in list then perform the function.
Override equals and hashcode method of User class.
throw error for appropriate scenarios.
Write testcases for testing the functionlity of bankaccount.
What are checked and unchecked exceptions. Explain with examples

