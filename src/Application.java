import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {
    public Application(){
        initUI();
    }

    private void initUI(){
        add(new Board());
        setResizable(false);
        pack();
        setTitle("Animation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Application app = new Application();
            app.setVisible(true);
        });

    }
}
