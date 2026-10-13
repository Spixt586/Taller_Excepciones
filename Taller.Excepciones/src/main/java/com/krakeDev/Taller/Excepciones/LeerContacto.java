package com.krakeDev.Taller.Excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LeerContacto {
	private static final Logger log = LogManager.getLogger(LeerContacto.class);
	
	public static void leer() {
		
		FileReader lectorArchivo = null;
		BufferedReader lector = null;
		
		try {
			lectorArchivo = new FileReader("contactos.txt");
			lector = new BufferedReader(lectorArchivo);
			
			for(int i = 0; i < 6; i++) {
				System.out.println(lector.readLine());
			}
			
			System.out.println(lector.readLine());
			log.info("Se guardó exitosamente");
		}catch(FileNotFoundException e) {
			log.error("Ocurrió un error al buscar el archivo: " + e);
		}catch(IOException e){
			log.error("Ocurrio un error al encontrar el archivo: " + e);
		}finally {
			try {
				lectorArchivo.close();
				lector.close();
				log.info("Se cerro exitosamente");
				
				if(lectorArchivo != null) {
					lectorArchivo.close();
				}
				if(lector != null) {
					lector.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
