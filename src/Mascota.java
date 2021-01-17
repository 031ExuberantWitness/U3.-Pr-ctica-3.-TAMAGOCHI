
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import static javax.swing.JOptionPane.showMessageDialog;

public class Mascota {
    int x, y, tamaño = 200;
    String estado;
    int salud, hambre, higiene, cansancio;
    
    Random rand = new Random();
    Lienzo puntero;
    
    int desplazamientoX, desplazamientoY;

    public Mascota(Lienzo fm, int x, int y, int s, int h, int c, int hi) {
        this.x = x;
        this.y = y;
        
        desplazamientoX = 5;
        desplazamientoY = 5;
        
        puntero = fm;
        
        estado = "dormido";
        salud = s; 
        hambre = h; 
        cansancio = c;
        higiene = hi; 
    }
    
    public void pintar(Graphics2D g2){
        try {
            g2.drawImage(ImageIO.read(getClass().getResource("gfx\\su\\" + estado + ".png")), x, y, puntero);
        } catch (IOException ex) {
            Logger.getLogger(Mascota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cambiarAnimo(int n){
        switch(n){
            case 0: estado = "Confundido";
                break;
            case 1: estado = "Desinterasado";
                break;
            case 2: estado = "Triste";
                break;
            case 3: estado = "Enfadado";
                break;
            case 4: estado = "Feliz";
                break;
            case 5: estado = "Neutral";
                break;
            case 6: estado = "Dormido";
                break;
            default: estado = "Triste";
                break;
        }
    }
    
    public void mover(){
        x += desplazamientoX;
        y += desplazamientoY;
        
        if(x <= 0){
            desplazamientoX = 5;
        }else if(x >= 1280-tamaño){
            desplazamientoX = -5;
        }
        
        if(y <= 0){
            desplazamientoY = 5;
        }else if(y >= 720-tamaño){
            desplazamientoY = -5;
        }
    }
    
    public void IA(){
        moverIzquierda();
        
    }
    
    public void moverIzquierda(){
        x += desplazamientoX;
        
        if(x <= 0){
            desplazamientoX = 5;
        }else if(x >= 1280-tamaño){
            desplazamientoX = -5;
        }
    }
    
    
    public void estado(){
        if(salud < 50){
            cambiarAnimo(6);
        }
        
        if(salud == 0){
            cambiarAnimo(2);
            puntero.HiloMovimiento.detener();
            
            showMessageDialog(null, "Tu mascota murio...");
            System.exit(0);
        }
    }
    
    public void controlCansancio(){
        if(puntero.HiloMovimiento.est == 1){
            if(cansancio < 100){
                cansancio++;
            }
            
            if(hambre < 100){
                hambre++;
            }
            
            if(hambre < 100 && cansancio == 100){
                hambre += 3;
            }
            
            if(higiene > 0){
                higiene--;
            }
            
            if(cansancio >= 100){
                salud --;
            } if(hambre >= 100){
                salud --;
            }
            
        }else{
            if(cansancio >= 100){
                salud --;
            }if(hambre >= 100){
                salud --;
            }if(cansancio > 0){
                cansancio--;
            }
        }
    }
}
