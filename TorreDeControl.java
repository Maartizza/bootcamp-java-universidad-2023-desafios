package ar.com.educationit.universidad.desafio.Java3;

import java.util.List;

public class TorreDeControl {
    public void gestionarAterrizaje(List<Volador> voladores) {
        for (Volador volador : voladores) {
            if (volador instanceof CumpleContrato) {
                volador.aterrizar();
            } else {
                if (obtenerAutorizacion()) {
                    System.out.println("Aterrizaje autorizado en pista 2");
                    volador.aterrizar();
                } else {
                    System.out.println("No es posible aterrizar");
                }
            }
        }
    }

    private boolean obtenerAutorizacion() {
		return false;
        
    }
}

    



