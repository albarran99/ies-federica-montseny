package org.iesfm.ticktacktoe;

import org.junit.Assert;
import org.junit.Test;
import org.iesfm.ticktacktoe.exceptions.InvalidPositionException;
import org.iesfm.ticktacktoe.exceptions.NotYourTurnException;
import org.iesfm.ticktacktoe.exceptions.PositionInUseException;

public class TickTackToeTest {

    private final TickTackToe game = new TickTackToe();

    @Test
    public void finishedOWinnrTest() {
        Character[][] board = {
                {TickTackToe.X, null, TickTackToe.X},
                {TickTackToe.O, TickTackToe.X, TickTackToe.O},
                {TickTackToe.O, TickTackToe.X, TickTackToe.O}
        };
        game.setBoard(board);

        // Text execution

        boolean finished = game.isFinished();

        //Assertions

        Assert.assertTrue(finished);

    }

    @Test
    public void noMoreMovesDrawTest() {
        Character[][] board = {
                {TickTackToe.X, TickTackToe.O, TickTackToe.X},
                {TickTackToe.O, TickTackToe.X, TickTackToe.O},
                {TickTackToe.O, TickTackToe.X, TickTackToe.O}
        };
        game.setBoard(board);

        // Text execution

        Character winner = game.getWinner();

        //Assertions

        Assert.assertEquals("Draw", winner);
    }

    @Test(expected = InvalidPositionException.class)
    public void InvalidPositionOTest() throws NotYourTurnException, PositionInUseException, InvalidPositionException {
        Character[][] board = {
                {null, null, null},
                {null, null, TickTackToe.X},
                {null, null, null}
        };
        game.setBoard(board);

        // Text execution

        game.putO(3, 3);


    }
    @Test(expected = InvalidPositionException.class)
    public void InvalidPositionXTest() throws NotYourTurnException, PositionInUseException, InvalidPositionException {
        Character[][] board = {
                {TickTackToe.O, null, null},
                {null, null, TickTackToe.X},
                {null, null, null}
        };
        game.setBoard(board);

        // Text execution

        game.putX(3, 3);


    }


    @Test
    public void putXTest() throws NotYourTurnException, PositionInUseException, InvalidPositionException {
        Character[][] board = {
                {null, null, null},
                {null, null, null},
                {null, null, null}


        };
        game.setBoard(board);

        // Text execution

        game.putX(1, 1);

        Character[][] expectedboard = {
                {null, null, null},
                {null, TickTackToe.X, null},
                {null, null, null}
        };

        //Assertions

        Assert.assertArrayEquals(expectedboard, game.getBoard());

    }

    @Test
    public void putOTest() throws NotYourTurnException, PositionInUseException, InvalidPositionException {
        Character[][] board = {
                {null, null, null},
                {null, null, null},
                {null, null, null}


        };
        game.setBoard(board);

        // Text execution

        game.putO(1, 1);

        Character[][] expectedboard = {
                {null, null, null},
                {null, TickTackToe.O, null},
                {null, null , null}
        };

        //Assertions

        Assert.assertArrayEquals(expectedboard, game.getBoard());

    }
    @Test(expected = NotYourTurnException.class)
    public void notXYourTurnTest() throws NotYourTurnException, PositionInUseException, InvalidPositionException {
        Character[][] board = {
                {null, null, null},
                {null, null, TickTackToe.X},
                {null, null, null}
        };
        game.setBoard(board);

        game.putX(1, 1);

    }

    @Test(expected = NotYourTurnException.class)
    public void notOYourTurnTest() throws NotYourTurnException, PositionInUseException, InvalidPositionException {
        Character[][] board = {
                {null, null, null},
                {null, null, TickTackToe.O},
                {null, null, null}
        };
        game.setBoard(board);

        game.putO(1, 1);

    }

}
