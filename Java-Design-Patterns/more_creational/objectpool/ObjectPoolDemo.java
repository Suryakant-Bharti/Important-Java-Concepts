package more_creational.objectpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

// THIS PROGRAM IS TAKEN FROM JAVATPOINT (AND IT IS WRONG !!)
// https://www.javatpoint.com/object-pool-pattern
// DO AGAIN FROM:
// https://sourcemaking.com/design_patterns/object_pool/java
// https://www.geeksforgeeks.org/object-pool-design-pattern/
// https://www.geeksforgeeks.org/thread-pools-java/

public class ObjectPoolDemo {
    public static void main(String args[]){

        ObjectPool<ExportingProcess> pool;
        AtomicLong procesNumber = new AtomicLong(0);
        ObjectPoolDemo objectPoolDemo = new ObjectPoolDemo();

        pool = new ObjectPool<ExportingProcess>(2,6, 1) {
            @Override
            protected ExportingProcess createObject() {
                return new ExportingProcess(procesNumber.incrementAndGet());
            }};

        pool.shutdown();

        int numberOfTasks = 100;
        ExecutorService executor = Executors.newFixedThreadPool(numberOfTasks);
        for(int i = 1; i <= numberOfTasks; i++)
            executor.execute(new ExportingTask(pool, i));
        executor.shutdown();
        try{
            executor.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
