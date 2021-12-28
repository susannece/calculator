package se.lexicon.susanne;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        boolean fortsatt = true;

        while(fortsatt)
        {
            System.out.println("Första numret: ");
            double firstNumber = input.nextFloat();

            System.out.println("Tecken (+ - * /) : ");
            char operator = input.next().charAt(0);

            System.out.println("Andra numret: ");
            double secondNumber = input.nextFloat();

            boolean omigen = true;

            switch (operator)
            {
                case '+':
                    System.out.println("Resultat: " + (firstNumber + secondNumber));
                    break;

                case '-':
                    System.out.println("Resultat: " + (firstNumber - secondNumber));
                    break;

                case '*':
                    System.out.println("Resultat: " + (firstNumber * secondNumber));
                    break;

                case '/':
                    System.out.println("Resultat: " + (firstNumber / secondNumber));
                    break;

                default:
                    System.out.println("Ogiltigt tecken. ");
                    break;
            }
            System.out.println("Vill du göra en ny uträkning? Y / N  ");
            char answer = input.next().charAt(0);

            while (omigen) {
                switch (answer) {
                    case 'N':
                        omigen = false;
                        fortsatt = false;
                        break;
                    case 'Y':
                        omigen = false;
                        break;
                    default:
                        System.out.println("Ogiltigt svar! Vill du göra en ny uträkning? Y / N ");
                        answer = input.next().charAt(0);
                        break;
                }
            }
        }
    }
}