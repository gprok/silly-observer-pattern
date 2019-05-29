import javax.swing.*;

public class SidePanel extends JPanel {

    JLabel message;

    public SidePanel(boolean isEmpty) {
        if(isEmpty) {
            message = new JLabel("");
        }
        else {
            message = new JLabel("Hello");
        }
        add(message);
    }

    public void changeText() {
        if(message.getText() == "Hello") {
            message.setText("");
        }
        else {
            message.setText("Hello");
        }
    }
}
