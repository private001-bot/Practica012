public class LaptopGamer extends Laptop {
    public LaptopGamer(String marcaModelo, int yeardFabricacion, String procesador, int sizePantalla) {
        super(marcaModelo, yeardFabricacion, procesador, sizePantalla);
    }

    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop para Gamer");
        System.out.println("Laptop para Gamer");
        System.out.println("Marca y Modelo: " + this.marcaModelo);
        System.out.println("Año de Fabricacion: " + this.yeardFabricacion);
        System.out.println("Procesador: " + this.procesador);
        System.out.println("Tamaño de la Pantalla: " + this.sizePantalla);
    }
}
