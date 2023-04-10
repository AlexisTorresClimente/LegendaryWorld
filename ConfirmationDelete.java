import javax.swing.*;
import java.awt.*;

public class ConfirmationDelete extends JFrame {

    public ConfirmationDelete() {
        setTitle("Confirmación de Eliminación");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton confirmButton = new JButton("Confirm");
        JButton returnButton = new JButton("Return");
        JTextField DeleteCharacter = new JTextField("Do you wanna delete the character?");
        DeleteCharacter.setEditable(false);
        DeleteCharacter.setPreferredSize(new Dimension(200, 30));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(confirmButton);
        buttonPanel.add(returnButton);

        setLayout(new BorderLayout());
        add(DeleteCharacter, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        returnButton.addActionListener(e -> {new CharacterFrame();dispose();});
        confirmButton.addActionListener(e -> {dispose();new CharacterSelectionFrame();});

        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        new ConfirmationDelete();
    }
}
