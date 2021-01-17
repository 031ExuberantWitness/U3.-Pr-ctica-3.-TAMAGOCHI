import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HiloSUMovimiento extends Thread{
    private boolean pausado = false;
    private boolean ejecutar = true;
    private int contador = 0;
    int est;
    
    Lienzo puntero;
    FrmMascota base;
    Random rand = new Random();
    
    public HiloSUMovimiento(Lienzo p){
        puntero = p;
        est = 1;
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
                if(estaDespausado()){
                    if(est == 1){
                        //puntero.ms.mover();
                        
                        puntero.ms.IA();
                        puntero.ms.cambiarAnimo(5);
                    }else{
                        puntero.ms.cambiarAnimo(6);
                    }
                    
                    puntero.repaint();
                }
                sleep(5);
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