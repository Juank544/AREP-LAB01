package co.edu.escuelaing.service.impl;

import co.edu.escuelaing.service.TempService;
import com.google.gson.JsonObject;

public class TempImpl implements TempService {
    @Override
    public double CelsiusToFahrenheit(double value) {
        return (value * 9/5) + 32;
    }

    @Override
    public double FahrenheitToCelsius(double value) {
        return (value - 32) * 5/9;
    }

    @Override
    public JsonObject CtF(double value) {
        JsonObject json = new JsonObject();

        double f = CelsiusToFahrenheit(value);

        json.addProperty("result", f);
        json.addProperty("units", "FaFahrenheit");

        return json;
    }

    @Override
    public JsonObject FtC(double value) {
        JsonObject json = new JsonObject();

        double c = FahrenheitToCelsius(value);

        json.addProperty("result", c);
        json.addProperty("units", "Celsius");

        return json;
    }
}