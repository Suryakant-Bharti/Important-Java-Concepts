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

## Features of Java :

![java-features](https://user-images.githubusercontent.com/2780145/34343682-d387500a-e9fe-11e7-8f6f-d6f49200c291.png)

## Java Program Execution Process :

![java-execution-process](https://user-images.githubusercontent.com/2780145/34343683-d3aea7e0-e9fe-11e7-866d-26a8857e04c9.png)

## JDK - JRE - JVM - JIT :

![jdk-jre-jvm-jit](https://user-images.githubusercontent.com/2780145/34342877-771d2796-e9e4-11e7-9d18-98ed672a4b53.png)

## Internal Architecture of JVM :

![jvm-architecture](https://user-images.githubusercontent.com/2780145/34343635-f405f2f2-e9fc-11e7-9628-28992defdd0b.png)

## Data Type Promotion in Java :

![data type promotion small](https://user-images.githubusercontent.com/2780145/34228209-f6d50f78-e5f5-11e7-889a-f961742b8bd7.png)

## Java Naming Conventions :

<table class="alt">
<tbody><tr><th>Name</th><th>Convention</th></tr>
<tr><td>class name</td><td> should start with uppercase letter and be a noun 
<br>e.g. String, Color, Button, System, Thread etc.</td></tr>
<tr><td>interface name</td><td>should start with uppercase letter and be an adjective 
<br>e.g. Runnable, Remote, ActionListener etc.</td></tr>
<tr><td>method name</td><td>should start with lowercase letter and be a verb 
<br>e.g. actionPerformed(), main(), print(), println() etc.
</td></tr>
<tr><td>variable name</td><td>should start with lowercase letter
<br>e.g. firstName, orderNumber etc.</td></tr>
<tr><td>package name</td><td>should be in lowercase letter 
<br>e.g. java, lang, sql, util etc.
</td></tr>
<tr><td>constants name</td><td>should be in uppercase letter.
<br>e.g. RED, YELLOW, MAX_PRIORITY etc.</td></tr>
</tbody></table>

## Object vs Class

<table class="alt">
<tbody><tr><th>No.</th><th>Object</th><th>Class</th></tr>
<tr><td>1)</td><td>Object is an <strong>instance</strong> of a class.</td><td>Class is a <strong>blueprint or template</strong> from which objects are created.</td></tr>
<tr><td>2)</td><td>Object is a <strong>real world entity</strong> such as pen, laptop, mobile, bed, keyboard, mouse, chair etc.</td><td>Class is a <strong>group of similar objects</strong>.</td></tr>
<tr><td>3)</td><td>Object is a <strong>physical</strong> entity.</td><td>Class is a <strong>logical</strong> entity.</td></tr>
<tr><td>4)</td><td>Object is created through <strong>new keyword</strong> mainly e.g. Student s1=new Student();</td><td>Class is declared using <strong>class keyword</strong> e.g. class Student{}</td></tr>
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

<table class="alt">
<tbody><tr><th>No.</th><th>Method Overloading </th><th>Method Overriding</th></tr>
<tr><td>1)</td><td>Method overloading is used <em>to increase the readability</em> of the program.</td><td>Method overriding is used <em>to provide the specific implementation</em> of the method that is already provided by its super class.</td></tr>
<tr><td>2)</td><td>Method overloading is performed <em>within class</em>.</td><td>Method overriding occurs <em>in two classes</em> that have IS-A (inheritance) relationship.</td></tr>
<tr><td>3)</td><td>In case of method overloading, <em>parameter must be different</em>.</td><td>In case of method overriding, <em>parameter must be same</em>.</td></tr>
<tr><td>4)</td><td>Method overloading is the example of <em>compile time polymorphism</em>.</td><td>Method overriding is the example of <em>run time polymorphism</em>.</td></tr>
<tr><td>5)</td><td>In java, method overloading can't be performed by changing return type of the method only. <em>Return type can be same or different</em> in method overloading. But you must have to change the parameter.</td><td><em>Return type must be same or covariant</em> in method overriding.</td></tr>
</tbody></table>

## Abstract Class vs Interface

