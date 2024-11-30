
// write a Program that accepts a grade (A,B,C,D, or F) using switch and prints a message based on the grade.
// example output:
// GRADE A:"Excellent!"
// GRADE B:"GOOD JOB!"
// GRADE C:"YOU PASSEED."
// GRADE D or F:"NEEDS IMPROVEMENT"

import java.util.Scanner;
import java.util.InputMismatchException;

public class grade {
    public static void main(String[] args){

        try(Scanner scanner = new Scanner(System.in)) {

        System.out.println("enter a grade ONLY FROM A TO E");
        String input=scanner.next().toUpperCase();

        if(input.length()!=1){
        throw new IllegalArgumentException("Input must be a single character.");
        }
        
        char val = input.charAt(0);
        switch (val) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("GOOD JOB!");
                break;

            case 'C':
                System.out.println("YOU PASSEED.");
                break;

            case 'D':
                System.out.println("NEEDS IMPROVEMENT");
                break;

            case 'E':
                System.out.println("NEEDS IMPROVEMENT");
                break;

            default:
                throw new IllegalArgumentException("Invalid input: Enter A, B, C, D, or E.");
                    
            }
        }


            catch (InputMismatchException e) {
                System.out.println("press correct character"+ e.getMessage());
                }

            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            catch (Exception e) {
                    System.out.println(e.getMessage());
                    }
            
            finally{
                    System.out.println("!!!!!!!!! Thank you !!!!!!");
                    }

            } 
}
