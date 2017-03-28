package pkgsuper.trunfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class SuperTrunfo {  
      public static List <Cartas> baralho = new ArrayList();
      public static List <Cartas> player = new ArrayList();
      
    public static void main(String[] args) {
        // TODO code application logic here
        Cartas c1 = new Cartas("Masserati Asseto Corsa",3217,369,280);
        Cartas c2 = new Cartas("Jaguar XKR",3996,363,250);
        Cartas c3 = new Cartas("Porsche 911 GT2",3600,462,315);
        Cartas c4 = new Cartas("Aston Martin Vanquish",5935,460, 306);
        Cartas c5 = new Cartas("Rolls-Royce Park Ward", 5379,326, 225);
        Cartas c6 = new Cartas("Mercedes S 63 AMG", 6258,444, 250);
        Cartas c7 = new Cartas("Daimler Super V8", 3996,363, 250);
        Cartas c8 = new Cartas("Bentley Continental T", 6750,426, 270);
        Cartas c9 = new Cartas("Lexus RX 300", 2995,201, 180);
        Cartas c10 = new Cartas("Mercedes ML 55 AMG", 5439,347, 235);
        Cartas c11 = new Cartas("Range Rover", 4553,218, 196);
        Cartas c12 = new Cartas("BMW X5", 4398,286, 280);
        Cartas c13 = new Cartas("Bugatti EB 16.4 Veyron", 7993,1001, 404);
        Cartas c14 = new Cartas("Ferrari 550 Maranello", 5474,485, 320);
        Cartas c15 = new Cartas("B. Engineering Edonis", 3760,680, 365);
        Cartas c16 = new Cartas("Lamborghini Diablo", 5992,550, 330);
        Cartas c17 = new Cartas("VW D1", 6000,450, 250);
        Cartas c18 = new Cartas("ItalDesign Scighera", 3000,400, 310);
        Cartas c19 = new Cartas("Cadillac Imaj", 4200,431, 300);
        Cartas c20 = new Cartas("Chrysler Chronos", 5980,350, 280);
        
       baralho.add(c1);
       baralho.add(c2);
       baralho.add(c3);
       baralho.add(c4);
       baralho.add(c5);
       baralho.add(c6);
       baralho.add(c7);
       baralho.add(c8);
       baralho.add(c9);
       baralho.add(c10);
       baralho.add(c11);
       baralho.add(c12);
       baralho.add(c13);
       baralho.add(c14);
       baralho.add(c15);
       baralho.add(c16);
       baralho.add(c17);
       baralho.add(c18);
       baralho.add(c19);
       baralho.add(c20);
                           
       int pontosPlayer = 0;
       int pontosRival = 0;
       
       for (int i = 0; i < 10; i++) {
           sorteiaBaralho();          
       }
       Scanner resposta = new Scanner(System.in);
       String res;
       int i=0;
       while(true) {
           System.out.println("PONTOS: \n");
           System.out.println("VocÃª: "+pontosPlayer);
           System.out.println("AdversÃ¡rio: "+pontosRival+"\n");
           System.out.println("VocÃª tem "+(10-pontosRival) +" cartas");
           System.out.println("-----------------------------");
           System.out.println("Nome: " + player.get(0).getNomeCarta());    
           System.out.println("Cilindradas:  " + player.get(0).getCilindradas());
           System.out.println("Potencia: " + player.get(0).getPotencia());
           System.out.println("Velocidade: " + player.get(0).getVelocidadeMaxima()); 
           System.out.println("-----------------------------");
           System.out.println("Rodada "+(i+1)+"\nVc ganhou???");
           res = resposta.nextLine();        
           
           
           if(res.equals("S")  || res.equals("s") ){
               pontosPlayer++;
               player.add(player.get(0));//copiando a primeira posicao na ultima
               player.remove(player.get(0));//removendo a primeira posicao             
           }else{
               pontosRival++;
               player.remove(0);
           }           
           i++;           
           if((10-pontosRival) == 0){
                System.out.println("\nFIM DE JOGO!");
                System.out.println("VocÃª: "+pontosPlayer);
                System.out.println("AdversÃ¡rio: "+pontosRival);
                System.out.println("\nVocÃª perdeu :( ");
                 break;
           }
           else if(pontosPlayer == 10){             
                System.out.println("\nFIM DE JOGO!");
                System.out.println("VocÃª: "+pontosPlayer);
                System.out.println("AdversÃ¡rio: "+pontosRival);
                System.out.println("\nParabÃ©ns vocÃª ganhou o jogo:)");
                break; 
                
           }          
       }       
 }     
    public static void sorteiaBaralho(){        
       Random gerador = new Random();	
       int n;
        //imprime sequÃªncia de 10 nÃºmeros inteiros aleatÃ³rios
	n=gerador.nextInt(11);
	//System.out.println(baralho.get(n).getNomeCarta());
        player.add(baralho.get(n));
        baralho.remove(n);            
        //System.out.println(player.get(i).getNomeCarta());    
    }    
}