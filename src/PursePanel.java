import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PursePanel extends JPanel {

    private Purse purse;

    public PursePanel() {
        this.purse = new Purse();
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(800, 600));



        //ImageIcon img = new ImageIcon("Images/penny.png");
        //label.setIcon(img);

    }

    public void setPurse(Purse p) {
        this.purse = p;

    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("This has ran");

        for (Map.Entry<DenominationList.Denominations, Integer> cash : purse.cash.entrySet()) {
            for(int i = 0; i < cash.getValue(); i++) {
                ImageIcon icon = new ImageIcon(cash.getKey().img());
                Image img = icon.getImage();
                // scale the image to change the size its way too big
                Image scaledImg = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(scaledImg);

                JLabel label = new JLabel(scaledIcon);
                this.add(label);
            }
        }
    }
}
