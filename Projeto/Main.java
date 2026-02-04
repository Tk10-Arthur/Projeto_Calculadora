import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        Scanner entrada = new Scanner(System.in);
        String escolha;

        do {
            System.out.println("\n\n========== WELCOME TO THE CALCULATOR! ==========\n");

            System.out.println("===== OPTIONS =====");
            System.out.println("- Sum");
            System.out.println("- Sub");
            System.out.println("- Mult");
            System.out.println("- Div");
            System.out.println("- Exit");

            System.out.print("Choose an option: ");
            escolha = entrada.next().strip().toLowerCase();
            
            switch (escolha) {
                case "sum":
                    System.out.print("\nResult: " + cal.somar());
                    break;
                case "sub":
                    System.out.print("\nResult: " + cal.subtrair());
                    break;
                case "mult":
                    System.out.print("\nResult: " + cal.multiplicar());
                    break;
                case "div":
                    System.out.print("\nResult: " + cal.divisao());
                    break;
                case "exit":
                    System.out.println("\nEncerrando o programa...");
                    break;
                default:
                    System.out.println("Erro: Opção inválida!");
                    break;
            }
        } while(!escolha.equalsIgnoreCase("Exit"));
    }
}