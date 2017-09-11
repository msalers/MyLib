package my.lib;

/**
 * Metodi per ricerca, controllo inserimento, scrittura e lettura di file
 * @author maria
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Controllo {

	public Controllo(){}
	
	public boolean controllaInserimento(Object oggetto, ArrayList<Object> elenco){
		
		boolean boole=false;
		
		if(oggetto==null){
			boole=true;
		}
		
		for(int i=0; i<elenco.size(); i++){
			if(oggetto.equals(elenco.get(i))){
				boole=true;
			}
		}
		
		return boole;
		
	}
	
	public static boolean controllaInserimento(String oggetto, ArrayList<String> elenco){
		
		boolean boole=false;
		
		if(oggetto==null){
			boole=true;
		}
		
		for(int i=0; i<elenco.size(); i++){
			if(oggetto.equals(elenco.get(i))){
				boole=true;
			}
		}
		
		return boole;
		
	}
	
	public Object ricercaDaTitolo(String titolo,  ArrayList<String> elenco){
		
		Object ricercato=null;
		
		for(int i=0; i<elenco.size(); i++){
			if(titolo.equalsIgnoreCase(elenco.get(i))){
			
				ricercato = elenco.get(i);
			}
		}
		
		return ricercato;
	}
	
	public void scelta(Object oggetto){
			
			int scelta;
			
			do{
				scelta=InputDati.leggiIntero(".." , 1,5);
				
				switch(scelta){
				
				case 1:{
					break;
				}
				
				case 2:{
					break;
				}
				
				case 3:{
					break;
				}
				
				case 4:{
					break;
				}
				
				case 5:{
					break;
				}
				}
			}while(scelta!=5);
			
	}

	
	public static int[] getArray(int size){
		
		int[] array = new int[size];
		
		Random casuale = new Random();
		
		array[0]= casuale.nextInt(size);
		boolean presenza = false;
		
		for(int i=1; i<size; i++){
		do{
			
			array[i]= casuale.nextInt(size);
			presenza =controllo(array[i], array, i);
			
		}while (presenza!=false);
		
		}
		
		return array;

	}
	
		
		
	
	public static boolean controllo(int elemento, int[]array, int size){
		
		boolean controllo = false;
		
		for(int i=0; i<size; i++){
			if(elemento==array[i]){
				controllo=true;
			}
		}
		
		return controllo;
		
	}
	
	/*public ArrayList<Libro> ricercaDaAutore(String autore){
		
		ArrayList<Libro> elencocercato= new ArrayList<>();
		Libro aggiunta=null;
		
		for(int i=0; i<elenco_libri.size(); i++){
			if(autore.equalsIgnoreCase(elenco_libri.get(i).getAutore())){
				
				aggiunta=elenco_libri.get(i);
				elencocercato.add(aggiunta);
			}
			else {
				String[] autorString = elenco_libri.get(i).getAutore().split(" ");
				int size = autorString.length;
				
				for(int n=0; n<size; n++){
					if(autore.equalsIgnoreCase(autorString[n])){
						aggiunta=elenco_libri.get(i);
						elencocercato.add(aggiunta);
					}
				}
			}
		}
		
		
		return elencocercato;
		
	}*/

	/*
	 public void leggiFile(File in , ElencoFilm elenco) throws FileNotFoundException{
		
		Scanner input = new Scanner(in);
		input.useDelimiter("\n"); 
		int size =input.nextInt();
		
		for(int i=0; i<size; i++){
			
			String titolo = input.next();
			String genere = input.next();
			int dh = input.nextInt();
			int dm = input.nextInt();
			int anno =input.nextInt();
			
			ArrayList<String> cast = new ArrayList<>();
			
			int N_cas = input.nextInt();
			for(int n=0; n<N_cas; n++){
				String attore = input.next();
				cast.add(attore);
			}
			
			String trama = input.next();
			double val = input.nextDouble();
			
			Film nuovo = new Film(titolo, genere, dh, dm, anno, cast, trama, val);
			
			elenco.addFilmTxt(nuovo);
			
			
		}
		
		input.close();
	}
	
	public void scriviFile(ElencoFilm elenco, String nome) throws FileNotFoundException{
		
		PrintWriter output = new PrintWriter(nome);
		
		ArrayList<Film> elencoFilm = elenco.getElencofilm();
		
		output.println(elencoFilm.size());
		
		for(int i=0; i<elencoFilm.size(); i++){
			
			output.println(elencoFilm.get(i).getTitolo());
			output.println(elencoFilm.get(i).getGenere());
			output.println(elencoFilm.get(i).getDh());
			output.println(elencoFilm.get(i).getDm());
			output.println(elencoFilm.get(i).getAnno());
			
			int cast = elencoFilm.get(i).getCast().size();
			
			output.println(cast);
			
			for(int n=0; n<cast; n++){
				output.println(elencoFilm.get(i).getCast().get(n));
			}
			
			output.println(elencoFilm.get(i).getTrama());
			output.println(elencoFilm.get(i).getValutazione());
		}
		
		output.close();
		
		
	}
	
	
	
		int scelta;
		 String nome = "Cinema";
		
			        File file = new File(nome);
			         
			        if (file.exists()){
			            System.out.println("Il file " +nome + " esiste.");
			            try {
							leggiFile(file, elenco);
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						}
			            
			            
			        } else
						try {
							if (file.createNewFile()){
							    System.out.println("Il file " + nome + " è stato creato.");   
							}
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
			        
	 */
}
