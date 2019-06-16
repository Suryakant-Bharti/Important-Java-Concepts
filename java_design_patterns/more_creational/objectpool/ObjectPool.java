package more_creational.objectpool;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public abstract class ObjectPool<T> {

    private ConcurrentLinkedQueue<T> pool;
    private ScheduledExecutorService executorService;

    private void initialize(int minObjects) {
        pool = new ConcurrentLinkedQueue<T>();
        for (int i = 0; i < minObjects; i++)
            pool.add(createObject());
    }

    public ObjectPool(final int minObjects) {
        initialize(minObjects);
    }

    public ObjectPool(final int minObjects, final int maxObjects, final long validationInterval)
    {
        initialize(minObjects);

        executorService = Executors.newSingleThreadScheduledExecutor();
        /*executorService.scheduleWithFixedDelay(new Runnable()
        {
            @Override
            public void run() {
                 int size = pool.size();

                System.out.println("minObjects = " + minObjects);
                System.out.println("maxObjects = " + maxObjects);

                 if(size < minObjects) {
                     int sizeToBeIncreased = minObjects - size;
                     for(int i = 0; i < sizeToBeIncreased; i++)
                         pool.add(createObject());
                 }

                 else if (size > maxObjects)  {
                     int sizeToBeDecreased = size - maxObjects;
                     for(int i = 0; i < sizeToBeDecreased; i++)
                         pool.poll();
                 }
            }
        }, validationInterval, validationInterval, TimeUnit.MICROSECONDS);*/
    }

    public T borrowObject() {
        T object;
        if((object = pool.poll()) == null)  object = createObject();
        return object;
    }

    public void returnObject(T object) {
        if(object == null)  return;
        pool.offer(object);
    }

    public void shutdown() {
        if(executorService != null) executorService.shutdown();
    }

    protected abstract T createObject();
}
