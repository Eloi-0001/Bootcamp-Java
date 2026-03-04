import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
     System.out.println("Bem vindo(a) a locadora AmazingMovies!!!\n" +
             "Por favor, escolha o serviço desejado (1-Adicionar 2-Visualizar 3-Editar 4-Deletar)");

        System.out.print("Oque deseja fazer?:");
            int escolha = scanner.nextInt();

            System.out.println(escolha);
    }
}