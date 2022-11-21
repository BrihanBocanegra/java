public class Employee {
    private int horas;
    private int costo;
    
    public Employee (int horas, int costo) {
        this.horas = horas;
        this.costo = costo;
    }

    public double sueldoFinal() {
        return this.horas * this.costo;
    }

    public int getHoras() {
        return horas;
    }

    public int getCosto() {
        return costo;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
}
