/*Challeng 2
 average stundent
 average == 7 approved
 avarage between 5 to 6,9 recovery
 avarage < 5 reproved 
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nota da P1: ");
            float p1 = scanner.nextFloat();

            System.out.println("Nota da P2: ");
            float p2 = scanner.nextFloat();

            if (p1 < 0 || p1 > 10 || p2 < 0 || p2 > 10) {
                throw new IllegalArgumentException("A média deve ser entre 0 e 10!");
            }

            Avarage studentAvarage = new Avarage();
            float avarageResult = studentAvarage.avarageCalc(p1, p2);

            Result studentResult = new Result();
            String finalStudentResult = studentResult.finalResult(avarageResult);

            System.out.println("Nota: " + avarageResult + " " + finalStudentResult);
        }
    }
}

class Avarage {
    public float avarageCalc(float p1, float p2) {
        return (p1 + p2) / 2;
    }
} 

class Result {
    public String finalResult(float avarageStudent) {
       if(avarageStudent >= 7) { 
            return "Parabéns, você foi APROVADO!";
        } else if(avarageStudent >= 5) {
            return "Você está de RECUPERAÇÃO!";
        } else {
            return "você foi REPROVADO! :(";
        }
    }
}
