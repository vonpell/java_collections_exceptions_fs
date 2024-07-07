package classes;

import java.io.Serializable;
import java.util.Objects;

import static java.lang.Boolean.parseBoolean;

public class Membro implements Comparable<Membro>, Serializable {
    // implementei o Serializable, mas não utilizei InputStream e OutputStream
    private String nome;
    private String matricula;
    private SituacaoEnum situacao;

    public Membro() {
    }

    public Membro(String nome, String matricula, SituacaoEnum situacao) {
        this.nome = nome;
        this.matricula = matricula;
        this.situacao = situacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public SituacaoEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoEnum situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Membro: " + nome + ", matrícula: " + matricula + ", situação: " + situacao + "\n";
    }


    @Override
    public int hashCode() {
        return Objects.hash(matricula, nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Membro other = (Membro) obj;
        return Objects.equals(matricula, other.matricula) &&
                Objects.equals(nome, other.nome);
    }

    @Override
    public int compareTo(Membro o) {
        if (this.nome == null) {
            return -1;
        } else if (o.getNome() == null) {
            return 1;
        }
        return this.nome.compareTo(o.getNome());
    }

}
