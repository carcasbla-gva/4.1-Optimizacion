public class EjercicioB {
    public static void main(String[] args) {
        // --- Antes: concatenación con + en bucle ---
        long t1 = System.nanoTime();
        String texto = "";
        for (int i = 0; i < 20_000; i++) {
            texto += "Línea " + i + "\n";
        }
        long t2 = System.nanoTime();
        System.out.println("Longitud texto: " + texto.length());
        System.out.println("Con +: " + (t2 - t1) + " ns");

        // TODO: Después: reescribe usando StringBuilder
        // Pista:
        // StringBuilder sb = new StringBuilder();
        // sb.append(...);
        // String resultado = sb.toString();
    }
}