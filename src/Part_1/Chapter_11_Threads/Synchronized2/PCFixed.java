package Part_1.Chapter_11_Threads.Synchronized2;

public class PCFixed {
    public static void main(String[] args) {
        Queue q = new Queue();

        new Producer(q);
        new Consumer(q);

        System.out.println("The finish!");
    }
}