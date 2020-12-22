import java.util.*;

public class Turn {

    private final Scanner input = new Scanner(System.in);
    private Board board = null;
    private int x = 0;
    private int y = 0;

    public void assignBoard(Board board) {
        this.board = board;
    }

    public void getUserPos() {
        this.x = input.nextInt();
        this.y = input.nextInt();
    }

    public boolean checkSpot() {
        return this.board.getBoard()[this.x][this.y].checkOccupied();
    }
}

