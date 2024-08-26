package bank_management_system;
import javax.swing.*;/*jframe */
import java.awt.*;/*color */
import java.awt.event.*;/*action when button pressed */
import com.toedter.calendar.JDateChooser;
public class SignupTwo extends JFrame implements ActionListener{
    JLabel senior,additional,religion,category,income,edu,address,state,aadhar,occupation,qual,pan,exca,l12,l13;
    JTextField tstate,tpan,taadhar;
    JRadioButton yess,nos,yese,noe;
    JDateChooser dateChooser;
    JButton next;
    String first;
    JComboBox<String> creligion,ccategory,cincome,cedu,coccupation;
    SignupTwo(String formno){
        first=formno;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank_management_system/logo.jpg"));/*creating an image obj which stores the image */
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);/*resizing the image in i1 */
        ImageIcon i3 = new ImageIcon(i2);/*putting back the resized image in another obj */
        JLabel l11 = new JLabel(i3);/*we can only pass imageicon and not image in args, JLabel is used to display image on the frame */
        setLayout(null);/*to avoid getting image at center */
        l11.setBounds(10, 10, 100, 100);/*default is border layout and image comes at center so we use custom layout by putting setLayout(null) */
        add(l11);

        l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway", Font.BOLD, 13));
        l12.setBounds(500,10,100,30);
        add(l12);
        
        l13 = new JLabel(first);
        l13.setFont(new Font("Raleway", Font.BOLD, 13));
        l13.setBounds(550,10,100,30);
        add(l13);

        setTitle("NEW ACCOUNT APPLICATION FORM PAGE 2");
         setLayout(null);

         additional = new JLabel("Page 2: Additional details");
         additional.setFont(new Font("Raleway", Font.BOLD, 22));
         additional.setBounds(290,80,400,30);
         add(additional);

         religion = new JLabel("Religion: ");
         religion.setFont(new Font("Raleway", Font.BOLD, 20));
         religion.setBounds(100,140,100,30);
         add(religion);
         String r[]={"Hindu","Muslim","Christian","sikh","Buddhism","jain"};        
         creligion=new JComboBox<String>(r);  
         creligion.setBackground(Color.WHITE);
         creligion.setForeground(Color.BLACK);
         creligion.setFont(new Font("Raleway", Font.BOLD, 14));
         creligion.setBounds(300,140,400,30);
         add(creligion);


         category = new JLabel("Category: ");
         category.setFont(new Font("Raleway", Font.BOLD, 20));
         category.setBounds(100,190,200,30);
         add(category);
         String r1[]={"General","OBC","SC","ST","Others"};        
         ccategory=new JComboBox<String>(r1);  
         ccategory.setBackground(Color.WHITE);
         ccategory.setForeground(Color.BLACK);
         ccategory.setFont(new Font("Raleway", Font.BOLD, 14));
         ccategory.setBounds(300,190,400,30);
         add(ccategory);
         
         income = new JLabel("Income: ");
         income.setFont(new Font("Raleway", Font.BOLD, 20));
         income.setBounds(100,240,200,30);
         add(income);
         String r2[]={"null","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000"};        
         cincome=new JComboBox<String>(r2);  
         cincome.setBackground(Color.WHITE);
         cincome.setForeground(Color.BLACK);
         cincome.setFont(new Font("Raleway", Font.BOLD, 14));
         cincome.setBounds(300,240,400,30);
         add(cincome);

         edu = new JLabel("Educatiocal ");
         edu.setFont(new Font("Raleway", Font.BOLD, 20));
         edu.setBounds(100,290,200,30);
         add(edu);

         qual = new JLabel("Qualification: ");
         qual.setFont(new Font("Raleway", Font.BOLD, 20));
         qual.setBounds(100,330,200,30);
         add(qual);
         String r3[]={"Non graduate","Graduate","Post graduation","Doctarate","Others"};        
         cedu=new JComboBox<String>(r3);  
         cedu.setBackground(Color.WHITE);
         cedu.setForeground(Color.BLACK);
         cedu.setFont(new Font("Raleway", Font.BOLD, 14));
         cedu.setBounds(300,310,400,30);
         add(cedu);

