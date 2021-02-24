package org.iesfm.ticktacktoe;

import org.iesfm.ticktacktoe.exceptions.InvalidPositionException;
import org.iesfm.ticktacktoe.exceptions.NotYourTurnException;
import org.iesfm.ticktacktoe.exceptions.PositionInUseException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NotYourTurnException, PositionInUseException, InvalidPositionException {
        ConsoleTickTackToe console = new ConsoleTickTackToe(new Scanner(System.in), new TickTackToe());
        console.run();
    }
}
