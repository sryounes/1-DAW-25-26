package ac3;

public class Impresora {

    private int nivelToner;
    private int paginasImpresas;
    private boolean dobleCara;

    public Impresora (int nivelToner, boolean dobleCara){
        if (nivelToner < 0 || nivelToner > 100) {
            this.nivelToner = 0;
        } else {
            this.nivelToner = nivelToner;
        }
        this.dobleCara = dobleCara;
        this.paginasImpresas = 0;
    }

    public int masToner(int cantidad) {
        if (cantidad < 0 || cantidad > 100) {
            return -1;
        }

        if (this.nivelToner + cantidad > 100) {
            return -1;
        }

        this.nivelToner += cantidad;
        return this.nivelToner;
    }
    public int imprimirPaginas(int paginas) {
        if (paginas <= 0) {
            return 0;
        }

        int paginasAImprimir;

        if (dobleCara) {
            paginasAImprimir = (paginas / 2) + (paginas % 2);
        } else {
            paginasAImprimir = paginas;
        }

        this.paginasImpresas += paginasAImprimir;
        return paginasAImprimir;
    }
    public int getPaginasImpresas() {
        return paginasImpresas;
    }
}
