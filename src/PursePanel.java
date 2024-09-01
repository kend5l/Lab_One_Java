import javax.swing.*;
import java.awt.*;

public class PursePanel extends JPanel {

    private Purse purse;

    public PursePanel() {
        this.purse = new Purse();
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(800, 600));



        //ImageIcon img = new ImageIcon("Images/penny.png");
        //label.setIcon(img);

    }
}
