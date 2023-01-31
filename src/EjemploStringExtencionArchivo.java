public class EjemploStringExtencionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna_imagen.png";

        //primera forma
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(13) = " + archivo.substring(13));

        //forma automatica mas flexible y practica
        int i = archivo.indexOf(".");
        System.out.println("archivo.substring() = " + archivo.substring(i));
    }
}
