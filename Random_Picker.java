
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Random_Picker {
    public static void main(String[] args){
        String[] list={"Amar Chaudhary","Chahana Gautam","Sunil Karki","Bhanu Aryal","Mison Chalise","Nanda Kishor mandal","Pradip Karki","Bikram Kumal","Anuj Kumar Karn","Amrit Poudel","Anjana Khatiwoda","Subir Chauhan","Nabin kandel","Sachin Bhattrai","Subani Budhathoki","Nirmaya Tamang","Ujwal Dhakal","Rahul kc","Binam Pathak","Prabin Joshi","Satish Chaudhary","Sijan Pokhrel","Rachita Thakuri","Sujana Shakya","Manju Neupane"};
        try {
            Scanner input=new Scanner(System.in);
            System.out.println("enter the selection number: ");
            int num=input.nextInt();

        if (num<=30){
            for(int i=1;i<=num;i++){
                Random rand=new Random();

                int index=rand.nextInt(list.length);
                String name=list[index];
                System.out.println("you most welcome guys: "+ name);
            }
        }

        else{
            System.out.println("only 30 students are in your class so please enter below 30");
        }
    
        input.close();

    }
    catch (InputMismatchException e) {
            System.out.println(" invalid input try only numbers!!! ");
            System.out.println(" Number only supported!!! ");
        }

    }
}


