package aula12;
public class Cachorro extends Mamifero{
    
    //Abstract Methods
    @Override
    public void emitirSom(){
        System.out.println("Latindo");
    }
    
    //Methods
    public void enterrarOsso(){
        System.out.println("Osso enterrado");
    }
    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }
    
}
