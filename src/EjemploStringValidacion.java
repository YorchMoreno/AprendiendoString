public class EjemploStringValidacion {
    public static void main(String[] args) {
        String curso = null;
        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);
        if (esNulo) {
            curso = " "; // "Programacion en Java";
        }

        boolean esVacio = curso.length() == 0; //length es la forma larga de validar un valor
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty(); //isEmpty es la forma corta de validar un valor
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank(); //isBlank es mas estricto ya que lee tambien si el valor dado a la variable es un espacio
        System.out.println("esBlanco = " + esBlanco);

        if (!esBlanco) {
            System.out.println(curso.toUpperCase());
            System.out.println("bienvenido al curso ".concat(curso));
        }
    }
}
