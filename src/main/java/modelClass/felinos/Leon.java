package modelClass.felinos;

public class Leon extends Felino{

    private Integer numManada;
    private Float potenciaRugidoDecibel;

    public Leon(Integer numManada, Float potenciaRugidoDecibel) {
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, int tamanoGarras, Integer velocidad, Integer numManada, Float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public Integer getNumManada() {
        return numManada;
    }

    public void setNumManada(Integer numManada) {
        this.numManada = numManada;
    }

    public Float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    public void setPotenciaRugidoDecibel(Float potenciaRugidoDecibel) {
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "comen cebras, gacelas o jabalines";
    }

    @Override
    public String dormir() {
        return "duermen alrededor de 20 horas al día";
    }

    @Override
    public String correr() {
        return "Puede alcanzar grandes velocidades";
    }

    @Override
    public String comunicarse() {
        return "A través de rugidos";
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n:::::::::::::: BIOGRAFÍA DEL LEON ").append(this.nombreCientifico).append(" ").append("::::::::::::::");
        sb.append("\n El leon conocido con su nombre cientifico ").append(this.nombreCientifico);
        sb.append(" tiene una altura de ").append(this.altura);
        sb.append( " y un largo de ").append(this.largo).append(".");
        sb.append("\n Este animal tiene un peso aproximado de ").append(peso);
        sb.append(", sus garras tiene un tamaño de ").append(this.tamanoGarras).append(" ");
        sb.append(correr()).append(". Su velocidad maxima es de ").append(velocidad);
        sb.append("\n El habitat del guepardo es "). append(this.habitat);
        sb.append(" Ellos duermen ").append(dormir());
        sb.append("\n se comunican ").append(comunicarse()).append(" sus rugidos pueden alcanzar los ").append(this.potenciaRugidoDecibel).append("decibeles");
        sb.append(" se alimentan de ").append(comer());



        return sb.toString();
    }
}
