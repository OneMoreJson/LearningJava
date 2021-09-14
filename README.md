# Learning Java

### 2021 09 14 || US08 Challenge 04 Instructor

Yeah, his code is broken.  I really do not know why, but when I try to add a user it bypasses the name field and goes directly to the phone.  He has both the phone and name as a string.  This does make sense.  However, scanner.nextLine() doesn’t stop for me to enter the actual name before it asks me to input the number.  In my code, I pushed this task to the Contacts array list which pushed both created the contact object and fixed it to the array.  The phone managed the instructions.  Here the instructor literally has the Main class working the instructions.  I don’t thing that should be the case.  
   
   I did learn a few things.  I will need to go back through this lesson’s code to include comments so the thing actually makes sense.  However, I don’t think I want to spend much time on it.  
   
   Also, I am going to raise an issue on this code because it doesn’t let the user input the name when trying to add a contact.  If anyone can figure it out, that would be awesome.  

-----------------------------------------------------------------------------

### 2021 09 13 || College

Focused on reading the lessons and the four chapters assigned this week.  Specifically, they were reviews of data types, operators, and arrays.  I also took the time to download the lesson sections from the Udemy course while reading them.  On that note, I still need to review the List Challenge from Udemy to see how the instructor completed it.  

-----------------------------------------------------------------------------

### 2021 09 12 || Lists cont

