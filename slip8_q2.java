import java.awt.*;
import java.awt.event.*;
public class mouse1 extends Frame implements MouseListener, 
MouseMotionListener
{
 int x, y;
String msg = " ";
 Font f;
 TextField t1;
mouse1()
{ 
 setTitle("mouse example");
 setVisible(true);
 setSize(250,250);
 setLayout(null);
 t1=new TextField(20);
 t1.setBounds(100,150,150,70);
 add(t1);
 f=new Font("arial",Font.BOLD,40);
addMouseListener(this);
addMouseMotionListener(this);
}
public void mouseClicked(MouseEvent me)
{
t1.setText("you clicked on"+me.getX()+" "+me.getY());
repaint();
}
public void mouseEntered(MouseEvent me){ } 
public void mouseExited(MouseEvent me){ }
public void mousePressed(MouseEvent me){ }
public void mouseReleased(MouseEvent me){ }
public void mouseDragged(MouseEvent me){ }
public void mouseMoved(MouseEvent me)
{
x = me.getX();
y = me.getY();
msg = "I am Moving..";
repaint();
}
public void paint(Graphics g)
{
 g.setFont(f);
g.drawString(msg, x, y);
}
public static void main(String args[])
{
 mouse1 t=new mouse1();
}
}