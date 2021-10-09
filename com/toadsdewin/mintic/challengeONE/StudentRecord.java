package com.toadsdewin.challengeONE;
import java.util.Scanner;

public class StudentRecord
{
        static Scanner objeto = new Scanner(System.in);
        static int array[ ],suma =0;
        static double average;

        static int quantityRead(int data)
        {
            array= new int[data];
            for(int i=0; i<data;i++)
            {
                System.out.print("Position #"+i+": ");
                array[i] = objeto.nextInt();
            }
            return data;
        }

        static void resultSum(int data)
        {
            for(int j=0; j<data; j++)
            {
                suma+=array[j];
                //System.out.println("Position #"+j+": "+array[j]);
            }
            System.out.println("Result: "+suma);
        }


        public static void main (String args[])
        {
            Integer dataOne,DNI;
            boolean flag;
            System.out.print("Please write your DNI: ");
            DNI = objeto.nextInt();

            do
            {
                if(DNI!=0)
                {
                    System.out.print("Please write the amount of data: ");
                    dataOne = objeto.nextInt();

                    System.out.println("Reading the amount of vectors: ");
                    quantityRead(dataOne);

                    System.out.println("DNI: "+DNI);
                    resultSum(dataOne);
                    flag = false;
                }
                else
                {
                    flag = true;
                    System.out.println("End of the program!");
                }
            }while(!flag);



        }
}
