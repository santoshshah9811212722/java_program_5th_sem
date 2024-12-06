
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {

        try {
            System.out.println("enter the selection number: ");
            Scanner get = new Scanner(System.in);
            int num = get.nextInt();

            int input;

            File object = new File("santosh.txt");

            if (object.exists()) {
                BufferedReader bf = new BufferedReader(new FileReader("santosh.txt"));
                String line;
                int i = 0;
                String[] array = new String[26];
                while ((line = bf.readLine()) != null && i < array.length) {
                    array[i] = line;

                    i++;

                }
                bf.close();

                if (num < array.length) {
                    for (input = 0; input < num; input++) {
                        Random rand = new Random();
                        int index = rand.nextInt(array.length);
                        String name = array[index];
                        if (name.equals("santosh_shah")) {

                            continue;
                        } else {
                            System.out.println(name);

                        }

                    }
                } else {
                    System.out.println("invalid input");
                }

                get.close();

            } else {
                System.out.println("file not found");
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }

    }
}


