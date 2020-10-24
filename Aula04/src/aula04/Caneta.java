package aula04;

public class Caneta {
   public String modelo;
   private float ponta;
   private String cor;
   public boolean tampada;
   
   public Caneta(String modelo, String cor, float ponta){
       this.tampar();
       this.setModelo(modelo);
       this.setCor(cor);
       this.setPonta(ponta);
   }

   public void tampar(){
       this.tampada = true;
   }
   
   public void destampar(){
       this.tampada = false;
   }
    
   
   
   public void status(){
        System.out.println("Sobre a caneta");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada? " + this.getTampada());


   }
    // getters and setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean getTampada(){
        return tampada;
    }
    
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    
    
    
    
}
