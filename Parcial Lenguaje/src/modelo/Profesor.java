package modelo;

public class Profesor extends Persona {
    private String area;
    private double salarioBase;
    private int horasCatedra;

    public Profesor(String nombre, int edad, String documento, String area, double salarioBase, int horasCatedra) {
        super(nombre, edad, documento);
        this.area = area;
        this.salarioBase = salarioBase;
        this.horasCatedra = horasCatedra;
    }

    public double calcularSalario() {
        return salarioBase + (horasCatedra * 50.0);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Área: " + area);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Horas Cátedra: " + horasCatedra);
        System.out.println("Salario Total Calculado: " + calcularSalario());
        System.out.println("Rol: " + getRol());
    }

    @Override
    public String getRol() {
        return "Profesor";
    }
}