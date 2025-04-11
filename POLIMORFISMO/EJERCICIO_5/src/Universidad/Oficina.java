package Universidad;

public class Oficina {
	private int nroSillas;
    private int nroEscritorios;
    private int nroEstanterias;

    public Oficina(int nroSillas, int nroEscritorios, int nroEstanterias) {
        this.nroSillas = nroSillas;
        this.nroEscritorios = nroEscritorios;
        this.nroEstanterias = nroEstanterias;
    }

    public void mostrar() {
        System.out.println("\n--- Oficina ---");
        System.out.println("Número de sillas: " + nroSillas);
        System.out.println("Número de escritorios: " + nroEscritorios);
        System.out.println("Número de estanterías: " + nroEstanterias);
    }

    public int cantidadMuebles() {
        return nroSillas + nroEscritorios + nroEstanterias;
    }

    public int cantidadMuebles(boolean incluirEstanterias) {
        if (incluirEstanterias) {
            return cantidadMuebles();
        } else {
            return nroSillas + nroEscritorios;
        }
    }
}
