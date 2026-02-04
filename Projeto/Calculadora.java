import java.util.Scanner;
public class Calculadora {
    Scanner entrada = new Scanner(System.in);

    double num1, num2;
    double div;
    double porcen;
    double raizQuadrada;

    double somar() {
        System.out.print("\n1st value: ");
        num1 = entrada.nextDouble();

        System.out.print("2st Value: ");
        num2 = entrada.nextDouble();
        return num1 + num2;
    }

    double subtrair() {
        System.out.print("\n1st value: ");
        num1 = entrada.nextDouble();

        System.out.print("2st Value: ");
        num2 = entrada.nextDouble();
        return num1 - num2;
    }

    double multiplicar() {
        System.out.print("\n1st value: ");
        num1 = entrada.nextDouble();

        System.out.print("2st Value: ");
        num2 = entrada.nextDouble();
        return num1 * num2;
    }

    double divisao() {
        if (num2 % 2 == 0) {
            System.out.print("\n1st value: ");
            num1 = entrada.nextDouble();

            System.out.print("2st Value: ");
            num2 = entrada.nextDouble();
            return num1 / num2;
        } else {
            return 0;
        }
    }
}