<table class="alt">
<tbody><tr><th>Abstract class</th><th>Interface</th></tr>
<tr><td>Abstract class can <strong>have abstract and non-abstract</strong> methods.</td><td>Interface can have <strong>only abstract</strong> methods. Since Java 8, it can have <strong>default and static methods</strong> also.</td></tr>
<tr><td>Abstract class <strong>doesn't support multiple inheritance</strong>.</td><td>Interface <strong>supports multiple inheritance</strong>.</td></tr>
<tr><td>Abstract class <strong>can have final, non-final, static and non-static variables</strong>.</td><td>Interface has <strong>only static and final variables</strong>.</td></tr>
<tr><td>Abstract class <strong>can provide the implementation of interface</strong>.</td><td>Interface <strong>can't provide the implementation of abstract class</strong>.</td></tr>
<tr><td>The <strong>abstract keyword</strong> is used to declare abstract class.</td><td>The <strong>interface keyword</strong> is used to declare interface.</td></tr>
<tr><td><strong>Example:</strong><br> public abstract class Shape{<br>public abstract void draw();}</td><td><strong>Example:</strong><br> public interface Drawable{<br>void draw();}</td></tr>
</tbody></table>

## Java Access Modifiers

<table class="alt">
<tbody><tr><th>Access Modifier</th><th>within class</th><th>within package</th><th>outside package by subclass only</th><th>outside package</th></tr>
<tr><td><b>Private</b></td><td>Y</td><td>N</td><td>N</td><td>N</td></tr>
<tr><td><b>Default</b></td><td>Y</td><td>Y</td><td>N</td><td>N</td></tr>
<tr><td><b>Protected</b></td><td>Y</td><td>Y</td><td>Y</td><td>N</td></tr>
<tr><td><b>Public</b></td><td>Y</td><td>Y</td><td>Y</td><td>Y</td></tr>
</tbody></table>

## Abstraction vs Encapsulation

<table class="alt">
<tbody><tr><th>Abstraction</th><th>Encapsulation</th></tr>
<tr><td>Abstraction is a process of hiding the implementation details and showing only functionality to the user.</td>
<td> Encapsulation is a process of wrapping code and data together into a single unit</td></tr>
<tr><td>Abstraction lets you focus on what the object does instead of how it does it.</td>
<td>Encapsulation provides you the control over the data and keeping it safe from outside misuse.</td></tr>
<tr><td>Abstraction solves the problem in the Design Level.</td>
<td>Encapsulation solves the problem in the Implementation Level.</td></tr>
<tr><td>Abstraction is implemented by using Interfaces and Abstract Classes.</td>
<td>Encapsulation is implemented by using Access Modifiers (private, default, protected, public)</td></tr>
<tr><td>Abstraction means hiding implementation complexities by using interfaces and abstract class.</td>
<td>Encapsulation means hiding data by using setters and getters.</td></tr>
</tbody></table>

## Methods of Object Class
The Object class is the parent class of all the classes in java by default.

<table class="alt">
<tbody><tr><th>Method</th><th>Description</th></tr>
<tr><td>public final Class getClass()</td><td>returns the Class class object of this object. The Class class can further be used to get the metadata of this class.</td></tr>
<tr><td>public int hashCode()</td><td> returns the hashcode number for this object.</td></tr>
<tr><td>public boolean equals(Object obj)</td><td> compares the given object to this object.</td></tr>
<tr><td>protected Object clone() throws CloneNotSupportedException</td><td> creates and returns the exact copy (clone) of this object.</td></tr>
<tr><td>public String toString()</td><td> returns the string representation of this object.</td></tr>
<tr><td>public final void notify()</td><td> wakes up single thread, waiting on this object's monitor.</td></tr>
<tr><td>public final void notifyAll()</td><td> wakes up all the threads, waiting on this object's monitor.</td></tr>
<tr><td>public final void wait(long timeout)throws InterruptedException</td><td> causes the current thread to wait for the specified milliseconds, until another thread notifies (invokes notify() or notifyAll() method).</td></tr>
<tr><td>public final void wait(long timeout,int nanos)throws InterruptedException</td><td>causes the current thread to wait for the specified milliseconds and nanoseconds, until another thread notifies (invokes notify() or notifyAll() method).</td></tr>
<tr><td>public final void wait()throws InterruptedException</td><td> causes the current thread to wait, until another thread notifies (invokes notify() or notifyAll() method).</td></tr>
<tr><td>protected void finalize()throws Throwable</td><td> is invoked by the garbage collector before object is being garbage collected.</td></tr>
</tbody></table>
