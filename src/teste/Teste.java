package teste;

import classes.*;

import java.util.ArrayList;
import java.util.TreeSet;

public class Teste {
    public static void main(String[] args) {

        ArquivoObjetos<Membro> arquivoObjetos = new ArquivoObjetos<>();
        Biblioteca DaMeiaNoite = new Biblioteca(new ArrayList<>(), new TreeSet<>());

        Livro DefeitoDeCor = new Livro("Defeito de Cor", "Ana Maria Goncalves", "9788501011756");
        Livro LivroNaoExiste = new Livro();
        LivroNaoExiste.setAutor("Fulano de Tal");

        Membro Silvia = new Membro("Silvia", "1000", SituacaoEnum.CANCELADO);
        Membro MembroNaoExiste = new Membro();
        Membro FulanoDeTal = new Membro();
        FulanoDeTal.setNome("Fulano de Tal");
        FulanoDeTal.setMatricula("-");
        FulanoDeTal.setSituacao(SituacaoEnum.CANCELADO);

        DaMeiaNoite.cadastrarLivro(new Livro("Continente", "Erico Verissimo", "9788525000705"));
        DaMeiaNoite.cadastrarLivro(new Livro("O Olho do Mundo", "Robert Jordan", "9788580573626"));
        DaMeiaNoite.cadastrarLivro(DefeitoDeCor);
        DaMeiaNoite.cadastrarLivro(LivroNaoExiste);
        // Coloquei uma condicional na biblioteca pra não adicionar nem livros nem membros que não estejam com cadastro completo
        DaMeiaNoite.cadastrarMembro(Silvia);
        DaMeiaNoite.cadastrarMembro(new Membro("Afonso", "1001", SituacaoEnum.MATRICULADO));
        DaMeiaNoite.cadastrarMembro(new Membro("Adao", "1002", SituacaoEnum.CANCELADO));
        DaMeiaNoite.cadastrarMembro(new Membro("Ivo", "1003", SituacaoEnum.CANCELADO));
        DaMeiaNoite.cadastrarMembro(new Membro("Simone", "1004", SituacaoEnum.MATRICULADO));
        DaMeiaNoite.cadastrarMembro(new Membro("Simaria", "1005", SituacaoEnum.MATRICULADO));
        DaMeiaNoite.cadastrarMembro(MembroNaoExiste);
        System.out.println();

        System.out.println(DaMeiaNoite.listarTodosLivros());
        System.out.println(DaMeiaNoite.listarTodosMembros());
        System.out.println("Livro Defeito de Cor esta cadastrado na biblioteca? " + (DaMeiaNoite.pesquisarLivro(DefeitoDeCor) ? "Sim" : "Nao"));
        System.out.println("Livro Nao Existe esta cadastrado na biblioteca? " + (DaMeiaNoite.pesquisarLivro(LivroNaoExiste) ? "Sim" : "Nao"));
        System.out.println("Membro Silvia esta cadastrado na biblioteca? " + (DaMeiaNoite.pesquisarMembro(Silvia) ? "Sim" : "Nao"));
        System.out.println("Membro Nao Existe esta cadastrado na biblioteca? " + (DaMeiaNoite.pesquisarMembro(MembroNaoExiste) ? "Sim" : "Nao"));
        System.out.println("Membro Fulano de Tal esta cadastrado na biblioteca? " + (DaMeiaNoite.pesquisarMembro(FulanoDeTal) ? "Sim" : "Nao"));
        // O membro Fulano de Tal tem todos os dados do cadastro, mas não adicionei ele à biblioteca, logo ele não existe na lista
        System.out.println();

        arquivoObjetos.gravaMembros(DaMeiaNoite.getListaMembros(), "Lista de Membros.txt");
        arquivoObjetos.gravaLivros(DaMeiaNoite.getListaLivros(), "Lista de Livros.txt");
        arquivoObjetos.leArquivo("Lista de Membros.txt");
        System.out.println();
        arquivoObjetos.leArquivo("Lista de Livros.txt");

    }
}
