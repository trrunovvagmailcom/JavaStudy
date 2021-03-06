package Complete_reference_java_11.Part_1.Chapter_11_Threads.Synchronized2;

public class Consumer implements Runnable{
    Queue q;

    public Consumer(Queue q) {
        this.q = q;
        new Thread(this,"Consumer").start();
    }

    @Override
    public void run() {
        while (true){
            q.get();
        }
    }
}
