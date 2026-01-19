import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        List<String> nomeMotoboy = new ArrayList<>();
        List<List<Double>> listaEntrega = new ArrayList<>();

        String continuarMotoboy;

        do {
            System.out.print("Nome do Motoboy: ");
            String nome = sc.nextLine();
            nomeMotoboy.add(nome);

            List<Double> entregaMotoboy = new ArrayList<>();

            String continuarEntrega;
            do {
                System.out.print("Valor da entrega: R$ ");
                double valor = sc.nextDouble();
                entregaMotoboy.add(valor);

                System.out.print("Deseja adicionar outra entrega para o motoboy? (s/n): ");
                continuarEntrega = sc.next();
            }
            while (continuarEntrega.equalsIgnoreCase("s"));
            listaEntrega.add(entregaMotoboy);
            System.out.print("\nDeseja cadastrar outro motoboy? (s/n): ");
            continuarMotoboy = sc.next();

        } while (continuarMotoboy.equalsIgnoreCase("s")) ;

            System.out.println("\n====Resumo====");
            for (int i = 0; i < nomeMotoboy.size(); i++) {
                System.out.println("\nMotoboy: " + nomeMotoboy.get(i));
                System.out.println("Entregas registradas: " + listaEntrega.get(i));

                double total = 0;
                for (double v : listaEntrega.get(i)) {
                    total += v;
                }
                System.out.println("Total recebido: R$ " + total);
            }
            sc.close();

        }
    }