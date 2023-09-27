import java.applet.*;
import java.awt.*;

public class applet2 extends Applet{
    public void init(){
        resize(500,500);
    }
    public void paint(Graphics g){
        g.drawString("The window is resized to 500,500 which was 200,200 in HTML",20,20);
    }
}