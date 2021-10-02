
package ClasesYGui;

import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante {
    /*
        La clase debe contener los métodos get y set que permitan el ajuste de los
        atributos. Además, la clase debe contener un método que permita adicionar un
        grupo de notas por semestre y debería tener un método que permita llenar un
        vector con las notas del semestre actual.
    */
    private String nombres;
    private String apellidos;
    private int edad;
    private String fechaNacimiento;
    private String direcciónResidencia;
    private String programaAcademico;
    private String cedula;
    private ArrayList<Integer> notas;
    private ArrayList<ArrayList<Integer>> semestre;
    
    public Estudiante(){
        
    }

    public Estudiante(String nombres, String apellidos, int edad, String fechaNacimiento, String direcciónResidencia, String programaAcademico, String cedula) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.direcciónResidencia = direcciónResidencia;
        this.programaAcademico = programaAcademico;
        this.cedula = cedula;
    }
    

    public Estudiante(String nombres, String apellidos, int edad, String fechaNacimiento, String direcciónResidencia, String programaAcademico, String cedula, ArrayList<Integer> notas, ArrayList<ArrayList<Integer>> semestre) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.direcciónResidencia = direcciónResidencia;
        this.programaAcademico = programaAcademico;
        this.cedula = cedula;
        this.notas = notas;
        this.semestre = semestre;
    }
    //toString()

    @Override
    public String toString() {
        return "Estudiante{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", direcci\u00f3nResidencia=" + direcciónResidencia + ", programaAcademico=" + programaAcademico + ", cedula=" + cedula + ", notas=" + notas + ", semestre=" + semestre + '}';
    }
    
    
    //adicionar un grupo de notas por semestre
    public void agregarNotas(ArrayList<Integer> notas){
        this.semestre.add(notas);
    }
    //agregar notas del semestre actual
    public void agregarNotasSemestreActual(int cantNotas){
            Scanner input = new Scanner(System.in);
            for(int i=0; i < cantNotas; i++){
            System.out.print("Ingrese la nota: " + (i+1));
            this.notas.add(input.nextInt());
        }
    }
    
    
    //getters and setters

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDirecciónResidencia() {
        return direcciónResidencia;
    }

    public void setDirecciónResidencia(String direcciónResidencia) {
        this.direcciónResidencia = direcciónResidencia;
    }

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public ArrayList<ArrayList<Integer>> getSemestre() {
        return semestre;
    }

    public void setSemestre(ArrayList<ArrayList<Integer>> semestre) {
        this.semestre = semestre;
    }
    
    
}
