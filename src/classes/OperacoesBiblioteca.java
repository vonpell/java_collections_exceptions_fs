package classes;

public interface OperacoesBiblioteca<T1, T2> {

	public void cadastrarMembro(T1 t);

	public void cadastrarLivro(T2 t);

	public String listarTodosMembros();

	public String listarTodosLivros();

	public boolean pesquisarMembro(Membro membro);

	public boolean pesquisarLivro(Livro livro);

}
