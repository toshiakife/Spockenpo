package br.org.fitec.dojo.spockenpo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public enum SpockenpoItem {
	
	
	LAGARTO("Lagarto", "Papel", "Spock"), 
	PAPEL("Papel", "Pedra", "Spock"), 
	PEDRA("Pedra", "Lagarto", "Tesoura"), 
	SPOCK("Spock", "Pedra", "Tesoura"),
	TESOURA("Tesoura", "Lagarto", "Papel"), 
	;
	
	private String key;
	
	private Set<String> beatKeys;

	private SpockenpoItem(String key, String...venceDe) {
		this.key = key;
		this.beatKeys = new HashSet<String>(Arrays.asList(venceDe));
	}
	
	public boolean venceDe(SpockenpoItem desafiante) {
		return desafiante == null || beatKeys.contains(desafiante.key);
	}
	public boolean empata(SpockenpoItem desafiante) {
		return desafiante != null && this == desafiante;
	}
}
