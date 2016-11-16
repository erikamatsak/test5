package client;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Toolkit;

public class Class1 extends Canvas {
    public Class1(GraphicsConfiguration graphicsConfiguration) {
        super(graphicsConfiguration);
    }

    public Class1() {
        super();
    }
    
    public void paint(Graphics g){
        Graphics2D g2=(Graphics2D)g;
        
        Image taust=Toolkit.getDefaultToolkit().getImage("rohetaust320x480.gif");
                g2.drawImage(taust, 0, 0, 320, 480, this);
                
        g2.setColor(Color.BLUE);
                g2.fillOval(100, 100, 20,20);
                
                g2.setColor(Color.PINK);
                g2.fillRect(150, 200, 40, 40);
                
        g2.setColor(Color.cyan);
        g2.fillRect(120, 120 ,60, 60);
                
                
        g2.setColor(Color.YELLOW);
        g2.fillRect(NewJFrame.xKordinaat, NewJFrame.yKordinaat, 20, 20);
                
        g2.setColor(Color.BLACK);
        g2.drawRect(150, 200, 40, 40);
        liblikas1=Toolkit.getDefaultToolkit().getImage("Blue_butterfly_2.gif");
                g2.drawImage(liblikas1, NewJFrame.x1, NewJFrame.y1, 70, 70, this);
                
                

    }
    
    
    Image liblikas1;
}
