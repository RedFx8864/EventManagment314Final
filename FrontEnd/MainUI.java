package FrontEnd;

import BackEnd.Controller.EventController;
import BackEnd.Model.Event;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainUI {
    private EventController controller;

    public MainUI(EventController controller) {
        this.controller = controller;
        initUI();
    }

    private void initUI() {
        JFrame frame = new JFrame("Event Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        // Top label
        JLabel title = new JLabel("Event Management Platform", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 24));
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        frame.add(title, BorderLayout.NORTH);

        // Center panel - list of events
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> eventList = new JList<>(model);
        eventList.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        JScrollPane scrollPane = new JScrollPane(eventList);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Bottom panel - add event
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JTextField nameField = new JTextField(10);
        JTextField dateField = new JTextField(10);
        JTextField locField = new JTextField(10);
        JButton addBtn = new JButton("Add Event");

        nameField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        dateField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        locField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        addBtn.setFont(new Font("Segoe UI", Font.BOLD, 14));

        bottomPanel.add(new JLabel("Name:"));
        bottomPanel.add(nameField);
        bottomPanel.add(new JLabel("Date:"));
        bottomPanel.add(dateField);
        bottomPanel.add(new JLabel("Location:"));
        bottomPanel.add(locField);
        bottomPanel.add(addBtn);

        frame.add(bottomPanel, BorderLayout.SOUTH);

        // Button logic
        addBtn.addActionListener(e -> {
            String name = nameField.getText().trim();
            String date = dateField.getText().trim();
            String loc = locField.getText().trim();

            if (name.isEmpty() || date.isEmpty() || loc.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "All fields are required!");
                return;
            }

            controller.createEvent(name, date, loc);
            refreshList(model, controller.getEvents());
        });

        frame.setVisible(true);
    }

    private void refreshList(DefaultListModel<String> model, List<Event> events) {
        model.clear();
        for (Event e : events) {
            model.addElement(e.toString());
        }
    }
}
