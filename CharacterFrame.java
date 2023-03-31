import javax.swing.*;
import java.awt.*;

public class CharacterFrame extends JFrame {

    int Slot=1;

    private static JLabel LBName=new JLabel();
    private static JLabel LBClass=new JLabel();
    private static JLabel LBRank=new JLabel();

    public CharacterFrame() {

        setTitle("Character Frame");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel PImg = new JPanel(null);
        PImg.setPreferredSize(new Dimension(300, 600));
        ImageIcon imageIcon;
        if(Slot == 1){
            imageIcon = new ImageIcon("/home/estudiante/Descargas/Knight.png");
        }
        else if(Slot == 2){
            imageIcon = new ImageIcon("/home/estudiante/Descargas/Knight.png");
        }
        else if(Slot == 3){
            imageIcon = new ImageIcon("/home/estudiante/Descargas/Knight.png");

        }
        else{
            imageIcon = new ImageIcon("/home/estudiante/Descargas/Knight.png");
        }
        JLabel LBImg = new JLabel(imageIcon);

        LBImg.setBounds(0, 0, 300, 600);
        PImg.add(LBImg);

        JPanel PInfo = new JPanel(new GridLayout(3, 1));
        PInfo.setPreferredSize(new Dimension(300, 150));
        PInfo.setBorder(BorderFactory.createTitledBorder("Info"));

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

        PInfo.add(LBName);
        PInfo.add(LBClass);
        PInfo.add(LBRank);

        JPanel PStats = new JPanel(new GridLayout(3, 3));
        PStats.setPreferredSize(new Dimension(300, 150));
        PStats.setBorder(BorderFactory.createTitledBorder("Stats"));

        if (Slot ==1){
        for(int i=0; i < Main.Stats1.length; i++) {
            JLabel LBStat = new JLabel(Main.StatsTitulos[i] +": "+ i);
            PStats.add(LBStat);
        }}
        if (Slot == 2){
            for(int i=0; i < Main.Stats1.length; i++) {
                JLabel LBStat = new JLabel(Main.StatsTitulos[i] +": "+ i);
                PStats.add(LBStat);
            }
        }
        if (Slot == 3){
            for (int i = 0; i < Main.Stats1.length; i++) {
                JLabel LBStat = new JLabel(Main.StatsTitulos[i] +": "+ i);
                PStats.add(LBStat);
            }
        }

        JPanel PCurrency = new JPanel(new GridLayout(4, 1));
        PCurrency.setPreferredSize(new Dimension(300, 100));
        PCurrency.setBorder(BorderFactory.createTitledBorder("Currency"));

        JLabel LBXP =new JLabel();
        JLabel LBGold =new JLabel();
        JLabel LBOna =new JLabel();
        JLabel LBAchvimentPoints =new JLabel();
        if (Slot ==1) {
            LBXP.setText(Main.CurencyTitulos[0] +": "+Main.Curency1 [0]);
            LBGold.setText(Main.CurencyTitulos[1] +": "+Main.Curency1 [1]);
            LBOna.setText(Main.CurencyTitulos[2] +": "+Main.Curency1 [2]);
            LBAchvimentPoints.setText(Main.CurencyTitulos[3] +": "+Main.Curency1 [3]);
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

        PCurrency.add(LBXP);
        PCurrency.add(LBGold);
        PCurrency.add(LBOna);
        PCurrency.add(LBAchvimentPoints);


        JPanel panel5 = new JPanel(new FlowLayout());

        panel5.setPreferredSize(new Dimension(300, 100));

        JButton BPlay = new JButton("Play");
        JButton BReturn = new JButton("Return");
        JButton BDelete = new JButton("Delete");

        panel5.add(BPlay);
        panel5.add(BReturn);
        panel5.add(BDelete);

        // Se agregan los paneles al JFrame

        /*CAMBIAR ESTA PARTE DEJANDO PIMG Y P5 COMO ESTAN Y LOS OTROS TRES QUE SE APILEN*/
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(PImg, BorderLayout.WEST);
        getContentPane().add(PInfo, BorderLayout.CENTER);
        getContentPane().add(PStats, BorderLayout.CENTER);
        getContentPane().add(PCurrency, BorderLayout.CENTER);
        getContentPane().add(panel5, BorderLayout.SOUTH);


        setVisible(true);
    }

    public static void main(String[] args) {
    new CharacterFrame();
    }
}
