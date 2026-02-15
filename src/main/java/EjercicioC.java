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
        long t3 = System.nanoTime();
        int totalOptimizado = 0;
        int precioConIVAFuera = (int) (precio * 1.21);

        for (int i = 0; i < unidades; i++) {
            totalOptimizado += precioConIVAFuera;
        }
        long t4 = System.nanoTime();

        System.out.println("Total: " + totalOptimizado);
        System.out.println("Recalcular fuera: " + (t4 - t3) + " ns");
    }
}