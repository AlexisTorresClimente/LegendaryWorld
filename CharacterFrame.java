import javax.swing.*;
import java.awt.*;

public class CharacterFrame extends JFrame {

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

    public CharacterFrame() {
        setTitle("Character Frame");
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
        JButton BPlay = new JButton("Play");
        JButton BReturn = new JButton("Return");
        JButton BDelete = new JButton("Delete");

        PButton.add(BPlay);
        PButton.add(BReturn);
        PButton.add(BDelete);

        BPlay.addActionListener(e -> dispose());
        BReturn.addActionListener(e -> {new CharacterSelectionFrame();dispose();});
        BDelete.addActionListener(e -> {new ConfirmationDelete();dispose();});

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
        if(Slot == 1){
            LBName.setText((Main.SlotTitulos[0])+": "+Main.Slot1[0]);
            LBClass.setText((Main.SlotTitulos[1])+": "+Main.Slot1[1]);
            LBRank.setText((Main.SlotTitulos[2])+": "+Main.Slot1[2]);
        }
        if(Slot == 2){
            LBName.setText((Main.SlotTitulos[0])+": "+Main.Slot2[0]);
            LBClass.setText((Main.SlotTitulos[1])+": "+Main.Slot2[1]);
            LBRank.setText((Main.SlotTitulos[2])+": "+Main.Slot2[2]);
        }
        if(Slot == 3){
            LBName.setText((Main.SlotTitulos[0])+": "+Main.Slot3[0]);
            LBClass.setText((Main.SlotTitulos[1])+": "+Main.Slot3[1]);
            LBRank.setText((Main.SlotTitulos[2])+": "+Main.Slot3[2]);
        }
    }

    private void updateStats() {
        if (Slot ==1){
            for(int i=0; i < Main.Stats1.length; i++) {
                JLabel LBStat = new JLabel(Main.StatsTitulos[i] +": "+ Main.Stats1[i]);
                PStats.add(LBStat);
            }}
        if (Slot == 2){
            for(int i=0; i < Main.Stats1.length; i++) {
                JLabel LBStat = new JLabel(Main.StatsTitulos[i] +": "+ Main.Stats2[i]);
                PStats.add(LBStat);
            }
        }
        if (Slot == 3){
            for (int i = 0; i < Main.Stats1.length; i++) {
                JLabel LBStat = new JLabel(Main.StatsTitulos[i] +": "+ Main.Stats3[i]);
                PStats.add(LBStat);
            }
        }
    }

    public void updateCurency(){
        if (Slot ==1) {
            LBXP.setText(Main.CurencyTitulos[0] +": "+Main.Curency1 [0]);
            LBGold.setText(Main.CurencyTitulos[1] +": "+Main.Curency1 [1]);
            LBOna.setText(Main.CurencyTitulos[2] +": "+Main.Curency1 [2]);
            LBAchvimentPoints.setText(Main.CurencyTitulos[3] +": "+Main.Curency1[3]);
        }
            else if (Slot == 2){
            LBXP.setText(Main.CurencyTitulos[0] +": "+Main.Curency2 [0]);
            LBGold.setText(Main.CurencyTitulos[1] +": "+Main.Curency2 [1]);
            LBOna.setText(Main.CurencyTitulos[2] +": "+Main.Curency2 [2]);
            LBAchvimentPoints.setText(Main.CurencyTitulos[3] +": "+Main.Curency2 [3]);
        }
            else  if (Slot == 3){
            LBXP.setText(Main.CurencyTitulos[0] +": "+Main.Curency3 [0]);
            LBGold.setText(Main.CurencyTitulos[1] +": "+Main.Curency3 [1]);
            LBOna.setText(Main.CurencyTitulos[2] +": "+Main.Curency3 [2]);
            LBAchvimentPoints.setText(Main.CurencyTitulos[3] +": "+Main.Curency3 [3]);
        }

    }

    public static void setSlot(int slot) {
        Slot = slot;
    }

    public static int getSlot() {
        return Slot;
    }
}
