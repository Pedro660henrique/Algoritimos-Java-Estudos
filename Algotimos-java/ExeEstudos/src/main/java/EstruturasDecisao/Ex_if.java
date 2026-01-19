package EstruturasDecisao;

import java.util.Scanner;

public class Ex_if {

    public static void ex1() {
        double n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero qualquer: ");
        n = sc.nextDouble();

        if (n < 0) {
            System.out.println("Numero negativo");
        } else if (n == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Numero Positivo");
        }
    }

    public static void ex2() {
        double nota;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");

        nota = sc.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void ex3() {
        int dia;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o dia da Semana(1 a 7): ");
        dia = sc.nextInt();
        //var message - para utilizar como menssagem assim diminui o codigo e também não precisa do break
        var message = switch (dia) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terca";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sabado";
            default -> "Opcao Invalida";
        };
        System.out.println(message);
    }

    public static void ex4() {
        Scanner sc = new Scanner(System.in);

        int valor;
        System.out.println("Digite um valor inteiro: ");

        valor = sc.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Valor par");
        } else {
            System.out.println("Valor impar");

        }
    }

    public static void ex5() {
        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.println("Digite a idade do motorista: ");
        idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("O condutor possui idade para dirigir.");
        } else {
            System.out.println("O condutor não possui idade para dirigir.");
        }
    }
}


