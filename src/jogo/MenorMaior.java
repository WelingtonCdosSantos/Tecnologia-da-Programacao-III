package jogo;
import java.util.Random;
import java.util.Scanner;
public class MenorMaior extends Jogo implements JogoInterface {

    @Override
    public int resetar(Placar p) {
        Random random = new Random(); 
        p.tentativas =0;
        System.out.println("\nJogo Resetado!!");        
        return random.nextInt(100)+1;
    }
    @Override
    public Placar jogar(Placar p) {      
        Random random = new Random();        
        int num = random.nextInt(100)+1;
        Scanner ler = new Scanner(System.in);
        int n;        
        while(true){
            System.out.println("Digite algum número, 0 para desistir ou -1 para resetar: "+num);
            n = ler.nextInt();
            p.tentativas++;
            if(n != 0){
                if(n == -1){                    
                    num = resetar(p);
                    continue;                    
                }
                if(n != num){
                    if(n>num){
                            System.out.println("\n"+n+" é MAIOR que o serteado!\n");
                    }else{
                        System.out.println("\n"+n+" é MENOR que o serteado!\n");                   
                    }        
                }else{
                    p.ganho = true;
                    break;
                } 
            }else{p.tentativas--;break;}
        }
        return p;
    }

    @Override
    public void abortar(Placar p, Jogo jogo) {
        System.out.println("\nInfelizmente você perdeu");
        p.exibirPlacar(p,((MenorMaior) jogo));
    }   
    
}
