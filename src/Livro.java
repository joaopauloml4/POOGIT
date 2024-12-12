public class Livro {
    protected String Título;
    protected String Autor;
    protected int Quantidade;    
    protected int código;
    protected boolean emprestar;
    protected boolean Devolver;

    void Emprestar(){
        this.emprestar = true;
        System.out.println("livro emprestado. Agora têm:");
        System.out.print(-1 + this.Quantidade);
        System.out.println(" livros disponíveis.");
        System.out.println("");
    }

    void Devolver(){
        this.Devolver = true;
        System.out.println("Livro devolvido. Agora têm:");
        System.out.print(1 + this.Quantidade);
        System.out.println(" livros disponíveis.");
        System.out.println("");
    }

    void status(){
        System.out.println("o título do livro é: " + this.Título + " do autor: " + this.Autor);
        System.out.print("Tem " + this.Quantidade + " livros disponíveis.");
        System.out.println("Seu código é: " + this.código);
    }
}