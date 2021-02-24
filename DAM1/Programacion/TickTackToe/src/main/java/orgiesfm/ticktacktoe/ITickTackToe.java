package orgiesfm.ticktacktoe;

import orgiesfm.ticktacktoe.exceptions.InvalidPositionException;
import orgiesfm.ticktacktoe.exceptions.NotYourTurnException;
import orgiesfm.ticktacktoe.exceptions.PositionInUseException;

public interface ITickTackToe {
    void putX(int x, int y) throws InvalidPositionException, PositionInUseException, NotYourTurnException;

    void putO(int x, int y) throws InvalidPositionException, PositionInUseException, NotYourTurnException;

    void reset();

    boolean isFinished();

    void setBoard(Character[][] board);

    String getWinner();

    String getTurn();

    Character[][] getBoard();
}
