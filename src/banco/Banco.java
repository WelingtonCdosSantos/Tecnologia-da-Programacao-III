/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Welington
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaCorrente cc = new ContaCorrente(5,"Eu","656-65","656-66",500);
        ContaPoupanca cp = new ContaPoupanca (0.7,"AA","666988-5","22625-6",300);
        
        cc.deposita(300);
        cp.saca(150);
        
        System.out.println("Titular da Conta Corrente: "+cc.getNtitular()+"\nRG: "+cc.getRg()+"\nCPF: "
        +cc.getCpf()+"\nAnuidade: R$ "+cc.getAnuidade());
        
        System.out.println("\nTitular da Conta Poupanca: "+cp.getNtitular()+"\nRG: "+cp.getRg()+"\nCPF: "
        +cp.getCpf()+"\nRendimento: "+cp.getRendimento()+" a.m.");
    }
    
}
