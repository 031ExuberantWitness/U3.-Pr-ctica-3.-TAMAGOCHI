import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HiloControl extends Thread{
    private boolean pausado = false;
    private boolean ejecutar = true;
    private int contador = 0, contador2 = 0, sleeping;
    Lienzo puntero;
    FrmMascota base;
    
    public HiloControl(Lienzo p){
        puntero = p;
    }
    
    public void pausar(){
        pausado = !pausado;
    }
    
    public void detener(){
        ejecutar = false;
    }
    
    private int controlador(){
        return 0;
    }
    
    @Override
    public void run(){
        while(ejecutar){
            try {
                puntero.ms.controlCansancio();
                
                puntero.actualizarDato();
                sleep(1500);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloSUMovimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private boolean estaDespausado(){
        return !pausado;
    }
    
    public boolean getPausa(){
        return pausado;
    }
}