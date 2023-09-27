import java.applet.*;
import java.awt.*;

public class applet4 extends Applet{
    public void init(){
        setBackground(Color.YELLOW);
        resize(500,500);
    }
    public void paint(Graphics g){
        g.drawString("Background colour updated to yellow",20,20);
        g.drawString("Window resized to 500,500 which was 200,200 in HTML",120,120);
    }
}
