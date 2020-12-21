import java.util.*;

public class Board {

    private Locations[][] board = new Locations[10][10];
    private List<Ships> ships;
    private final Random random = new Random();

    public void grabShips(){
        Ships aircraft = new Aircraft_Carrier();
        Ships battleship = new Battleship();
        Ships destroyer = new Destroyer();
        Ships patrol = new Patrol_Boat();
        Ships submarine = new Submarine();
        this.ships.add(aircraft); this.ships.add(battleship); this.ships.add(destroyer);
        this.ships.add(patrol); this.ships.add(submarine);
    }

    public void makeBoard() {
        for (int x = 1; x <= 10; x++){
            for (int y = 1; y<=10; y++){
                Locations pointer = new Locations();
                pointer.setOccupied(null);
                this.board[x][y] = pointer;
            }
        }
        grabShips();
        randomiseShips();

    }

    public void randomiseShips() {
        for (Ships item : this.ships) {
            while (true) {
                int orientation = this.random.nextInt(2) + 1;
                int x = this.random.nextInt(10) + 1;
                int y = this.random.nextInt(10) + 1;

                List<Locations> iterate = prepShipLocations(item, orientation, x, y);
                if (orientation == 1) {
                    if (!checkEmpty(iterate) && !checkOOB(x, y, item.getLength(), 0)){
                        for (int a = 0; a < item.getLength(); a++){
                            assignSquare(x, y, a,0, item);
                            break;
                        }
                    }
                }
                else if (orientation == 2) {
                    if (!checkEmpty(iterate) && !checkOOB(x, y, 0, item.getLength())){
                        for (int a = 0; a < item.getLength(); a++){
                            assignSquare(x, y , 0, a, item);
                            break;
                        }
                    }
                }
            }
        }
    }

    public boolean checkEmpty(List<Locations> iterate) {
        boolean occupied = false;
        for (Locations item : iterate) {
            occupied = item.checkOccupied();
            if (occupied) {
                break;
            }
        }
        return occupied;
    }

    public void assignSquare(int x, int y, int i, int c, Ships assignment){
        this.board[x+i][y+c].setOccupied(assignment);
    }

    public boolean checkOOB(int x, int y, int i, int c){
        return (x+i>10 || y+c>10);
    }

    public List<Locations> prepShipLocations(Ships item, int orientation, int x, int y) {
        List<Locations> iterate = null;

        if (orientation == 1) {
            for (int a = 0; a < item.getLength(); a++) {
                iterate.add(board[x + a][y]);
            }
        } else {
            for (int a = 0; a < item.getLength(); a++) {
                iterate.add(board[x][y + a]);
            }
        }
        return iterate;
    }

    public void showBoard(){
        System.out.println("|1|2|3|4|5|6|7|8|9|10");
        for (int a = 1; a <= 10; a++){
            String board_line = a + "|";
            for (int b = 1; b <= 10; b++){
                board_line += this.board[a][b].checkPointer();
                board_line += "|";
            }
            System.out.println(board_line);
        }
    }
}