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
    public String getTitulo() {
        return this.titulo;
    }

    public String getDiretor() {
        return this.diretor;
    }

    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }

    public String getGenero() {
        return this.genero;
    }

    public double getDuracao() {
        return this.duracao;
    }

    public String getClassificacao() {
        return this.classificacao;
    }

    public double getPreco() {
        return this.preco;
    }

    public boolean isEmCartaz() {
        return this.emCartaz;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEmCartaz(boolean emCartaz) {
        this.emCartaz = emCartaz;
    }

    public String getTodos() {
        return "\n\n\nTítulo: " + this.titulo +
                "\nDiretor: " + this.diretor +
                "\nAno de Publicação: " + this.anoPublicacao +
                "\nGênero: " + this.genero +
                "\nDuração: " + this.duracao + " minutos" +
                "\nClassificação: " + this.classificacao +
                "\nPreço: R$" + String.format("%.2f", this.preco) +
                "\nEm Cartaz: " + (this.emCartaz ? "Sim" : "Não");
    }
}

