package hotel;
public class Funcionario {
    private String nome;
    private String sobrenome;
    private String cargo;
    private String horarioTrabalho;
    private String departamento;
    private double salario;
    
    public Funcionario() {
    }

    public Funcionario(String nome, String sobrenome, String cargo, String horarioTrabalho, String departamento, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cargo = cargo;
        this.horarioTrabalho = horarioTrabalho;
        this.departamento = departamento;
        this.salario=salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHorarioTrabalho() {
        return horarioTrabalho;
    }

    public void setHorarioTrabalho(String horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
