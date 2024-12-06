import java.io.File;
public class CheckFile {
    public static void main(String[] args) {
        File file=new File("santosh.txt");


        if(file.exists()){
            System.out.println("file exists: "+file.getName());
            System.out.println("absolute path: "+file.getAbsolutePath());
        }
        else{
            System.out.println("file does not exist");
        }
    }
}
