public class Boleta_Calificaciones {
    String nombre;
    String materia;
    int matricula;
    double c1;
    double c2;
    double c3;
    double c4;
    double c5;
    double c6;
    double c7;

    double calcular_prom() {return (c1 + c2 + c3 + c4 + c5 + c6 + c7) / 7;}

        String obtenerDatos () {
            String cad = "";
            cad = cad + "Nombre:" + nombre + "  ";
            cad = cad + "Matricula:" + matricula + "  ";
            cad = cad + "Calificacion de Calculo:" + c1 + "  ";
            cad = cad + "Calificacion de Matematicas:" + c2 + "  ";
            cad = cad + "Calificacion de Administracion:" + c3 + "  ";
            cad = cad + "Calificacion de Programacion:" + c4 + "  ";
            cad = cad + "Calificacion de Investigacion:" + c5 + "  ";
            cad = cad + "Calificacion de Etica:" + c6 + "  ";
            cad = cad + "Calificacion de Tutoria:" + c7 + "  ";
            return cad;


        }
    }

