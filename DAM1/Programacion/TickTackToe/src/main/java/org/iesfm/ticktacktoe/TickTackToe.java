package org.iesfm.ticktacktoe;

import org.iesfm.ticktacktoe.exceptions.InvalidPositionException;
import org.iesfm.ticktacktoe.exceptions.NotYourTurnException;
import org.iesfm.ticktacktoe.exceptions.PositionInUseException;

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
            throw new NotYourTurnException();
        }
    }

    @Override
    public void putO(int x, int y) throws InvalidPositionException, PositionInUseException, NotYourTurnException {
        if (!isXTurn()) {
            if (isValidPosition(x, y)) {
                if (!isOccuiedPosition(x, y)) {
                    board[x][y] = O;
                } else {
                    throw new PositionInUseException();
                }
            } else {
                throw new InvalidPositionException();
            }
        } else {
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
        return count % 2 == 0;
    }

    @Override
    public void reset() {

    }

    @Override
    public boolean isFinished() {
        boolean finished = true;
        if (getWinner() == null) {
            for (int i = 0; i < board.length; i++) {
                Character[] columna = board[i];
                for (int j = 0; j < board.length; j++) {
                    Character casilla = columna[j];
                    if (casilla == null) {
                        finished = true;
                    }
                }
            }

        }
        return finished;
    }

    @Override
    public void setBoard(Character[][] board) {
        this.board = board;
    }

    @Override
    public Character getWinner() {
        Character winner = null;
        for (int i = 0; i < board.length; i++) {
            Character casilla1 = board[i][0];
            Character casilla2 = board[i][1];
            Character casilla3 = board[i][2];
            if (casilla1 == casilla2 && casilla2 == casilla3) {
                winner = casilla1;
            }
        }

        for (int i = 0; i < board.length; i++) {
            Character casilla1 = board[0][i];
            Character casilla2 = board[1][i];
            Character casilla3 = board[2][i];
            if (casilla1 == casilla2 && casilla2 == casilla3) {
                winner = casilla1;
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            winner = board[1][1];
        } else if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            winner = board[2][2];
        }
        return winner;
    }

    @Override
    public Character getTurn() {
        if (isXTurn()) {
            return X;
        } else {
            return O;
        }
    }

    @Override
    public Character[][] getBoard() {
        Character[][] board = {

                {null, null, null},
                {null, null, null},
                {null, null, null}
        };
        return board;
    }
}
