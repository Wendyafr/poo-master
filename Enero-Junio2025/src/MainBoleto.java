public class MainBoleto {
    public static void main(String[] args) {
        Boleto b1 = new Boleto(345008,2500,"general");
        Boleto b2 = new Boleto(560010,5000,"VIP");
        Boleto b3 = new Boleto(279055,500,"Zona A");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}