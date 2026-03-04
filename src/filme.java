public class filme {
    String titulo;
    String genero;
    String classificacao;
    String diretor;
    double duracao;
    double preco;
    int anoPublicacao;
    boolean emCartaz;

    public filme(String titulo, String diretor, int anoPublicacao,
                 String genero, double duracao, String classificacao,
                 double preco, boolean emCartaz)
    {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.duracao = duracao;
        this.classificacao = classificacao;
        this.preco = preco;
        this.emCartaz = emCartaz;
    }
}
