import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Window for our app
 */
public class MainWindow extends JFrame {
    private JButton button;

    /**
     * Constructor method for MainWindow
     */
    MainWindow() {
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        button = new JButton("click me");
        add(button);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        button.setText("Good job");
    }
}
