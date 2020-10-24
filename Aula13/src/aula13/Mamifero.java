package aula13;
public class Mamifero extends Animal {

    //Attribute
    protected String corPelo;
    
    //Absctract Method
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }
    
}
