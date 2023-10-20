package ar.com.educationit.universidad.desafio.Java3;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<Volador> voladores = new ArrayList<>();
        voladores.add(new CumpleContrato());
        voladores.add(new NoCumpleContrato());
        voladores.add(new CumpleContrato());

        TorreDeControl torreDeControl = new TorreDeControl();
        torreDeControl.gestionarAterrizaje(voladores);
    }

		
}


