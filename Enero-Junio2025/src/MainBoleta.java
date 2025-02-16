public class MainBoleta {
    public static void main(String[] args){
        Boleta_Calificaciones C1=new Boleta_Calificaciones();
        C1.nombre="Wendy Anai Farfan Ramirez";
        C1.matricula=24020334;
        C1.c1=9.0;
        C1.c2=8.7;
        C1.c3=9.7;
        C1.c4=8.5;
        C1.c5=8.9;
        C1.c6=10;
        C1.c7=10;

        System.out.println(C1.obtenerDatos());
        System.out.println(C1.calcular_prom());

        Boleta_Calificaciones C2=new Boleta_Calificaciones();
        C2.nombre="Mariana Rojas Vicario";
        C2.matricula=24020267;
        C2.c1=8.5;
        C2.c2=8.7;
        C2.c3=10;
        C2.c4=10;
        C2.c5=8.9;
        C2.c6=9.5;
        C2.c7=10;


        System.out.println(C2.obtenerDatos());
        System.out.println(C2.calcular_prom());

        Boleta_Calificaciones C3=new Boleta_Calificaciones();
        C3.nombre="Cristel Ismerai Lara Garcia";
        C3.matricula=24020345;
        C3.c1=10;
        C3.c2=9.7;
        C3.c3=10;
        C3.c4=10;
        C3.c5=9.9;
        C3.c6=9.5;
        C3.c7=10;

        String res=C3.obtenerDatos();
        System.out.println(C3.obtenerDatos());
        System.out.println(C3.calcular_prom());
    }
}
