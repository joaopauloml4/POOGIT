import java.util.Scanner;


public class App {
        public static void main(String[] args){
                int livro12;
                String livro;
                Livro usuario = new Livro();
                Scanner texto = new Scanner(System.in);
        
                Livro c1 = new Livro();

                    c1.Quantidade = 20;
                    c1.Título = "Mengao do meu coraçao: O Inesquecivel Bicampeonato da Libertadores - 2019.";
                    c1.Autor = "Marcia Ghelman";
                    c1.código = 657463;
                    
                    Livro c2 = new Livro();
            
                    c2.Quantidade = 12;
                    c2.Título = "Ainda estou aqui.";
                    c2.Autor = "Marcelo Rubens Paiva.";
                    c2.código = 657462;
                    
                    Livro c3 = new Livro();
            
                    c3.Quantidade = 8;
                    c3.Título = "Dracula.";
                    c3.Autor = "Bram Stoker.";
                    c3.código = 657461;

                    System.out.println("Temos os livros:");
                    System.out.println("1 - Mengao do meu coraçao: O Inesquecivel Bicampeonato da Libertadores - 2019.");
                    System.out.println("2 - Ainda estou aqui.");
                    System.out.println("3 - Dracula.");
                    System.out.println("Qual livro deseja pegar de nossa biblioteca?");
             
                    
                    
                    livro12 = texto.nextInt();
                    switch (livro12) {
                        case 1:
                        usuario.Setlivro(livro="Mengao do meu coraçao: O Inesquecivel Bicampeonato da Libertadores - 2019.");
                        usuario.Setlivro(livro);
                        c1.status();
                        c1.Devolver();
                        break;
                      case 2:
                        usuario.Setlivro(livro="Ainda estou aqui.");
                        usuario.Setlivro(livro);
                        c2.status();
                        c2.Emprestar();
                        break;
                      case 3:
                        usuario.Setlivro(livro="Dracula.");
                        usuario.Setlivro(livro);
                        c3.status();
                        c3.Emprestar();
                        break;
                    }

            usuario.mostralivro();
    }
    }
