import java.applet.*;
import java.awt.*;

public class applet7 extends Applet{
    int x,y,w,h;
    public void init(){
        x=Integer.parseInt(getParameter("xvalue"));
        y=Integer.parseInt(getParameter("yvalue"));
        w=Integer.parseInt(getParameter("wid")); //if width then it becomes wrong as width is a keyword in HTML
        h=Integer.parseInt(getParameter("heig"));
    }
    public void paint(Graphics g){
        g.drawRect(x,y,w,h);
        g.drawString("My Rectangle in an applet",100,100);
    }
}