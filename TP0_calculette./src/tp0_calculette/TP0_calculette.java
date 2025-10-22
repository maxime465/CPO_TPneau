/*
 * TP0_calculette - 20 octobre
 */
package tp0_calculette;

import java.util.Scanner;

public class TP0_calculette {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in); // Création du scanner

        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        System.out.print("Your choice: ");

        int operateur = clavier.nextInt(); // lecture d’un entier

        System.out.print("Enter first number: ");
        int a = clavier.nextInt();

        System.out.print("Enter second number: ");
        int b = clavier.nextInt();

        int result = 0;

        switch (operateur) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                result = a / b;
                break;
            case 5:
                result = a % b;
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }

        System.out.println("Result = " + result);
    }
}

