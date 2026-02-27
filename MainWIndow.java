import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Window for our app
 */
public class MainWindow extends JFrame implements ActionListener {
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

        button.addActionListener(this);

        setVisible(true);
    }

    /**
     * Change button text to good job after pressing it
     */
    public void actionPerformed(ActionEvent e) {
        button.setText("Good job");
    }
