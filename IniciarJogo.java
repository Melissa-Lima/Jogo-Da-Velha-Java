import java.util.Scanner;

public class IniciarJogo{

  public void jogar(){
    Jogo jogo = new Jogo();
    Scanner entrada = new Scanner(System.in);

    System.out.println(" ____________________________ ");
    System.out.println("|                            |");
    System.out.println("|Jogador 1: Seu símbolo é 'X'|");
    System.out.println("|Jogador 2: Seu símbolo é 'O'|");
    System.out.println("|____________________________|");
    System.out.println("\n");
    jogo.getTabuleiro().printaTabuleiro();

    int cont = 1;

    while (true){
      System.out.println("Jogador "+ cont + ": "  +"Faça a sua jogada!");
      int linha = entrada.nextInt();
      int coluna = entrada.nextInt();
      jogo.Jogar(linha,coluna,jogo.getJogador(cont).getSimbolo());
      System.out.println("\n");
      jogo.getTabuleiro().printaTabuleiro();
      if (jogo.checaJogo()==true){
        {
          if (jogo.checaEmpate()==true){
            System.out.println("Empate! Ninguém ganhou :/");
            System.out.println("\n");
          }
          else{
            System.out.println("Parabéns, jogador "+ cont + "! "  +"Você ganhou!");
            System.out.println("\n");
          }
          break;
        }
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
