import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class RegisterPanel extends JPanel {
    private JTextField textField;

    public RegisterPanel() {
        this.setPreferredSize(new Dimension(800, 700));

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(300, 200));
        textField.setFont(new Font("sansserif", Font.PLAIN, 40));
        textField.addActionListener(new InputListener() {});

        this.add(textField);


    }

    private static class InputListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
}
