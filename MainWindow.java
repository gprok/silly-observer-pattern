import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private JButton btn;
    private SouthPanel spanel;
    private SidePanel leftpanel;
    private SidePanel rightpanel;

    public MainWindow() {
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        btn = new JButton("Click me!");
        panel.add(btn);

        add(panel, BorderLayout.CENTER);

        spanel = new SouthPanel();
        add(spanel, BorderLayout.SOUTH);

        leftpanel = new SidePanel(true);
        add(leftpanel, BorderLayout.EAST);

        rightpanel = new SidePanel(false);
        add(rightpanel, BorderLayout.WEST);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = panel.getBackground();
                if(color == Color.RED) {
                    panel.setBackground(Color.GREEN);
                }
                else {
                    panel.setBackground(Color.RED);
                }

                spanel.increaseCounter();

                leftpanel.changeText();
                rightpanel.changeText();
            }
        });

        setVisible(true);
    }

    public static void main(String [] args) {
        MainWindow m = new MainWindow();
    }
}
