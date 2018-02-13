package sample;

import java.io.*;

public class UICompiler {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("data.xml")));
        int data;
        String word = "";
        char ch;
        while ((data = reader.read()) != -1){
            ch = (char)data;
            if (ch != ' '){
                word = word + ch ;
            }else {
                word = word + " ";
                System.out.println(word);

                word = "";
            }
            /*System.out.print((char)data);*/
        }
    }
}
