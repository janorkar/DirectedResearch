package ChessAPI;

public class GameDump {
	Square s[][];
	int noOfMovesTillNow;
	int turn;

	GameDump()
	{
		s = new Square[8][8];
		noOfMovesTillNow = 0;
	}
	
	GameDump getDump()
	{
		GameDump currentDump;
		currentDump = new GameDump();

		// noOfMovesTillNow get it from Player class object
		// If Player1.isMyTurn = true then turn = 1
		// Else turn = 2
		return currentDump;
	}
}
