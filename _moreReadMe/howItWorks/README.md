# Java Features and Internal Working

Java is a **programming language** and a **platform**. 

**Platform:** Any hardware or software environment in which a program runs, is known as a platform. Since Java has its own runtime environment (JRE) and Application Programming Interface (API), it is called platform.

## Features of Java :

![java-features](https://user-images.githubusercontent.com/2780145/34343690-2fd47db0-e9ff-11e7-9630-75423dda7eaa.png)

- **Simple:**
  - Syntax is based on C++
  - Removed confusing features - explicit pointers, operator overloading, multiple inheritance, etc
  - Introduced Automatic Garbage Collection
 
- **Object-oriented:**
  - In Java, we organize the software as a combination of different types of objects that incorporates both data and behaviour.
  - Based on the concept of Objects, Class, Inheritance, Polymorphism, Abstraction, Encapsulation
  
- **Platform Independent:**
  - Java provides software-based platform. It has two components:
    - JRE (Runtime Environment)
    - API (Application Programming Interface)
  - Java code is compiled by the compiler and converted into bytecode. This bytecode is a platform-independent. Can run on many platforms - Windows, Linux, Mac, etc.
  
- **Secured:**
  - **No explicit pointer**
  - **JVM -** java Programs run inside virtual machine sandbox 
  - **Classloader -** adds security by separating the package for the classes of the local file system from those that are imported from network sources.
  - **Bytecode Verifier -** checks the code fragments for illegal code that can violate access right to objects.
  - **Security Manager -** determines what resources a class can access such as reading and writing to the local disk.
  - **More -** developers can add extra security through SSL, JAAS, Cryptography etc.
  
- **Robust:**
  - Good memory management - automatic garbage collection.
  - No pointers - increses security. 
  - Exception handling - increses robustness against errors.
  - Strongly typed - variables' data types must be declared before they can be used.
  
- **Architecture-Neutral:**
  - There is no implementation dependent features. e.g. size of primitive types is fixed.
  
- **Portable:**
  - Write Once and Run Anywhere.
  
- **High-Performance:**
  - Java is faster than traditional interpretation since byte code is "close" to native code. NOTE: It is still somewhat slower than a compiled language like C++.
  
- **Distributed:**
  - We can create distributed applications in java. RMI and EJB are used for creating distributed applications.
  - We may access files by calling the methods from any machine on the internet.
  
- **Multi-threaded:**
  - A thread is like a separate program, executing concurrently. We can write Java programs that deal with many tasks at once by defining multiple threads.
  - The main advantage of multi-threading is that it doesn't occupy memory for each thread. It shares a common memory area.
  - Threads are important for multi-media, Web applications etc.
  
- **Simple:**
  - Sy
  
- **Simple:**
  - Sy
  
  
  

## Java Program Execution Process :

![java-execution-process](https://user-images.githubusercontent.com/2780145/34343683-d3aea7e0-e9fe-11e7-866d-26a8857e04c9.png)

## JDK - JRE - JVM - JIT :

![jdk-jre-jvm-jit](https://user-images.githubusercontent.com/2780145/34342877-771d2796-e9e4-11e7-9d18-98ed672a4b53.png)

## Internal Architecture of JVM :

![jvm-architecture](https://user-images.githubusercontent.com/2780145/34343635-f405f2f2-e9fc-11e7-9628-28992defdd0b.png)

JVM (Java Virtual Machine) has various sub components internally. You can see the most important ones in the above diagram.

- **Class loader sub system:** JVM's class loader sub system performs 3 tasks
  - It loads .class file into memory.
  - It verifies byte code instructions.
  - It allots memory required for the program.
  
- **Run time data area:** This is the memory resource used by JVM and it is divided into 5 parts
  - **Method area:** Method area stores class code and method code.
  - **Heap:** Objects are created on heap.
  - **Java stacks:** Java stacks are the places where the Java methods are executed. A Java stack contains frames. On each frame, a separate method is executed.
  - **Program counter registers:** The program counter registers store memory address of the instruction to be executed by the micro processor.
  - **Native method stacks:** The native method stacks are places where native methods (for example, C language programs) are executed. Native method is a function, which is written in another language other than Java.
  
-  **Native method interface:** Native method interface is a program that connects native methods libraries (C header files) with JVM for executing native methods.

- **Native method library:** holds the native libraries information.

- **Execution engine:** Execution engine contains interpreter and JIT compiler, which covert byte code into machine code. JVM uses optimization technique to decide which part to be interpreted and which part to be used with JIT compiler. The HotSpot represent the block of code executed by JIT compiler.

This is a basic guide. For more - Read "Inside JVM" Book
