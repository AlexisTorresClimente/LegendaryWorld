import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class CharacterLogsParser extends DefaultHandler {

    private boolean bSlot = false;
    private boolean bName = false;
    private boolean bClass = false;
    private boolean bRank = false;

    private String Slot;
    private String Name;
    private String Class;
    private String Rank;
    private int i = 0;

    private static String[] Logs = new String[12];

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if (qName.equalsIgnoreCase("Character")) {
        } else if (qName.equalsIgnoreCase("Slot")) {
            bSlot = true;
        } else if (qName.equalsIgnoreCase("Name")) {
            bName = true;
        } else if (qName.equalsIgnoreCase("Class")) {
            bClass = true;
        } else if (qName.equalsIgnoreCase("Rank")) {
            bRank = true;
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
    }

    public void characters(char ch[], int start, int length) throws SAXException {
        if (bSlot) {
            Slot = new String(ch, start, length);
            bSlot = false;
            Logs[i] = Slot;
            i++;
        } else if (bName) {
            Name = new String(ch, start, length);
            bName = false;
            Logs[i] = Name;
            i++;
        } else if (bClass) {
            Class = new String(ch, start, length);
            bClass = false;
            Logs[i] = Class;
            i++;
        } else if (bRank) {
            Rank = new String(ch, start, length);
            bRank = false;
            Logs[i] = Rank;
            i++;
        }
    }

    public CharacterLogsParser() {
        try {
            File inputFile = new File("src/SaveData.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse(inputFile, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String[] getLogs() {
        return Logs;
    }
}
