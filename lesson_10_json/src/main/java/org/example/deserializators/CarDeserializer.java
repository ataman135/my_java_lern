package org.example.deserializators;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import org.example.Car;

import java.lang.reflect.Type;

public class CarDeserializer implements JsonDeserializer<Car> {
    @Override
    public Car deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
        Car carObject = new Car();
        String json = jsonElement.getAsString();
        String mark = json.substring(0, json.indexOf(" "));
        String model = json.substring(json.indexOf(" ") + 1);
        carObject.setMark(mark);
        carObject.setModel(model);
        return carObject;
    }
}
