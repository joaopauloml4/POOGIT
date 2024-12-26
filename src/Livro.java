
public class Livro {
    protected String Título;
    protected String Autor;
    protected int Quantidade;    
    protected int código;
    protected boolean emprestar;
    protected boolean Devolver;
    private String livro;

    void Emprestar(){
        this.emprestar = true;
        System.out.println("livro emprestado. Agora têm:");
        System.out.print(-1 + this.Quantidade);
        System.out.println(" livross disponíveis.");
        System.out.println("");
}
    void Devolver(){
        this.Devolver = true;
        System.out.println("livro devolvido. Agora têm:");
        System.out.print(1 + this.Quantidade);
        System.out.println(" livros disponíveis.");
        System.out.println("");
    }
    void status(){
        System.out.println("o titulo do livro é: " + this.Título + " do autor: " + this.Autor);
        System.out.println("Tem " + this.Quantidade + " livros disponíveis.");
        System.out.println("Seu codigo: " + this.código);
    }
    public void Setlivro(String seulivro){
        livro = seulivro;
    }
    public String getlivro() {
        return livro;
    }
    public void mostralivro() {
        System.out.printf("Você quer o livro %s\n", getlivro());
    }
}