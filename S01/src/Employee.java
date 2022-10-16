public class Employee {
    
    private int dni;
    private String nombres;
    private String apellidos;
    private int sueldo_base;
    private int numero_hijos;

    public Employee (int dni, String nombres, String apellidos, int sueldo_base, int numero_hijos) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sueldo_base = sueldo_base;
        this.numero_hijos = numero_hijos;
    }

    public Employee() {
   
    };
    
    public void saludar() {
        System.out.println("¡Hola, " + nombres + " " +apellidos + "!");
    }

    public void sueldo() {
        double impuesto = (this.sueldo_base * 0.15);
        int bono = numero_hijos * 10;
        double sueldo_final = this.sueldo_base - impuesto + bono;
        
        System.out.println("Sueldo final: " + sueldo_final);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombre(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(int sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public int getNumero_hijos() {
        return numero_hijos;
    }

    public void setNumero_hijos(int numero_hijos) {
        this.numero_hijos = numero_hijos;
    }
}
