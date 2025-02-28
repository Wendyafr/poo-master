public class Balon {
    private String material;
    private String color;
    private String tamanio;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    public void setTamaño(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", tamaño='" + tamanio + '\'' +
                '}';
    }
        public Balon() {
        }
        public Balon(String material, String color, String tamanio){
            this.material=material;
            this.color=color;
            this.tamanio=tamanio;
        }

        }


