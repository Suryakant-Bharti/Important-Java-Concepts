# Java Features and Internal Working

Java is a programming language and a platform. 

**Platform:** Any hardware or software environment in which a program runs, is known as a platform. Since Java has its own runtime environment (JRE) and API, it is called platform.

## Features of Java :

![java-features](https://user-images.githubusercontent.com/2780145/34343690-2fd47db0-e9ff-11e7-9630-75423dda7eaa.png)

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
