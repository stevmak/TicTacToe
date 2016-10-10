public class board
{
	public String[][] grid;
	String boardLayout;

	public board()
	{
		grid = new String[3][3];
		for (int i = 0; i<3; i++)
		{
			for (int j = 0; j<3; j++)
			{
				grid[i][j] = " ";
			}
		}
		boardLayout = grid[0][0] + " | " + grid[1][0] + " | " + grid[2][0] + "\n";
		boardLayout = boardLayout + "--+---+--" + "\n";
		boardLayout = boardLayout + grid[0][1] + " | " + grid[1][1] + " | " + grid[2][1] + "\n";
		boardLayout = boardLayout + "--+---+--" + "\n";
		boardLayout = boardLayout + grid[0][2] + " | " + grid[1][2] + " | " + grid[2][2] + "\n";
	}

	public void printBoard()
	{
		System.out.println(boardLayout);
	}

	public void updateBoard(String piece, int x, int y)
	{
		grid[x][y] = piece;
		boardLayout = grid[0][0] + " | " + grid[1][0] + " | " + grid[2][0] + "\n";
		boardLayout = boardLayout + "--+---+--" + "\n";
                boardLayout = boardLayout + grid[0][1] + " | " + grid[1][1] + " | " + grid[2][1] + "\n";
		boardLayout = boardLayout + "--+---+--" + "\n";
		boardLayout = boardLayout + grid[0][2] + " | " + grid[1][2] + " | " + grid[2][2] + "\n";

	}

	public boolean checkIfTie()
	{
		int count = 9;
		for (int i = 0; i<3; i++)
		{
			for (int j = 0; j<3; j++)
			{
				if (grid[i][j].equals(" "))
				{
					count--;
				}
			}
		}
		if (count == 9)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args)
	{
		board board1 = new board();
		board1.printBoard();
		board1.updateBoard("X", 1, 1);
		System.out.println(board1.grid[1][1]);
		board1.updateBoard("O", 0, 1);
		System.out.println(board1.grid[0][1]);
		board1.printBoard();
	}
}