         occupation= new JLabel("occupation: ");
         occupation.setFont(new Font("Raleway", Font.BOLD, 20));
         occupation.setBounds(100,390,200,30);
         add(occupation);
         String r4[]={"Self employeed","Salaried employee","Business","Student","Retired","Others"};        
         coccupation=new JComboBox<String>(r4);  
         coccupation.setBackground(Color.WHITE);
         coccupation.setForeground(Color.BLACK);
         coccupation.setFont(new Font("Raleway", Font.BOLD, 14));
         coccupation.setBounds(300,390,400,30);
         add(coccupation);

         pan = new JLabel("Pan number: ");
         pan.setFont(new Font("Raleway", Font.BOLD, 20));
         pan.setBounds(100,440,200,30);
         add(pan);
         tpan = new JTextField();
         tpan.setFont(new Font("Raleway", Font.BOLD, 14));
         tpan.setBounds(300,440,400,30);
         add(tpan);

         aadhar = new JLabel("Aadhar number: ");
         aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
         aadhar.setBounds(100,490,200,30);
         add(aadhar);
         taadhar = new JTextField();
         taadhar.setFont(new Font("Raleway", Font.BOLD, 14));
         taadhar.setBounds(300,490,400,30);
         add(taadhar);

         senior = new JLabel("Senior citizen: ");
         senior.setFont(new Font("Raleway", Font.BOLD, 20));
         senior.setBounds(100,540,200,30);
         add(senior);
         yess = new JRadioButton("Yes");
        yess.setFont(new Font("Raleway", Font.BOLD, 14));
        yess.setBounds(300,540,60,30);
        yess.setBackground(Color.YELLOW);
        add(yess);
        nos = new JRadioButton("No");
        nos.setFont(new Font("Raleway", Font.BOLD, 14));
        nos.setBounds(450,540,120,30);
        nos.setBackground(Color.YELLOW);
        add(nos);
        ButtonGroup groupgender = new ButtonGroup();/*to ensure both the radio buttons are not selected only one is selected */
        groupgender.add(yess);
        groupgender.add(nos);

         exca = new JLabel("Existing account: ");
         exca.setFont(new Font("Raleway", Font.BOLD, 20));
         exca.setBounds(100,590,200,30);
         add(exca);
         yese = new JRadioButton("Yes");
         yese.setFont(new Font("Raleway", Font.BOLD, 14));
         yese.setBounds(300,590,60,30);
         yese.setBackground(Color.YELLOW);
         add(yese);
         noe = new JRadioButton("No");
         noe.setFont(new Font("Raleway", Font.BOLD, 14));
         noe.setBounds(450,590,120,30);
         noe.setBackground(Color.YELLOW);
         add(noe);
         ButtonGroup groupgender2 = new ButtonGroup();/*to ensure both the radio buttons are not selected only one is selected */
         groupgender2.add(yese);
         groupgender2.add(noe);
          
        next=new JButton("SIGN UP");
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
        String religion = (String)creligion.getSelectedItem(); 
        String category = (String)ccategory.getSelectedItem();
        String income = (String)cincome.getSelectedItem();
        String education = (String)cedu.getSelectedItem();
        String occupation = (String)coccupation.getSelectedItem();

        String pan = tpan.getText();
        String aadhar = taadhar.getText();

        String scitizen = "";
        if(yess.isSelected()){ 
            scitizen = "Yes";
        }
        else if(nos.isSelected()){ 
            scitizen = "No";
        }
        
        String eaccount = "";
        if(yese.isSelected()){ 
            eaccount = "Yes";
        }else if(noe.isSelected()){ 
            eaccount = "No";
        }

        try{
            if(taadhar.getText().equals("")||tpan.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();
                String q1 = "insert into signuptwo values('"+first+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
                c1.stmt.executeUpdate(q1);
                new SignupThree(first).setVisible(true);
                setVisible(false);
            }
        }catch(Exception ex){
             ex.printStackTrace();
        }
        
     }
     public static void main(String[] args){
        new SignupTwo("");
    }
}
