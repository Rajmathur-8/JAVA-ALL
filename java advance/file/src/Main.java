import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("Secret.txt");
            int data = reader.read();
            while (data!=-1){
                System.out.print((char) data);
                data= reader.read();
            }reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }

          }
}