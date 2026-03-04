import java.util.ArrayList;
import java.util.Scanner;


public class funcoes {
    static Scanner scanner = new Scanner(System.in);

    public void adicionar (ArrayList filme) {

        System.out.println("Qual o título do filme que deseja adicionar?");
        String titulo = scanner.nextLine();

        System.out.println("Qual o diretor(es) desse filme?");
        String diretor = scanner.nextLine();

        System.out.println("Em que ano o filme foi publicado?");
        int anoPublicacao = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual o gênero do filme?");
        String genero = scanner.nextLine();

        System.out.println("Quanto tempo o filme dura (Ex: Horas,Minutos)?");
        float duracao = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Qual a faixa etária do filme?");
        String classificacao = scanner.nextLine();

        System.out.println("Qual o preço do filme?");
        float preco = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("O filme está em cartaz? (true/false)");
        boolean emCartaz = scanner.nextBoolean();

        filme novoFilme = new filme(titulo,diretor,anoPublicacao,genero, duracao, classificacao,preco,emCartaz);
        filme.add(novoFilme);

    }
    public void visualizar(ArrayList<filme> listafilme) {
        for (filme filme: listafilme) {
            System.out.println(filme.getTodos());
        }
    }
}
