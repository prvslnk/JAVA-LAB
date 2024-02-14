import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BackgroundColorChanger extends JFrame implements ActionListener {
    private JButton colorButton;

    public BackgroundColorChanger() {
        setTitle("Background Color Changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        colorButton = new JButton("Change Background Color");
        colorButton.addActionListener(this);

        add(colorButton);

        setSize(300, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == colorButton) {
            changeBackgroundColor();
        }
    }

    private void changeBackgroundColor() {
        // Generate a random color
        Color randomColor = new Color(
                (int) (Math.random() * 256),
                (int) (Math.random() * 256),
                (int) (Math.random() * 256)
        );
        getContentPane().setBackground(randomColor);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BackgroundColorChanger());
    }
}