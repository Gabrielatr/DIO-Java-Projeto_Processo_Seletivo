package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo");

        String [] candidatos = {"Gabriela", "Luana", "Juliana", "Marcos"};
        for(String candidato : candidatos){
            contactar(candidato);
        }
    }

    static void contactar(String candidato){
        int tentativa = 1;
        boolean atendeu = false;

        do{
            atendeu = atender();
            if(atendeu){
                System.out.println("Contato realizado com sucesso!");
                System.out.println("Conseguimos contato com " + candidato + " com " + tentativa + " tentativa(s).");
                break;
            }
            tentativa++;
        }while(tentativa<3);

        if(!atendeu){
            System.out.println("Não conseguimos contato com " + candidato + " com " + tentativa + " tentativa(s).");
        }

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void analisarCandidatura(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase>salarioPretendido){ 
            System.out.println("Ligar para o candidato");
        }else if(salarioBase==salarioPretendido){ 
            System.out.println("Ligar com contra proposta");
        }else {System.out.println("Aguardando o resultado dos demais candidatos");}
    }
}
