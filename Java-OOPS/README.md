# Java Fundamentals and Object Oriented Programming

Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects. It simplifies the software development and maintenance. Main Concepts - Inheritance, Polymorphism, Abstraction, Encapsulation.

## Data Types in Java

<table class="alt"> 
<tbody><tr> 
  <th id="table_dvpt_datatype"><strong>Data Type</strong></th> 
  <th id="table_dvpt_defaultvalue"><strong>Default Value</strong></th> 
  <th id="table_dvpt_defaultsize"><strong>Default size</strong></th> 
</tr> 
<tr> 
<td headers="table_dvpt_datatype">boolean</td> 
<td headers="table_dvpt_defaultvalue">false</td> 
<td headers="table_dvpt_defaultsize">1 bit</td> 
</tr> 
<tr> 
<td headers="table_dvpt_datatype">char</td> 
<td headers="table_dvpt_defaultvalue">'\u0000'</td> 
<td headers="table_dvpt_defaultsize">2 byte</td> 
</tr> 
<tr> 
<td headers="table_dvpt_datatype">byte</td> 
<td headers="table_dvpt_defaultvalue">0</td> 
<td headers="table_dvpt_defaultsize">1 byte</td> 
</tr> 
<tr> 
<td headers="table_dvpt_datatype">short</td> 
<td headers="table_dvpt_defaultvalue">0</td> 
<td headers="table_dvpt_defaultsize">2 byte</td> 
</tr> 
<tr> 
<td headers="table_dvpt_datatype">int</td> 
<td headers="table_dvpt_defaultvalue">0</td> 
<td headers="table_dvpt_defaultsize">4 byte</td> 
</tr> 
<tr> 
<td headers="table_dvpt_datatype">long</td> 
<td headers="table_dvpt_defaultvalue">0L</td> 
<td headers="table_dvpt_defaultsize">8 byte</td> 
</tr> 
<tr> 
<td headers="table_dvpt_datatype">float</td> 
<td headers="table_dvpt_defaultvalue">0.0f</td> 
<td headers="table_dvpt_defaultsize">4 byte</td> 
</tr> 
<tr> 
<td headers="table_dvpt_datatype">double</td> 
<td headers="table_dvpt_defaultvalue">0.0d</td> 
<td headers="table_dvpt_defaultsize">8 byte</td> 
</tr> 
</tbody></table>

NOTE : UTF-8 is the most popular unicode character encoding with 90% websites using it.

## Data Type Promotion in Java :

