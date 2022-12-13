import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        try{
            FileOutputStream fileOutputStream=new FileOutputStream("text.txt",true)  ;
            String melumat="Hello world ";
            byte[] byteMelumat=melumat.getBytes();
            fileOutputStream.write(byteMelumat);
        }catch (Exception ex){
            ex.printStackTrace();
        }

        try{
            FileInputStream fileInputStream=new FileInputStream("text.txt");

           int melumatlaroxu=0;
           while ((melumatlaroxu=fileInputStream.read())!=-1){
               System.out.print((char) melumatlaroxu);
           }

        }catch (Exception ex){
            ex.printStackTrace();
        }


    }
}