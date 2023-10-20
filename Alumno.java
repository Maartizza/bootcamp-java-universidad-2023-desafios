package ar.com.educationit.universidad.desafio.Java2;

public class Alumno {
	private String nombre;
    private String apellido;
    private int numeroExamen;
    private double nota;
    private double notas;
    
    public Alumno(String nombre, String apellido, int numeroExamen,
    		double nota, double notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroExamen = numeroExamen;
        this.nota = nota;
        this.notas = notas;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumeroExamen() {
        return numeroExamen;
    }

    public double getNota() {
        return nota;
    }
    public double getNotas() {
        return notas;
    }
    
    public double getPromedio() {
        return nota / numeroExamen;
    }
    
    

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroExamen=" + numeroExamen +
                ", nota=" + nota +
                ", notas=" + notas +
                ", promedio=" + getPromedio() +
                '}';
    }
}



