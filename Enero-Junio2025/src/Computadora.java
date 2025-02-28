public class Computadora {
    private String marca;
    private String color;
    private String procesador;

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", procesador='" + procesador + '\'' +
                '}';

    }
    public Computadora() {
    }
    public Computadora(String marca, String color, String procesador){
        this.marca=marca;
        this.color=color;
        this.procesador=procesador;
    }
}

