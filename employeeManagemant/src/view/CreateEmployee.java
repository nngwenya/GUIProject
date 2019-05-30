package view;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateEmployee {

    static JFrame f;
    static JTextField name,surname,id,mobile,email;
    static JLabel label1,label2,label3,label4,label5;
    static JButton submit, back;

    public static void close(){
        f.setVisible(false);
        f.dispose();
    }
    public static void addEployee(){

        f = new JFrame("Add Employee");
        name = new JTextField();
        surname = new JTextField();
        id = new JTextField();
        mobile = new JTextField();
        email = new JTextField();
        label1 = new JLabel("Name");
        label2 = new JLabel("Surname");
        label3 = new JLabel("ID");
        label4 = new JLabel("Mobile");
        label5 = new JLabel("Email");
        submit = new JButton("Submit");
        back = new JButton("Back");

        label1.setBounds(210,80,150,20);
        name.setBounds(210,100,300,40);
        label2.setBounds(210,150,150,20);
        surname.setBounds(210,170,300,40);
        label3.setBounds(210,220,150,20);
        id.setBounds(210,240,300,40);
        label4.setBounds(210,290,150,20);
        mobile.setBounds(210,310,300,40);
        label5.setBounds(210,350,150,40);
        email.setBounds(210,380,300,40);
        submit.setBounds(260,450,100,40);
        back.setBounds(370,450,100,40);

        f.add(name);
        f.add(surname);
        f.add(id);
        f.add(mobile);
        f.add(email);
        f.add(label1);
        f.add(label2);
        f.add(label3);
        f.add(label4);
        f.add(label5);
        f.add(submit);
        f.add(back);

        f.setSize(800,600);
        f.setLayout(null);
        f.setVisible(true);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                close();
                SelectOption.option();
            }
        });
    }
}
