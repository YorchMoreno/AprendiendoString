public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {
        String nombre = "Yorch Moreno";

        //toCharArray se usa para convertir un string en un arreglo de caracteres
        System.out.println("nombre.toCharArray() = " + nombre.toCharArray());

        char[] arreglo = nombre.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++) {
            System.out.println("arreglo[i] = " + arreglo[i]);
        }

        //split crea elementos con los caracteres que esten separados por el valor que se le asigne, en este caso por la letra o
        System.out.println("nombre.split(\"o\") = " + nombre.split("o"));
        String[] arreglo2 = nombre.split("o");
        int l = arreglo2.length;
        for (int i = 0; i < l; i++) {
            System.out.println("arreglo2 = " + arreglo2[i]);
        }
    }
}
