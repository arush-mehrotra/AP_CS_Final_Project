import java.util.Scanner;
public class TicTacToeBoard{
  private String spot1;
  private String spot2;
  private String spot3;
  private String spot4;
  private String spot5;
  private String spot6;
  private String spot7;
  private String spot8;
  private String spot9;
  private boolean isGameOver;
  private String currentPlayer;

  public TicTacToeBoard(){
    this.spot1 = "  1  ";
    this.spot2 = "  2  ";
    this.spot3 = "  3  ";
    this.spot4 = "  4  ";
    this.spot5 = "  5  ";
    this.spot6 = "  6  ";
    this.spot7 = "  7  ";
    this.spot8 = "  8  ";
    this.spot9 = "  9  ";
    this.isGameOver = false;
    this.currentPlayer = "  O  ";

  }

  public String getBoard(){
     return "\n" + "\n" + "A  " + spot1 + "|" + spot2 + "|" + spot3 + "\n" + "   _____|_____|_____ " + "\n" + "B  " + spot4 + "|" + spot5 + "|" + spot6 + "\n" + "   _____|_____|_____ " + "\n" + "C  " + spot7 + "|" + spot8 + "|" + spot9 + "\n" + "        |     |      "+ "\n";
}

   

  public boolean getGameOver(){
    return isGameOver;
  }

  public void play(int scan){
    if (scan == 1 && spot1.equals("  1  ")){
      spot1 = currentPlayer;
    } else if (scan == 2 && spot2.equals("  2  ")){
      spot2 = currentPlayer;
    } else if (scan == 3 && spot3.equals("  3  ")){
      spot3 = currentPlayer;
    } else if (scan == 4 && spot4.equals("  4  ")){
      spot4 = currentPlayer;
    } else if (scan == 5 && spot5.equals("  5  ")){
      spot5 = currentPlayer;
    } else if (scan == 6 && spot6.equals("  6  ")){
      spot6 = currentPlayer;
    } else if (scan == 7 && spot7.equals("  7  ")){
      spot7 = currentPlayer;
    } else if (scan == 8 && spot8.equals("  8  ")){
      spot8  = currentPlayer;
    } else if (scan == 9 && spot9.equals("  9  ")){
      spot9 = currentPlayer;
    } else {
      return;
    }
    if (currentPlayer.equals("  O  ")){
      currentPlayer = "  X  ";
    }
    else {
      currentPlayer = "  O  ";
    }

  }
  public String playerName(){
    if (currentPlayer.equals("  O  ")){
      return "Player 1: it is your turn.";
    }
    else{
      return "Player 2: it is your turn.";
    }
  }
  
  public String gameOver(){
    String lastPlayer;
    if (currentPlayer.equals("  X  ")){
      lastPlayer = "  O  ";
    }
    else{
      lastPlayer = "  X  ";
    }
    if (spot1.equals(spot2) && spot2.equals(spot3)){
      isGameOver = true;
      return "Player " + lastPlayer + ", you have won!";
    } else if (spot4.equals(spot5) && spot5.equals(spot6)){
      isGameOver = true;
      return "Player " + lastPlayer  + ", you have won!";
    } else if (spot7.equals(spot8) && spot8.equals(spot9)){
      isGameOver = true;
      return "Player " + lastPlayer  + ", you have won!";
    } else if (spot1.equals(spot4) && spot4.equals(spot7)){
      isGameOver = true;
      return "Player " + lastPlayer  + ", you have won!";
    } else if (spot2.equals(spot5) && spot5.equals(spot8)){
      isGameOver = true;
      return "Player " + lastPlayer  + ", you have won!";
    } else if (spot3.equals(spot6) && spot6.equals(spot9)){
      isGameOver = true;
      return "Player " + lastPlayer  + ", you have won!";
    } else if (spot1.equals(spot5) && spot5.equals(spot9)){
      isGameOver = true;
     return "Player " + lastPlayer  + ", you have won!";
    } else if (spot3.equals(spot5) && spot5.equals(spot7)){
      isGameOver = true;
      return "Player " + lastPlayer  + ", you have won!";
    }
    else {
      isGameOver = false;
      return "";
    }
  }


}