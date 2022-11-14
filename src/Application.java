import javax.swing.*;

public class Application extends JFrame {
    public Application(){
        initUI();
    }

    private void initUI(){
        add(new Board());
        setSize(250, 200);
        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.setVisible(true);
    }
}
