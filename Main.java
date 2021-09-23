import java.util.Scanner;
public class Main{
public static void main (String[] args){
  Scanner sc = new Scanner(System.in);

  TicTacToeBoard board1 = new TicTacToeBoard();
  System.out.println("Player 1. You are O");
  System.out.println("Player 2. You are X");
  System.out.println(board1.getBoard());

  int i = 0;
  
  while (board1.getGameOver() == false && i < 9 ){    
    System.out.println(board1.playerName());
    while (! sc.hasNextInt()){
      sc.nextLine();
      System.out.println("Wrong input. Please enter a number 1-9!");
    }
     board1.play(sc.nextInt());
     System.out.println("\033[H\033[2J");
     System.out.println(board1.getBoard());
     System.out.println(board1.gameOver());
     i++;
}
if (i == 9 && board1.getGameOver() == false){
  System.out.println("Cat's Game!");
}
else {
  System.out.println("Game Over!");
}
}
}