package EstruturasRepeticao;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ex_For_While {
    public static void Ex1(){
        System.out.println("Lista de numeros de 1 a 100:");
        for(int  i = 1; i <= 100; i++){
            System.out.println(i);
        }
    }

    public static void Ex2(){
        int soma = 0;
        int i = 1;
        while(i <= 50){
            soma = soma + i;
            i++;
            System.out.println(soma);
        }
    }

    public static void Ex3(){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double soma = 0;
        int x;
        do{
            System.out.println("Digite a fila de numeros que você quer somar: ");
            x = sc.nextInt();
            soma = soma + x;
        }while(x != 0);
            System.out.println(soma);
    }
}


