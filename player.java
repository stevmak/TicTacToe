public class player
{
	String name;
	String piece;
	
	public player()
	{
		name = "Player 1";
		piece = "O";
	}
	
	public player(String playerName, String playerPiece)
	{
		name = playerName;
		piece = playerPiece;
	}

	public void setName(String playerName)
	{
		name = playerName;
	}

	public void setPiece(String playerPiece)
	{
		piece = playerPiece;
	}
	
	public void play(board board1, int x, int y)
	{
		if (x > 2 || y > 2)
		{
			System.out.println("Invalid move, pick two numbers less than 3");
		}
		else if(board1.grid[x][y].equals(" "))
		{
			board1.updateBoard(piece, x, y);
		}
		else if(!(board1.grid[x][y].equals(" ")))
		{
			System.out.println("Invalid move, a piece has been placed there");
		}
		board1.printBoard();
	}

	public boolean checkIfWon(board board1)
	{
		boolean win = false;
		if (board1.grid[0][0].equals(piece) && board1.grid[1][0].equals(piece) && board1.grid[2][0].equals(piece))
		{
			win  = true;
		}
		else if (board1.grid[0][1].equals(piece) && board1.grid[1][1].equals(piece) && board1.grid[2][1].equals(piece))
		{
			win = true;
		}	
		else if (board1.grid[0][2].equals(piece) && board1.grid[1][2].equals(piece) && board1.grid[2][2].equals(piece))
		{
			win = true;
		}
		else if (board1.grid[0][0].equals(piece) && board1.grid[0][1].equals(piece) && board1.grid[0][2].equals(piece))
		{
			win = true;
		}
		else if (board1.grid[1][0].equals(piece) && board1.grid[1][1].equals(piece) && board1.grid[1][2].equals(piece))
		{
			win = true;
		}	
		else if (board1.grid[2][0].equals(piece) && board1.grid[2][1].equals(piece) && board1.grid[2][2].equals(piece))
		{
			win = true;
		}
		else if (board1.grid[0][0].equals(piece) && board1.grid[1][1].equals(piece) && board1.grid[2][2].equals(piece))
		{
			win = true;
		}
		else if (board1.grid[2][0].equals(piece) && board1.grid[1][1].equals(piece) && board1.grid[0][2].equals(piece))
		{
			win = true;
		}
		
		return win;
	}
	
	public static void main(String[] args)
	{
		board board1 = new board();
		player player1 = new player("Deeba", "X");
		
		player1.play(board1, 0, 0);
		player1.play(board1, 1, 1);
		player1.play(board1, 1, 2);
		player1.play(board1, 2, 2);
		player1.play(board1, 0, 0);
		player1.play(board1, 3, 5);
		player1.checkIfWon(board1);
	}
}
