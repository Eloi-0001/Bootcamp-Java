import java.util.Scanner;

void main() {
Scanner scanner = new Scanner(System.in);

    System.out.print("1-Adicionar \n2-Visualizar \n3-deletar \n:");
    int escolha = scanner.nextInt();
    scanner.nextLine();

switch (escolha) {
    case 1:
            System.out.print("Qual o seu nome?");
            String nome = scanner.nextLine();
            System.out.print("Qual sua idade?");
            int idade = scanner.nextInt();

            System.out.println("Olá "+nome+ " de "+idade+" anos!!" );
        break;

    case 2:
            System.out.print("");
}

}
