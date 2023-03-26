package com.company;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Pradeep");
        JFrame frame = new JFrame("Introduction1");
        frame.setTitle("Introduction2");
        frame.setVisible(true);
        frame.setLocation(200,200);
        frame.setSize(800,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.cyan);
//        frame.getContentPane().setBackground(Color.decode("#fff"));
        frame.setBackground(Color.cyan);
    }
}
