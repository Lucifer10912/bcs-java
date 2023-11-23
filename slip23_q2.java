import javax.swing.*;
import java.awt.*; 
import java.awt.event.*; 
public class converter extends JFrame implements ActionListener
{
JFrame f;
JLabel l1, l2,l3;
CreativeLogics pg. 75
JTextField t1, t2,t3; 
JButton b1;
converter()
{
f = new JFrame("CONVERTER");
l1 = new JLabel("Singapore Dollars:"); 
l1.setBounds(20, 40, 110, 30);
l2 = new JLabel("US Dollars:"); 
l2.setBounds(20, 100, 80, 30); 
l3 = new JLabel("Euros:"); 
l3.setBounds(20, 160, 80, 30);
t1 = new JTextField(20);
t1.setBounds(180, 40, 80, 30);
t2 = new JTextField(20);
t2.setBounds(180, 100, 80, 30); 
t3 = new JTextField(20); 
t3.setBounds(180, 160, 80, 30);
b1 = new JButton("Convert");
b1.setBounds(50, 200, 90, 40);
b1.addActionListener(this);
f.add(l1);
f.add(t1);
f.add(l2);
f.add(t2);
f.add(l3);
f.add(t3);
f.add(b1);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setLayout(null);
f.setSize(400, 300);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
double d= Double.parseDouble(t1.getText());
double d1 = (d *0.740); 
String str1 = String.valueOf(d1);
t2.setText(str1);
double d2=(d*0.697);
String str2 = String.valueOf(d2);
t3.setText(str2);
}
public static void main(String args[])
{
new converter();
}
}