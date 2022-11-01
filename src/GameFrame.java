import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame() {
        GamaPanel gamaPanel = new GamaPanel();
        this.add(gamaPanel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}