import javax.swing.*;

public class SouthPanel extends JPanel {

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

}
