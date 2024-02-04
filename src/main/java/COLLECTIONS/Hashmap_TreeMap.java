package COLLECTIONS;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;



// MAP : 		RELATION CLE / VALEUR
// TREEMAP:		MAP qui est AUTOMATIQUEMENT TRIEE



public class Hashmap_TreeMap {
	
	public static void main(String[] args) {
		
		// Déclaration de map simple
		
		Map<String, Persons> agentList = new HashMap<>();
		Map<Integer, String> simpleMap	= new HashMap<>();

		// Déclaration de map complexe
		Map<Map<String, Integer>, Map<Double, Boolean>> myMap = new HashMap<>();
		
		
		
		// METHODES Avec MAP SIMPLE
		
		
		// OPERATIONS
		
// Ajout d'une paire clé valeur
		simpleMap.put(1, "silvio");
		
// Ajout si absent ou NULL
		simpleMap.putIfAbsent(2, "Delphine");
		simpleMap.putIfAbsent(3, "Valentina");
		simpleMap.putIfAbsent(4, "Plume");
		
// Remplace la valeur si clé existe déja
		simpleMap.replace(1, "PAPA");
		
// 3ème paramètre remplace le 2 si ce dernier est bien associé à la clé
		simpleMap.replace(2, "Delphine", "MAMAN");
		
// Supprime la paire clé valeur
		simpleMap.remove(4);
		simpleMap.remove(4, "Plume");
		
		
		// TESTS
		
// Test si clé/valeur éxiste		<= retourne TRUE si existante
		simpleMap.containsKey(3);				
		simpleMap.containsValue("Valentina");
		
		
		// RETOURS
		
// Retourne la valeur de la clé en paramètre
		simpleMap.get(1);
		
// Retourne toutes les clés
		simpleMap.keySet();

// Retourne toutes les valeurs
		simpleMap.values();
		
// Retourne toutes les paires CLE/VALEUR
		System.out.println("EntrySet : " + simpleMap.entrySet());
		
		
		
		
		// BOUCLE 
// La boucle des MAP se fait via l'interface ENTRY qui donne accès à de nouvelles méthodes
		
		for (Entry<Integer, String> loop : simpleMap.entrySet()) {
			
			System.out.println("getKey : " + loop.getKey());
			System.out.println("getValue : " + loop.getValue());
			loop.setValue("nouvelle valeur");
			
			Entry.comparingByKey();     // <= Possibilité d'ajouter un COMPARATOR en paramètre
			Entry.comparingByValue();	//
		}
		
		System.out.println(Math.round(1.5));
		
		
//		// Ajout d'une paire clé valeur
//		agentList.put("007", new Persons("James Bond", 40));
//		
//		// Ajout si absent ou NULL
//		agentList.putIfAbsent("006", new Persons("Alec Trevelyan", 45));
//		agentList.putIfAbsent("001", new Persons("M", 65));
//		
//		agentList.replace("001", new Persons("MMM", 65) );
//		
//		agentList.forEach((k,v) -> System.out.println(k + " : " + v));
		
		

		
		
		
	
		
	}
	

}
