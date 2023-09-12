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
                    nuevaPartida();
                    break;

                case 2:
                    verPuntaje();
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

    public void nuevaPartida(){

        System.out.println("1. Poner tuberias ");
        System.out.println("2. Simular ");
        System.out.println("Salir");

        String optionString = reader.nextLine();
        int option = Integer.parseInt(optionString);

        switch (option){
            case 1:

                addPipe();

                break;

            case 2:

                simulation();

                break;

            case 3:

                System.exit(0);

                break;

            default:

                System.out.println("Ingrese un numero del 1 al 3 ");
        }

    }

    public void addPipe(){

        System.out.println("Ingrese la posicion en que desea ingresar la nueva tuberia:");
        System.out.println("Ingrese la columna:");

        String columnString = reader.nextLine();
        int column = Integer.parseInt(columnString);

        System.out.println("Ingrese la fila:");

        String rowString = reader.nextLine();
        int row = Integer.parseInt(rowString);



    }

    public void simulation(){



    }

    public void verPuntaje(){



    }




}