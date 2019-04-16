package com.xd.xd_animalapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class AnimalActivity extends AppCompatActivity {

    private TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = (TextView)findViewById(R.id.output);

        Duck duck = new Duck();
        Fish fish = new Fish();
        Seal seal = new Seal();
        Fox fox = new Fox();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(duck);
        animals.add(fish);
        animals.add(seal);
        animals.add(fox);

        String[] words = {"\nDuck say ", "\nFish goes ", "\nSeal goes ", "\n"};

        for (Animal animal : animals) {

            if (animal instanceof Seal) {
                this.output.append("\n" + ((Seal)animal).play());
            }
            if (animal instanceof Fox) {
                this.output.append("\n" + ((Fox)animal).play());
            }
            this.output.append(words[animals.indexOf(animal)] + animal.say());
        }


    }
}
