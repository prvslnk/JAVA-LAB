import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextColorChanger extends JFrame implements ActionListener {
    private JButton redButton;
    private JButton blueButton;
    private JButton greenButton;
    private JLabel textLabel;

    public TextColorChanger() {
        setTitle("Text Color Changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        redButton = new JButton("Red");
        redButton.addActionListener(this);
        blueButton = new JButton("Blue");
        blueButton.addActionListener(this);
        greenButton = new JButton("Green");
        greenButton.addActionListener(this);

        textLabel = new JLabel("Text");
        textLabel.setForeground(Color.BLACK);

        add(redButton);
        add(blueButton);
        add(greenButton);
        add(textLabel);

        setSize(300, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            changeTextColor(Color.RED);
        } else if (e.getSource() == blueButton) {
            changeTextColor(Color.BLUE);
        } else if (e.getSource() == greenButton) {
            changeTextColor(Color.GREEN);
        }
    }

    private void changeTextColor(Color color) {
        textLabel.setForeground(color);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TextColorChanger());
    }
}
