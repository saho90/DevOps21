/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package DevOpsTest;

import spark.Spark;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        Spark.get("/users/:id/welcome", (req, res) -> {return"Hallo " + req.params("id") + ", wie kann ich behilflich sein?";});
        Spark.get("/users/:id/math",(req,res)->{
            return"Och hör doch uf mit Mathe, Nummer " + req.params("id") + ". Dänk and Pipi: 2 x 3 macht 4, Widdewiddewitt und Drei macht Neune" +
            " !! Ich mach' mir die Welt, Widdewidde wie sie mir gefällt.";});
}}