package model;

public class PipeMania {

    private GameBoard gameBoard;

    private Scoreboard scoreboard;

    public PipeMania() {

        GameBoard gameBoard = new GameBoard();
        Scoreboard scoreboard = new Scoreboard();

    }

    public static void main(String[] args) {

    }

    public void createGameBoard(){
        createGameBoard(0,0,0);
    }

    private void createGameBoard(int counter,int column, int row ){

        if(counter < 65){

            if (counter%8 == 0){

                column = 0;

                row =+ 1;

            }

            gameBoard.addNodeAtTail(column,row);

            createGameBoard(counter+1,column+1,row);

        }

    }



    public String addPipe(int clumn, int row, int pipeType){

        String msg = "";





        return msg;

    }

    public String simulation(){

        String msg = "";


        return msg;

    }

    public String seeScores(){

        String msg = "";

        return msg;

    }
}
