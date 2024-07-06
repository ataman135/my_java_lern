package org.example.serializators;

import com.google.gson.*;
import org.example.Car;

import java.lang.reflect.Type;

public class CarSerialazer implements JsonSerializer<Car> {
    @Override
    public JsonElement serialize(Car car, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(
                car.getMark() + " " + car.getModel()
        );
    }
}
