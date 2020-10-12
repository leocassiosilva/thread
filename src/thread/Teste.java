package thread;

public class Teste {
    public static void main(String[] args) { try {
            MinhaThreadRunnable thread = new MinhaThreadRunnable("#1", 900);
            //Thread t1 = new Thread(thread);
            //t1.start();
            MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#2", 400);
            MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#3", 200);

        } catch (Exception e) {
        }
       
    }
}
