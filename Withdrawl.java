package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener{
    JTextField t1,t2;
       JButton b1,b2,b3;
        JLabel l1,l2,l3;
        String pin;
    Withdrawl(String pin){
       this.pin=pin;
       setLayout(null);
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank_management_system/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(960, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 960, 1080);
        add(l3);

        l1 = new JLabel("ENTER AMOUNT YOU WANT TO WITHDRAW");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(190,350,400,35);
        l3.add(l1);

        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 22));
        t1.setBounds(190,420,320,25);
        l3.add(t1);

        b1 = new JButton("WITHDRAW");
        b2 = new JButton("BACK");
        b1.setBounds(390,588,150,35);
        l3.add(b1);
        
        b2.setBounds(390,633,150,35);
        l3.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
         

        setSize(960,1080);
        setLocation(200,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        try{        
            String amount = t1.getText();
            Date date = new Date();
            if(ae.getSource()==b1){
                if(t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Withdraw");
                }else{
                    Conn c1 = new Conn();
                    int balance=0;
                    ResultSet rs = c1.stmt.executeQuery("select * from bank where pin = '"+pin+"'");
                    while (rs.next()) {
                         if (rs.getString("type").equals("Deposit")) {
                         balance += Integer.parseInt(rs.getString("amount"));
                         } else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                      }
                    }
                    int drawn=Integer.parseInt(t1.getText());
                    if(drawn<=balance){
                    c1.stmt.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Withdrawl', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Withdrawn Successfully");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Please check the balance");
                    }
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }
            }else if(ae.getSource()==b2){
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new Withdrawl("").setVisible(true);
    }
}