![data type promotion small](https://user-images.githubusercontent.com/2780145/34364362-403e9db4-eaab-11e7-914b-7acc9007cf41.png)

## Wrapper Classes in Java

<table class="alt">
<tbody><tr><th>Primitive Type</th><th>Wrapper class</th></tr>
<tr><td>boolean</td><td>Boolean</td></tr>
<tr><td>char</td><td>Character</td></tr>
<tr><td>byte</td><td>Byte</td></tr>
<tr><td>short</td><td>Short</td></tr>
<tr><td>int</td><td>Integer</td></tr>
<tr><td>long</td><td>Long</td></tr>
<tr><td>float</td><td>Float</td></tr>
<tr><td>double</td><td>Double</td></tr>
</tbody></table>

## Operators in Java

<table class="alt"> 
<tbody><tr><th>Operator Type</th><th>Category</th><th>Precedence</th></tr> 
<tr> 
<td rowspan="2">Unary</td><td>postfix</td><td><code><em>expr</em>++ <em>expr</em>--</code></td> 
</tr>  
<tr> 
<td>prefix</td><td headers="precedence"><code>++<em>expr</em> --<em>expr</em> +<em>expr</em> -<em>expr</em> ~ !</code></td> 
</tr> 
<tr> 
<td rowspan="2">Arithmetic</td><td>multiplicative</td><td headers="precedence"><code>* / %</code></td> 
</tr> 
<tr> 
<td>additive</td><td headers="precedence"><code>+ -</code></td> 
</tr> 
<tr> 
<td>Shift</td><td>shift</td><td headers="precedence"><code>&lt;&lt; &gt;&gt; &gt;&gt;&gt;</code></td>  
</tr> 
<tr> 
<td rowspan="2">Relational</td><td>comparison</td><td headers="precedence"><code>&lt; &gt; &lt;= &gt;= instanceof</code></td> 
</tr> 
<tr> 
<td>equality</td><td headers="precedence"><code>== !=</code></td> 
</tr>  
<tr> 
<td rowspan="3">Bitwise</td><td>bitwise AND</td><td headers="precedence"><code>&amp;</code></td> 
</tr> 
<tr> 
<td>bitwise exclusive OR</td><td headers="precedence"><code>^</code></td> 
</tr> 
<tr> 
<td>bitwise inclusive OR</td><td headers="precedence"><code>|</code></td> 
</tr>  
<tr> 
<td rowspan="2">Logical</td><td>logical AND</td><td headers="precedence"><code>&amp;&amp;</code></td> 
</tr> 
<tr> 
<td>logical OR</td><td headers="precedence"><code>||</code></td> 
</tr> 
<tr> 
<td>Ternary</td><td>ternary</td><td headers="precedence"><code>? :</code></td> 
</tr> 
<tr> 
<td>Assignment</td><td>assignment</td><td headers="precedence"><code>= += -= *= /= %= &amp;= ^= |= &lt;&lt;= &gt;&gt;= &gt;&gt;&gt;=</code></td> 
</tr> 
</tbody></table>

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
<tbody><tr><th>Object</th><th>Class</th></tr>
<tr><td>Object is an <strong>instance</strong> of a class.</td><td>Class is a <strong>blueprint or template</strong> from which objects are created.</td></tr>
<tr><td>Object is a <strong>real world entity</strong> such as pen, laptop, mobile, bed, keyboard, mouse, chair etc.</td><td>Class is a <strong>group of similar objects</strong>.</td></tr>
<tr><td>Object is a <strong>physical</strong> entity.</td><td>Class is a <strong>logical</strong> entity.</td></tr>
<tr><td>Object is created through <strong>new keyword</strong> mainly e.g. Student s1=new Student();</td><td>Class is declared using <strong>class keyword</strong> e.g. class Student{}</td></tr>
<tr><td>Object is created <strong>many times</strong> as per requirement.</td><td>Class is declared <strong>once</strong>.</td></tr>
<tr><td>Object <strong>allocates memory when it is created</strong>.</td><td>Class <strong>doesn't allocated memory when it is created</strong>.</td></tr>
<tr><td>There are <strong>many ways to create object</strong> like new keyword, newInstance() method, clone() method, factory method & deserialization.</td><td>There is only <strong>one way to define class</strong> in java using class keyword.</td></tr>
</tbody></table>

## Constructors vs Methods

<table class="alt">
<tbody><tr><th>Java Constructor</th><th>Java Method</th></tr>
<tr><td>Constructor is used to initialize the state of an object.</td><td>Method is used to expose behaviour of an object.</td></tr>
<tr><td>Constructor must not have return type.</td><td>Method must have return type.</td></tr>
<tr><td>Constructor is invoked implicitly.</td><td>Method is invoked explicitly.</td></tr>
<tr><td>Compiler provides a default constructor if you don't have any constructor.</td><td>Method is not provided by compiler in any case.</td></tr>
<tr><td>Constructor name must be same as the class name.</td><td> Method name may or may not be same as class name.</td></tr>
</tbody></table>

## Types of Inheritance (Supported through Class)

![single inheritance](https://user-images.githubusercontent.com/2780145/34364364-40b6b646-eaab-11e7-8c92-2c4cd9d0b2ca.png)

## Types of Inheritance (Supported through Interface only)

![multiple inheritance](https://user-images.githubusercontent.com/2780145/34364363-407486b8-eaab-11e7-94e2-5c1876f414d3.png)

## Assciation - Aggregation - Composition

![association-aggregation-composition](https://user-images.githubusercontent.com/2780145/34364371-5db00694-eaab-11e7-8ef2-bf56d3394f15.png)

## Aggregation vs Composition

<table class="alt">
<tbody><tr><th>Aggregation</th><th>Composition</th></tr>
<tr><td>Aggregation is a weak Association.</td><td>Composition is a strong Association.</td></tr>
<tr><td>Class can exist independently without owner.</td><td>Class can not meaningfully exist without owner.</td></tr>
<tr><td>Have their own Life Time.</td><td>Life Time depends on the Owner.</td></tr>
<tr><td>A uses B.</td><td>A owns B.</td></tr>
<tr><td>Child can have many owners.</td><td>Child can have only 1 owner.</td></tr>
<tr><td>Has-A relationship. A has B.</td><td>Part-Of relationship. B is part of A.</td></tr>
<tr><td>Denoted by a empty diamond in UML.</td><td>Denoted by a filled diamond in UML.</td></tr>
<tr><td>We do not use "final" keyword for Aggregation.</td><td>"final" keyword is used to represent Composition.</td></tr>
<tr><td>Examples:<br>- Car has a Driver.<br>- A Human uses Clothes.<br>- A Company is an aggregation of People.<br>- A Text Editor uses a File.<br>- Mobile has a SIM Card.</td><td>Examples:<br>- Engine is a part of Car.<br>- A Human owns the Heart.<br>- A Company is a composition of Accounts.<br>- A Text Editor owns a Buffer.<br>- IMEI Number is a part of a Mobile.</td></tr>
</tbody></table>

NOTE : "final" keyword is used in Composition to make sure child variable is initialized.

## Polymorphism - Method Overloading vs Method Overriding

<table class="alt">
<tbody><tr><th>Method Overloading </th><th>Method Overriding</th></tr>
<tr><td>Method overloading is used <em>to increase the readability</em> of the program.</td><td>Method overriding is used <em>to provide the specific implementation</em> of the method that is already provided by its super class.</td></tr>
<tr><td>Method overloading is performed <em>within class</em>.</td><td>Method overriding occurs <em>in two classes</em> that have IS-A (inheritance) relationship.</td></tr>
<tr><td>In case of method overloading, <em>parameter must be different</em>.</td><td>In case of method overriding, <em>parameter must be same</em>.</td></tr>
<tr><td>Method overloading is the example of <em>compile time polymorphism</em>.</td><td>Method overriding is the example of <em>run time polymorphism</em>.</td></tr>
<tr><td>In java, method overloading can't be done by changing only the return type of method. <em>Return type can be same/different</em> in overloading, but you must change the parameter.</td><td><em>Return type must be same or covariant (changing return type to subclass type)</em> in method overriding.</td></tr>
</tbody></table>

## Abstract Class vs Interface

<table class="alt">
<tbody><tr><th>Abstract class</th><th>Interface</th></tr>
<tr><td>Abstract class can <strong>have abstract and non-abstract</strong> methods.</td><td>Interface can have <strong>only abstract</strong> methods. Since Java8, it can have <strong>default & static methods</strong> also.</td></tr>
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
