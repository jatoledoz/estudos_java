package aula12;
public class Mamifero extends Animal {

    //Attribute
    private String corPelo;
    
    //Abstract Methods
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de mamifero");
    }
    
    
    //Getter & Setter

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    

}
