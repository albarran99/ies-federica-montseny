package org.iesfm.ticktacktoe;

import org.iesfm.ticktacktoe.exceptions.InvalidPositionException;
import org.iesfm.ticktacktoe.exceptions.NotYourTurnException;
import org.iesfm.ticktacktoe.exceptions.PositionInUseException;

public interface ITickTackToe {
    void putX(int x, int y) throws InvalidPositionException, PositionInUseException, NotYourTurnException;

    void putO(int x, int y) throws InvalidPositionException, PositionInUseException, NotYourTurnException;

    void reset();

    boolean isFinished();

    void setBoard(Character[][] board);

    Character getWinner();

    Character getTurn();

    Character[][] getBoard();
}
