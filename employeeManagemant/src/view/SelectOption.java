package view;
import javax.swing.*;
import java.awt.event.*;

public class SelectOption {
    static JFrame f;
    static JButton create, delete, view, edit;
    static JLabel label;

    public static void close(){
        f.setVisible(false);
        f.dispose();
    }
    public static void option() {

        f = new JFrame("Select Option");
        label = new JLabel("Employee Management System");

        create = new JButton("Create employee");
        view = new JButton("view employee");
        edit = new JButton("edit employee");
        delete = new JButton("delete employee");

        label.setBounds(270, 30, 500, 60);
        create.setBounds(210, 100, 300, 40);//x axis, y axis, width, height
        view.setBounds(210, 150, 300, 40);
        edit.setBounds(210, 200, 300, 40);
        delete.setBounds(210, 250, 300, 40);

        f.add(create);
        f.add(view);
        f.add(edit);
        f.add(delete);
        f.add(label);

        f.setSize(800, 600);
        f.setLayout(null);
        f.setVisible(true);

        create.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                close();
                CreateEmployee.addEployee();
            }
        });
        view.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                close();
                ViewEmployees.viewList();
            }
        });

    }
}
