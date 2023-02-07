package TicTacToe;

public class tictactoe_game_UC1 {
    static char[] board = new char[10];
    static char player_1;
    static char player_2;

        public static void main(String args[]){

        }

       public static void board(){
            for (int i =1; i<=board.length; i++){
                board[i]= ' ';
            }
       }

}
