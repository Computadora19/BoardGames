package Checkers;

/***
 * @author estebanacosta
 */
public class Tile

{
    private Piece piece;

    private int col;

    private int row;

    /**
     * Initializes the Tile with the given row and column
     * @param col
     * @param row
     */
    public Tile(int row, int col)
    {
        this.setColumn(col);
        this.setRow(row);
    }

    private void setRow(int r)
    {
        this.row = r;
    }

    public int getRow()
    {
        return this.row;
    }

    private void setColumn(int c)
    {
        this.col = c;
    }

    public int getCol()
    {
        return this.col;
    }

    public String toString()
    {
        return this.getRow() + "," + this.getCol();
    }

    /**
     * @return the Piece that is occupying this tile, or null if the Tile has no occupant.
     */
    public Piece getOccupant()
    {

        return this.piece;
    }

    /**
     * Sets the occupant of this Tile to the Piece specified.
     * @param newOccupant
     */
    public void setOccupant(Piece newOccupant)
    {

        this.piece = newOccupant;
    }

    /**
     * @return true if the Tile has a Piece on it, false otherwise
     */
    public boolean isOccupied()
    {

        if (getOccupant() != null)
        {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o)
    {

        // If the object is compared with itself then return true
        if (o == this)
        {
            return true;
        }

        /*
         * Check if o is an instance of Complex or not
         * "null instanceof [type]" also returns false
         */
        if (!(o instanceof Tile))
        {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Tile t = (Tile) o;

        // Compare the data members and return accordingly
        return this.row == t.getRow() && this.col == t.getCol()
        && this.getOccupant() == t.getOccupant();
    }

    @Override
    public int hashCode()
    {

        int hash = 7;

        int result = 31;

        hash = hash * result + col;

        hash = hash * result + row;

        result = hash * result + piece.hashCode();

        return result;

    }

}
