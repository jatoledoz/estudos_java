package aula05;

public class Conta {
    
    //Atributos
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    //Constructor

    public Conta(int numConta, String dono) {
        this.numConta = numConta;
        this.dono = dono;
        this.saldo = 0f;
        this.status = false;
    }
    
    
    
    //Metodos
    
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        
        if ("CC".equals(tipo)){
            this.setSaldo(50);
        } else if ("CP".equals(tipo)){
            this.setSaldo(150);
        }        
        
        System.out.println("Conta aberta com sucesso!!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() != 0){
            System.out.println("Impossivel fechar conta. Saldo: " + this.saldo);
        }else{
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso");
        }
    }
    
    public void depositar(float valorDepositado){
        if (this.isStatus()){
           this.setSaldo(this.getSaldo() + valorDepositado);
            System.out.println("Deposito realizado com sucesso");
        }else{
            System.out.println("Conta ainda fechada");
        }
    }
    
    public void sacar(float valorSacado){
        if (this.isStatus()){
            if (this.getSaldo() >= valorSacado){
                this.setSaldo(this.getSaldo() - valorSacado);
                System.out.println("Saque realizado com sucesso");
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel sacar");
        }
          
    }
    
    public void pagarMensalidade(){
        float valorMensalidade = 0;
        
        if("CC".equals(this.getTipo())){
            valorMensalidade = 12f;
            System.out.println("Mensalidade no valor de " + valorMensalidade + " paga com sucesso");
        }else if ("CP".equals(this.getTipo())){
            valorMensalidade = 20f;
            System.out.println("Mensalidade no valor de " + valorMensalidade + " paga com sucesso");
        }
        
        if (this.isStatus()){
            if(this.getSaldo() > valorMensalidade){
                this.setSaldo(getSaldo() - valorMensalidade);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Conta ainda fechada");
        }
        
    }
    
    public void statusConta(){
        if (this.isStatus()){
            System.out.println("Nova conta: ");
            System.out.println("Numero da conta: " + this.getNumConta());
            System.out.println("Tipo: " + this.getTipo());
            System.out.println("Dono: " + this.getDono());
            System.out.println("Saldo: " + this.getSaldo());
            System.out.println("Status atual: " + this.isStatus());
        }else{
            System.out.println("Conta ainda nao aberta");
        }
    }
    
    
    // Getters & Setters
    
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public boolean isStatus(){
        return this.status;
    }

    public void setStatus(boolean status){
        this.status = status;
    
    }

}
