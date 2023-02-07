package TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class tictactoe_game_UC5 {
    static char[] board = new char[10];
    static char player_1;
    static char computer_input;

    public static void main(String args[]){

        System.out.println("Welcome To Tic Tac Toe Game");
        System.out.println("---------------------------");

        board();
        choose();
        if (toss()==1){
            playTurn();
            displayBoard();

        }
        else{
            computerTurn();
            displayBoard();
        }

        while(true) {
            playTurn();
            computerTurn();
            displayBoard();
            freeSpace();
            winner();

        }

    }

    public static void board(){
        for (int i =1; i<=9; i++){
            board[i]= ' ';
        }
    }

    public static void choose(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Between X and O");
        player_1 = sc.next().toUpperCase().charAt(0);
        computer_input=(player_1=='X')?'O':'X';
    }

    public static void displayBoard(){
        System.out.println(board[1]+"||"+board[2]+"||"+board[3]);
        System.out.println("-------");
        System.out.println(board[4]+"||"+board[5]+"||"+board[6]);
        System.out.println("-------");
        System.out.println(board[7]+"||"+board[8]+"||"+board[9]);
    }

    public static void playTurn(){
        int move;
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose Location From 0-9");
            move =sc.nextInt();
            if(board[move] == ' '){
                break;
            }

        }
        System.out.println("Move: "+move);
        board[move]= player_1;
    }

    public static void computerTurn(){
        int computerMove;
        Random random =new Random();
        while(true){
            computerMove= random.nextInt(9)+1;
            if (board[computerMove]==' '){
                break;
            }
        }
        System.out.println("Computer Move:" +computerMove);
        board[computerMove]=computer_input;
    }

    public static void freeSpace(){
        boolean spaces = false;
        int remaining_spaces = 0;

        for(int i =1; i<=9; i++){
            if (board[i]==' '){
                spaces=true;
                remaining_spaces++;
            }
        }
        if (spaces==false){
            System.out.println("--------------------------------------");
            System.out.println("No More Spaces Available, Game is Draw");
            System.exit(0);
        }
        else{
            System.out.println("Spaces Available: " + remaining_spaces);
        }
    }

    public static int toss(){
        Random random = new Random();
        int check = random.nextInt(0,2);
        int val_check;
        if (check == 1){
            System.out.println("Player Plays First");
            val_check = 1;
        }
        else{
            System.out.println("Computer Plays First");
            val_check = 0;

        }
        return val_check;
    }

    public static void winner(){
        if ((board[1] == player_1 && board[2] == player_1 && board[3] == player_1) ||
                board[1] == player_1 && board[4] == player_1 && board[7] == player_1 ||
                board[2] == player_1 && board[5] == player_1 && board[8] == player_1 ||
                board[3] == player_1 && board[6] == player_1 && board[9] == player_1 ||
                board[1] == player_1 && board[5] == player_1 && board[9] == player_1 ||
                (board[4] == player_1 && board[5] == player_1 && board[6] == player_1) ||
                (board[7] == player_1 && board[8] == player_1 && board[9] == player_1) ||
                (board[3] == player_1 && board[5] == player_1 && board[7] == player_1)){
            System.out.println("Player Won The Game");
            System.exit(0);
        } else if ((board[1] == computer_input && board[2] == computer_input && board[3] == computer_input) ||
                board[1] == computer_input && board[4] == computer_input && board[7] == computer_input ||
                board[2] == computer_input && board[5] == computer_input && board[8] == computer_input ||
                board[3] == computer_input && board[6] == computer_input && board[9] == computer_input ||
                board[1] == computer_input && board[5] == computer_input && board[9] == computer_input ||
                (board[4] == computer_input && board[5] == computer_input && board[6] == computer_input) ||
                (board[7] == computer_input && board[8] == computer_input && board[9] == computer_input) ||
                (board[3] == computer_input && board[5] == computer_input && board[7] == computer_input)) {
            System.out.println("Computer Won The Game");
            System.exit(0);

        }







    }




}
