package UIEngine;

import java.io.*;

public class UIParser {
    File xmlFile;
    File htmlFile;
    BufferedWriter htmlWriter;
    BufferedReader xmlReader;
    Integer counterForLine=0;
    String htmlFormat="<!doctype html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <meta name=\"viewport\"\n" +
            "          content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n" +
            "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
            "    <title>Oriel</title>\n" +
            "    <style>\n" +
            "    </style>\n" +
            "</head>\n" +
            "<body>\n" +
            "</body>\n" +
            "</html>";
    public UIParser(File xmlFile) throws IOException {
        this.xmlFile=xmlFile;
        htmlFile=new File("..//Test.html");
        htmlWriter=new BufferedWriter(new FileWriter(htmlFile));
        xmlParser();
    }

    private void xmlParser() throws IOException {
        htmlWriter.write(htmlFormat);
        htmlWriter.close();
        xmlReader=new BufferedReader(new FileReader(xmlFile));
        while (xmlReader.readLine()!=null){
            counterForLine++;
        }
    }

}
