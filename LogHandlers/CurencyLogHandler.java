package LogHandlers;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.File;

public class CurencyLogHandler {

    private static String[] Curency1 = new String[4];
    private static String[] Curency2 = new String[4];
    private static String[] Curency3 = new String[4];
    public CurencyLogHandler() {
        try {

            File inputFile = new File("LogHandlers/CurencyLog.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("Curency");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    int Number = Integer.parseInt(element.getElementsByTagName("Number").item(0).getTextContent());
                    int XP = Integer.parseInt(element.getElementsByTagName("XP").item(0).getTextContent());
                    int Gold = Integer.parseInt(element.getElementsByTagName("Gold").item(0).getTextContent());
                    int Ona = Integer.parseInt(element.getElementsByTagName("Ona").item(0).getTextContent());
                    int AchvimentPoints = Integer.parseInt(element.getElementsByTagName("AchvimentPoints").item(0).getTextContent());

                    if (Number == 1) {
                        Curency1[0] = String.valueOf(XP);
                        Curency1[1] = String.valueOf(Gold);
                        Curency1[2] = String.valueOf(Ona);
                        Curency1[3] = String.valueOf(AchvimentPoints);
                    } else if (Number == 2) {
                        Curency2[0] = String.valueOf(XP);
                        Curency2[1] = String.valueOf(Gold);
                        Curency2[2] = String.valueOf(Ona);
                        Curency2[3] = String.valueOf(AchvimentPoints);
                    } else if (Number == 3) {
                        Curency3[0] = String.valueOf(XP);
                        Curency3[1] = String.valueOf(Gold);
                        Curency3[2] = String.valueOf(Ona);
                        Curency3[3] = String.valueOf(AchvimentPoints);
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String[] getCurency1() {
        return Curency1;
    }

    public static String[] getCurency2() {
        return Curency2;
    }

    public static String[] getCurency3() {
        return Curency3;
    }
}

