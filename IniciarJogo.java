import java.util.Scanner;

public class IniciarJogo{

  public static void main (String[] args){

    Jogo jogo = new Jogo();
    Scanner entrada = new Scanner(System.in);

    System.out.println(" ____________________________ ");
    System.out.println("|                            |");
    System.out.println("|Jogador 1: Seu símbolo é 'X'|");
    System.out.println("|Jogador 2: Seu símbolo é 'O'|");
    System.out.println("|____________________________|");
    jogo.getTabuleiro().printaTabuleiro();
    System.out.println("\n");
    System.out.println("\n");

    int cont = 1;

    /*while (jogo.checaJogo()==false){  //mudar a logica desse
      if (cont==1){
        System.out.println("Jogador "+ cont + ": "  +"Faça a sua jogada!");
        int linha = entrada.nextInt();
        int coluna = entrada.nextInt();
        jogo.Jogar(linha,coluna,'X');
        jogo.getTabuleiro().printaTabuleiro();
        cont++;
      }
      else{
        System.out.println("Jogador "+ cont + ": "  +"Faça a sua jogada!");
        int linha = entrada.nextInt();
        int coluna = entrada.nextInt();
        jogo.Jogar(linha,coluna,'O');
        jogo.getTabuleiro().printaTabuleiro();
        cont--;
      }
    }
    System.out.println("Parabéns, jogador "+ cont + "! "  +"Você ganhou!");*/

    while (true){
      System.out.println("Jogador "+ cont + ": "  +"Faça a sua jogada!");
      int linha = entrada.nextInt();
      int coluna = entrada.nextInt();
      jogo.Jogar(linha,coluna,jogo.getJogador(cont).getSimbolo());
      jogo.getTabuleiro().printaTabuleiro();
      if (jogo.checaJogo()==true){
        System.out.println("Parabéns, jogador "+ cont + "! "  +"Você ganhou!");
        break;
      }
      if (cont%2==0){
        cont--;
      }
      else{
        cont++;
      }
    }
  }
}
