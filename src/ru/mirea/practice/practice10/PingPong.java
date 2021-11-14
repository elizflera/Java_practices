package ru.mirea.practice.practice10;

public class PingPong extends Thread {
    private boolean f;
    public PingPong(boolean f) {
        this.f=f;
    }
    @Override
    public void run() {
        if (f) System.out.println("Ping");
        else System.out.println("Pong");
    }

    public static void main(String[] args) throws InterruptedException {
        while (true){
            PingPong thread1 = new PingPong(true);
            PingPong thread2 = new PingPong(false);
            thread1.start();
            PingPong.sleep(2000);
            thread2.start();
            PingPong.sleep(2000);
        }
    }
}
