package co.edu.escuelaing.service;

import com.google.gson.JsonObject;

public interface TempService {
    double CelsiusToFahrenheit(double value);
    double FahrenheitToCelsius(double value);
    JsonObject CtF(double value);
    JsonObject FtC(double value);
}
