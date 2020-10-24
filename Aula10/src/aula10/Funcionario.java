package aula10;
public class Funcionario extends Pessoa{
    
    //Attributes
    
    private String setor;
    private boolean trabalhando;
    
    //Methods
    
    public void mudarTrabalho(){
        this.setTrabalhando(! this.isTrabalhando());
    }
    
    //Getters & Setters

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
