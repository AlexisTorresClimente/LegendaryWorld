import javax.swing.*;
import java.awt.*;

public class CharacterSelectionWindow extends JFrame  {

    private static String[] Logs;

    private static int Selected=0;
    private JPanel panelSup = new JPanel();
    private JPanel panelInf = new JPanel();
    private JPanel panelInfo = new JPanel();
    private JPanel panelSlot1 = new JPanel();
    private JPanel panelSlot2 = new JPanel();
    private JPanel panelSlot3 = new JPanel();
    private JLabel lbTitulo = new JLabel("Character Selection");
    private JButton bClose = new JButton("Close");
    private JLabel lbSlots = new JLabel("Slots");
    private JLabel lbName = new JLabel("Name");
    private JLabel lbClass = new JLabel("Class");
    private JLabel lbRank = new JLabel("Rank");
    private JButton bSlot1 = new JButton("Slot 1");
    private JButton bSlot2 = new JButton("Slot 2");
    private JButton bSlot3 = new JButton("Slot 3");


    public CharacterSelectionWindow() {
        super("Character Selection");
        new CharacterLogsParser();
        Logs = CharacterLogsParser.getLogs();


        JTextField tfSlot1 = new JTextField("   "+Logs[1]+"      |   "+Logs[2]+"   |   "+Logs[3]);
        JTextField tfSlot2 = new JTextField("   "+Logs[5]+"      |   "+Logs[6]+"   |   "+Logs[7]);
        JTextField tfSlot3 = new JTextField("   "+Logs[9]+"      |   "+Logs[10]+"   |   "+Logs[11]);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        panelSup.setLayout(new BorderLayout());
        panelInf.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelInfo.setLayout(new GridLayout(1, 4));
        panelSlot1.setLayout(new BorderLayout());
        panelSlot2.setLayout(new BorderLayout());
        panelSlot3.setLayout(new BorderLayout());

        lbTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        lbTitulo.setHorizontalAlignment(JLabel.CENTER);
        lbSlots.setHorizontalAlignment(JLabel.CENTER);
        lbName.setHorizontalAlignment(JLabel.CENTER);
        lbClass.setHorizontalAlignment(JLabel.CENTER);
        lbRank.setHorizontalAlignment(JLabel.CENTER);
        tfSlot1.setEditable(false);
        tfSlot2.setEditable(false);
        tfSlot3.setEditable(false);

        panelSup.add(lbTitulo, BorderLayout.CENTER);
        panelInf.add(bClose);
        panelInfo.add(lbSlots);
        panelInfo.add(lbName);
        panelInfo.add(lbClass);
        panelInfo.add(lbRank);
        panelSlot1.add(bSlot1, BorderLayout.WEST);
        panelSlot1.add(tfSlot1, BorderLayout.CENTER);
        panelSlot2.add(bSlot2, BorderLayout.WEST);
        panelSlot2.add(tfSlot2, BorderLayout.CENTER);
        panelSlot3.add(bSlot3, BorderLayout.WEST);
        panelSlot3.add(tfSlot3, BorderLayout.CENTER);

        bSlot1.setPreferredSize(new Dimension(100, bSlot1.getPreferredSize().height));
        bSlot2.setPreferredSize(new Dimension(100, bSlot2.getPreferredSize().height));
        bSlot3.setPreferredSize(new Dimension(100, bSlot3.getPreferredSize().height));

        getContentPane().setLayout(new GridLayout(6, 1));
        getContentPane().add(panelSup);
        getContentPane().add(panelInfo);
        getContentPane().add(panelSlot1);
        getContentPane().add(panelSlot2);
        getContentPane().add(panelSlot3);
        getContentPane().add(panelInf);


        bClose.addActionListener(e -> System.exit(0));
        bSlot1.addActionListener(e -> {new Characters();Selected=0; dispose();});
        bSlot2.addActionListener(e -> {new Characters();Selected=4; dispose();});
        bSlot3.addActionListener(e -> {new Characters();Selected=8; dispose();});

        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {

        new CharacterSelectionWindow();
    }

    public static int getSelected() {
        return Selected;
    }
}
