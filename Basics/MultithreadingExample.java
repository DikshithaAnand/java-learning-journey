class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);

            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class MultithreadingExample {

    public static void main(String[] args) {

        MyThread thread = new MyThread();

        // Start the child thread
        thread.start();

        // Main thread execution
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
    }
}
