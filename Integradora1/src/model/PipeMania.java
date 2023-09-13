package model;

public class PipeMania {

    private static Gameboard gameboard = new Gameboard();

    private static Scoreboard scoreboard = new Scoreboard();

    public PipeMania() {

    }

    public static void main(String[] args) {

    }

    public String createGameboard(){
        return createGameboard(0,0,0);
    }

    private String createGameboard(int counter,int column, int row ){

        if(counter < 64){

            if (counter%8 == 0 && counter !=0){

                column = 0;

                row =+ 1;

            }

            gameboard.addNodeAtTail(column,row);

            createGameboard(counter+1,column+1,row);

        }

        return gameboard.print();

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
