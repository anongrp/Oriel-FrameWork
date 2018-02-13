import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("vcs.xml")));
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("OutPut.html"),true));

        String data;
        int fi=0,li=0;
        while ((data = reader.readLine()) != null){
            while (fi != -1){
                fi = data.indexOf(' ',li)+1;
                li = data.indexOf(' ',fi);
                String var = data.substring(fi,li);
                System.out.println(getKey(var)+" : "+getData(var));
            }
        }
    }
    private static String getKey(String data){
        return data.substring(0,data.indexOf("=")).trim();
    }
    private static String getData(String data){
        return data.substring(data.indexOf("=")+2,data.length()-1);
    }
}
