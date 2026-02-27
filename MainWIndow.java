import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private JButton button;

    MainWindow() {
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        button = new JButton("click me");

        add(button);

    }
}
