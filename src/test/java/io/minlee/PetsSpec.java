package io.minlee;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by minlee on 5/4/16.
 */
public class PetsSpec {

    Pets pet;

    @Before
    public void initialize(){

    }
    @Test
    public void DogSpec(){
        String expectedSpeak = "Woof";
        pet = new Dog("Fido");
        String actualSpeak = pet.speak();
        Assert.assertEquals(expectedSpeak,actualSpeak);
        expectedSpeak = "Meow";
        pet = new Cat("Meowingtons");
        actualSpeak = pet.speak();
        Assert.assertEquals(expectedSpeak,actualSpeak);
        expectedSpeak = "SSSSSssssss";
        pet = new Snake("Fido");
        actualSpeak = pet.speak();
        Assert.assertEquals(expectedSpeak,actualSpeak);
        expectedSpeak = "Squeak";
        pet = new Mouse("Fido");
        actualSpeak = pet.speak();
        Assert.assertEquals(expectedSpeak,actualSpeak);
    }



}
