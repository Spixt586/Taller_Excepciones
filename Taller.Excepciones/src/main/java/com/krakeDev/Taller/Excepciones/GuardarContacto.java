package com.krakeDev.Taller.Excepciones;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GuardarContacto {
	
	private static final Logger log = LogManager.getLogger(GuardarContacto.class);
	
	public static void guardar(String telefono){
		
		FileWriter escritor = null;//Escribir el archivo
		
		try {
			escritor = new FileWriter("contactos.txt");
			escritor.write("Nombre: Maria\n");
			escritor.write("Apellido: Gomez\n");
			escritor.write("Telefono: 0981234567\n");
			
			log.info("Se guardó exitosamente");
		}catch(IOException e ) {
			log.error("Ocurrió un error: ", e );
		}finally {
			try {
				if(escritor != null) {
			escritor.close();
			log.info("Se cerro el escritorio exitosamente");
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
