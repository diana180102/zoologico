package modelClass.felinos;

public class Guepardo extends Felino {


    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, int tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "gacelas e imapalas";
    }

    @Override
    public String dormir() {
        return "entre 15 y 16 horas";
    }

    @Override
    public String correr() {
        return "corren a gran velocidad  ";
    }

    @Override
    public String comunicarse() {
        return "a través del olor, sonido y la postura del cuerpo";
    }


    @Override
    public String imprimir() {

        StringBuilder sb = new StringBuilder();

        sb.append("\n:::::::::::::: BIOGRAFÍA DEL GUEPARDO ").append(this.nombreCientifico).append(" ").append("::::::::::::::");
        sb.append("\nEl guepardo conocido con su nombre cientifico ").append(this.nombreCientifico);
        sb.append(" tiene una altura de ").append(this.altura).append("m");
        sb.append( " y un largo de ").append(this.largo).append("cm .");
        sb.append("\n Este animal tiene un peso aproximado de ").append(peso);
        sb.append(", sus garras tiene un tamaño de ").append(this.tamanoGarras).append(" ");
        sb.append(correr()).append(" tu velocidad maxima es de ").append(velocidad).append("km/h");
        sb.append("\n El habitat del guepardo es "). append(this.habitat);
        sb.append(" Ellos duermen ").append(dormir());
        sb.append(" se comunican ").append(comunicarse());
        sb.append(" se alimentan de ").append(comer());



        return sb.toString();


    }
}
