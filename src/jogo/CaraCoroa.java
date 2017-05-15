package jogo;
import java.util.Random;
import java.util.Scanner;

public class CaraCoroa extends Jogo implements JogoInterface{

    @Override
    public int resetar(Placar p) {
        Random random = new Random();   
        p.tentativas =0;
        p.acertos =0;
        System.out.println("\nJogo Resetado!!");        
        return random.nextInt(2)+1;
    }
    @Override
    public Placar jogar(Placar p) {      
        Random random = new Random();        
        int num;
        Scanner ler = new Scanner(System.in);
        int n;        
        while(true){
            System.out.println("\nEscolha o lado desejado: ");
            System.out.println("1 - Cara");
            System.out.println("2 - Coroa");              
            System.out.println("-1 - Reiniciar");
            System.out.println("0 - Sair");
            n = ler.nextInt();
            p.tentativas++;
            num = random.nextInt(2)+1;           
            if(n != 0){
                if(n == -1){                    
                    num = resetar(p);
                    continue;                    
                }
                if(n != num){
                    System.out.println("Errrrooouuuuuu");                       
                }else{
                    System.out.println("Acertou");               
                    p.acertos++;
                } 
            }else{p.tentativas--;break;}   
            
        }
        return p;
    }

    @Override
    public void abortar(Placar p,Jogo jogo) {
        System.out.println("\nVocê saiu do jogo");
        p.exibirPlacar(p, jogo);
    }  
}
