package com.krakeDev.Taller.Excepciones;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

	private static final Logger log = LogManager.getLogger(Test.class);

	public static void main(String[] args) {

		try {

			String telefono = "098123457";
			ValidarContacto.validarTelefono(telefono);

			GuardarContacto.guardar(telefono);
			LeerContacto.leer();
			
			log.info("Se guardó el teléfono de forma exitosa");
		} catch (IllegalArgumentException e) {
			log.error("Ocurrió un error: " + e);
		}

	}

}
