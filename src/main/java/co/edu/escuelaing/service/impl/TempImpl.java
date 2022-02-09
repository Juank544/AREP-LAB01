package co.edu.escuelaing.service.impl;

import co.edu.escuelaing.service.TempService;
import com.google.gson.JsonObject;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TempImpl implements TempService {
    @Override
    public double CelsiusToFahrenheit(double value) {
        double f = (value * 9/5) + 32;

        return new BigDecimal(f).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public double FahrenheitToCelsius(double value) {
        double c = (value - 32) * 5/9;

        return new BigDecimal(c).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public JsonObject CtF(double value) {
        JsonObject json = new JsonObject();

        double f = CelsiusToFahrenheit(value);

        json.addProperty("result", f);
        json.addProperty("units", "Fahrenheit");

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