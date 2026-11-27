import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio04 {

    static String userIn;
    static ArrayList<Integer> numbers = new ArrayList<Integer>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ValidationInput validationInput = new ValidationInput();

        do {
            System.out.println("Digite 'STOP' para encerrar o programa \nDigite um Número para adicionar: ");
            userIn = scanner.nextLine().trim();

            validationInput.validation(userIn);

            System.out.println(numbers);
        } while (!"STOP".equalsIgnoreCase(userIn));

        scanner.close();

    }

    static class ValidationInput {
        public String validation(String validation) {
            String userIn = Exercicio04.userIn;

            try {
                if (!"STOP".equalsIgnoreCase(userIn)) {
                    numbers.add(Integer.parseInt(userIn));
                }
            } catch (NumberFormatException e) {
                System.out.println(
                        "Entrada inválida. Digite um número inteiro ou STOP para ENCERRAR.(Pressione ENTER para reiniciar)");
                scanner.nextLine();
            }
            return validation;
        }
    }

}
