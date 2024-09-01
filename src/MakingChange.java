import java.awt.*;
import javax.swing.*;

public class MakingChange {
    // creates JFrame
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        RegisterPanel registerPanel = new RegisterPanel();
        frame.add(registerPanel);
        frame.setPreferredSize(new Dimension(800,700));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);

    }
}
