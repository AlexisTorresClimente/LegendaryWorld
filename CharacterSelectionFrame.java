import javax.swing.*;
import java.awt.*;
public class CharacterSelectionFrame extends JFrame {

    private static JTextField textField1 = new JTextField();
    private static JTextField textField2 = new JTextField();
    private static JTextField textField3 = new JTextField();


    public CharacterSelectionFrame() {

        setTitle("Character Selection");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel();
        JPanel middlePanel = new JPanel();
        JPanel bottomPanel = new JPanel();

        JLabel label = new JLabel("Character Selection", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        topPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        topPanel.add(label, gbc);

        middlePanel.setLayout(new BorderLayout());
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(3, 1, 0, 10));
        JButton BSlot1 = new JButton(" Slot 1");
        buttonsPanel.add(BSlot1);
        JButton BSlot2 = new JButton(" Slot 2");
        buttonsPanel.add(BSlot2);
        JButton BSlot3 = new JButton(" Slot 3");
        buttonsPanel.add(BSlot3);

        middlePanel.add(buttonsPanel, BorderLayout.WEST);
        JPanel textFieldsPanel = new JPanel();
        textFieldsPanel.setLayout(new GridLayout(3, 1, 0, 10));

        Textfield1Variable();
        Textfield2Variable();
        Textfield3Variable();

        textField1.setEditable(false);
        textFieldsPanel.add(textField1);

        textField2.setEditable(false);
        textFieldsPanel.add(textField2);

        textField3.setEditable(false);
        textFieldsPanel.add(textField3);


        middlePanel.add(textFieldsPanel, BorderLayout.CENTER);
        middlePanel.add(textFieldsPanel, BorderLayout.CENTER);


        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));
        JPanel buttonsPanel2 = new JPanel();
        buttonsPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton BHelp = new JButton("Help");
        buttonsPanel2.add(BHelp);
        JButton BExit = new JButton("Exit");
        buttonsPanel2.add(BExit);
        bottomPanel.add(Box.createVerticalGlue());
        bottomPanel.add(buttonsPanel2);
        bottomPanel.add(Box.createVerticalGlue());
        JLabel LBJoke = new JLabel("Try pressing another one");
        bottomPanel.add(LBJoke);
        LBJoke.setVisible(false);

        topPanel.setPreferredSize(new Dimension(400, 100));
        middlePanel.setPreferredSize(new Dimension(400, 100));
        bottomPanel.setPreferredSize(new Dimension(400, 100));


        add(topPanel, BorderLayout.NORTH);
        add(middlePanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);


        if (!Main.Slot1[1].equals(Class.Knight.toString()) && !Main.Slot1[1].equals(Class.Mage.toString()) && !Main.Slot1[1].equals(Class.Saint.toString())) {
            BSlot1.addActionListener(e -> {
                CharacterFrame.setSlot(1);
                new CharacterCreator();
                dispose();
            });
        } else {
            BSlot1.addActionListener(e -> {
                CharacterFrame.setSlot(1);
                new CharacterFrame();
                dispose();
            });
        }

        if (!Main.Slot2[1].equals(Class.Knight.toString()) && !Main.Slot2[1].equals(Class.Mage.toString()) && !Main.Slot2[1].equals(Class.Saint.toString())) {
            BSlot2.addActionListener(e -> {
                CharacterFrame.setSlot(2);
                new CharacterCreator();
                dispose();
            });
        } else {
            BSlot2.addActionListener(e -> {
                CharacterFrame.setSlot(2);
                new CharacterFrame();
                dispose();
            });
        }

        if (!Main.Slot3[1].equals(Class.Knight.toString()) && !Main.Slot3[1].equals(Class.Mage.toString()) && !Main.Slot3[1].equals(Class.Saint.toString())) {
            BSlot3.addActionListener(e -> {
                CharacterFrame.setSlot(3);
                new CharacterCreator();
                dispose();
            });
        } else {
            BSlot3.addActionListener(e -> {
                CharacterFrame.setSlot(3);
                new CharacterFrame();
                dispose();
            });
        }


        BHelp.addActionListener(e -> LBJoke.setVisible(true));

        BExit.addActionListener(e -> System.exit(0));

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void Textfield1Variable() {
        if (!Main.Slot1[1].equals(Class.Knight.toString()) && !Main.Slot1[1].equals(Class.Mage.toString()) && !Main.Slot1[1].equals(Class.Saint.toString())) {
            textField1.setText("Save File 1");
        }else{
        textField1.setText("Name: " + Main.Slot1[0] + " | Class: " + Main.Slot1[1] + " | Rank: " + Main.Slot1[2]);
        }
    }

    public static void Textfield2Variable() {
        if (!Main.Slot2[1].equals(Class.Knight.toString()) && !Main.Slot2[1].equals(Class.Mage.toString()) && !Main.Slot2[1].equals(Class.Saint.toString())) {
            textField2.setText("Save File 3");
        }else{
        textField2.setText("Name: " + Main.Slot2[0] + " | Class: " + Main.Slot2[1] + " | Rank: " + Main.Slot2[2]);
        }
    }
    public static void Textfield3Variable() {
        if (!Main.Slot3[1].equals(Class.Knight.toString()) && !Main.Slot3[1].equals(Class.Mage.toString()) && !Main.Slot3[1].equals(Class.Saint.toString())){
            textField3.setText("Save File 3");
        }else{
        textField3.setText("Name: "+Main.Slot3[0]+" | Class: "+Main.Slot3[1]+" | Rank: "+Main.Slot3[2]);
        }
    }

    public static void main(String[] args) {
        new CharacterSelectionFrame();
    }
}
