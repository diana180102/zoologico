package modelClass.caninos;

import modelClass.Mamifero;

abstract public class Canino extends Mamifero {
    protected String color;
    protected Float tamanoColmillo;

    public Canino() {
    }

    public Canino(String color, Float tamanoColmillo) {
        this.color = color;
        this.tamanoColmillo = tamanoColmillo;
    }

    public Canino(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, Float tamanoColmillo) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillo = tamanoColmillo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getTamanoColmillo() {
        return tamanoColmillo;
    }

    public void setTamanoColmillo(Float tamanoColmillo) {
        this.tamanoColmillo = tamanoColmillo;
    }
}
