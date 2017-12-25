# Java Fundamentals and Object Oriented Programming

Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects. It simplifies the software development and maintenance. Main Concepts - Inheritance, Polymorphism, Abstraction, Encapsulation.

## C++ vs Java :

<table class="alt">
<tbody><tr><th>Comparison Index</th> <th>C++</th><th>Java</th></tr>
<tr><td>Platform-independent</td><td>C++ is platform-dependent.</td><td>Java is platform-independent.</td></tr>
<tr><td>Mainly used for</td><td>C++ is mainly used for system programming.</td><td>Java is mainly used for application programming. It is widely used in window, web-based, enterprise and mobile applications.</td></tr>
<tr><td>Goto</td><td>C++ supports goto statement.</td><td>Java doesn't support goto statement.</td></tr>
<tr><td>Multiple inheritance</td><td>C++ supports multiple inheritance.</td><td>Java doesn't support multiple inheritance through class. It can be achieved by interfaces in java.</td></tr>
<tr><td>Operator Overloading</td><td>C++ supports operator overloading.</td><td>Java doesn't support operator overloading.</td></tr>
<tr><td>Pointers</td><td>C++ supports pointers. You can write pointer program in C++.</td><td>Java supports pointer internally. But you can't write the pointer program in java. It means java has restricted pointer support in java.</td></tr>
<tr><td>Compiler and Interpreter</td><td>C++ uses compiler only.</td><td>Java uses compiler and interpreter both.</td></tr>
<tr><td>Call by Value and Call by reference</td><td>C++ supports both call by value and call by reference.</td><td>Java supports call by value only. There is no call by reference in java.</td></tr>
<tr><td>Structure and Union</td><td>C++ supports structures and unions.</td><td>Java doesn't support structures and unions.</td></tr>
<tr><td>Thread Support</td><td>C++ doesn't have built-in support for threads. It relies on third-party libraries for thread support.</td><td>Java has built-in thread support.</td></tr>
<tr><td>Documentation comment</td><td>C++ doesn't support documentation comment.</td><td>Java supports documentation comment (/** ... */) to create documentation for java source code.</td></tr>
<tr><td>Virtual Keyword</td><td>C++ supports virtual keyword so that we can decide whether or not override a function.</td><td>Java has no virtual keyword. We can override all non-static methods by default. In other words, non-static methods are virtual by default.</td></tr>
<tr><td>unsigned right shift &gt;&gt;&gt;</td><td>C++ doesn't support &gt;&gt;&gt; operator.</td><td>Java supports unsigned right shift &gt;&gt;&gt; operator that fills zero at the top for the negative numbers. For positive numbers, it works same like &gt;&gt; operator.</td></tr>
<tr><td>Inheritance Tree</td><td>C++ creates a new inheritance tree always.</td><td>Java uses single inheritance tree always because all classes are the child of Object class in java. Object class is the root of inheritance tree in java.</td></tr>
</tbody></table>

## Data Type Promotion in Java :

![data type promotion small](https://user-images.githubusercontent.com/2780145/34228209-f6d50f78-e5f5-11e7-889a-f961742b8bd7.png)

## Java Naming Conventions :

<table class="alt">
<tbody><tr><th>Name</th><th>Convention</th></tr>
<tr><td>class name</td><td> should start with uppercase letter and be a noun e.g. String, Color, Button, System, Thread etc.</td></tr>
<tr><td>interface name</td><td>should start with uppercase letter and be an adjective 
e.g. Runnable, Remote, ActionListener etc.</td></tr>
<tr><td>method name</td><td>should start with lowercase letter and be a verb e.g. actionPerformed(), main(), print(), println() etc.
</td></tr>
<tr><td>variable name</td><td>should start with lowercase letter
e.g. firstName, orderNumber etc.</td></tr>
<tr><td>package name</td><td>should be in lowercase letter 
e.g. java, lang, sql, util etc.
</td></tr>
<tr><td>constants name</td><td>should be in uppercase letter.
e.g. RED, YELLOW, MAX_PRIORITY etc.</td></tr>
</tbody></table>

## Object vs Class

<table class="alt">
<tbody><tr><th>No.</th><th>Object</th><th>Class</th></tr>
<tr><td>1)</td><td>Object is an <strong>instance</strong> of a class.</td><td>Class is a <strong>blueprint or template</strong> from which objects are created.</td></tr>
<tr><td>2)</td><td>Object is a <strong>real world entity</strong> such as pen, laptop, mobile, bed, keyboard, mouse, chair etc.</td><td>Class is a <strong>group of similar objects</strong>.</td></tr>
<tr><td>3)</td><td>Object is a <strong>physical</strong> entity.</td><td>Class is a <strong>logical</strong> entity.</td></tr>
<tr><td>4)</td><td>Object is created through <strong>new keyword</strong> mainly e.g.<br> Student s1=new Student();</td><td>Class is declared using <strong>class keyword</strong> e.g.<br> class Student{}</td></tr>
<tr><td>5)</td><td>Object is created <strong>many times</strong> as per requirement.</td><td>Class is declared <strong>once</strong>.</td></tr>
<tr><td>6)</td><td>Object <strong>allocates memory when it is created</strong>.</td><td>Class <strong>doesn't allocated memory when it is created</strong>.</td></tr>
<tr><td>7)</td><td>There are <strong>many ways to create object</strong> in java such as new keyword, newInstance() method, clone() method, factory method and deserialization.</td><td>There is only <strong>one way to define class</strong> in java using class keyword.</td></tr>
</tbody></table>

## Constructors vs Methods

<table class="alt">
<tbody><tr><th>Java Constructor</th><th>Java Method</th></tr>
<tr><td>Constructor is used to initialize the state of an object.</td><td>Method is used to expose behaviour of an object.</td></tr>
<tr><td>Constructor must not have return type.</td><td>Method must have return type.</td></tr>
<tr><td>Constructor is invoked implicitly.</td><td>Method is invoked explicitly.</td></tr>
<tr><td>The java compiler provides a default constructor if you don't have any constructor.</td><td>Method is not provided by compiler in any case.</td></tr>
<tr><td>Constructor name must be same as the class name.</td><td> Method name may or may not be same as class name.</td></tr>
</tbody></table>

## Types of Inheritance (Supported through Class)

![single inheritance](https://user-images.githubusercontent.com/2780145/34229063-f2c8d010-e5f8-11e7-8e49-d2d750bb850a.png)

## Types of Inheritance (Supported through Interface only)

![multiple inheritance](https://user-images.githubusercontent.com/2780145/34229358-f95d95e0-e5f9-11e7-8ac5-c0a3aef2f89d.png)

## Polymorphism - Method Overloading vs Method Overriding

![method overloading vs method overriding](https://user-images.githubusercontent.com/2780145/34219473-4b0ea5fa-e5d7-11e7-942c-12c7493b282d.png)

## Abstract Class vs Interface

![abstract class vs interface](https://user-images.githubusercontent.com/2780145/34228145-a8899456-e5f5-11e7-9700-3da10a91ee83.png)

## Java Access Modifiers

![java access modifiers](https://user-images.githubusercontent.com/2780145/34307899-81fbccce-e770-11e7-9b13-fcfff05fd1a1.png)

## Abstraction vs Encapsulation

![abstraction vs encapsulation](https://user-images.githubusercontent.com/2780145/34227453-24176ed4-e5f3-11e7-8361-b006727fd273.png)

## Methods of Object Class
The Object class is the parent class of all the classes in java by default.

![methods of object class](https://user-images.githubusercontent.com/2780145/34322988-65f36ff4-e85c-11e7-9925-f0d2dab7a5db.png)
