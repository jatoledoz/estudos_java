package aula10;
public class Pessoa {
    
    //Attributes
    
    private String nome;
    private int idade;
    private String sexo;
    
    //Methods
    
    public void fazerAniversario(){
        this.setIdade(this.getIdade()+1);
    }

    @Override
    public String toString() {
        return "Pessoa" + "\nNome = " + nome + ", idade=" + idade + ", sexo=" + sexo;
    }
    
    
    
    
    //Getters & Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
