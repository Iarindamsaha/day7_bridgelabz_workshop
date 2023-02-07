package TicTacToe;

import java.util.Scanner;

public class tictactoe_game_UC3 {
    static char[] board = new char[10];
    static char player_1;
    static char player_2;

    public static void main(String args[]){
        displayBoard();

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

    public static void displayBoard(){
        System.out.println(board[1]+"||"+board[2]+"||"+board[3]);
        System.out.println("-------");
        System.out.println(board[4]+"||"+board[5]+"||"+board[6]);
        System.out.println("-------");
        System.out.println(board[7]+"||"+board[8]+"||"+board[9]);
    }
}
