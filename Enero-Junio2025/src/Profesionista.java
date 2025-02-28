public class Profesionista {
    private String profesion;
    private int anios_de_profesion;

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAnios_de_profesion() {
        return anios_de_profesion;
    }

    public void setAnios_de_profesion(int anios_de_profesion) {
        this.anios_de_profesion = anios_de_profesion;
    }

    @Override
    public String toString() {
        return "Profesionista{" +
                "profesion='" + profesion + '\'' +
                ", años_de_profesion='" + anios_de_profesion + '\'' +
                '}';
    }
    public Profesionista() {
    }
    public Profesionista(String profesion, int anios_de_profesion) {
        this.profesion = profesion;
        this.anios_de_profesion = anios_de_profesion;

    }
}
