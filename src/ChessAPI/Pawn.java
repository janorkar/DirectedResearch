package ChessAPI;

public class Pawn extends Piece {

	public Pawn() {
		super();
	}
	
	public Pawn(Color c, Square s) {
		super(c,s);
	}

	@Override
	public boolean moveTo(Square destination) {
		
		System.out.println("Pawn");
		//logic for checking if the Pawn can move from current Location to this Destination
		//i.e validate()
		//return true and move else return false
		
		return true;
	}
	
	
	//the class will also include other functions specific to Pawn Object
}
