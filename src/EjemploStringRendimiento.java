public class EjemploStringRendimiento {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder br = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 500; i++){
            //c = c.concat(a).concat(b).concat("\n"); //51 milisegundos
            //c += a + b + "\n"; //110 milisegundos
            br.append(a).append(b).append("\n"); // 1 milisegundo
        }
        long fin = System.currentTimeMillis();
        System.out.println(fin-inicio);
        System.out.println("c = " + c);
        System.out.println("br = " + br);
    }
}
