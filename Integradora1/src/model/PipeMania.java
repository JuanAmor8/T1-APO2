package model;

public class PipeMania {

    private static Gameboard gameboard;

    private static Scoreboard scoreboard = new Scoreboard();

    public PipeMania() {

    }

    public static void main(String[] args) {

    }

    public void createGameboard(){
        gameboard = new Gameboard();
        createGameboard(0,0,0);
    }

    private void createGameboard(int counter, int row,int column ){

        if(counter < 64){

            if (counter%8 == 0 && counter !=0){

                column = 0;

                row ++;

            }

            gameboard.addNodeAtTail(row,column);

            createGameboard(counter+1,row,column+1);

        }


    }



    public String addPipe( int row, int column, int pipeType){

        String msg = "";

        if (gameboard.addPipe(row,column,pipeType)){
            msg+="Su pipe fue agregado correctamente";
        }
        else{
            msg+="Hubo un error al agregar su pipe(Ingrese un numero del 1 al 3)";
        }


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
    public void addDYF(){
        gameboard.addDYF();

    }

    public String print(){
        return gameboard.print();
    }

    public boolean simulate(){
        return gameboard.simulate();
    }


    public Gameboard getGameboard() {
        return gameboard;
    }

    public Scoreboard getScoreboard() {
        return scoreboard;
    }

}
