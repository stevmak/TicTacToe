import java.util.Scanner;

class play
{
	public static void main(String[] args)
	{
		board board1 = new board();
		player player1 = new player();
		player player2 = new player();

		Scanner s = new Scanner(System.in);

		System.out.println("Player 1, choose player name: ");
		String player1Name = s.next();
		player1.setName(player1Name);

		System.out.println("\n" + player1.name + ", choose any 1 character token: ");
		String player1Piece = s.next();
		player1.setPiece(player1Piece);

		System.out.println("\nPlayer 2, choose player name: ");
		String player2Name = s.next();
		player2.setName(player2Name);
		
		System.out.println("\n" + player2.name + ", choose any 1 character token: ");
		String player2Piece = s.next();
		player2.setPiece(player2Piece);

		boolean game = false;
		System.out.println("\n");
		board1.printBoard();

		while(game != true)
		{	
			Scanner scan = new Scanner(System.in);

			System.out.println(player1.name + ", choose x-coordinate: ");
			int x1 = scan.nextInt();
			System.out.println(player1.name + ", choose y-coordinate: ");
			int y1 = scan.nextInt();
			System.out.println("\n");
			player1.play(board1, x1, y1);
			if (player1.checkIfWon(board1))
			{
				System.out.println("\n" + player1.name + " wins!");
				game = true;
				break;
			}
			
			System.out.println("\n" + player2.name + ", choose x-coordinate: ");
			int x2 = scan.nextInt();
			System.out.println(player2.name + ", choose y-coordinate: ");
			int y2 = scan.nextInt();
			System.out.println("\n");
			player2.play(board1, x2, y2);
			if (player2.checkIfWon(board1))
			{
				System.out.println("\n" + player2.name + " wins!");
				game = true;
				break;
			}
		}
	}
}
