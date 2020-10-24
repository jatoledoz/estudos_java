package aula12;
public class Peixe extends Animal {

    //Attribute
    private String corEscama;
    
    //Abstract Methods
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som");
    }
    
    //Methods
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }
    
    
    //Getter & Setter
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
