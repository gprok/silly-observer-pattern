import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class MainWindow extends JFrame {

    private JButton btn;
    private SouthPanel spanel;
    private SidePanel leftpanel;
    private SidePanel rightpanel;

    private ArrayList<ButtonListener> blisteners;

    public MainWindow() {
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ColorPanel panel = new ColorPanel();

        btn = new JButton("Click me!");
        panel.add(btn);

        add(panel, BorderLayout.CENTER);

        spanel = new SouthPanel();
        add(spanel, BorderLayout.SOUTH);

        leftpanel = new SidePanel(true);
        add(leftpanel, BorderLayout.EAST);

        rightpanel = new SidePanel(false);
        add(rightpanel, BorderLayout.WEST);

        blisteners = new ArrayList<>();
        blisteners.add(panel);
        blisteners.add(spanel);
        blisteners.add(leftpanel);
        blisteners.add(rightpanel);


        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Iterator<ButtonListener> it = blisteners.iterator();
                while(it.hasNext()) {
                    ButtonListener b = it.next();
                    b.act();
                }
            }
        });

        setVisible(true);
    }

    public static void main(String [] args) {
        MainWindow m = new MainWindow();
    }
}
