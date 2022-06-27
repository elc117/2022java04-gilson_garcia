import java.util.ArrayList;

public class Funcionario_pub {
    protected String nome;
    protected int salario_base;
    private   int salario;
    protected int tempo_de_trabalho; // em anos
    protected ArrayList<Especializacao> especs;

    public Funcionario_pub (String nome, int salario_base, int tempo) {
        this.nome = nome;
        this.salario_base = salario_base;
        this.tempo_de_trabalho = tempo;
        attSal();
    }

    private void attSal() {
        this.salario = salario_base + 250 * especs.size() + 200 * tempo_de_trabalho ;
    }

    public void addEspec(Especializacao espec) {
        especs.add(espec);
        attSal();
    }

    public String getName(String nome) {
        return this.nome;
    }
    public void setName(String nome) {
        this.nome = nome;
    }

    public int getSalB() {
        return this.salario_base;
    }
    public void setSalB(int sal) {
        this.salario_base = sal;
        attSal();
    }

    public int getSal() {
        return this.salario;
    }

    public int getWorkTime() {
        return this.tempo_de_trabalho;
    }
    public void setWorkTime(int time) {
        this.salario_base = time;
        attSal();
    }






}