package modelClass.caninos;

public class Lobo extends Canino{

    private Integer numCamada;
    private String especieLobo;

    public Lobo(Integer numCamada, String especieLobo) {
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, Float tamanoColmillo, Integer numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillo);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public Integer getNumCamada() {
        return numCamada;
    }

    public void setNumCamada(Integer numCamada) {
        this.numCamada = numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "venados, borregos, antílopes, liebres y roedores";
    }

    @Override
    public String dormir() {
        return "duerme entre 4 a 10 horas";
    }

    @Override
    public String correr() {
        return "Son medianamente veloces";
    }

    @Override
    public String comunicarse() {
        return "aullidos, lenguaje del cuerpo y aroma";
    }

    @Override
    public String imprimir() {

        StringBuilder sb = new StringBuilder();

        sb.append("\n:::::::::::::: BIOGRAFÍA DEL LOBO ").append(this.nombreCientifico).append(" ").append(" ESPECIE ").append(this.especieLobo).append(" ::::::::::::::");
        sb.append("\nEl lobo conocido con su nombre cientifico ").append(this.nombreCientifico);
        sb.append(" tiene una altura de ").append(this.altura).append("m");
        sb.append( " y un largo de ").append(this.largo).append(".").append("cm");
        sb.append("\n Este animal tiene un peso aproximado de ").append(peso).append("kg");
        sb.append(", se caracteriza por tener un color ").append(this.color).append(" ");
        sb.append("\n El tamaño de sus colmillos oscilan en ").append(this.tamanoColmillo).append(" cm");
        sb.append("\n El habitat del lobo es "). append(this.habitat);
        sb.append("viven en camadas de ").append(this.numCamada).append(" entre 1 hembra y varios machos de lobos");
        sb.append(" Ellos duermen ").append(dormir());
        sb.append("\n se comunican mediante ").append(comunicarse());
        sb.append(" se alimentan de ").append(comer());



        return sb.toString();
    }
}
