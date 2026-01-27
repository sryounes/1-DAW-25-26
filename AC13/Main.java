package AC13;

public class Main {
    public static void main(String[] args) {

        Circulo c = new Circulo(3.5);
        System.out.println(c.getRadio());
        System.out.println(c.getArea());

        Cilindro cil = new Cilindro(5, 10);
        System.out.println(cil.getRadio());
        System.out.println(cil.getAltura());
        System.out.println(cil.getArea());
        System.out.println(cil.getVolume());
    }
}

