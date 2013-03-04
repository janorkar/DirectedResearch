package ChessAPI;

public class Rook extends Piece{
	
	public Rook() {
		super();
	}
	
	public Rook(Color c, Square s) {
		super(c,s);
	}

	@Override
	public boolean moveTo(Square destination) {
		
		System.out.println("Rook");
		//logic for checking if the Rook can move from current Location to this Destination
		//i.e validate()
		//return true and move else return false
		
		return true;
	}
	
	
	//the class will also include other functions specific to Rook Object
	
}
