import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("IDADE: ");
            String age = scanner.nextLine();

            VerifyInput verify = new VerifyInput();
            if (verify.ageLogic(age) == false) {
                return;
            }

            System.out.println("SENHA: ");
            String password = scanner.nextLine();

            if (verify.passwordLogic(password)) {
                System.out.println("Bem-vindo ao sistema!");
            }
        }
    }
}

class VerifyInput {
    public boolean ageLogic(String ageInput) {
        try {
            int age = Integer.parseInt(ageInput);

            if (age < 18) {
                System.out.println("Aesso NEGADO, necessário ser maior de 18 ANOS!");
                return false;
            }

            return true;

        } catch (NumberFormatException e) {
            System.out.println("Precisa ser um número inteiro válido!");
            return false;
        }
    }

    public boolean passwordLogic(String pass) {
        if (!"java2026".equals(pass)) {
            System.out.println("Usuário ou senha INCORRETA!");
            return false;
        }
        return true;
    }
}
