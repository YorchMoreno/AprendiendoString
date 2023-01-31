public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Yorch Moreno";

        //length para ver el largo de la cadena o cuantos caracteres tiene
        System.out.println("nombre.length() = " + nombre.length());

        //toLowerCase se utiliza para colocar todos los caracteres en minuscula
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());

        //toUpperCase se utiliza para colocar todos los caracteres en mayuscula
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());

        //equals se utiliza para comparar de manera sensible
        System.out.println("nombre.equals(\"Yorch Moreno\") = " + nombre.equals("Yorch Moreno"));
        System.out.println("nombre.equals(\"yorch moreno\") = " + nombre.equals("yorch moreno"));

        //equalsIgnoreCase se utiliza para comparar sin tener en cuenta si es mayuscula o minuscula
        System.out.println("nombre.equalsIgnoreCase(\"yOrch MoReNo\") = " + nombre.equalsIgnoreCase("yOrch MoReNo"));

        //compareTo tambien es un metodo de comparacion pero tiene en cuenta el orden lexico unicode, es decir va a comparar letra por letra y si da cero es porque son iguales
        System.out.println("nombre.compareTo(\"Yorch Moreno\") = " + nombre.compareTo("Yorch Moreno"));
        System.out.println("nombre.compareTo(\"George Moreno\") = " + nombre.compareTo("George Moreno"));

        //charAt se utiliza para mostrar la letra de la posicion que se le de contando desde 0
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        //substring se utiliza para recibir parte de un string
        System.out.println("nombre.substring(4) = " + nombre.substring(4));
        System.out.println("nombre.substring(4) = " + nombre.substring(4, 7));
        System.out.println("nombre.substring(4) = " + nombre.substring(nombre.length()-1));

        //replace es para reemplazar caracteres por otros sin alterar la variable original
        System.out.println("nombre.replace(\"o\", \"i\") = " + nombre.replace("o", "i"));

        //indexOf permite saber si se encuentra algun caracter dentro del string y en que posicion esta el primer caracter
        System.out.println("nombre.indexOf(\"e\") = " + nombre.indexOf("e"));

        //lastIndexOf es igual que el indexOf solo que este muestra la posicion del ultimo caracter
        System.out.println("nombre.lastIndexOf(\"o\") = " + nombre.lastIndexOf("o"));

        //contains recibe secuencia de caracteres
        System.out.println("nombre.contains(\"s\") = " + nombre.contains("s"));

        //startWith para preguntar por que letra o palabra inicia el texto
        System.out.println("nombre.startsWith(\"moreno\") = " + nombre.startsWith("Moreno"));
        System.out.println("nombre.startsWith(\"yorch\") = " + nombre.startsWith("Yorch"));

        //endWith termina en
        System.out.println("nombre.endsWith(\"Yorch\") = " + nombre.endsWith("Yorch"));
        System.out.println("nombre.endsWith(\"Moreno\") = " + nombre.endsWith("Moreno"));

        //trim para quitar espacios en blanco
        System.out.println("  Yorch Moreno    ");
        System.out.println("  Yorch Moreno    ".trim());
    }
}
