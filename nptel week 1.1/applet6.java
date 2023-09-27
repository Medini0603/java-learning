import java.applet.*;
import java.awt.*;

public class applet6 extends Applet{
    public void paint(Graphics g){
        g.drawString("Welcome to my first applet program",20,20);
        g.drawString("By Medini",100,100);
    }
}
/*
<applet code="applet6.class" width="400" height="400">
          </applet>
          */


//this runs after we compile with javac applet6.java
//then appletviewer applet6.java
//not  appletviewer applet6.html

//this works becoz the appletviewer is also interface 
//so it just reads the code with html tags in the given file