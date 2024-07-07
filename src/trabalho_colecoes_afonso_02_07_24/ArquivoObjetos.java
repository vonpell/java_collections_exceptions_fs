package trabalho_colecoes_afonso_02_07_24;

import java.io.*;
import java.util.ArrayList;
import java.util.TreeSet;

public class ArquivoObjetos<T> {
    public ArquivoObjetos() {
    }

    public void gravaMembros(TreeSet<Membro> listaMembros, String nomeArqMembros) {
        File arquivo = new File(nomeArqMembros);
        try {
            FileWriter fw = new FileWriter(arquivo);
            BufferedWriter escrita = new BufferedWriter(fw);
            for (Membro membro : listaMembros) {
                if (membro != null) {
                    escrita.write(membro.toString());
                }
            }
            escrita.flush();
            escrita.close();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void gravarLivro(ArrayList<Livro> listaLivros, String nomeArqLivro) {
        File arquivo = new File(nomeArqLivro);
        try {
            FileWriter fw = new FileWriter(arquivo);
            BufferedWriter escrita = new BufferedWriter(fw);
            for (Livro livro : listaLivros) {
                if (livro != null) {
                    escrita.write(livro.toString());
                }
            }
            escrita.flush();
            escrita.close();
        } catch (IOException e) {
            System.out.println("Erro de IO.");
        }
    }

    public void lerArquivo(String nomeArquivo) {
        try {
            FileReader fr = new FileReader(nomeArquivo);
            BufferedReader leitura = new BufferedReader(fr);
            String content;
            while ((content = leitura.readLine()) != null) {
                System.out.println(content);

            }
            leitura.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro de File not found.");
        } catch (IOException e) {
            System.out.println("Erro de IO.");
        }
    }
}
