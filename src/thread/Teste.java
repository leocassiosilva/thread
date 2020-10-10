package thread;

public class Teste {
    public static void main(String[] args) { try {
            MinhaThread thread = new MinhaThread("Thread #1", 600);
            MinhaThread thread1 = new MinhaThread("Thread #2", 900);

        } catch (Exception e) {
        }
       
    }
}
