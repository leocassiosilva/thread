
package thread;

/**
 *
 * @author Leocassio
 */
public class MinhaThreadRunnable implements Runnable{
   private String nome; 
   private int tempo; 
   
   public MinhaThreadRunnable(String nome, int tempo){
       this.nome = nome;
       this.tempo = tempo;
       Thread t = new Thread(this); //passa a propria classe
       t.start();
   }
   
    @Override
    public void run() { 
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " contador" + i);
                Thread.sleep(tempo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(nome + " Terminou a execução!");

    }
    
}
