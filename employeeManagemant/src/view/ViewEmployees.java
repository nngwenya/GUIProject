package view;
import javax.swing.*;
import java.awt.*;

public class ViewEmployees {
    static JFrame f;
    static private JPanel controlPanel;
    public static void viewList() {

        f = new JFrame("View Employee");
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        final DefaultListModel employee = new DefaultListModel();
        employee.addElement("USA");
        employee.addElement("India");
        employee.addElement("Vietnam");
        employee.addElement("Canada");
        employee.addElement("Denmark");
        employee.addElement("France");
        employee.addElement("Great Britain");
        employee.addElement("Japan");

        final JList employeeList = new JList(employee);
        employeeList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        employeeList.setSelectedIndex(0);
        employeeList.setVisibleRowCount(3);

        JScrollPane employeeListScrollPane = new JScrollPane(employeeList);
        f.add(controlPanel);
        f.add(employeeList);
        controlPanel.add(employeeListScrollPane);
        f.setSize(800,600);
        f.setLayout(null);
        f.setVisible(true);

    }
}
