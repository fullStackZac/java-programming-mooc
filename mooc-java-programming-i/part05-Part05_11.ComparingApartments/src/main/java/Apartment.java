
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if(this.squares > compared.squares) {
            return true;
        }else {
            return false;
        }
    }
    
    public int priceDifference(Apartment compared) {
        int thisPrice = this.squares * this.princePerSquare;
        int comparedPrice = compared.squares * compared.princePerSquare;
        int priceDifference = thisPrice - comparedPrice;
        
        if(priceDifference < 0) {
            priceDifference = priceDifference * -1;
        }
        return priceDifference;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int thisPrice = this.squares * this.princePerSquare;
        int comparedPrice = compared.squares * compared.princePerSquare;
        
        if(thisPrice > comparedPrice) {
            return true;
        }else {
            return false;
        }
    }

}
