public class Especializacao {
    private String nome_esp;
    private String instituicao;
    private int duracao; // em anos
    
    public Especializacao(String nome, String inst, int duracao) {
        this.nome_esp = nome;
        this.instituicao = inst;
        this.duracao = duracao;
    }

    public void setName(String nome) {
        this.nome_esp = nome;
    }
    public String getName() {
        return this.nome_esp;
    }

    public void setInst(String nome) {
        this.instituicao = nome;
    }
    public String getInst() {
        return this.instituicao;
    }

    public void setDuracao(int dura) {
        this.duracao = dura;
    }
    public int getDuracao() {
        return this.duracao;
    }
}
