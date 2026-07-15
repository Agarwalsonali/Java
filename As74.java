// q-4
class Deadlock {
    int count = 0;
    final Object r1 = new Object();
    final Object r2 = new Object();

    public void increment() {
        synchronized (r1) {
            count++;
        }
        synchronized (r2) {
            count++;
        }
    }

    public int getCount() {
        synchronized (r1) {
            return count;
        }
    }
}

class ResourceThread extends Thread {
    Deadlock r1, r2;

    public ResourceThread(Deadlock r1, Deadlock r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            r1.increment();
            r2.increment();
        }
    }
}

class As74Test {
    public static void main(String[] args) throws InterruptedException {
        Deadlock r1 = new Deadlock();
        Deadlock r2 = new Deadlock();

        ResourceThread t1 = new ResourceThread(r1, r2);
        System.out.println("Thread t1: Will lock resource1 then resource2");

        ResourceThread t2 = new ResourceThread(r2, r1);
        System.out.println("Thread t2: Will lock resource2 then resource1");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count r1: " + r1.getCount());
        System.out.println("Final count r2: " + r2.getCount());
    }
}
