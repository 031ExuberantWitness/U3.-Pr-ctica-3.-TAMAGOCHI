
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JPanel;

public class Lienzo extends JPanel{
    Mascota ms;
    FrmMascota puntero;
    
    HiloControl HiloControls = new HiloControl(this);
    HiloSUMovimiento HiloMovimiento = new HiloSUMovimiento(this);
    Random rand = new Random();
    
    
    public Lienzo(FrmMascota fm) {
        ms = new Mascota(this, 10, 50, 100, rand.nextInt(100), rand.nextInt(100), rand.nextInt(100));
        puntero = fm;
        
        HiloMovimiento.start();
        HiloControls.start();
    }
    
    public void actualizarDato(){
        try{
            puntero.pSalud.setValue(ms.salud);
            puntero.pHambre.setValue(ms.hambre);
            puntero.pCansancio.setValue(ms.cansancio);
            puntero.pHigiene.setValue(ms.higiene);
        }catch(Exception e){
        }
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        
        setBackground(Color.gray);
        ms.pintar(g2);
    }
}
