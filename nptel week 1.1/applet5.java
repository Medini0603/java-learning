import java.applet.*;
import java.awt.*;

public class applet5 extends Applet{
     //Declaring and initializing variables
    int x=0,y=0;
    String msg="";
    public void init(){
        //Now getting variables from HTML
        x=Integer.parseInt(getParameter("xposition"));
        y=Integer.parseInt(getParameter("yposition"));
        msg=getParameter("displaymsg");
    }
        //here xposition yposition displaymsg are the names of parameter in html 
        //that is to be taken into x,y,msg respctively
        public void paint(Graphics g){
        g.drawString(msg,x,y);
        //if ("msg",x,y)  ---> then only the word msg will be printed in applet
    }
}