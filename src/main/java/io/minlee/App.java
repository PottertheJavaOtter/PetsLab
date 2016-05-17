package io.minlee;

/**
 * Created by minlee on 5/4/16.
 */
public class App {

    public void engine(){

        Display display = new Display();
        int numberOfPets = display.getInteger("How many pets do you have?:");
        Pets pets[] = new Pets[numberOfPets];
        for(int i = 0; i < numberOfPets; i++){
            String petName;
            petName = display.getName("Enter the pet's name:");

            String petType = display.getType("Enter the pet's type (Dog, Cat, Snake, Mouse):");

            switch (petType.toLowerCase()){
                case "dog":
                    pets[i] = new Dog(petName);
                    break;
                case "cat":
                    pets[i] = new Cat(petName);
                    break;
                case "mouse":
                    pets[i] = new Mouse(petName);
                    break;
                case "snake":
                    pets[i] = new Snake(petName);
                    break;
            }

        }
        display.printPetList(pets, numberOfPets);
    }
    public static void main(String[] args) {
        App userApp = new App();
        userApp.engine();
    }
}

