// This file is responsible for adding a textbox to the gui as well as calling images
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RegisterPanel extends JPanel {

    private JTextField input;
    private Register register;
    private PursePanel changePanel;
    private JFrame holder;

    public RegisterPanel(JFrame holder) {
        this.holder = holder;
        register = new Register();

        this.setPreferredSize(new Dimension(800, 700));

        JPanel inputPanel = new JPanel();
        input = new JTextField();
        input.setPreferredSize(new Dimension(300, 100));
        input.setFont(new Font("sansserif", Font.PLAIN, 40));
        input.addActionListener(new InputListener() {});
        inputPanel.add(new JLabel("Enter Amount:"));
        inputPanel.add(input);

        changePanel = new PursePanel();

        this.add(inputPanel);
        this.add(changePanel);



    }

    private class InputListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String text = input.getText();
            double amount = Double.parseDouble(text);
            Purse purse = Register.makeChange(amount);
            System.out.println(purse);
            changePanel.setPurse(purse);
            changePanel.setDisplayContents();
            changePanel.displayResetLabel.setText("");
            holder.setVisible(true);


        }
    }
}
