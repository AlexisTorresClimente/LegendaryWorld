import javax.swing.*;
import java.awt.*;

public class NewCharacterConfirmation extends JFrame {

    private static JLabel LBXP = new JLabel();
    private static JLabel LBGold= new JLabel();
    private static JLabel LBOna= new JLabel();
    private static JLabel LBAchvimentPoints= new JLabel();

    private static int Slot;

    private static JLabel LBName=new JLabel();
    private static JLabel LBClass=new JLabel();
    private static JLabel LBRank=new JLabel();
    private JPanel PImg;
    private JPanel PInfo;
    private JPanel PStats;
    private JPanel PCurrency;
    private JPanel PButton;
    private ImageIcon imageIcon;

    public NewCharacterConfirmation() {
        setTitle("Character Creator Confirmation");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        PImg = new JPanel(null);
        PImg.setPreferredSize(new Dimension(400, 600));

        updateImg();

        JLabel LBImg = new JLabel(imageIcon);
        LBImg.setBounds(0, 0, 400, 600);
        PImg.add(LBImg);

        PInfo = new JPanel(new GridLayout(3, 1));
        PInfo.setPreferredSize(new Dimension(200, 150));
        PInfo.setBorder(BorderFactory.createTitledBorder("Info"));

        updateInfo();

        PInfo.add(LBName);
        PInfo.add(LBClass);
        PInfo.add(LBRank);

        PStats = new JPanel(new GridLayout(3, 3));
        PStats.setPreferredSize(new Dimension(200, 150));
        PStats.setBorder(BorderFactory.createTitledBorder("Stats"));

        updateStats();

        PCurrency = new JPanel(new GridLayout(4, 1));
        PCurrency.setPreferredSize(new Dimension(200, 100));
        PCurrency.setBorder(BorderFactory.createTitledBorder("Currency"));

        updateCurency();

        PCurrency.add(LBXP);
        PCurrency.add(LBGold);
        PCurrency.add(LBOna);
        PCurrency.add(LBAchvimentPoints);

        PButton = new JPanel(new FlowLayout());
        PButton.setPreferredSize(new Dimension(400, 100));
        JButton BCreate = new JButton("Create");
        JButton BCancel = new JButton("Cancel");

        PButton.add(BCreate);
        PButton.add(BCancel);

        BCreate.addActionListener(e -> dispose());
        BCancel.addActionListener(e -> {new CharacterSelectionFrame();dispose();});

        JPanel PRight = new JPanel(new GridLayout(3, 1));
        PRight.add(PInfo);
        PRight.add(PStats);
        PRight.add(PCurrency);
        getContentPane().add(PImg, BorderLayout.WEST);
        getContentPane().add(PRight, BorderLayout.CENTER);
        getContentPane().add(PButton, BorderLayout.SOUTH);


        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void updateImg() {
        if(Slot == 1){
            imageIcon = new ImageIcon("./Knight.png");
        }
        else if(Slot == 2){
            imageIcon = new ImageIcon("./Knight.png");
        }
        else if(Slot == 3){
            imageIcon = new ImageIcon("./Knight.png");
        }
        else{
            imageIcon = new ImageIcon("./Knight.png");
        }
    }

    private void updateInfo() {
        String s =(CharacterCreator.getTFName());
        LBName.setText(s);
        LBClass.setText(String.valueOf(CharacterCreator.getSelectedClass()));
        LBRank.setText("F");
    }

    private void updateStats() {

        String[] statsTitulos = {"STR", "DEX", "INT", "WIS", "END", "MYS", "CHARM", "LUCK"};
        if (LBClass.getText().equals("Knight")) {
            int[] statsInicial = {5, 0, 0, 0, 5, 0, 3, 2};
            String[] stats = new String[8];
            for (int i = 0; i < stats.length; i++) {
                stats[i] = statsTitulos[i] + ": " + statsInicial[i];
            }
            for (int i = 0; i < stats.length; i++) {
                JLabel LBStat = new JLabel(stats[i]);
                PStats.add(LBStat);
            }
        }
        else if (LBClass.getText().equals("Mage")) {
            int[] statsInicial = {0, 0, 7, 6, 2, 1, 1, 3};
            String[] stats = new String[8];
            for (int i = 0; i < stats.length; i++) {
                stats[i] = statsTitulos[i] + ": " + statsInicial[i];
            }
            for (int i = 0; i < stats.length; i++) {
                JLabel LBStat = new JLabel(stats[i]);
                PStats.add(LBStat);
            }
        }
        else if (LBClass.getText().equals("Saint")) {
            int[] statsInicial = {0, 0, 0, 0, 0, 7, 2, 5};
            String[] stats = new String[8];
            for (int i = 0; i < stats.length; i++) {
                stats[i] = statsTitulos[i] + ": " + statsInicial[i];
            }
            for (int i = 0; i < stats.length; i++) {
                JLabel LBStat = new JLabel(stats[i]);
                PStats.add(LBStat);
            }
        }
    }

    public void updateCurency(){
            LBXP.setText(Main.CurencyTitulos[0] +": 0");
            LBGold.setText(Main.CurencyTitulos[1] +": 0");
            LBOna.setText(Main.CurencyTitulos[2] +": 0");
            LBAchvimentPoints.setText(Main.CurencyTitulos[3] +": 0");
    }

    public static void setSlot(int slot) {
        Slot = slot;
    }
}
