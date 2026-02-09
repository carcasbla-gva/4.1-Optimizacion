import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjercicioA {
    public static void main(String[] args) {
        List<String> emails = new ArrayList<>();
        for (int i = 0; i < 50_000; i++) {
            emails.add("user" + i + "@mail.com");
        }

        String objetivo = "user40000@mail.com";

        // --- Antes: List.contains ---
        int aciertosLista = 0;
        long t1 = System.nanoTime();
        for (int i = 0; i < 20_000; i++) {
            if (emails.contains(objetivo)) {
                aciertosLista++;
            }
        }
        long t2 = System.nanoTime();

        // --- Después: HashSet.contains ---
        Set<String> indice = new HashSet<>(emails);

        int aciertosSet = 0;
        long t3 = System.nanoTime();
        for (int i = 0; i < 20_000; i++) {
            if (indice.contains(objetivo)) {
                aciertosSet++;
            }
        }
        long t4 = System.nanoTime();

        System.out.println("Aciertos lista: " + aciertosLista);
        System.out.println("List.contains: " + (t2 - t1) + " ns");

        System.out.println("Aciertos set: " + aciertosSet);
        System.out.println("HashSet.contains: " + (t4 - t3) + " ns");
    }
}
