public class ExcecaoJogar extends RuntimeException{

  public ExcecaoJogar(){
    System.out.println("Essa posição já foi jogada!");
  }
}
