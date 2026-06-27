public abstract class Laptop implements ILaptop{
    protected String marcaModelo;
    protected int yeardFabricacion;
    protected String procesador;
    protected int sizePantalla;


    public Laptop(String marcaModelo, int yeardFabricacion, String procesador, int sizePantalla) {
        this.marcaModelo = marcaModelo;
        this.yeardFabricacion = yeardFabricacion;
        this.procesador = procesador;
        this.sizePantalla = sizePantalla;
    }
}
