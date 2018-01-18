# Synchronization in Java
Synchronization in java is the capability to control the access of multiple threads to any shared resource. Java Synchronization is better option where we want to allow only one thread to access the shared resource.

**The synchronization is mainly used to :**
- To **prevent Thread Interference** (Thread interference is a condition which occurs when more than one threads, executing simultaneously, access same piece of data.).
- To **prevent Consistency Problem** (Memory consistency errors occur when different threads have inconsistent views of what should be the same data.).

## Types of Synchronization :
![synchronization-types](https://user-images.githubusercontent.com/2780145/35073887-214be2f0-fc11-11e7-9a84-604feca9bbb4.png)

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

![static synchronization](https://user-images.githubusercontent.com/2780145/35074524-596ce5f0-fc14-11e7-8fd9-e7defb2de0ae.png)

Suppose there are two objects of a shared class(e.g. Table) named object1 and object2.In case of synchronized method and synchronized block there cannot be interference between t1 and t2 or t3 and t4 because t1 and t2 both refers to a common object that have a single lock.But there can be interference between t1 and t3 or t2 and t4 because t1 acquires another lock and t3 acquires another lock.I want no interference between t1 and t3 or t2 and t4.Static synchronization solves this problem.
```java
synchronized static void printTable(int n){  
   for(int i=1;i<=10;i++){  
     System.out.println(n*i);  
     try{  Thread.sleep(200);  
     }catch(Exception e){System.out.println(e);}  
   }  }  
```

## Deadlock in Java

![deadlock of threads](https://user-images.githubusercontent.com/2780145/35073886-2122bc2c-fc11-11e7-97a0-a04938a49227.png)

Deadlock can occur in a situation when a thread is waiting for an object lock, that is acquired by another thread and second thread is waiting for an object lock that is acquired by first thread. Since, both threads are waiting for each other to release the lock, the condition is called deadlock.

