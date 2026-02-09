public class EjercicioC {
    public static void main(String[] args) {

        int precio = 100;
        int unidades = 500_000;

        // --- Antes: cálculo repetido ---
        long t1 = System.nanoTime();
        int total = 0;
        for (int i = 0; i < unidades; i++) {
            int precioConIVA = (int) (precio * 1.21); // se recalcula cada vuelta
            total += precioConIVA;
        }
        long t2 = System.nanoTime();

        System.out.println("Total: " + total);
        System.out.println("Recalcular dentro: " + (t2 - t1) + " ns");

        // TODO: Después: mueve el cálculo fuera del bucle y vuelve a medir
    }
}