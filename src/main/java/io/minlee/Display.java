package io.minlee;

import java.util.Scanner;

/**
 * Created by minlee on 5/4/16.
 */
public class Display {

    Scanner input = new Scanner(System.in);

    public int getInteger(String msg){
        printMsg(msg);
        int response = input.nextInt();
        input.nextLine();
        return response;
    }
    public String getName(String msg){
        printMsg(msg);
        return input.nextLine();
    }
    public String getType(String msg){
        printMsg(msg);
        return input.nextLine();
    }

    public void printMsg(String msg){
        System.out.println(msg);
    }

    public void printPetList(Pets[] pets, int numOfPets){
        for(int i = 0; i < numOfPets; i++){
            System.out.println(pets[i].getName() +" says "+pets[i].speak());
        }
    }
}
