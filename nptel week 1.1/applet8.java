import java.applet.*;
import java.awt.*;

import org.w3c.dom.events.Event;

public class applet8 extends Applet{
    TextField text1,text2;
    public void init()
    {
        text1=new TextField(10);
        text2=new TextField(10);
        text1.setText("0");
        text2.setText("0");
        add(text1);
        add(text2);
    }

    public void paint(Graphics g){
        int n1=0,n2=0;int sum;
        String s1,s2,s3;

        g.drawString("Input each number in box", 10, 50);
        try{
            s1=text1.getText();
            n1=Integer.parseInt(s1);
            s2=text2.getText();
            n2=Integer.parseInt(s2);
        }catch(Exception e){}

        sum=n1+n2;
        String s="Sum = "+String.valueOf(sum);
        g.drawString(s, 100, 125);
    }

    public boolean action(Event ev,Object ob)
    {
        repaint();
        return true;
    }
}

//<applet code="applet8.class" width="1000" height="1000">
//</applet>