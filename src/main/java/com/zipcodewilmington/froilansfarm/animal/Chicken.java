package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.animal.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.animal.interfaces.Produce;
import com.zipcodewilmington.froilansfarm.edible.Edible;
import com.zipcodewilmington.froilansfarm.edible.EdibleEgg;

public class Chicken implements Animal, Produce {
    private boolean hasBeenFertilized;

    public void eat(Edible food) {

    }

    public void makeNoise() {

    }

    public Edible yield() {
        if(!hasBeenFertilized)
            return new EdibleEgg();
        return null;
    }
}
