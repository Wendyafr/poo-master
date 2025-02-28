public class Manzana {
    private String color;
    private String sabor;
    private String tamanio;
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Manzana{" +
                "color='" + color + '\'' +
                ", sabor='" + sabor + '\'' +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }
    public Manzana() {
    }
    public Manzana(String color, String sabor, String tamanio){
        this.color=color;
        this.sabor=sabor;
        this.tamanio=tamanio;
    }
}
