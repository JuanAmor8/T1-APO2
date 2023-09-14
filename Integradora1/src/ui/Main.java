package ui;

import model.PipeMania;
import java.util.Scanner;

public class Main {

    private Scanner reader;

private PipeMania pipeMania;

    public Main() {

        reader = new Scanner(System.in);
        pipeMania = new PipeMania();

    }

    public static void main(String[] args) {

        Main exe = new Main();
        exe.menu();

    }

    public void menu(){

        boolean flag = true;

        while (flag){

            System.out.println("1. Nueva partida");
            System.out.println("2. Ver puntaje");
            System.out.println("3. Salir");

            String optionString = reader.nextLine();
            int option = Integer.parseInt(optionString);

            switch (option){
                case 1:
                    newGame();
                    break;

                case 2:
                    System.out.println(pipeMania.seeScores());
                    break;

                case 3:

                    System.out.println("¡Nos vemos pronto!");
                    System.exit(0);
                    break;

                default:

                    System.out.println("Ingrese un numero del 1 al 3 ");

            }

        }

    }

    public void newGame(){

        System.out.println(pipeMania.createGameboard());

        //No se que hacer todavia con este nicknames
        System.out.println("Ingrese su nickname");

        String nicknameString = reader.nextLine();

        boolean flag = true;

        while (flag){



            System.out.println("1. Poner tuberias ");
            System.out.println("2. Simular ");
            System.out.println("3.Salir");

            String optionString = reader.nextLine();
            int option = Integer.parseInt(optionString);

            switch (option){
                case 1:

                    addPipe();

                    break;

                case 2:

                    pipeMania.simulation();

                    break;

                case 3:

                    System.exit(0);

                    break;

                default:

                    System.out.println("Ingrese un numero del 1 al 3 ");
            }

        }

    }

    public void addPipe(){

        System.out.println(pipeMania.getGameboard().printRowColumn());

        System.out.println("Ingrese la posicion en que desea ingresar la nueva tuberia:");
        System.out.println("Ingrese la fila:");

        String rowString = reader.nextLine();
        int row = Integer.parseInt(rowString);

        System.out.println("Ingrese la columna:");

        String columnString = reader.nextLine();
        int column = Integer.parseInt(columnString);

        System.out.println("Ingrese el tipo de tuberia que desea agregar:");
        System.out.println("1. =");
        System.out.println("2. ||");
        System.out.println("3. o");

        String pipeTypeString = reader.nextLine();
        int pipeType = Integer.parseInt(pipeTypeString);

        System.out.println(pipeMania.addPipe(column,row,pipeType));

        System.out.println(pipeMania.getGameboard().print());

    }





}