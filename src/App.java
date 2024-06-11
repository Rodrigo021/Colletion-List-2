public class App {
    public static void main(String[] args) throws Exception {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("livro1", "autor 1", 2020);
        catalogoLivros.adicionarLivro("livro1", "autor 2", 2021);
        catalogoLivros.adicionarLivro("livro2", "autor 2", 2022);
        catalogoLivros.adicionarLivro("livro3", "autor 3", 2023);
        catalogoLivros.adicionarLivro("livro4", "autor 4", 1994);

        //System.out.println(catalogoLivros.pesquisaAutor("autor 4"));
        System.out.println(catalogoLivros.pesquisaTitulo("livro1"));
    }
}
