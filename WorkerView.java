package OOP.OOP_HW.HW05;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WorkerView extends JFrame{
    private JTextField idField;
    private JTextField nameField;
    private JTextField positionField;
    private JTextField salaryField;
    private JButton addButton;
    private JButton deleteButton;
    private JButton updateButton;
    private JList<Worker> employeeList;
    private DefaultListModel<Worker> listModel;
    public WorkerView() {
        this.setTitle("Worker Management System");
        this.setSize(500, 350);

        this.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));

        idField = new JTextField();
        inputPanel.add(new JLabel("ID:"));
        inputPanel.add(idField);

        nameField = new JTextField();
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);

        positionField = new JTextField();
        inputPanel.add(new JLabel("Position:"));
        inputPanel.add(positionField);

        salaryField = new JTextField();
        inputPanel.add(new JLabel("Salary:"));
        inputPanel.add(salaryField);

        this.add(inputPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new FlowLayout());

        addButton = new JButton("Add");
        buttonPanel.add(addButton);

        deleteButton = new JButton("Delete");
        buttonPanel.add(deleteButton);

        updateButton = new JButton("Update");
        buttonPanel.add(updateButton);

        this.add(buttonPanel, BorderLayout.SOUTH);

        listModel = new DefaultListModel<>();
        employeeList = new JList<>(listModel);
        this.add(new JScrollPane(employeeList));

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public int getSelectedEmployeeId() {
        return employeeList.getSelectedValue().getId();
    }
    public Worker getEmployeeInputData() {
        int id = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        String position = positionField.getText();
        int salary = Integer.parseInt(salaryField.getText());

        return new Worker(id, name, position, salary);
    }
    public void setEmployeeList(Worker[] employees) {
        listModel.clear();
        for (Worker emp : employees) {
            listModel.addElement(emp);
        }
    }
    public void setAddActionListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }
    public void setDeleteActionListener(ActionListener listener) {
        deleteButton.addActionListener(listener);
    }
    public void setUpdateActionListener(ActionListener listener) {
        updateButton.addActionListener(listener);
    }
}
