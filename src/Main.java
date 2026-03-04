import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
    funcoes menu = new funcoes();

    filme primeiroFilme = new filme("Avengers End Game","Anthony Russo e Joe Russo",2019,"Ação",03.01,"12", 30.00,false);

    ArrayList<filme> listaFilmes = new ArrayList<filme>();
    listaFilmes.add(primeiroFilme);



     System.out.println("Bem vindo(a) a locadora AmazingMovies!!!\n" +
             "Por favor, escolha o serviço desejado \n(1-Adicionar 2-Visualizar 3-Editar 4-Deletar 5-Sair)");
        while (true){
        System.out.print("Oque deseja fazer?:");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:

                    menu.adicionar(listaFilmes);
                    menu.visualizar(listaFilmes);

                case 2:

                    menu.visualizar(listaFilmes);
                    break;
                case 4:

                    menu.deletar(listaFilmes);
                    break;
            }

            }
    }
}