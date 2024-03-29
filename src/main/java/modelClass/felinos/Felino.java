package modelClass.felinos;

import modelClass.Mamifero;

abstract public class Felino extends Mamifero {

    protected  int tamanoGarras;
    protected  Integer velocidad;

    public Felino() {}

    public Felino(int tamanoGarras, Integer velocidad) {
        this();
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico, int tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public int getTamanoGarras() {
        return tamanoGarras;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setTamanoGarras(int tamanoGarras) {
        this.tamanoGarras = tamanoGarras;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

}


