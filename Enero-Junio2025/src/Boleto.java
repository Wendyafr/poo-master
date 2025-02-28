public class Boleto {
    private int numero_de_boleto;
    private int precio;
    private String tipo;

    public int getNumero_de_boleto() {
        return numero_de_boleto;
    }

    public void setNumero_de_boleto(int numero_de_boleto) {
        this.numero_de_boleto = numero_de_boleto;
    }

    public int isPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "numero_de_boleto=" + numero_de_boleto +
                ", precio=" + precio +
                ", tipo='" + tipo + '\'' +
                '}';
    }

     public Boleto() {
}
     public Boleto(int numero_de_boleto, int precio, String tipo){
     this.numero_de_boleto=numero_de_boleto;
     this.precio=precio;
     this.tipo=tipo;
    }
}
