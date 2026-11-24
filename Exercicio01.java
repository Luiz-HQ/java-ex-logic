/* Challenge 1
1° Input number
2° Check if it's positive, negative or zero
3° Check if it´s even or odd */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        int userNumber = scanner.nextInt();

        VerifyNumber verify = new VerifyNumber();
        String resultNumber = verify.verifyUserNumber(userNumber);
        String resultEvenOrOdd = verify.evenOrOdd(userNumber);
        
        System.out.println(resultNumber + resultEvenOrOdd + userNumber);

        scanner.close();
    }
}

class VerifyNumber {
        public String evenOrOdd(int number) {
            if(number % 2 == 0) {
                return " Par: ";
            } else {
                return " Impar: ";
            }
        }

        public String verifyUserNumber(int number) {
            if(number > 0) {
            return "Numero positivo";
        } else if(number == 0) {
            return "Numero zero";
        } else {
            return "Numero Negativo";
        }
        }        
    }
