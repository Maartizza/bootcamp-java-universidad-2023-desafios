package ar.com.educationit.universidad.desafioJava1;

public class Fecha {
	private int dia;
    private int mes;
    private int anio;

    
    public Fecha() {
    }

    
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    
    public void setDia(int d) {
        dia = d;
    }
    public void setMes(int m) {
        mes = m;
    }
    public void setanio(int a) {
        anio = a;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getanio() {
        return anio;
    }

    
    public boolean fechaCorrecta() {
        boolean diaCorrecto, mesCorrecto, anioCorrecto;
        anioCorrecto = anio >= 1900 && anio <= 2099;
        mesCorrecto = mes >= 1 && mes <= 12;
        switch (mes) {
            case 2:
                if (bisiesto()) {
                    diaCorrecto = dia >= 1 && dia <= 29;
                } else {
                    diaCorrecto = dia >= 1 && dia <= 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            default:
                diaCorrecto = dia >= 1 && dia <= 31;
        }
        return diaCorrecto && mesCorrecto && anioCorrecto;
    }

    private boolean bisiesto() {
        return (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0);
    }

    @Override
    public String toString() {
        StringBuilder ff = new StringBuilder();
        if (dia < 10) {
            ff.append("0");
        }
        ff.append(dia);
        ff.append("/");
        if (mes < 10) {
            ff.append("0");
        }
        ff.append(mes);
        ff.append("/");
        ff.append(anio);
        return ff.toString();
    }
} 


