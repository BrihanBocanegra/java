public class App {
    public static void main(String[] args) {
        
        Employee empleado1 = new Employee(72918138, "Raquel", "Vera Heredia", 3800, 2);
        Employee empleado2 = new Employee(72918137, "Cristian Tomas", "Bocanegra Vera", 1800, 0);
        Employee empleado3 = new Employee(72918136, "Alemndra Guisella", "Cornejo Quiñonez", 1600, 1);

        empleado1.saludar();
        empleado1.sueldo();
        System.out.println("--------------------------------------------");

        empleado2.saludar();
        empleado2.sueldo();
        System.out.println("--------------------------------------------");

        empleado3.saludar();
        empleado3.sueldo();
        System.out.println("--------------------------------------------");
    }

}