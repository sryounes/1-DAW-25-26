package ac3;

public class MainEncapsulacion {
    public static void main(String[] args) {

        Impresora impresora = new Impresora(50, true);

        System.out.println("Nivel de tóner tras añadir: " +
                impresora.masToner(30));

        System.out.println("Nivel de tóner tras añadir demasiado: " +
                impresora.masToner(40));

        int impresas = impresora.imprimirPaginas(7);
        System.out.println("Páginas físicas impresas: " + impresas);

        System.out.println("Total de páginas impresas: " +
                impresora.getPaginasImpresas());
    }
}
