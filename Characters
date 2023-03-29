import javax.swing.*;
import java.awt.*;

public class Characters extends JFrame {

    private static String[] Logs = new String[12];
    private JPanel panelImg = new JPanel();
    private JPanel panelInfo = new JPanel();
    private JPanel panelName = new JPanel();
    private JPanel panelClass = new JPanel();
    private JPanel panelRank = new JPanel();
    private JPanel panelOpc = new JPanel();
    private JLabel lbName = new JLabel("Name:");
    private JLabel lbClass = new JLabel("Class:");
    private JLabel lbRank = new JLabel("Rank:");
    private static int i;

    private JButton bUse = new JButton("USE");
    private JButton bReturn = new JButton("RETURN");
    private JButton bDelete = new JButton("DELETE");
    private JLabel Blank = new JLabel("         |         ");
    private JLabel Blank2 = new JLabel("         |         ");
    public Characters() {

        Logs = CharacterLogsParser.getLogs();
        i = CharacterSelectionWindow.getSelected();

        setTitle("Characters");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField tfName = new JTextField(Logs[i+1]);
        JTextField tfClass = new JTextField(Logs[i+2]);
        JTextField tfRank = new JTextField("        "+Logs[i+3]);

        panelImg.setPreferredSize(new Dimension(300, getHeight()));
        panelInfo.setPreferredSize(new Dimension(300, getHeight()/2));
        panelName.setPreferredSize(new Dimension(300, getHeight()/6));
        panelClass.setPreferredSize(new Dimension(100, getHeight()/6));
        panelRank.setPreferredSize(new Dimension(100, getHeight()/6));
        panelOpc.setPreferredSize(new Dimension(300, getHeight()/4));

        panelName.setLayout(new BorderLayout());
        panelClass.setLayout(new BorderLayout());
        panelRank.setLayout(new BorderLayout());
        panelInfo.setLayout(new BoxLayout(panelInfo, BoxLayout.Y_AXIS));
        panelOpc.setLayout(new GridBagLayout());

        lbName.setPreferredSize(new Dimension(98, panelName.getHeight()));
        tfName.setPreferredSize(new Dimension(297, panelName.getHeight()));
        lbClass.setPreferredSize(new Dimension(98, panelClass.getHeight()));
        tfClass.setPreferredSize(new Dimension(297, panelClass.getHeight()));
        lbRank.setPreferredSize(new Dimension(98, panelRank.getHeight()));
        tfRank.setPreferredSize(new Dimension(297, panelRank.getHeight()));

        tfName.setEditable(false);
        tfClass.setEditable(false);
        tfRank.setEditable(false);

        panelName.add(lbName, BorderLayout.WEST);
        panelName.add(tfName, BorderLayout.CENTER);
        panelClass.add(lbClass, BorderLayout.WEST);
        panelClass.add(tfClass, BorderLayout.CENTER);
        panelRank.add(lbRank, BorderLayout.WEST);
        panelRank.add(tfRank, BorderLayout.CENTER);

        panelInfo.add(panelName);
        panelInfo.add(panelClass);
        panelInfo.add(panelRank);


        panelOpc.add(bUse);
        panelOpc.add(Blank);
        panelOpc.add(bReturn);
        panelOpc.add(Blank2);
        panelOpc.add(bDelete);

        bUse.setMargin(new Insets(5, 50, 5, 50));
        Blank.setSize(5,50);
        bReturn.setMargin(new Insets(5, 50, 5, 50));
        Blank2.setSize(5,50);
        bDelete.setMargin(new Insets(5, 50, 5, 50));

        panelImg.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panelImg, BorderLayout.WEST);
        getContentPane().add(panelInfo, BorderLayout.CENTER);
        getContentPane().add(panelOpc, BorderLayout.SOUTH);

        bReturn.addActionListener(e -> {new CharacterSelectionWindow();dispose();});



        setLocationRelativeTo(null);
        setVisible(true);
    }

}
