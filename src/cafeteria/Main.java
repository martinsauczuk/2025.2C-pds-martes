package cafeteria;

public class Main {

    public static void main(String[] args) {
//        Cafe unCafe = new Cafe(); es abstracta no se puede instanciar
        CafeParaLocal unCafe = new CafeParaLocal();
        System.out.println(unCafe);
        unCafe.preparar();
        System.out.println(unCafe);

        CafeParaLlevar cafe2 = new CafeParaLlevar();
        System.out.println(cafe2);
        cafe2.preparar();
        System.out.println(cafe2);
    }

}
