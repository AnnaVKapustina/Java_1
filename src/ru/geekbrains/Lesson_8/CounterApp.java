package ru.geekbrains.Lesson_8;

import javax.swing.*;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {
    private int counter = 0;

    public CounterApp() {
        setTitle("CounterApp window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 320, 120);

        Font font = new Font("Arial", Font.BOLD, 30);

        JLabel counterView = new JLabel(String.valueOf(counter));
        counterView.setHorizontalAlignment(SwingConstants.CENTER);
        counterView.setFont(font);

        setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton minusTenButton = new JButton("-10");
        add(minusTenButton);
        minusTenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter = counter - 10;
                refreshCounterView(counterView);
            }
        });

        JButton decrementButton = new JButton("-1");
        add(decrementButton);
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter--;
                refreshCounterView(counterView);
            }
        });

        JButton clearButton = new JButton("Clear");
        add(clearButton);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter = 0;
                refreshCounterView(counterView);
            }
        });

        JButton incrementButton = new JButton("+1");
        add(incrementButton);
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                refreshCounterView(counterView);
            }
        });

        JButton plusTenButton = new JButton("+10");
        add(plusTenButton);
        plusTenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter = counter + 10;
                refreshCounterView(counterView);
            }
        });

        add(counterView);

        setVisible(true);
    }

    private void refreshCounterView(JLabel counterView) {
        counterView.setText(String.valueOf(counter));
    }

    public static void main(String[] args) {
        new CounterApp();
    }
}
