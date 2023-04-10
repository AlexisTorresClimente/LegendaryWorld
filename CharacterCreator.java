import javax.swing.*;

public class CharacterCreator extends JFrame {

    private static JLabel LBName, LBClass;
    private static JTextField TFName;
    private static JComboBox<String> CBClass;
    private static JButton BTCreate, BTReturn;
    private static String selectedClass = String.valueOf(Class.Knight);

    public CharacterCreator() {
        super("Character Creator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(300, 200);

        LBName = new JLabel("Name:");
        LBName.setBounds(10, 10, 100, 20);
        add(LBName);

        TFName = new JTextField();
        TFName.setBounds(120, 10, 150, 20);
        add(TFName);

        LBClass = new JLabel("Class:");
        LBClass.setBounds(10, 40, 100, 20);
        add(LBClass);


        String[] classOptions = {String.valueOf(Class.Knight), String.valueOf(Class.Mage), String.valueOf(Class.Saint)};
        CBClass = new JComboBox<>(classOptions);
        CBClass.setBounds(120, 40, 150, 20);
        add(CBClass);


        CBClass.addActionListener(e -> {selectedClass = (String) CBClass.getSelectedItem();});

        BTCreate = new JButton("Create");
        BTCreate.setBounds(40, 100, 80, 30);
        add(BTCreate);

        BTReturn = new JButton("Return");
        BTReturn.setBounds(140, 100, 80, 30);
        add(BTReturn);

        BTCreate.addActionListener(e -> new NewCharacterConfirmation());
        BTReturn.addActionListener(e -> {new CharacterSelectionFrame(); dispose();});

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CharacterCreator();
    }

    public static String getTFName() {
        return TFName.getText();
    }

    public static String getSelectedClass() {
        return selectedClass;
    }
}