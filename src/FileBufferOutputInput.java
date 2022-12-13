import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileBufferOutputInput {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter=new FileWriter("file.txt",true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("Salam dunya");
            bufferedWriter.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }

        try{
            FileReader fileReader=new FileReader("file.txt")  ;
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
