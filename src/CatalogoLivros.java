import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros(){
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        livros.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisaAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosAutor.add(l);
                }
            }
        }
        else{
            System.out.println("O catálogo está vazio");
        }
        return livrosAutor;
    }

    public List<Livro> pesquisaAno(int anoInicial, int anoFinal){
        List<Livro> livrosAno = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getAno()>=anoInicial && l.getAno()<=anoFinal) {
                    livrosAno.add(l);
                }
            }
        }
        else{
            System.out.println("O catálogo está vazio");
        }
        return livrosAno;
    }

    public Livro pesquisaTitulo(String titulo){
        Livro livrosTitulo = null;
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosTitulo = l;
                    break;
                }
            }
        }
        else{
            System.out.println("O catálogo está vazio");
        }
        return livrosTitulo;
    }

}
