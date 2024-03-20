import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
class Calculator implements ActionListener
{
 JLabel lblnum1,lblnum2,lblresult;
 JTextField txtnum1,txtnum2,txtresult;
 JButton btnadd,btnsub,btnclear;
 Calculator()
 {
  JFrame jfrm=new JFrame("Math calculator");
  lblnum1=new JLabel("Number 1:");
  lblnum2=new JLabel("Number 2:");
  lblresult=new JLabel("Result:");
  
  txtnum1=new JTextField("");
  txtnum2=new JTextField("");
  txtresult=new JTextField("0");
  txtresult.setEditable(false);
  
  btnadd=new JButton("Add");
  btnsub=new JButton("Subtract");
  btnclear=new JButton("clear");
  
  jfrm.setSize(500,500);
  jfrm.setLayout(null);
  jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  lblnum1.setBounds(100,50,100,50);
  lblnum2.setBounds(100,120,100,50);
  lblresult.setBounds(100,190,100,50);
  
  txtnum1.setBounds(250,50,100,50);
  txtnum2.setBounds(250,100,100,50);
  txtresult.setBounds(250,200,100,50);
  
  btnadd.setBounds(100,250,75,50);
  btnsub.setBounds(180,250,75,50);
  btnclear.setBounds(300,250,75,50);
  
  jfrm.add(lblnum1);
  jfrm.add(lblnum2);
  jfrm.add(lblresult);
  jfrm.add(txtnum1);
  jfrm.add(txtnum2);
  jfrm.add(txtresult);
  jfrm.add(btnadd);
  jfrm.add(btnsub);
  jfrm.add(btnclear);
  
  btnadd.addActionListener(this);
  btnsub.addActionListener(this);
  btnclear.addActionListener(this);
  jfrm.setVisible(true);
  }
   public void actionPerformed(ActionEvent ae)
   {
    float n1,n2,r;
    n1=Float.parseFloat(txtnum1.getText());
    n2=Float.parseFloat(txtnum2.getText());
    String cmd=ae.getActionCommand();
    if(cmd.equals("Add"))
    {
    r=n1+n2;
    txtresult.setText(Float.toString(r));
    }
    else if(cmd.equals("Subtract"))
    {
    r=n1-n2;
    txtresult.setText(Float.toString(r));
    }
    else{
    txtnum1.setText("0");
    txtnum2.setText("0");
    txtresult.setText("0");
    }
    }
    }
    class Maincalculator{
     public static void main(String[]a){
      new Calculator();
      }
      }
