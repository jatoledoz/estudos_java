package aula12;
public class Ave extends Animal {

    //Attribute
    private String corPena;
    
    
    //Abstract methods
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    
    //Methods
    public void fazerNinho(){
        System.out.println("Ninho feito");
    }

    //Getter & Setter

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
