package modelClass.felinos;

public class Tigre extends Felino {

    private String especieTigre;

    public Tigre(String especieTigre) {
        this.especieTigre = especieTigre;
    }

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, int tamanoGarras, Integer velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }


    public String getEspecieTigre() {
        return especieTigre;
    }

    public void setEspecieTigre(String especieTigre) {
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "come jabalís, ciervos, búfalos y jaguares";
    }

    @Override
    public String dormir() {
        return "duerme 16 horas aproximadamente";
    }

    @Override
    public String correr() {
        return "corren a a gran velocidad ";
    }

    @Override
    public String comunicarse() {
        return "con ronroneos, gruñidos, con señales olfativas, visuales y por medio de la orina y heces fecales";
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n:::::::::::::: BIOGRAFÍA DEL TIGRE").append(this.nombreCientifico).append(" ").append("ESPECIE ").append(this.especieTigre).append("::::::::::::::");
        sb.append("\ntiene una altura de ").append(this.altura);
        sb.append( " y un largo de ").append(this.largo).append(".");
        sb.append("\n Este animal tiene un peso aproximado de ").append(peso).append("kg");
        sb.append(", sus garras tiene un tamaño de ").append(this.tamanoGarras).append("cm ");
        sb.append(correr()).append(" tu velocidad maxima es de ").append(velocidad).append("km/h");
        sb.append("\n El habitat del tigre es "). append(this.habitat);
        sb.append(" Ellos duermen ").append(dormir());
        sb.append(" se comunican ").append(comunicarse());
        sb.append(" se alimentan de ").append(comer());


        return sb.toString();
    }

}
