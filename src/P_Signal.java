import java.util.logging.Level;
import java.util.logging.Logger;

public class P_Signal extends Thread{
    
    private Semaforo sem;
    
    public P_Signal(Semaforo sem) 
    {
        this.sem = sem;  
    }
    
   public void run() {
        System.out.println("Hilo 1 - Semaforo en ejecucion (signal)");
        try {
            System.out.println("Hilo 1 - Esperando permiso");
            sem.v();
            System.out.println("Hilo 1 - Obtiene permiso");
        } catch (Exception ex) {
            Logger.getLogger(P_Signal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            System.out.println("Hilo 1- Permiso de liberación obtenido");
            sem.p();
        } catch (Exception ex) {
            Logger.getLogger(P_Signal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
}