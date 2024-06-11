public interface Operacoes {
    void adicionarLivro(Livro livro);
    void emprestarLivro(Usuario usuario, Livro livro)throws Exception;
    void devolverLivro(Usuario usuario, Livro livro)throws Exception;
    void excluirLivro(Livro livro);
    void pesquisarLivro(String criterio);
    void verificarSituacaoUsuario(Usuario usuario);    
}
