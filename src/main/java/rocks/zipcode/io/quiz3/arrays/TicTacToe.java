package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        String[] row = {board[value][0], board[value][1], board[value][2]};
        return row;
    }

    public String[] getColumn(Integer value) {
        String[] column = {board[0][value], board[1][value], board[2][value]};
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return (getRow(rowIndex)[0].equals("X") && getRow(rowIndex)[1].equals("X") && getRow(rowIndex)[2].equals("X")) ||
                (getRow(rowIndex)[0].equals("O") && getRow(rowIndex)[1].equals("O") && getRow(rowIndex)[2].equals("O"));
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return null;
    }

    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
        return null;
    }
}
