public class Jogador{

  private char simbolo;
  private static int jogador = 0;

  public Jogador(){
    if (this.jogador==0){
      this.simbolo = ('x');
    }
    else{
      this.simbolo = ('O');
    }
    jogador++;
  }

  public char getSimbolo(){
    return this.simbolo;
  }
}
