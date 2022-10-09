import java.util.logging.Level;
import java.util.logging.Logger;

public class V_Wait extends Thread{
    
    private Semaforo sem;
 
    
    public V_Wait(Semaforo sem) 
    {
        this.sem = sem;
        
    }
    
    public void run() {
        System.out.println("Hilo 2 - Semaforo en ejecucion (signal)");
        try {
            System.out.println("Hilo 2 - Esperando permiso");
            sem.v();
            System.out.println("Hilo 2 - Obtiene permiso");
        } catch (Exception ex) {
            Logger.getLogger(P_Signal.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            System.out.println("Hilo 2 - Permiso de liberación obtenido");
            sem.p();
        } catch (Exception ex) {
            Logger.getLogger(P_Signal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
    

