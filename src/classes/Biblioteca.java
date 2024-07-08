package classes;

import java.util.ArrayList;
import java.util.TreeSet;

public class Biblioteca implements OperacoesBiblioteca<Membro, Livro> {
    private ArrayList<Livro> listaLivros = new ArrayList<>();
    private TreeSet<Membro> listaMembros = new TreeSet<>();

    public Biblioteca() {
    }

    public Biblioteca(ArrayList<Livro> listaLivros, TreeSet<Membro> listaMembros) {
        this.listaLivros = listaLivros;
        this.listaMembros = listaMembros;
    }

    public ArrayList<Livro> getListaLivros() {
        return listaLivros;
    }

    public void setListaLivros(ArrayList<Livro> listaLivros) {
        this.listaLivros = listaLivros;
    }

    public TreeSet<Membro> getListaMembros() {
        return listaMembros;
    }

    public void setListaMembros(TreeSet<Membro> listaMembros) {
        this.listaMembros = listaMembros;
    }

    public void cadastrarMembro(Membro membro) {
        if (membro.getMatricula() == null || membro.getNome() == null || membro.getSituacao() == null) {
            System.out.println("Membro com informacoes faltantes nao pode ser cadastrado.");
        } else listaMembros.add(membro);
    }

    public void cadastrarLivro(Livro livro) {
        if (livro.getIsbn() == null || livro.getTitulo() == null || livro.getAutor() == null) {
            System.out.println("Livro com informacoes faltantes nao pode ser cadastrado.");
        } else listaLivros.add(livro);
    }

    public String listarTodosMembros() {
        StringBuilder aux = new StringBuilder();
        for (Membro membro : listaMembros) {
            if (membro != null) {
                aux.append(membro);
            }
        }
        return aux.toString();
    }

    public String listarTodosLivros() {
        StringBuilder aux = new StringBuilder();
        for (Livro livro : listaLivros) {
            if (livro != null) {
                aux.append(livro);
            }
        }
        return aux.toString();
    }

    public boolean pesquisarMembro(Membro membro) {
        return listaMembros.contains(membro);
    }

    public boolean pesquisarLivro(Livro livro) {
        return listaLivros.contains(livro);
    }

}