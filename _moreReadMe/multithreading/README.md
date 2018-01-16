# Multithreading

Multithreading in java is a process of executing multiple threads simultaneously. Thread is basically a lightweight sub-process, a smallest unit of processing. Multiprocessing and multithreading, both are used to achieve multitasking.

But we use multithreading than multiprocessing because threads share a common memory area. They don't allocate separate memory area so saves memory, and context-switching between the threads takes less time than process.

Thread is executed inside the process. There is context-switching between the threads. There can be multiple processes inside the OS and one process can have multiple threads.

![java-cpu-thread](https://user-images.githubusercontent.com/2780145/34954754-a19d1652-fa47-11e7-8d36-4ac3858383b2.png)

**Advantages of Multithreading :**
- It **doesn't block the user** because threads are independent and you can perform multiple operations at same time.
- You **can perform many operations simultaneously** so it saves time.
- Threads are **independent** so it doesn't affect other threads if exception occur in a single thread.

## Multitasking

Multitasking is a process of executing multiple tasks simultaneously. We use multitasking to utilize the CPU. Multitasking can be achieved by two ways:
- Process-based Multitasking(Multiprocessing)
- Thread-based Multitasking(Multithreading)

| Multiprocessing | Multithreading |
| --- | --- |
| Each process have its own address in memory i.e. each process allocates separate memory area. | Threads share the same address space. |
| Process is heavyweight. | Thread is lightweight. |
| Cost of communication between the process is high. | Cost of communication between the thread is low. |
| Context-switching require some time for saving & loading registers, memory maps, updating lists etc. | Context-switching between the threads takes less time than process. |

**NOTE :** Context switching (aka process/task switching) is the switching of the CPU (central processing unit) from one process or thread to another.

## Life Cycle of a Thread

The life cycle of the thread in java is controlled by JVM. The java thread states are as follows:
1. **New -** The thread is in new state if you create an instance of Thread class but before the invocation of start() method.
2. **Runnable -** The thread is in runnable state after invocation of start() method, but the thread scheduler has not selected it to be the running thread.
3. **Running -** The thread is in running state if the thread scheduler has selected it.
4. **Non-Runnable (Blocked) -** This is the state when the thread is still alive, but is currently not eligible to run.
5. **Terminated -** A thread is in terminated or dead state when its run() method exits.

**NOTE :** According to sun, there is only 4 states in thread life cycle in java new, runnable, non-runnable and terminated. There is no running state.

![Java Thread Life Cycle](https://user-images.githubusercontent.com/2780145/33823420-15edbc42-de81-11e7-9785-79e99b7b3a11.png)

## Creating a Thread

**There are two ways to create a thread:**
1. By extending Thread class
2. By implementing Runnable interface.

**Thread class:** 
Thread class provide constructors and methods to create and perform operations on a thread.Thread class extends Object class and implements Runnable interface.

**Commonly used Constructors of Thread class:**
- Thread()
- Thread(String name)
- Thread(Runnable r)
- Thread(Runnable r,String name)

**Commonly used methods of Thread class:**
<ol>
<li><strong>public void run():  </strong> is used to perform action for a thread.</li>
<li><strong>public void start():  </strong>starts the execution of the thread.JVM calls the run() method on the thread.</li>
<li><strong>public void sleep(long miliseconds):  </strong> Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.</li>
<li><strong>public void join():  </strong>waits for a thread to die.</li>
<li><strong>public void join(long miliseconds):  </strong>waits for a thread to die for the specified miliseconds.</li>
<li><strong>public int getPriority():  </strong>returns the priority of the thread.</li>
<li><strong>public int setPriority(int priority):  </strong>changes the priority of the thread.</li>
<li><strong>public String getName():  </strong>returns the name of the thread.</li>
<li><strong>public void setName(String name):  </strong>changes the name of the thread.</li>
<li><strong>public Thread currentThread():  </strong>returns the reference of currently executing thread.</li>
<li><strong>public int getId():  </strong>returns the id of the thread.</li>
<li><strong>public Thread.State getState():  </strong>returns the state of the thread.</li>
<li><strong>public boolean isAlive():  </strong>tests if the thread is alive.</li>
<li><strong>public void yield():  </strong>causes the currently executing thread object to temporarily pause and allow other threads to execute.</li>
<li><strong>public void suspend():  </strong>is used to suspend the thread(depricated).</li>
<li><strong>public void resume():  </strong>is used to resume the suspended thread(depricated).</li>
<li><strong>public void stop():  </strong>is used to stop the thread(depricated).</li>
<li><strong>public boolean isDaemon():  </strong>tests if the thread is a daemon thread.</li>
<li><strong>public void setDaemon(boolean b):  </strong>marks the thread as daemon or user thread.</li>
<li><strong>public void interrupt():  </strong>interrupts the thread.</li>
<li><strong>public boolean isInterrupted():  </strong>tests if the thread has been interrupted.</li>
<li><strong>public static boolean interrupted():  </strong>tests if the current thread has been interrupted.</li>
</ol>

**Runnable interface:**
The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread. Runnable interface have only one method named run(). **public void run():** is used to perform action for a thread.

**Starting a thread:**
**start()** method of Thread class is used to start a newly created thread. It performs following tasks:
- A new thread starts(with new callstack).
- The thread moves from New state to the Runnable state.
- When the thread gets a chance to execute, its target run() method will run.

## Creating Thread Codes :

1. Thread Example by extending Thread class
```java
class Multi extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
Multi t1=new Multi();  
t1.start();  
 }  
}  
```

2. Thread Example by implementing Runnable interface
```java
class Multi3 implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
Multi3 m1=new Multi3();  
Thread t1 =new Thread(m1);  
t1.start();  
 }  
} 
```

## Thread Scheduler in Java
Thread scheduler in java is the part of the JVM that decides which thread should run. There is no guarantee that which runnable thread will be chosen to run by the thread scheduler. Only one thread at a time can run in a single process. The thread scheduler mainly uses preemptive or time slicing scheduling to schedule the threads.

**Difference between preemptive scheduling and time slicing**
Under preemptive scheduling, the highest priority task executes until it enters the waiting or dead states or a higher priority task comes into existence. Under time slicing, a task executes for a predefined slice of time and then reenters the pool of ready tasks. The scheduler then determines which task should execute next, based on priority and other factors.

**NOTE :**
We cannot start a thread twice. After starting a thread, it can never be started again. If you does so, an IllegalThreadStateException is thrown the moment it is started for the second time.

## sleep() method in Java
The sleep() method of Thread class is used to sleep a thread for the specified amount of time.

**The Thread class provides two methods for sleep :**
1. public static void sleep(long miliseconds)throws InterruptedException
2. public static void sleep(long miliseconds, int nanos)throws InterruptedException
```java
Thread.sleep(500)
```
At a time only one thread is executed. If you sleep a thread for the specified time,the thread shedular picks up another thread and so on.

## run() method in Java
In Java, Each thread starts in a separate call stack. Invoking the run() method from main thread, the run() method goes onto the current call stack rather than at the beginning of a new call stack.

**Problem if you use run() directly instead of start() "**
There is no context-switching in the below program because here t1 and t2 will be treated as normal object not thread object.
Output will be : 1 2 3 4 5 1 2 3 4 5         (One object will finish before starting next)
```java
class TestCallRun extends Thread{  
 public void run(){  
  for(int i=1;i<5;i++){  
    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
    System.out.println(i);  
  }  
 }  
 public static void main(String args[]){  
  TestCallRun2 t1=new TestCallRun2();  
  TestCallRun2 t2=new TestCallRun2();  
   
  t1.run();  
  t2.run();  
 }  
} } }  
```

## join() method in Java
Java Thread **join()** method can be used to pause the current thread execution, until the specified thread is dead. 

**There are three join methods :**
1. public void join()
2. public void join(long millis)
3. public void join(long millis, int nanos)

**Examples :**
```java
t1.join();   \\Current thread will be paused, until t1 is dead. (t1 will start executing)
```
```java
t1.join(1500);  \\Current thread will be paused, t1 will execute for 1500 milliseconds.
```

## Naming Thread
The Thread class provides methods to change and get the name of a thread. By default, each thread has a name i.e. thread-0, thread-1 and so on. But, we can change the name of the thread by using setName() method.
- **public String getName():** is used to get the name of a thread.
```java
t1.getName()
```
- **public void setName(String name):** is used to change the name of a thread.
```java
t1.setName("My sweet thread"); 
```

Getting the Current Thread
**public static Thread currentThread():**
The currentThread() method returns a reference of currently executing thread.
```java
System.out.println(Thread.currentThread().getName());  
```

## Priority of a Thread
