
/*Программа читает из файла поток и возвращает byte символа*/
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        File f = new File("c:/Temp/te.dat");
        FileInputStream in = new FileInputStream(f);
        //InputStream in = System.in;            //if we try enter from keyboard
        int ch;
        try {
            while((ch = in.read()) != -1){
                System.out.println(ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}