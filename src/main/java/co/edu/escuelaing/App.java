package co.edu.escuelaing;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        get("/hello", (req, res) -> "Hello World");
    }
}
