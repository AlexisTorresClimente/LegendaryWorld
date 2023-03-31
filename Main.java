import java.util.Arrays;
public class Main {

    public static String[] Slot1;
    public static String[] Slot2;
    public static String[] Slot3;
    public static String[] Stats1;
    public static String[] Stats2;
    public static String[] Stats3;

    public static String[] Curency1;
    public static String[] Curency2;
    public static String[] Curency3;

    public static String[] SlotTitulos= new String[3];
    public static String[] StatsTitulos = new String[8];
    public static String[] CurencyTitulos = new String[4];

    public static void main(String[] args) {

        new CharacterLogHandler();

        new StatLogHandler();

        new CurencyLogHandler();

        RecogeLog();

        new CharacterSelectionFrame();

        new CharacterFrame();

        /*Unicamente comprovador de que se han guardo los datos correctamente, borrar al acabar el progama*/
        System.out.println("Slot1: " + Arrays.toString(Slot1));
        System.out.println("Slot2: " + Arrays.toString(Slot2));
        System.out.println("Slot3: " + Arrays.toString(Slot3));
        System.out.println("___________________________________");
        System.out.println("Stats1: " + Arrays.toString(Stats1));
        System.out.println("Stats2: " + Arrays.toString(Stats2));
        System.out.println("Stats3: " + Arrays.toString(Stats3));
        System.out.println("___________________________________");
        System.out.println("Curency1: " + Arrays.toString(Curency1));
        System.out.println("Curency2: " + Arrays.toString(Curency2));
        System.out.println("Curency3: " + Arrays.toString(Curency3));

    }

    public static void RecogeLog(){

        Slot1= CharacterLogHandler.getSlot1();
        Slot2= CharacterLogHandler.getSlot2();
        Slot3= CharacterLogHandler.getSlot3();

        Stats1= StatLogHandler.getStats1();
        Stats2= StatLogHandler.getStats2();
        Stats3= StatLogHandler.getStats3();

        Curency1= CurencyLogHandler.getCurency1();
        Curency2= CurencyLogHandler.getCurency2();
        Curency3= CurencyLogHandler.getCurency3();

        SlotTitulos [0] = "Name";SlotTitulos [1] = "Class";SlotTitulos [2] = "Rank";
        StatsTitulos [0] = "STR";StatsTitulos [1] = "DEX";StatsTitulos [2] = "INT";StatsTitulos [3] = "WIS";StatsTitulos [4] = "END";StatsTitulos [5] = "MYS";StatsTitulos [6] = "CHARM";StatsTitulos [7] = "LUCK";
        CurencyTitulos [0]= "XP";CurencyTitulos [1]= "Gold";CurencyTitulos [2]= "Ona";CurencyTitulos [3]= "Achviment Points";
    }
}
