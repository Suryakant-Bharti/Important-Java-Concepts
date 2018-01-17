# Synchronization in Java
Synchronization in java is the capability to control the access of multiple threads to any shared resource. Java Synchronization is better option where we want to allow only one thread to access the shared resource.

**The synchronization is mainly used to :**
- To **prevent Thread Interference** (Thread interference is a condition which occurs when more than one threads, executing simultaneously, access same piece of data.).
- To **prevent Consistency Problem** (Memory consistency errors occur when different threads have inconsistent views of what should be the same data.).

**There are two types of synchronization :**
1. Process Synchronization
2. Thread Synchronization

## Thread Synchronization
There are two types of thread synchronization mutual exclusive and inter-thread communication.
1. Mutual Exclusive
2. Cooperation (Inter-thread communication in java)

**Mutual Exclusive :**
Mutual Exclusive helps keep threads from interfering with one another while sharing data. 
This can be done by three ways in java :
1. by synchronized method
2. by synchronized block
3. by static synchronization

**Concept of Lock in Java :**
Synchronization is built around an internal entity known as the lock or monitor. Every object has an lock associated with it. By convention, a thread that needs consistent access to an object's fields has to acquire the object's lock before accessing them, and then release the lock when it's done with them. The package java.util.concurrent.locks contains several lock implementations.

## Synchronized Method in Java :**
If you declare any method as synchronized, it is known as synchronized method. Synchronized method is used to lock an object for any shared resource. When a thread invokes a synchronized method, it automatically acquires the lock for that object and releases it when the thread completes its task.
```java
synchronized void printTable(int n){  //synchronized method  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  Thread.sleep(200);  
     }catch(Exception e){System.out.println(e);}  
   } }  
```

## Synchronized Block in Java
Synchronized block can be used to perform synchronization on any specific resource of the method. Suppose you have 50 lines of code in your method, but you want to synchronize only 5 lines, you can use synchronized block. Scope of synchronized block is smaller than the method. If you put all the codes of the method in the synchronized block, it will work same as the synchronized method. Syntax - synchronized (object reference expression) { ... }  
```java
void printTable(int n){  
   synchronized(this){      //synchronized block  
     for(int i=1;i<=5;i++){  
      System.out.println(n*i);  
      try{  Thread.sleep(200);  
      }catch(Exception e){System.out.println(e);}  
     } } }
```

## Static Synchronization in Java
If you make any static method as synchronized, the lock will be on the class not on object.

**Problem without static synchronization :**





