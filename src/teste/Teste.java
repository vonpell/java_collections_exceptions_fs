package teste;

import classes.*;

import java.util.ArrayList;
import java.util.TreeSet;

public class Teste {
    public static void main(String[] args) {

        ArquivoObjetos<Membro> arquivoObjetos = new ArquivoObjetos<>();

        Biblioteca DaMeiaNoite = new Biblioteca(new ArrayList<>(), new TreeSet<>());
        Livro DefeitoDeCor = new Livro("Defeito de Cor", "Ana Maria Gonçalves", "9788501011756");
        Livro LivroNaoExiste = new Livro();
        Membro Silvia = new Membro("Silvia", "1000", SituacaoEnum.CANCELADO);
        Membro MembroNaoExiste = new Membro();

        DaMeiaNoite.cadastrarLivro(new Livro("Continente", "Érico Veríssimo", "9788525000705"));
        DaMeiaNoite.cadastrarLivro(new Livro("O Olho do Mundo", "Robert Jordan", "9788580573626"));
        DaMeiaNoite.cadastrarLivro(DefeitoDeCor);
        DaMeiaNoite.cadastrarMembro(Silvia);
        DaMeiaNoite.cadastrarMembro(new Membro("Afonso", "1001", SituacaoEnum.MATRICULADO));
        DaMeiaNoite.cadastrarMembro(new Membro("Adao", "1002", SituacaoEnum.CANCELADO));
        DaMeiaNoite.cadastrarMembro(new Membro("Ivo", "1003", SituacaoEnum.CANCELADO));
        DaMeiaNoite.cadastrarMembro(new Membro("Simone", "1004", SituacaoEnum.MATRICULADO));
        DaMeiaNoite.cadastrarMembro(new Membro("Simaria", "1005", SituacaoEnum.MATRICULADO));

        System.out.println(DaMeiaNoite.listarTodosLivros());
        System.out.println(DaMeiaNoite.listarTodosMembros());
        System.out.println(DaMeiaNoite.pesquisarLivro(DefeitoDeCor));
        System.out.println(DaMeiaNoite.pesquisarLivro(LivroNaoExiste));
        System.out.println(DaMeiaNoite.pesquisarMembro(Silvia));
        System.out.println(DaMeiaNoite.pesquisarMembro(MembroNaoExiste));

        arquivoObjetos.gravaMembros(DaMeiaNoite.getListaMembros(), "Lista de Membros.txt");
        arquivoObjetos.gravarLivro(DaMeiaNoite.getListaLivros(), "Lista de Livros.txt");
        arquivoObjetos.lerArquivo("Lista de Membros.txt");
        arquivoObjetos.lerArquivo("Lista de Livros.txt");

    }
}
