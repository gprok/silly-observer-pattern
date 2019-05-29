import javax.swing.*;
import java.awt.*;

public class ColorPanel extends JPanel implements ButtonListener {

    @Override
    public void act() {
        Color color = getBackground();
        if(color == Color.RED) {
            setBackground(Color.GREEN);
        }
        else {
            setBackground(Color.RED);
        }
    }

}
