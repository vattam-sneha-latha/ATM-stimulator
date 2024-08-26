package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transactions extends JFrame implements ActionListener{
    JLabel l1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    Transactions(String pin){
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank_management_system/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 960, 1080);
        add(l2);
        
        l1 = new JLabel("Please Select Your Transaction");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 22));
        l1.setBounds(150,150,700,35);
        l2.add(l1);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(150,200,150,35);
        l2.add(b1);

        b2 = new JButton("CASH WITHDRAWL");
        b2.setBounds(150,250,150,35);
        l2.add(b2);

        b3 = new JButton("FAST CASH");
        b3.setBounds(150,300,150,35);
        l2.add(b3);

        b4 = new JButton("MINI STATEMENT");
        b4.setBounds(350,200,150,35);
        l2.add(b4);

        b5 = new JButton("PIN CHANGE");
        b5.setBounds(350,250,150,35);
        l2.add(b5);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setBounds(350,300,150,35);
        l2.add(b6);

        b7 = new JButton("EXIT");
        b7.setBounds(350,350,150,35);
        l2.add(b7);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){ 
            setVisible(false);
            new Deposit(pin).setVisible(true);
        }else if(ae.getSource()==b2){ 
            setVisible(false);
            new Withdrawl(pin).setVisible(true);
        }else if(ae.getSource()==b5){ 
            setVisible(false);
            new Pin(pin).setVisible(true);
        }
        else if(ae.getSource()==b6){ 
            setVisible(false);
            new BalanceEnquiry(pin).setVisible(true);
        }
        else if(ae.getSource()==b3){ 
            setVisible(false);
            new FastCash(pin).setVisible(true);
        }
        else if(ae.getSource()==b7){ 
            System.exit(0);
        }
        else if(ae.getSource()==b4){ 
            setVisible(false);
            new MiniStatement(pin).setVisible(true);
        }
    }
    public static void main(String[] args){
        new Transactions("").setVisible(true);
    }
}
