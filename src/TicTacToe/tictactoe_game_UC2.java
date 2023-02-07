package TicTacToe;

import java.util.Scanner;

public class tictactoe_game_UC2 {
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

    public static void choose(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Between X and O");
        player_1 = sc.next().toUpperCase().charAt(0);
        player_2 = sc.next().toUpperCase().charAt(0);
    }
}
