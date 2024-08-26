package bank_management_system;
import javax.swing.*;/*jframe */
import java.awt.*;/*color */
import java.awt.event.*;/*action when button pressed */
import java.util.Random;
import com.toedter.calendar.JDateChooser;
public class SignupOne extends JFrame implements ActionListener{
    JLabel formno,personal,name,fname,email,gender,address,pincode,dob,city,state,marital;
    JTextField tname,tfname,temail,taddress,tpincode, tcity,tstate;
    JRadioButton male,female,married,unmarried,other;
    JDateChooser dateChooser;
    JButton next;
    String first;
    SignupOne(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank_management_system/logo.jpg"));/*creating an image obj which stores the image */
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);/*resizing the image in i1 */
        ImageIcon i3 = new ImageIcon(i2);/*putting back the resized image in another obj */
        JLabel l11 = new JLabel(i3);/*we can only pass imageicon and not image in args, JLabel is used to display image on the frame */
        setLayout(null);/*to avoid getting image at center */
        l11.setBounds(10, 10, 100, 100);/*default is border layout and image comes at center so we use custom layout by putting setLayout(null) */
        add(l11);
        Random ran = new Random();/*for generating random application number */
        long first4 = (ran.nextLong() % 9000L) + 1000L;/*number should only be 4 digits */
         first = "" + Math.abs(first4);/*for ignoring negatives */

         formno = new JLabel("APPLICATION FORM NO. "+first);
         formno.setFont(new Font("Raleway", Font.BOLD, 38));
         formno.setBounds(140,20,600,40);
         add(formno);
         setLayout(null);

         personal = new JLabel("Page 1: Personal details");
         personal.setFont(new Font("Raleway", Font.BOLD, 22));
         personal.setBounds(290,80,400,30);
         add(personal);

         name = new JLabel("Name: ");
         name.setFont(new Font("Raleway", Font.BOLD, 20));
         name.setBounds(100,140,100,30);
         add(name);
         tname = new JTextField();
         tname.setFont(new Font("Raleway", Font.BOLD, 14));
         tname.setBounds(300,140,400,30);
         add(tname);

         fname = new JLabel("Father's Name: ");
         fname.setFont(new Font("Raleway", Font.BOLD, 20));
         fname.setBounds(100,190,200,30);
         add(fname);
         tfname = new JTextField();
         tfname.setFont(new Font("Raleway", Font.BOLD, 14));
         tfname.setBounds(300,190,400,30);
         add(tfname);
         
         dob = new JLabel("Date Of Birth: ");
         dob.setFont(new Font("Raleway", Font.BOLD, 20));
         dob.setBounds(100,240,200,30);
         add(dob);
         dateChooser=new JDateChooser();
         dateChooser.setForeground(new Color(105, 105, 105));
         dateChooser.setBounds(300, 240, 400, 30);
         add(dateChooser);

         gender = new JLabel("Gender: ");
         gender.setFont(new Font("Raleway", Font.BOLD, 20));
         gender.setBounds(100,290,200,30);
         add(gender);
        male = new JRadioButton("Male");
        male.setFont(new Font("Raleway", Font.BOLD, 14));
        male.setBounds(300,290,60,30);
        male.setBackground(Color.YELLOW);
        add(male);
        female = new JRadioButton("Female");
        female.setFont(new Font("Raleway", Font.BOLD, 14));
        female.setBounds(450,290,120,30);
        female.setBackground(Color.YELLOW);
        add(female);
        ButtonGroup groupgender = new ButtonGroup();/*to ensure both the radio buttons are not selected only one is selected */
        groupgender.add(male);
        groupgender.add(female);

         email = new JLabel("Email Address: ");
         email.setFont(new Font("Raleway", Font.BOLD, 20));
         email.setBounds(100,340,200,30);
         add(email);
         temail = new JTextField();
         temail.setFont(new Font("Raleway", Font.BOLD, 14));
         temail.setBounds(300,340,400,30);
         add(temail);

         marital = new JLabel("Marital status: ");
         marital.setFont(new Font("Raleway", Font.BOLD, 20));
         marital.setBounds(100,390,200,30);
         add(marital);
         married = new JRadioButton("Married");
        married.setFont(new Font("Raleway", Font.BOLD, 14));
        married.setBounds(300,390,100,30);
        married.setBackground(Color.YELLOW);
        add(married);
        unmarried = new JRadioButton("Unmarried");
        unmarried.setFont(new Font("Raleway", Font.BOLD, 14));
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.YELLOW);
        add(unmarried);
        other = new JRadioButton("Other");
        other.setFont(new Font("Raleway", Font.BOLD, 14));
        other.setBounds(600,390,100,30);
        other.setBackground(Color.YELLOW);
        add(other);
        ButtonGroup groupgender1 = new ButtonGroup();/*to ensure both the radio buttons are not selected only one is selected */
        groupgender1.add(married);
        groupgender1.add(unmarried);
        groupgender1.add(other);

         address = new JLabel("Address: ");
         address.setFont(new Font("Raleway", Font.BOLD, 20));
         address.setBounds(100,440,200,30);
         add(address);
         taddress = new JTextField();
         taddress.setFont(new Font("Raleway", Font.BOLD, 14));
         taddress.setBounds(300,440,400,30);
         add(taddress);

         city = new JLabel("City: ");
         city.setFont(new Font("Raleway", Font.BOLD, 20));
         city.setBounds(100,490,200,30);
         add(city);
         tcity = new JTextField();
         tcity.setFont(new Font("Raleway", Font.BOLD, 14));
         tcity.setBounds(300,490,400,30);
         add(tcity);

         state = new JLabel("State: ");
         state.setFont(new Font("Raleway", Font.BOLD, 20));
         state.setBounds(100,540,200,30);
         add(state);
         tstate = new JTextField();
         tstate.setFont(new Font("Raleway", Font.BOLD, 14));
         tstate.setBounds(300,540,400,30);
         add(tstate);

         pincode = new JLabel("Pin Code: ");
         pincode.setFont(new Font("Raleway", Font.BOLD, 20));
         pincode.setBounds(100,590,200,30);
         add(pincode);
         tpincode = new JTextField();
         tpincode.setFont(new Font("Raleway", Font.BOLD, 14));
         tpincode.setBounds(300,590,400,30);
         add(tpincode);
          
        next=new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,20));
        next.setBounds(620,660,200,50);
        next.addActionListener(this); 
        add(next);

        setSize(850,800);
        setLocation(500,120);
        setVisible(true);
       
        getContentPane().setBackground(Color.YELLOW);/*to change background color of frame */
    }
    public void actionPerformed(ActionEvent ae){
        String formno = first;
        String name = tname.getText();
        String fname = tfname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){ 
            gender = "Male";
        }else if(female.isSelected()){ 
            gender = "Female";
        }
        String email = temail.getText();
        String marital = null;
        if(married.isSelected()){ 
            marital = "Married";
        }else if(unmarried.isSelected()){ 
            marital = "Unmarried";
        }else if(other.isSelected()){ 
            marital = "Other";
        }
        String address = taddress.getText();
        String city = tcity.getText();
        String pincode = tpincode.getText();
        String state = tstate.getText();
        try{
        if(tname.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Fill the name");
        }
        else{
            Conn c1 = new Conn();
            String q1 = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
            c1.stmt.executeUpdate(q1);

            setVisible(false);
            new SignupTwo(first).setVisible(true);
         }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        new SignupOne();
    }
}
