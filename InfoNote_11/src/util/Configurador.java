package util;

import java.io.FileInputStream;
import java.util.Properties;

public class Configurador {
	
	private String idioma;
	private String regiao;
	private String arquivoAjuda;
	
	
	public Configurador() throws Exception{
		
		//Abre o arquivo de propriedades
		
		FileInputStream arq = new FileInputStream("config.ini");
		
		//Cria um objeto para armazenar as propriedades
		
		Properties prop = new Properties();
		
		//Carrega o conte�do do arquivo de propriedades
		
		prop.load(arq);
		
		//Fecha o arquivo de propriedades
		
		arq.close();
		
		//Carrega as respectivas propriedades de cada atributo
		
		idioma = prop.getProperty("idioma");
		regiao = prop.getProperty("regiao");
		arquivoAjuda = prop.getProperty("ajuda");
		
	}


	public String getIdioma() {
		return idioma;
	}


	public String getRegiao() {
		return regiao;
	}


	public String getArquivoAjuda() {
		return arquivoAjuda;
	}

	
	
}
