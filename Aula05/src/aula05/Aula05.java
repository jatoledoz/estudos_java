package aula05;

public class Aula05 {

    public static void main(String[] args) {
      Conta c1 = new Conta(1000, "Jubileu");
      c1.statusConta();
      c1.abrirConta("CC");
      c1.statusConta();
      c1.depositar(300);
      c1.statusConta();
      c1.sacar(100);
      c1.statusConta();
      c1.fecharConta();
      c1.pagarMensalidade();
      c1.statusConta();
      c1.sacar(251);
      c1.sacar(238);
      c1.fecharConta();

      Conta c2 = new Conta(2000, "Creuza");
      c2.statusConta();
      c2.abrirConta("CP");
      c2.statusConta();
      c2.depositar(500);
      c2.statusConta();
      c2.sacar(100);
      c2.statusConta();
      c2.fecharConta();
      c2.pagarMensalidade();
      c2.statusConta();
      c2.sacar(531);
      c2.sacar(530);
      c2.fecharConta();
      
      
      
    }
    
}
