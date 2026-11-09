package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String caminhoPasta = "D:" + File.separator 
		                     + "ws-eclipse" + File.separator 
		                     + "Pastas" + File.separator 
		                     + "ConteudosTXT" + File.separator 
		                     + "usuario_atual.txt";

		File arquivoAnalise = new File(caminhoPasta);

		File pasta = arquivoAnalise.getParentFile(); 
		if (pasta != null && !pasta.exists()) {
		    pasta.mkdirs(); 
		    System.out.println("Pastas criadas automaticamente!");
		}
		
		try (FileWriter fw = new FileWriter(arquivoAnalise);			
		     BufferedWriter escritor = new BufferedWriter(fw)) {
			
			escritor.write("Nome: João Silva");
			escritor.newLine(); 
			
			escritor.write("Email: joao@email.com");
			escritor.newLine();
			
			escritor.write("Acesso: Administrador");
			escritor.newLine();

			System.out.println("Arquivo 'resultado.txt' criado e escrito com sucesso!");

		}
		catch (IOException erro) {
			System.out.println("Erro crítico na escrita do arquivo: " + erro.getMessage());
		}

	}

}
