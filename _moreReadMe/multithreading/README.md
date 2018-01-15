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


