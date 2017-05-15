package jogo;
public class Placar{
    public int tentativas;     
    public boolean ganho;   
    public Jogador j = new Jogador();
    public int acertos;
    
    public Placar(String nomej,int pontuacao, boolean ganho) {
        j.nome = nomej;       
        this.tentativas = pontuacao;
        this.ganho = ganho;
    }
    
    public void exibirPlacar(Placar p, Jogo jogo){
        if(jogo instanceof MenorMaior){
            if(p.ganho == true){
                System.out.println("\nParabéns "+p.j.nome+" você acertou após "+p.tentativas+ " tentativa(s)!!");
            }else{
                System.out.println(p.j.nome+" você tentou "+p.tentativas+" vez(es)");
            }
        }else{
            System.out.println("\n"+p.j.nome+" você acertou "+p.acertos+" em "+p.tentativas+" tentativa(s)!!"); 
        }
    }
 
}
