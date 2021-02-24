package orgiesfm.ticktacktoe;

import orgiesfm.ticktacktoe.exceptions.InvalidPositionException;
import orgiesfm.ticktacktoe.exceptions.NotYourTurnException;
import orgiesfm.ticktacktoe.exceptions.PositionInUseException;

public class TickTackToe implements ITickTackToe {

    public final static char X = 'X';
    public final static char O = 'O';

    private Character[][] board;

    public TickTackToe(Character[][] board) {
        this.board = board;
    }

    public TickTackToe() {
        Character[][] board = {

                {null, null, null},
                {null, null, null},
                {null, null, null}
        };

    }

    @Override
    public void putX(int x, int y) throws InvalidPositionException, PositionInUseException, NotYourTurnException {
        if (isXTurn()) {
            if (isValidPosition(x, y)) {
                if (!isOccuiedPosition(x, y)) {
                    this.board[x][y] = X;
                } else {
                    throw new PositionInUseException();
                }
            } else {
                throw new InvalidPositionException();
            }
        } else {
            throw  new NotYourTurnException();
        }
    }

    @Override
    public void putO(int x, int y) throws InvalidPositionException, PositionInUseException, NotYourTurnException {
        if(!isXTurn()){
            if (isValidPosition(x, y)) {
                if(!isOccuiedPosition(x, y)){
                    board[x][y] = O;
                } else{
                    throw new PositionInUseException();
                }
            }else{
                throw new InvalidPositionException();
            }
        }else {
            throw new NotYourTurnException();
        }

    }

    private boolean isValidPosition(int x, int y) throws InvalidPositionException {
        return x >= 0 && x <= 2 && y >= 0 && y <= 2;
    }

    private boolean isOccuiedPosition(int x, int y) throws InvalidPositionException {
        return board[x][y] != null;
    }

    private boolean isXTurn() {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != null) {
                    count++;
                }
            }

        }
        return count%2 == 0;
    }

    @Override
    public void reset() {

    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void setBoard(Character[][] board) {
        this.board = board;
    }

    @Override
    public String getWinner() {
        return null;
    }

    @Override
    public String getTurn() {
        return null;
    }

    @Override
    public Character[][] getBoard() {
        return board;
    }
}
