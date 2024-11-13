package start;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        int quantidadeDeNomes;
        ArrayList<Candidato> listaDeNomes = new ArrayList<>();

        System.out.println("Informe a quantidade de nomes na lista");
        quantidadeDeNomes = scan.nextInt();
        while (contador <= quantidadeDeNomes) {
            System.out.print("insira o nome na lista: ");
            String nome = scan.nextLine();
            Candidato pessoa = new Candidato(nome);
            listaDeNomes.add(pessoa);
            contador++;
        }

      /*  System.out.println("Agora imprimindo a lista...");
        for (Candidato nome: listaDeNomes){
            System.out.println(nome.toString());
        }*/
    }
}
