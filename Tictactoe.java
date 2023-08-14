package Training;

import java.util.Scanner;

public class Tictactoe {

	public static void main(String[] args) {
		char[][] board=new char[3][3];
		for(int r=0;r<3;r++) {
			for(int c=0;c<board[r].length;c++) {
				board[r][c]=' ';
				
			}
		}
		Scanner sc=new Scanner(System.in);
		char player='X';
		boolean gameOver=false;
		while(!gameOver) {
			printBoard(board);
			System.out.println("player "+player+" enter: ");
			int r=sc.nextInt();
			int c=sc.nextInt();
			if(board[r][c]==' ') {
				board[r][c]=player;
				gameOver=haveWon(board,player);
				if(gameOver) {
					System.out.println("player "+player+" has won");
				}
				else {
					if(player=='X') {
						player='O';
					}
					else {
						player='X';
						
					}
				}
				
			}
			else {
				System.out.println("invalid");
			}
		}
		printBoard(board);

	}
	public static boolean haveWon(char board[][],char player) {
		for(int r=0;r<3;r++) {
			if(board[r][0]==player && board[r][1]==player && board[r][2]==player) {
				return true;
			}
		
		}
		for(int c=0;c<board[0].length;c++) {
			if(board[0][c]==player && board[1][c]==player && board[2][c]==player) {
				return true;
			}
		
		}
		if(board[0][0]==player && board[1][1]==player && board[2][2]==player) {
			return true;
			
		}
		if(board[0][2]==player && board[1][1]==player && board[2][0]==player) {
			return true;
			
		}
		return false;

		
	}
	
	public static void printBoard(char board[][]) {
		for(int r=0;r<3;r++) {
			for(int c=0;c<board[r].length;c++) {
				System.out.print(board[r][c]+"|");
				
			}
			System.out.println();
		}
		
	}

}
