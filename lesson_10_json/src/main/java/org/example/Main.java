package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.deserializators.CarDeserializer;
import org.example.deserializators.HumanDeserializer;
import org.example.serializators.CarSerialazer;
import org.example.serializators.HumanSerialazer;

public class Main {
    public static void main(String[] args) {
        Car haval = new Car("Haval", "hatchback", 300);
        Human father = new Human("Валерий", "M", 44, haval);

        Car opel = new Car("Opel", "sedan", 240);
        Human sister = new Human("Кристина", "F", 27, opel);

        Car shevrole = new Car("shevrole", "sedan", 160);
        Human son = new Human("Владимир", "M", 19, shevrole);

        Family family = new Family();

        family.addHuman(father);
        family.addHuman(sister);
        family.addHuman(son);

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Car.class, new CarSerialazer())
                .registerTypeAdapter(Human.class, new HumanSerialazer())
                .registerTypeAdapter(Car.class, new CarDeserializer())
                .registerTypeAdapter(Human.class, new HumanDeserializer())
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(family);
        System.out.println(json);

        Family newFamily = gson.fromJson(json, Family.class);
        System.out.println(newFamily);


    }
}

/*
{
  "humans": [
    {
      "name": "Валерий",
      "gender": "M",
      "age": 44,
      "car": {
        "mark": "Haval",
        "model": "hatchback",
        "maxSpeed": 300
      }
    },
    {
      "name": "Кристина",
      "gender": "F",
      "age": 27,
      "car": {
        "mark": "Opel",
        "model": "sedan",
        "maxSpeed": 240
      }
    },
    {
      "name": "Владимир",
      "gender": "M",
      "age": 19,
      "car": {
        "mark": "shevrole",
        "model": "sedan",
        "maxSpeed": 160
      }
    }
  ]
}
Family(humans=[Human(name=Валерий, gender=M, age=44, car=Car(mark=Haval, model=hatchback, maxSpeed=300)), Human(name=Кристина, gender=F, age=27, car=Car(mark=Opel, model=sedan, maxSpeed=240)), Human(name=Владимир, gender=M, age=19, car=Car(mark=shevrole, model=sedan, maxSpeed=160))])

 */
