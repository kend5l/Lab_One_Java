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
    // this function is responsible for displaying images (also holds logic)
    public void setDisplayContents() {
        // Outer loop will loop through the purse
        for (Map.Entry<DenominationList.Denominations, Integer> cash : purse.cash.entrySet()) {
            // Inner loop will loop through the cash types in the purse (ex: dollars, quarters, hundreds etc)
            for(int i = 0; i < cash.getValue(); i++) {
                // creates an image icon for a bill / coin. for example, if we have $5.23 this would load
                // a $5 bill icon into the gui
                ImageIcon icon = new ImageIcon(cash.getKey().img());
                // gets image
                Image img = icon.getImage();
                // scales the image down so it can fit inside the gui window (this was a bug fix
                // for me this may not apply to you)
                Image scaledImg = img.getScaledInstance(75, 75, Image.SCALE_SMOOTH);
                // add scaled image into the gui window (again this may not apply to you)
                ImageIcon scaledIcon = new ImageIcon(scaledImg);
                // create a label for the image icon (we need a label as a placeholder if we wanna add anything to the gui)
                // if you wanna add to the gui, it needs a label
                JLabel label = new JLabel(scaledIcon);
                // add it to the gui
                this.add(label);
            }
        }
        // this is just resetting the gui window to be empty
        this.add(displayResetLabel);
        repaint();

    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);

    }
}