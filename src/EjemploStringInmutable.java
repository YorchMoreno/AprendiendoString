public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso1 = "Programación en Java";
        String tutor = "Udemy";
        System.out.println(curso1 + " " +tutor);

        String detalle1 = curso1 + tutor;
        System.out.println(detalle1);

        detalle1 = curso1.concat(" ").concat(tutor);
        System.out.println("curso1 = " + curso1);
        System.out.println("tutor = " + tutor);
        System.out.println(curso1 == tutor);

        String detalle2 = curso1.transform(c -> {
            return c + " con " + tutor;
        });

        System.out.println("detalle2 = " + detalle2);

        String detalle3 = detalle1.replace("a", "A");
        System.out.println("detalle3 = " + detalle3);
    }
}
