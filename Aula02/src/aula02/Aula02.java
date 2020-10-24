package aula02;
public class Aula02 {
    public static void main(String[] args) {
        /*Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Vermelha";
        c2.ponta = 0.7f;
        
        c2.tampar();
        c2.status();
        c2.rabiscar();
       */
        
        Consulta con1 = new Consulta();
        
        con1.paciente = "Joaozinho da Silva";
        con1.medico = "Jose Santos";
        con1.especialidade = "Proctologista";
        con1.dia = 2;
        con1.mes = 11;
        con1.ano = 2020;
        con1.hora = 14;
        con1.min = 00;
        
        con1.agendar();
    }
    
}
