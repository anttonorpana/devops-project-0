import javax.swing.*;

public class MainWindow extends JFrame {
    private JButton button;

    MainWindow() {
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        button = new JButton("click me");

    }
}
