package modelClass.caninos;

public class Perro extends Canino{

    private Integer fuerzaMordida;

    public Perro(Integer fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }

    public Perro(String color, Float tamanoColmillo, Integer fuerzaMordida) {
        super(color, tamanoColmillo);
        this.fuerzaMordida = fuerzaMordida;
    }

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, Float tamanoColmillo, Integer fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillo);
        this.fuerzaMordida = fuerzaMordida;
    }

    public Integer getFuerzaMordida() {
        return fuerzaMordida;
    }

    public void setFuerzaMordida(Integer fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "carne y pollo";
    }

    @Override
    public String dormir() {
        return "8 horas";
    }

    @Override
    public String correr() {
        return "dependiendo de la raza pueden ser rápidos o lentos al correr";
    }

    @Override
    public String comunicarse() {
        return "ladridos, olfato, lenguaje corporal y orina";
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n:::::::::::::: BIOGRAFÍA DEL LOBO ").append(this.nombreCientifico).append(" ::::::::::::::");
        sb.append("\nEl perro conocido con su nombre cientifico ").append(this.nombreCientifico);
        sb.append(" tiene una altura de ").append(this.altura).append("m");
        sb.append( " y un largo de ").append(this.largo).append("m .");
        sb.append("\n Este animal tiene un peso aproximado de ").append(peso).append("kg");
        sb.append(", se caracteriza por tener un color ").append(this.color).append(" ");
        sb.append("\n El tamaño de sus colmillos oscilan en ").append(this.tamanoColmillo).append(" cm");
        sb.append("su fuerza de mordida oscila en ").append(this.fuerzaMordida).append("PSI");
        sb.append("\n El habitat del lobo es "). append(this.habitat);
        sb.append(". Ellos duermen aproximadamente ").append(dormir());
        sb.append("\n se comunican mediante ").append(comunicarse());
        sb.append(" se alimentan de ").append(comer());



        return sb.toString();
    }
}



