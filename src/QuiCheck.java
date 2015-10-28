import java.awt.*;
import java.awt.event.*;
//Class definition
class QuizCheck extends Frame implements ActionListener
{
//Variable declaration
    Checkbox che1, che2, che3, che4;
    Panel pa1,pa2;
    Button bu1,bu2;
    Label la1;
public QuizCheck(String title)
{
super(title);
pa1=new Panel();//Object creation
pa2=new Panel();
che1=new Checkbox("Charles Babbage");
che2=new Checkbox("Dennis Ritche");
che3=new Checkbox("James Gosling");
che4=new Checkbox("None");
la1=new Label("Q. Who developed Java?");
bu1=new Button("OK");
bu2=new Button("CANCEL");
// © http://students3k.com – Karthikh Venkat
bu1.addActionListener(this);
bu2.addActionListener(this);
pa1.setLayout(new GridLayout(5,1));
pa1.add(la1);
pa1.add(che1);
pa1.add(che2);
pa1.add(che3);
pa1.add(che4);
pa2.add(bu1);
pa2.add(bu2);
add("West",pa1);
add("South",pa2);
setSize(300,300);
setVisible(true);
}
public static void main(String args[]) {
QuizCheck c=new QuizCheck("QUIZ");
}
// © http://students3k.com – Karthikh Venkat
public void actionPerformed(ActionEvent e)
{
//Decision making statement
if(e.getSource()==bu1)
if(che1.getState()==false && che2.getState()==false && che3.getState()==true &&che4.getState()==false)
javax.swing.JOptionPane.showMessageDialog(this,"Congratulations!");
else
javax.swing.JOptionPane.showMessageDialog(this,"Sorry! Try again");

System.exit(0);
}
}