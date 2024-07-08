package org.example.deserializators;

import com.google.gson.*;
import org.example.Car;
import org.example.Human;

import java.lang.reflect.Type;

public class HumanDeserializer implements JsonDeserializer<Human> {
    @Override
    public Human deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        Human humanObject = new Human();

        humanObject.setName(jsonObject.get("name").getAsString());
        humanObject.setAge(jsonObject.get("age").getAsInt());
        humanObject.setCar(context.deserialize(jsonObject.get("car"), Car.class));

        return humanObject;
    }
}
