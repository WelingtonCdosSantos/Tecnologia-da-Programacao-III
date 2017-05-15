package jogo;

import java.util.Scanner;

public class Jogo{
    public static void main(String[] args) {   
        Jogo j = new Jogo();
        j.iniciar();           
    }
    public void iniciar(){   
        int n =-1;
        while(n != 0){
            System.out.println("\nSeja Bem-vindo");
            System.out.println("Digite o número do jogo desejado:");
            System.out.println("1 - Maior ou Menor");
            System.out.println("2 - Cara ou Coroa");
            System.out.println("0 - Sair");
            Scanner ler = new Scanner(System.in);
            n = ler.nextInt();

            switch(n){
                case 1:
                    Jogo m = new MenorMaior();
                    m.jogar(m);                    
                break;
                case 2:
                   Jogo c = new CaraCoroa();
                   c.jogar(c); 
                break;
                case 0:
                    finalizar();
                break;
                default:
                    System.out.println("Opção inválida!");
                break;
            }  
        }
    }
    public static void jogar(Jogo jogo){
        Placar p = new Placar("Jao",0,false);  
        if(jogo instanceof MenorMaior){                      
            ((MenorMaior) jogo).jogar(p);           
            if(p.ganho == true){
                p.exibirPlacar(p, jogo);
            }else{
                 ((MenorMaior) jogo).abortar(p,jogo);
            }             
        }else{ 
            ((CaraCoroa) jogo).jogar(p);
            if(p.ganho == true){
                p.exibirPlacar(p, jogo);
            }else{
                 ((CaraCoroa) jogo).abortar(p,jogo);
            }     
        }        
    }
     public void finalizar(){
        System.out.println("Programa Finalizado!!!");        
    }   
}