The second run through of how lists should have encapsulated methods was really rough.  The instructor rushed through and made things really hard to jump around.  It also didn’t help that he made mistakes along the way, forcing you to follow him in jumping around to fix them.  Now, I think watching an instructor show you where mistakes can happen and how to fix them is very helpful.  However, these didn’t look like they were planned for instructional purpose.  “Oh, I made mistake” is not very encouraging.  He did know how to fix them very quickly… but it still means you’re questioning what part of the instruction was a mistake.  None-the-less, I need to remember the following method in copying one array list to another (without needing to use a “For-loop.”  Here it is:

// One Way…

public static void processArrayList() {
	ArrayList<String> newArray = new ArrayList<String>();
	newArray.addAll(groceryList.getGroceryList());
}

NOTE: this only works if the GroceryList List obj has a get method set inside it!

// Another Way…

public static void processArrayList() {
  ArrayList<String> nextArray = new ArrayList<String>(grocerList.getGroceryList());
}
	
#### 1700 || USO8 Challenge 04 Lists

Holy smokes, this has been a long challenge.  Mainly, I have been testing all sorts of stuff.  Frankly, I think I am still relying on what I know more than actually figuring out how the new stuff works.  Slowly getting there.  

None-the-less, this challenge is about creating an array list that keeps contact’s information within a cell phone.  Although it is a rather simplified concept of what would really need to take place, it does give us some ex in building, accessing, and modifying lists.  I completed my version.  However, I will finish the instructor’s version tomorrow and post that as well.  I am pretty sure I’m nowhere near where his version is.  It works though, so I call that a WIN!  

  -----------------------------------------------------------------------------

### 2021 09 11 || US08 Challenge 

Completed.  A lot of what was done in reversing the strings or integer digits can be revisited using the array information.  After looking at the instructor’s demonstration I want to remember a few things. First, I always forget that we can now use the built in: Arrays.toString(array) … Second, the instructor breaks the array into half and uses a temp var to hold data from first position until it can be placed in the last position.  This is done, mirroring data from first half to the second half.  Meanwhile, “i” is counting down to the halfway point.  Once there, we are done.  If we didn’t stop at the halfway point, we would end up mirroring the data back to the position it previously started at.  The result would look like nothing happened.  I am providing the instructor’s example with my comments because I thing this should be thoroughly incorporated within the programmer’s mindset.  

#### 2100  || Lists

First time really diving into the lists of java.  I am surprised as they are pretty powerful.  Arrays lead to understanding how lists should work.  However, from what I gather there are both limitations as well as benefits to using lists instead of an array.  Although, I’m not really seeing it right now.  I also noted that we are getting into a lot more built in methods.  I think you can learn to program, figuring out solutions to problems.  However, it also seems like a ton of strength comes from the built in libraries.  When you know how to use them, the language really opens up.  

-----------------------------------------------------------------------------

### 2021 09 10 || US08 Challenge

Completed.  Also broke down how sorting data within an array works.  I am really pleased with finally getting to understand how this is done.  I will post my work in GH (done).  

#### 2030 || US08 Ref Types vs Value Types

Really bring home the understanding of references verses values during this course.  Does that mean it is easy to understand?  Hell no!  However, I think I get how ref can ruin code over time.  If you say this var is equal to another var, it will ref the data address at a point, but that will mean they are tied together.  In order to break that link, you need to re-assign the var to a new data address.  That is what we were doing in the shell game earlier.

#### 2100 || US08 Challenge 02

Completed the challenge.  I posted it in GH.  


-----------------------------------------------------------------------------

### 2021 09 09 || College

Completed the first assignments for week 01 in both classes.

#### 1500 || US08 Arrays

Relearning arrays.  Working on the first challenge of the section.  I should have some work completed and posted this weekend (since week 01 classwork is completed).  

-----------------------------------------------------------------------------

### 2021 09 08 || College 

Downloading textbooks for courses. Completed the forum for the AD course and reviewed the lessons for both classes.  I am expecting that I might be able to continue with the Udemy course while I work on college assignments.  In truth, Udemy is teaching a lot more than the actual academic programs in college.  The OOP with Java seems to repeat lessons that we did last course (with some variety).  I don’t mean exactly repeating… rather the subject matter is repeated.  That is a bit discouraging.  

#### 1930 || US07 MC Instructor

I’m reviewing the instructor’s explanation on how he completed the MC.  Surprisingly, I was on the right path.  That is until I wanted to add user input to include additions to the basic hamburger.  I think I will continue with that line of thinking and post it in GH as part of my MC completion.  I also noticed he did a series of if statements that served as adding items to the hamburger.  I literally did the same thing.  I even looked to see if the additional item was “null!”  That was kind of cool to see my mind was thinking somewhat properly.  

-----------------------------------------------------------------------------

### 2021 09 07 || College Courses

Started two new classes in college.  First class is a continuation on the OOP Java class.  The first is 381 OOP with Java.  The second is a 400 level course on Application Development (AD).  This one looks like it will focus on the PMP side of SDLC.  I completed the reading assignments in both classes.  I also completed the forum assignment for the OOP Java course.  Tomorrow, I focus on the lessons and completing AD forums

-----------------------------------------------------------------------------

### 2021 09 06 || US07 MC

Well… Starting next two courses in college so I am going to need to set aside these Code Challenges and Challenges for a period in which I have time.  However, I will continue burning through the lesson portions of the Udemy course as they really help with what we are doing on the academic side.  So, with that said, today we are going to see what the instructor had in mind when he set out this MC…  

-----------------------------------------------------------------------------

### 2021 09 04 || US07 Master Challenge

I’m completing section seven. Since this section focuses on OOP, we are reviewing things we learned in Sections one through seven… especially inheritance, encapsulation and polymorphism.  For most of the challenges I have been following (really, let’s call it “tracing) the instructor’s work.  Mainly I did this because the challenge instructions sucked pretty bad.  There are quite a few people in the comments that have expressed their frustration.  The Code Challenges are actually better at explaining what they are looking for.  They have to, because the debugging feature is terrible (yes… what debugging feature?).  Still, I am working on this project on my own.  I’m doing this primarily because I want to post something on GH that isn’t a clone of someone else’s work.  Secondly, I think I could have some fun with the Bill’s Burger Master Challenge.  After I’m done, I’ll post my work and the instructors for comparison.  

-----------------------------------------------------------------------------

### 2021 09 03 || US07 Encapsulation

Continuing with Udemy and the encapsulation discussion.  This is a review on when we would want to use encapsulation or inheritance.  Also spent a ton of time on the challenges.  There were some interesting issues with the way the instructor set up the challenge and how the Udemy code compiler wanted things presented.  Worked through some Q&A forums to figure out just what and why the code did not work.  

#### 1400 || US07 Polymorphism 

Polymorphism is the ability to use written code for something outside its original use.  The example created during this lesson was the ability to have a random code select a movie object and provide its plot.  However, if the movie did not have a plot it would inherit from the parent class Movie and provide “no plot here.”  All movies that did have a plot would provide it in their own obj with an override function.  The point of this lesson was to show that you can create generic code that could be “morphed” into use case situations.  

-----------------------------------------------------------------------------

### 2021 09 02 0400 || US07

Knocking out some challenges from the Udemy Course.  US07 stands of Udemy Section 07.  This challenge isn’t especially challenging.  However, it does reinforce how to check for an empty string: nameOfObject.isEmpty() … provides a boolean response which is used within the if statements.  This is the first time I’ve used it.

#### 0530 || US07 Encapsulation

Rewatched instruction on constructors.  This time, I wrote the code to get a better “feeling” on how constructors work.  I like to think of them as components working together to create a functioning machine.  The instructor did great at using a computer as an example in which constructors work.  However, the challenge we are to write is a little odd.  We are to create a “house” with the constructors connecting rooms and peaces of the room.  That is far from the typical machine concept.  Still, I’ll give it a try…

-----------------------------------------------------------------------------

## Admin

### 2021 09 01 1600 || Updating Files

Adding folders and files that I have been working through in the previous sections

#### 2100 || Updates

More updates.  

-----------------------------------------------------------------------------

## Udemy Section 07

### 2021 08 31 1430 || Beginning

Starting Section 7:  OOP - Composition Encapsulation, and Polymorphism.

## Admin

I have been working on a Udemy Course Called: Java Programming Masterclass covering Java 11 & Java 17 by Tim Buchalka.  A ton of people have gone through his course and He does seem to try and keep it refreshed.  It does have some serious issues.  However, it seems to be the “most recommended” course online.  I really cannot find any other for the price of twenty dollars (on a Udemy sale).  I have completed Sections one through five.  That includes the tedious Code Challenges.  I also worked through section six, but I needed to skip the challenges because I’m trying to get the academic understanding to help with my college courses.  I find the coding challenges often hold you back from learning what you need to understand to grasp the bigger picture.  You will spend a ton of time trying to complete a challenge, only to know that you will never use it when you could just use something else Java provides.  It’s like being told to paint a wall with a toothbrush, when you know there’s a spray gun just a few lessons away!  Why slow the learning progress?  Actually, I really understand these challenges will help solidify educational point.  That is why I earmarked all the challenges to be done when I have limited internet capabilities… and time.  I need more time… 

-----------------------------------------------------------------------------

## Coursework

## Admin

### 2021 08 31 1300 || Clean

Clean up folders and deleted items not needed in GH.  I might want to clean folders and leave a report on what each course taught and if I think it was worth taking it.  I can’t have 1000s of MB files all showing “hello world” just because each class explains how to write the program using a different stack.  

-----------------------------------------------------------------------------

## LL 04 Java Memory Management

### 2021 08 28 1200 || LL 04 Return

Returning to the Linkedin Learning course on Java Memory Management.  I have been working on a Udemy course while completing my OOP Java course in AMU.  Now, its time to complete this LL course after learning what I’ve learned in the previous courses.  Later today, I will include the files completed in the Udemy course.  

-----------------------------------------------------------------------------

## 2021 08 30 || OOP Java Course

Completed Several College Courses. Although I am still learning, it might be time to post some that work. The instructors provide good feedback. However, I think I will learn even more when those within the community review and communicate their own experience in these projects. With that... and with some trepidation (^^), here we go... 

-----------------------------------------------------------------------------

## Admin

### 2021 07 13 1600 || Admin

Updating all files onto a new computer

-----------------------------------------------------------------------------

## LL 04 Java Memory Management

### 2021 06 28 1000 || LL 04 

1. How memory works in Java, 2. Values and References, 3. Escaping References and 4. Intro to Garbage Collection…

-----------------------------------------------------------------------------

## LL 03 Learning Java Applications

### 2021 06 28 0730 || LL 03 Cont

1. Install Java and IDE (Eclipse and Swing),  2. Java Basic Review, Create a User Interface with Swing, 4. Tables and Data Source, 5. Distribution and Deployment, 6. Server—Side Java: JSP, 7. Android Dev

#### 1300 || Downloads

Download Eclipse, WindowBuilder (Swing), JEE Server Stuff, Android Studio

#### 1300 || Rewatch and Do

-----------------------------------------------------------------------------

### 2021 06 27 1000 || LL 02 Completion

How to debug and complete exception handling.  Create Custom Classes. Work with inheritance (Polymorphism).  Manage Data Collections. 

-----------------------------------------------------------------------------

### 2021 06 26 0900 || LL 02 

Worked through string, numbers and combining everything.  Here are the chapters: Manage String Values & Manage Program Flow.

-----------------------------------------------------------------------------

### 2021 06 13 1600 || LL 02 Intro and Prep 

Set up files and journal.  Also, jshell is a very powerful tool.  Remember the following commands as they might help:

jshell (in the terminal)
/list
/save filename.java
/open filename.java
/reset
/help
/exit

Note: you always want to compile from the source directory (src) when you are working in the terminal.  This is done by “javac com/company/main.java” in the terminal.  Also “sout" is a shortcut for “System.out.println(“”);”  This is extremely useful!!!!

#### 1700 || strings and data
So much more!!!

-----------------------------------------------------------------------------

## LL 02 Java 11+ Essential Training

### 2021 06 10 0800 || LL 02 Intro

First there is a package.  Then there is the class (public class Main).  Then there is a main method.  The parentheses defined parameters.  In the curly braces you have the main code.  JSHell allows you to test java code inside the terminal.  Java is also case sensitive.  Java is not white space sensitive (unlike python).  The end of your code, you must end with semicolon.  There is more about syntax and memory management.  Something we don’t talk about in other languages so far.  

The following helps you manage your memory use.  
Runtime.maxMemory()
Runtime.totalMemor() 

-----------------------------------------------------------------------------

### 2021 06 09 : 2000 || LL O1 Class Instances

Went over creating instances from classes using a triangle class.  This is just a simple view of everthing.  A lot of things are different when compared to Python.  I really do think that Python is more simple.  However, I like how Java can be compiled into machine code.  That lets it be used on MANY more types of devices.  I am having a little difficulty following.  I do think the problem is on me.  The instructor is actually great at mixing the tone and pitch of delivery.  I just need to watch some more and run through a lot more examples.  

Here is a Summary:
Class help organize our code; they contain attributes (also referred to as properties) and behavior (also referred to as methods).  Every class contains a constructor that can create instances.  The Class is a blueprint while the constructor builds instances from the blueprint.  

Finished LL 01

-----------------------------------------------------------------------------

### 2021 06 08 : 1840 || LL 01 Class

The constructor may or may not take inputs.  A constructor always returns an instance of the class it’s in (that is, a constructor in the Triangle class returns a triangle) … because the lesson is talking about a class that creates triangles… What I’m winding is: Is an “instance” the same as and “object?”  This instruction seems to use words that are not consistent with what they saying… that or they interchange words that have different and same meanings!  Ok, objects come from class.  Actually I’ve learned about classes and objects. However, Java really does some unique thing that works similar, yet very different.  For one… a class created is actually now considered as a data type.  That is very different from what I am familiar with.  Although I don’t think it is divergent… it is not something other languages revealed as a concept.  More learning and comparisons will need to be made.  

Lets talk about the triangle class that we are going to build from the instructions.  Atribute variables are called instance variables because they are each instance will have a variable for.  

-----------------------------------------------------------------------------
### 2021 06 07 : 0800 || LL 01 Functions

The “public static void” is a return type.  The word “void” can be changed to a double data type.  Need to understand functions verses operations.  Google GeeksforGeeks.org.  After chapter 5 challenge, we learn about classes.  Classes are user defined blueprint that has a set of attributes and behaviors that define the item that it is supposed to represent.  So, remember attributes, operations, and relations. Focusing on the attributes right now.  The Operations is known as a “behavior.”  It is also known as a function within Python and Java.  This is also called a “method.”  Interestingly, you can add the keyword “static” if the function does not use the attributes of a class, but still relates to the overall theme or idea of the class. More on this later…

An instance is an object created from a class blueprint.  So, ACCarrier c  lass can have USS Lincoln as an instance of that blueprint.  Creating an instance is done through a constructor.  A constructor is a special method or behavior inside every class that creates an initializes instances.  It is the construction yard to our Air Craft Carrier class.  

-----------------------------------------------------------------------------

### 2021 06 06 : 0830 || LL 01 IDE

Learning about the IDE (InteliJ).  Noticing that it runs slow on my current MacBook 13 inch (2013).  Java has two different data types: Primitive (Boolean, int, double, char) and Reference Types.  Also review strings, concatenation, and input/outputs.  Next we look at logic decisions.  Things like “Control Flow.” To test this, we did a Fortune Teller Flow Control program.  

Relational Operators: >, <, ==, , >=, <=, !=

#### 1400 || LL 01 Java
Completed debugging and Functions.  Found out that you can change an input into a double by using the .nextDoube() notation.  That changed my Scanner result into a double to be used for math.  Not bad!

-----------------------------------------------------------------------------


## LL 01 Learning Java

### 2021 06 05 : 2200 || LL 01
Starting a 20 Hour Course on becoming a “Becoming a Java Programmer.”  The first course starts with “Learning Java” by  Kathryn Hodg.  This is a two hour and forty minute course.  It will take time to build off of this because it has been a long time since I have had a chance to actually study programming.  

-----------------------------------------------------------------------------
