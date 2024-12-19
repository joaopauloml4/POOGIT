
public class Livro {
    protected String Título;
    protected String Autor;
    protected int Quantidade;    
    protected int código;
    protected boolean emprestar;
    protected boolean Devolver;
    private String livro;

    public void Setlivro(String seulivro){
        livro = seulivro;
    }
    public String getlivro() {
        return livro;
    }
    public void mostralivro() {
        System.out.printf("Você quer o livro %s\n.", getlivro());
    }

    void Emprestar(){
        this.emprestar = true;
        System.out.println("l emprestado. Agora têm:");
        System.out.print(-1 + this.Quantidade);
        System.out.println(" ls disponíveis.");
        System.out.println("");
}
    void Devolver(){
        this.Devolver = true;
        System.out.println("l devolvido. Agora têm:");
        System.out.print(1 + this.Quantidade);
        System.out.println(" ls disponíveis.");
        System.out.println("");
    }
    void status(){
        System.out.println("o título do l é: " + this.Título + " do autor: " + this.Autor);
        System.out.print("Tem " + this.Quantidade + " ls disponíveis.");
        System.out.println("Seu código é: " + this.código);
    }
}