public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso1 = "Programación en Java";
        String tutor = "Udemy";
        System.out.println(curso1 + " " +tutor);

        String detalle1 = curso1 + tutor;
        System.out.println(detalle1);

        detalle1 = curso1.concat(" ").concat(tutor);
        System.out.println(detalle1);
    }
}
