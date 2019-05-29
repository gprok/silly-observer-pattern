import javax.swing.*;

public class SouthPanel extends JPanel implements ButtonListener {

    private int counter;
    private JLabel message;

    public SouthPanel() {
        counter = 0;
        message = new JLabel("No click yet");
        add(message);
    }

    public void increaseCounter() {
        counter++;
        message.setText("Button clicked " + counter + " times");
    }

    @Override
    public void act() {
        increaseCounter();
    }
}
