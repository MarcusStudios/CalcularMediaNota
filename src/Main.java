import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double nota1;
        double nota2;
        double nota3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é a primeira nota?");
        nota1 = sc.nextDouble();

        System.out.println("Qual é a segunda nota?");
        nota2 = sc.nextDouble();

        System.out.println("Qual é a terceira nota?");
        nota3 = sc.nextDouble();

        sc.close();

        if (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota inválida!");
        } else if (nota2 < 0 || nota2 > 10) {
            System.out.println("Nota inválida!");
        }else if (nota3 < 0 || nota3 > 10) {
            System.out.println("Nota inválida!");
        }

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.printf("Aprovado, a sua média é: %.2f\n", media);
        }else{
            System.out.printf("Reprovado, a sua média é: %.2f\n", media);
        }

        System.out.println("Notas registradas com sucesso!...");


    }
}
