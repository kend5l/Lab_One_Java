// This file creates a JFrame and adds a register panel to the JFrame
import java.awt.*;
import javax.swing.*;

public class MakingChange {
    // creates JFrame
    public static void main(String[] args) {
        // initialize a new frame
        JFrame frame = new JFrame();
        // creates register panel for frame
        RegisterPanel registerPanel = new RegisterPanel(frame);
        //adds frame
        frame.add(registerPanel);
        // sets dimensions of frame
        frame.setPreferredSize(new Dimension(800,700));
        // make gui close when you press the "X"
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // pack the frame
        frame.pack();
        // set visible to true
        frame.setVisible(true);

    }
}