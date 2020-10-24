package aula03;
public class Consulta {
    String paciente;
    String medico;
    String especialidade;
    int dia;
    int mes;
    int ano;
    int hora;
    int min;
    boolean agendada;
    
    
    void agendar(){
        agendada = true;
        System.out.println("Consulta agendada para " + this.paciente);
        System.out.println("dia " + this.dia + "." + this.mes + "." + this.ano);
        System.out.println("as " + this.hora + "h" + this.min);
        System.out.println("com " + this.medico + ". Especialidade: " + this.especialidade);
        System.out.println("Confirmada" + this.agendada);
        
    }
    
    void cancelar(){
        agendada = false;
        System.out.println("Consulta cancelada");
    }
}
