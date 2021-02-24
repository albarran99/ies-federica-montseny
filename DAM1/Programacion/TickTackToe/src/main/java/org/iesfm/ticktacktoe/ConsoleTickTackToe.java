package org.iesfm.ticktacktoe;

import org.iesfm.ticktacktoe.exceptions.InvalidPositionException;
import org.iesfm.ticktacktoe.exceptions.NotYourTurnException;
import org.iesfm.ticktacktoe.exceptions.PositionInUseException;

import java.util.Scanner;

public class ConsoleTickTackToe {
    private Scanner scan;
    private ITickTackToe game;

    public ConsoleTickTackToe(Scanner scan, ITickTackToe game) {
        this.scan = scan;
        this.game = game;
    }

    public void run() throws NotYourTurnException, PositionInUseException, InvalidPositionException {
        System.out.println("Bienvenido al tres en raya (Spanihs Edititon)");

        printBoard(game.getBoard());

        while (!game.isFinished()) {
            System.out.println("Es el turno de " + game.getTurn());
            System.out.println("Introduce coordenadas");
            int cordX = scan.nextInt();
            int cordY = scan.nextInt();
            scan.nextLine();
            try{

                if (game.getTurn() == TickTackToe.X) {
                    game.putX(cordX, cordY);
                } else {
                    game.putO(cordX, cordY);
                }
            }catch (NotYourTurnException e){
                System.out.println("No es tu turno");
            } catch (PositionInUseException e){
                System.out.println("Posicion esta ocupada");
            }catch (InvalidPositionException e){
                System.out.println("Posicion no valida");
            }

            printBoard(game.getBoard());
        }
        Character winner = game.getWinner();
        if (winner == null){
            System.out.println("a habido un empate");
        } else {
            System.out.println("a ganado " + winner);
        }
    }

    private void printBoard(Character[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (i == 0) {
                System.out.println("|̄ ̄ ̄ |̄ ̄ ̄ |̄ ̄ ̄ |");
            } else {
                System.out.println("|   |   |   |");
            }
            Character[] row = board[i];
            for (int j = 0; j < row.length; j++) {
                if (row[j] == null) {
                    System.out.print("|   ");
                } else if (row[j] == 'X') {
                    System.out.print("| X ");
                } else {
                    System.out.print("| O ");
                }
            }
            System.out.println("|");
            System.out.println("|___|___|___|");
        }
    }
}
