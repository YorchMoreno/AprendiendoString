import java.util.Scanner;

public class EjemploString {
    public static void main(String[] args) {
        String curso1 = "Programación en Java";
        String curso2 = new String("Programación en Java");

        //comparación con == y equals
        boolean esIgual = curso1 == curso2; //compara todo lo que este asignado a esa variable
        System.out.println("curso1 == curso2: = " + esIgual);

        esIgual = curso1.equals(curso2); //compara solo el valor dentro de las comillas de esa variable
        System.out.println("curso1.equals(curso2): = " + esIgual);

        String curso3 = "programación en java";
        esIgual = curso2.equalsIgnoreCase(curso3); //equalsIgnoreCase va a a comparar el texto generalizado, es decir, no va a tener en cuenta si esta en mayuscula o en minuscula
        System.out.println("curso2.equalsIgnoreCase(curso3): = " + esIgual);

        String curso4 = "Programación en Java";
        esIgual = curso1 == curso4; //El == casi no se usa pero cuando son cadenas indirectas iguales nos puede servir
        System.out.println("curso1 == curso4: = " + esIgual);
    }
}
