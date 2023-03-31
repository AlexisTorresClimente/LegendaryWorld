import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class CharacterLogHandler {

    private static String[] Slot1 = new String[5];
    private static String[] Slot2 = new String[5];
    private static String[] Slot3 = new String[5];

    public CharacterLogHandler() {
        try {

            File inputFile = new File("/home/estudiante/Unidad8/src/main/java/CharacterLog.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();


            NodeList nList = doc.getElementsByTagName("Character");



            for (int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    String slot = eElement.getElementsByTagName("Slot").item(0).getTextContent();
                    String name = eElement.getElementsByTagName("Name").item(0).getTextContent();
                    String charClass = eElement.getElementsByTagName("Class").item(0).getTextContent();
                    String rank = eElement.getElementsByTagName("Rank").item(0).getTextContent();
                    String statLogNum = eElement.getElementsByTagName("StatLogNum").item(0).getTextContent();
                    String currencyLogNum = eElement.getElementsByTagName("CurrencyLogNum").item(0).getTextContent();

                    if (slot.equals("1")) {
                        Slot1[0] = name;
                        Slot1[1] = charClass;
                        Slot1[2] = rank;
                        Slot1[3] = statLogNum;
                        Slot1[4] = currencyLogNum;
                    } else if (slot.equals("2")) {
                        Slot2[0] = name;
                        Slot2[1] = charClass;
                        Slot2[2] = rank;
                        Slot2[3] = statLogNum;
                        Slot2[4] = currencyLogNum;
                    } else if (slot.equals("3")) {
                        Slot3[0] = name;
                        Slot3[1] = charClass;
                        Slot3[2] = rank;
                        Slot3[3] = statLogNum;
                        Slot3[4] = currencyLogNum;
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String[] getSlot1() {
        return Slot1;
    }

    public static String[] getSlot2() {
        return Slot2;
    }

    public static String[] getSlot3() {
        return Slot3;
    }
}