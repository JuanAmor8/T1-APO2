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

    private String createGameboard(int counter, int row,int column ){

        if(counter < 64){

            if (counter%8 == 0 && counter !=0){

                column = 0;

                row ++;

            }

            gameboard.addNodeAtTail(row,column);

            createGameboard(counter+1,row,column+1);

        }

        return gameboard.print1();


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
