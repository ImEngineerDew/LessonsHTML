package com.toadsdewin.mintic;
import java.util.Scanner;

public class doWileCycle
{
    public static void main (String args[])
    {
        boolean exit = false;
        double note1, note2, note3;
        int DNI=1;

        do
        {
            Scanner objeto = new Scanner(System.in);
            System.out.println("Please write your DNI: ");
            DNI = objeto.nextInt();
            if(DNI!=0)
            {
                System.out.println("Note 1: ");
                note1 = objeto.nextDouble();

                System.out.println("Note 2: ");
                note2 = objeto.nextDouble();

                System.out.println("Note 3: ");
                note3 = objeto.nextDouble();

                double result = (note1+note2+note3)/3;

                System.out.println("Your record is: "+result);
                exit= true;
            }
        }while(!exit);
    }

}
