public class FabricarLaptop {
    public static Laptop crearLaptop(String tipo, String marcaModelo, int yeardFabricacion, String procesador, int sizePantalla) {
        switch (tipo.toLowerCase()) {
             case "gamer":
                 return new LaptopGamer(marcaModelo, yeardFabricacion, procesador, sizePantalla);
             case "basica":
                 return new LaptopBasica(marcaModelo, yeardFabricacion, procesador, sizePantalla);
            case "profesional":
                return new LaptopProfesional(marcaModelo, yeardFabricacion, procesador, sizePantalla);
            default:
                throw new IllegalArgumentException("Tipo de laptop no especificado");
        }
    }
}
