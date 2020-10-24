package aula10;
public class Aluno extends Pessoa{
    
    //Attributes
    
    private int matricula;
    private String curso;
    
    
    //Methods
    
    public void cancelarMatricula(){
        System.out.println("Matricula cancelada");
    }

    
    //Getters & Setters
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
