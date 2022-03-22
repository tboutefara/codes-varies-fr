import java.util.Scanner;
import java.util.Random;

public class Jeu {
	
	public static void main(String[] args) {
		
		String[] dictionnaire = new String[]{"angle", "armoire", "banc", "bureau", "cabinet", 
				"carreau", "chaise", "classe", "clé", "coin", "couloir", 
				"dossier", "eau", "école", "écriture", "entrée", "escalier", 
				"étagère", "étude", "extérieur", "fenêtre", "intérieur", 
				"lavabo", "lecture", "lit", "marche", "matelas", "maternelle", 
				"meuble", "mousse", "mur", "peluche", "placard", "plafond", 
				"porte", "portemanteau", "poubelle", "radiateur", "rampe", 
				"récréation", "rentrée", "rideau", "robinet", "salle", 
				"savon", "serrure", "serviette", "siège", "sieste", "silence", 
				"sol", "sommeil", "sonnette", "sortie", "table", "tableau", 
				"tabouret", "tapis", "tiroir", "toilette", "vitre"};
		
		Random r = new Random();
		int choix = r.nextInt(dictionnaire.length);
		String mot_objectif = dictionnaire[choix];
		int longueur_mot_objectif = mot_objectif.length();
		String mot_devine = "";
		for(int i = 0; i < longueur_mot_objectif; i++)
			mot_devine += "_";
		char[] mot_devine_chars = mot_devine.toCharArray();
		int nombre_tentatives = 0;
		int nombre_limite_tentatives = 6;
		
		Scanner s = new Scanner(System.in);
		
		while(nombre_tentatives < nombre_limite_tentatives && !mot_devine.equals(mot_objectif)){
			nombre_tentatives++;
			System.out.printf("Tentative N %d de %d\n", nombre_tentatives, nombre_limite_tentatives);
			System.out.println("Donnez une lettre");
			char lettre = s.nextLine().charAt(0);
			for(int i = 0; i < longueur_mot_objectif; i++){
				if(mot_objectif.charAt(i) == lettre){
					mot_devine_chars[i] = lettre;
				}
			}
			mot_devine = new String(mot_devine_chars);
			System.out.println(mot_devine);
		}
		
		if(mot_devine.equals(mot_objectif)){
			System.out.println("Bingo");
		}else{
			System.out.println("Echec, le mot est " + mot_objectif);
		}
	}
	
}
