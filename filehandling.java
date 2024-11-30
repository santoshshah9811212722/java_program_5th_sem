

import java.io.File;
public class filehandling {
    public static void main(String[] args) {
        File f=new File("//home//saroj//college content//java program class//santosh.txt");
        if(f.exists()){
            System.out.println("filename: "+f.getName());
            System.out.println("filepath: "+f.getAbsolutePath());
            System.out.println("filesize: "+f.length());
            System.out.println("filereadable: "+f.canRead());
            System.out.println("file_writeable: "+f.canWrite());
            System.out.println("file removed: "+f.delete());
        }
        else{
            System.out.println("file doesn't exists");
        }
    }
}
