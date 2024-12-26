import java.util.Scanner;


public class App {
        public static void main(String[] args){
                String livro;
                Livro usuario = new Livro();
                Scanner texto = new Scanner(System.in);
        
                    System.out.println("temos os livros: Mengao do meu coraçao: O Inesquecivel Bicampeonato da Libertadores - 2019.");
                    System.out.println("Ainda estou aqui.");
                    System.out.println("Dracula.");
                    System.out.println("Qual livro deseja pegar de nossa biblioteca?");
                    livro = texto.nextLine();
        
                    usuario.Setlivro(livro);
                    
                
            Livro c1 = new Livro();
        
            c1.Quantidade = 20;
            c1.Título = "Mengao do meu coraçao: O Inesquecivel Bicampeonato da Libertadores - 2019.";
            c1.Autor = "Marcia Ghelman";
            c1.código = 657463;
            c1.status();
            c1.Devolver();
    
            Livro c2 = new Livro();
    
            c2.Quantidade = 12;
            c2.Título = "Ainda estou aqui.";
            c2.Autor = "Marcelo Rubens Paiva.";
            c2.código = 657462;
            c2.status();
            c2.Emprestar();

            Livro c3 = new Livro();
    
            c3.Quantidade = 8;
            c3.Título = "Dracula.";
            c3.Autor = "Bram Stoker.";
            c3.código = 657461;
            c3.status();
            c3.Emprestar();

            usuario.mostralivro();
    }
    }
