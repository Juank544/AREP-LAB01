package co.edu.escuelaing;

import co.edu.escuelaing.service.TempService;
import co.edu.escuelaing.service.impl.TempImpl;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    static TempService tempService = new TempImpl();

    public static void main( String[] args ){
        //staticFileLocation("/public");
        port(getPort());

        // Allow CORS
        after(((request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
            response.header("Access-Control-Allow-Methods", "GET");
        }));

        path("/api/v1", () -> {
            get("/CtF", (req, res) ->{
                res.type("application/json");
                String value = req.queryParams("value");

                return tempService.CelsiusToFahrenheit(Double.parseDouble(value));
            });
            get("/FtC", (req, res) ->{
                res.type("application/json");
                String value = req.queryParams("value");

                return tempService.FahrenheitToCelsius(Double.parseDouble(value));
            });
        });

        get("/hello", (req, res) -> "Hello World");
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set(i.e. on localhost)
    }
}
