// This file is responsible for the logic side of the images displaying in the gui
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PursePanel extends JPanel {

    private Purse purse;

    public final JLabel displayResetLabel = new JLabel("");
    public PursePanel() {
        this.purse = new Purse();
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(800, 600));
    }

    public void setPurse(Purse p) {
        this.purse = p;

    }

    public void setDisplayContents() {

        for (Map.Entry<DenominationList.Denominations, Integer> cash : purse.cash.entrySet()) {
            for(int i = 0; i < cash.getValue(); i++) {
                ImageIcon icon = new ImageIcon(cash.getKey().img());
                Image img = icon.getImage();
                Image scaledImg = img.getScaledInstance(75, 75, Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(scaledImg);

                JLabel label = new JLabel(scaledIcon);
                this.add(label);
            }
        }
        this.add(displayResetLabel);
        repaint();

    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);

    }
}