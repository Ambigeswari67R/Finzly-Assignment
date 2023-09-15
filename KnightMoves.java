import java.util.Scanner;

public class KnightMoves {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the row position (0-7) of the knight: ");
		int row = scanner.nextInt();

		System.out.print("Enter the column position (0-7) of the knight: ");
		int col = scanner.nextInt();

		int numberOfMoves = getPossibleKnightMoves(row, col);

		System.out.println(
				"The knight at position (" + row + ", " + col + ") can make " + numberOfMoves + " possible moves.");
	}

	public static int getPossibleKnightMoves(int row, int col) {
		int[][] knightMoves = { { -2, -1 }, { -2, 1 }, { -1, -2 }, { -1, 2 }, { 1, -2 }, { 1, 2 }, { 2, -1 },
				{ 2, 1 } };

		int possibleMoves = 0;

		for (int[] move : knightMoves) {
			int newRow = row + move[0];
			int newCol = col + move[1];

			if (isValidMove(newRow, newCol)) {
				possibleMoves++;
			}
		}

		return possibleMoves;
	}

	public static boolean isValidMove(int row, int col) {
		return row >= 0 && row < 8 && col >= 0 && col < 8;
	}
}
