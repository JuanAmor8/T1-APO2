package ui;

import model.PipeMania;
import java.util.Scanner;

public class Main {

    private Scanner reader;

    private PipeMania pipeMania;

    public Main() {

        rd = new Scanner(System.in);
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
                    cond = true;
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

        String optionString = rd.nextLine();
        int option = Integer.parseInt(optionString);

        switch (option){
            case 1:


                break;

            case 2:


                break;

            case 3:


                break;

            default:

                System.out.println("Ingrese un numero del 1 al 3 ");
        }

    }

    public void verPuntaje(){

        System.out.println("daniel es gay");

    }




}