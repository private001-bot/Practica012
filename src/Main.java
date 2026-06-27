public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("====================================");
        System.out.println("BIENVENIDO A LA FABRICA DE LATOPS");
        System.out.println("====================================");
        System.out.println();

        Laptop gamer = FabricarLaptop.crearLaptop("gamer", "MAcbook air", 2017, "Silicon M1", 13);
        gamer.ejecutarPrueba();
        System.out.println();

        Laptop basica = FabricarLaptop.crearLaptop("basica", "Dell Latitude", 2020, "intel core i7", 14);
        basica.ejecutarPrueba();
        System.out.println();

        Laptop profesional = FabricarLaptop.crearLaptop("profesional", "Macbook Pro", 2022, "Apple Silicon M2", 16);
        profesional.ejecutarPrueba();
    }

}