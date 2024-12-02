
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Random_Picker {
    public static void main(String[] args){
        String[] list={"santosh shah","rahul","binam","bikram","prabin","satish","sijan","rachita","sujana","manju"};
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


