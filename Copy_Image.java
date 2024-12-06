import java.io.FileInputStream;
import java.io.FileOutputStream;
// import java.io.IOException;
public class Copy_Image {
    public static void main(String[] args) {
        try( FileInputStream in=new FileInputStream("/home/saroj/santosh.jpeg");
        FileOutputStream out= new
        FileOutputStream("copied_image.jpeg")) {
        int data;
        while ((data=in.read())!= -1) {
            out.write(data);
            
        }
        System.out.println("image copied successfully");
        } catch (Exception e) {
        e.printStackTrace();
        }

    }
}
