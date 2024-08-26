package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JLabel l1,cardno,pin;/*         INSTANCES OF THE CLASS */
    JTextField tcardno;
    JPasswordField tpin;
    JButton sign_in,clear,sign_up;
    Login(){    /* constructor to initialize base frame */
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank_management_system/logo.jpg"));/*creating an image obj which stores the image */
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);/*resizing the image in i1 */
        ImageIcon i3 = new ImageIcon(i2);/*putting back the resized image in another obj */
        JLabel l11 = new JLabel(i3);/*we can only pass imageicon and not image in args, JLabel is used to display image on the frame */
        setLayout(null);/*to avoid getting image at center */
        l11.setBounds(70, 10, 100, 100);/*default is border layout and image comes at center so we use custom layout by putting setLayout(null) */
        add(l11);
        
        getContentPane().setBackground(Color.ORANGE);/*to change background color of frame */
        l1 = new JLabel("WELCOME TO ATM");
        l1.setFont(new Font("Osward", Font.BOLD, 38));
        l1.setBounds(200,40,450,40);
        add(l1);

        cardno = new JLabel("Card No:");/*label for card number */
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(125,150,375,30);
        add(cardno);

        pin = new JLabel("PIN:");/*label for pin */
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(125,220,375,30);
        add(pin);

        tcardno = new JTextField(15);/*text field for cord number */
        tcardno.setBounds(300,150,230,30);
        tcardno.setFont(new Font("Arial", Font.BOLD, 14));
        add(tcardno);

        tpin = new JPasswordField(15);/*password text field for pin */
        tpin.setFont(new Font("Arial", Font.BOLD, 14));
        tpin.setBounds(300,220,230,30);
        add(tpin);

        sign_in = new JButton("SIGN IN");
        sign_in.setBackground(Color.GREEN);
        sign_in.setForeground(Color.BLACK);
 
        clear = new JButton("CLEAR");
        clear.setBackground(Color.GREEN);
        clear.setForeground(Color.BLACK);
        
        sign_up = new JButton("SIGN UP");
        sign_up.setBackground(Color.GREEN);
        sign_up.setForeground(Color.BLACK);

        sign_in.setFont(new Font("Arial", Font.BOLD, 14));
        sign_in.setBounds(300,300,100,30);
        add(sign_in);
        
        clear.setFont(new Font("Arial", Font.BOLD, 14));
        clear.setBounds(430,300,100,30);
        add(clear);
        
        sign_up.setFont(new Font("Arial", Font.BOLD, 14));
        sign_up.setBounds(300,350,230,30);
        add(sign_up);

        sign_in.addActionListener(this);/*listens when ever the button is clicked */
        clear.addActionListener(this);
        sign_up.addActionListener(this);
        
        setTitle("AUTOMATED TELLER MACHINE");
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            tcardno.setText("");
            tpin.setText("");
        }
        else if(ae.getSource()==sign_up){
            setVisible(false);/* to remove the current frame and go to signup frame*/
            new SignupOne().setVisible(true);
        }
        else if(ae.getSource()==sign_in){
            Conn c1=new Conn();
            String cardno=tcardno.getText();
            char[] ch=tpin.getPassword();
            String pin=new String(ch);
            String query="select * from login where cardno='"+cardno+"' and pin='"+pin+"';";
            try{
                ResultSet rs=c1.stmt.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        new Login().setVisible(true);
    }
}
