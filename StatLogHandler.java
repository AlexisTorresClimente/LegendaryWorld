import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class StatLogHandler {
    private static String[] stats1 = new String[8];
    private static String[] stats2 = new String[8];
    private static String[] stats3 = new String[8];
    public StatLogHandler() {



        try {
            File inputFile = new File("/home/estudiante/Unidad8/src/main/java/StatLog.xml");

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("Stat");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
                String[] stats = {
                        element.getElementsByTagName("STR").item(0).getTextContent(),
                        element.getElementsByTagName("DEX").item(0).getTextContent(),
                        element.getElementsByTagName("INT").item(0).getTextContent(),
                        element.getElementsByTagName("WIS").item(0).getTextContent(),
                        element.getElementsByTagName("END").item(0).getTextContent(),
                        element.getElementsByTagName("MYS").item(0).getTextContent(),
                        element.getElementsByTagName("CHARM").item(0).getTextContent(),
                        element.getElementsByTagName("LUCK").item(0).getTextContent()
                };

                switch (element.getElementsByTagName("NUM").item(0).getTextContent()) {
                    case "1":
                        stats1 = stats;
                        break;
                    case "2":
                        stats2 = stats;
                        break;
                    case "3":
                        stats3 = stats;
                        break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String[] getStats1() {
        return stats1;
    }

    public static String[] getStats2() {
        return stats2;
    }

    public static String[] getStats3() {
        return stats3;
    }
}