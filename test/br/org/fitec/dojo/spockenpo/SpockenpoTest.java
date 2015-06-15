package br.org.fitec.dojo.spockenpo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SpockenpoTest {
	
	private Spockenpo spockenpo;
	
	@Before
	public void setUp() {
		spockenpo = new Spockenpo();
	}
	
	@Test
	public void tesouraDeveVencerPapel() {
		SpockenpoItem winner = spockenpo.resolveWinner(SpockenpoItem.TESOURA, SpockenpoItem.PAPEL);
		assertEquals("Tesoura deveria vencer de Papel", SpockenpoItem.TESOURA, winner);
		winner = spockenpo.resolveWinner(SpockenpoItem.PAPEL, SpockenpoItem.TESOURA);
		assertEquals("Tesoura deveria vencer de Papel", SpockenpoItem.TESOURA, winner);
	}
	@Test
	public void tesouraDeveVencerLagarto() {
		SpockenpoItem winner = spockenpo.resolveWinner(SpockenpoItem.TESOURA, SpockenpoItem.LAGARTO);
		assertEquals("Tesoura deveria vencer de Lagarto", SpockenpoItem.TESOURA, winner);
		winner = spockenpo.resolveWinner(SpockenpoItem.LAGARTO, SpockenpoItem.TESOURA);
		assertEquals("Tesoura deveria vencer de Lagarto", SpockenpoItem.TESOURA, winner);
	}
	@Test
	public void tesouraDeveEmpatarComTesoura() {
		SpockenpoItem winner = spockenpo.resolveWinner(SpockenpoItem.TESOURA, SpockenpoItem.TESOURA);
		assertNull("Empate não deve ter resultado", winner);
	}
	
	@Test
	public void papelDeveVencerPedra() {
		SpockenpoItem winner = spockenpo.resolveWinner(SpockenpoItem.PAPEL, SpockenpoItem.PEDRA);
		assertEquals("Papel deveria vencer de Pedra", SpockenpoItem.PAPEL, winner);
		winner = spockenpo.resolveWinner(SpockenpoItem.PEDRA, SpockenpoItem.PAPEL);
		assertEquals("Papel deveria vencer de Pedra", SpockenpoItem.PAPEL, winner);
	}
	
	@Test
	public void papelDeveVencerSpock() {
		SpockenpoItem winner = spockenpo.resolveWinner(SpockenpoItem.PAPEL, SpockenpoItem.SPOCK);
		assertEquals("Papel deveria vencer de Spock", SpockenpoItem.PAPEL, winner);
		winner = spockenpo.resolveWinner(SpockenpoItem.SPOCK, SpockenpoItem.PAPEL);
		assertEquals("Papel deveria vencer de Spock", SpockenpoItem.PAPEL, winner);
	}
	@Test
	public void papelDeveEmpatarComPapel() {
		SpockenpoItem winner = spockenpo.resolveWinner(SpockenpoItem.PAPEL, SpockenpoItem.PAPEL);
		assertNull("Empate não deve ter resultado", winner);
	}
	@Test
	public void pedraDeveVencerTesoura() {
		SpockenpoItem winner = spockenpo.resolveWinner(SpockenpoItem.PEDRA, SpockenpoItem.TESOURA);
		assertEquals("Pedra deveria vencer de Tesoura", SpockenpoItem.PEDRA, winner);
		winner = spockenpo.resolveWinner(SpockenpoItem.TESOURA, SpockenpoItem.PEDRA);
		assertEquals("Pedra deveria vencer de Tesoura", SpockenpoItem.PEDRA, winner);
	}
	@Test
	public void pedraDeveVencerLagarto() {
		SpockenpoItem winner = spockenpo.resolveWinner(SpockenpoItem.PEDRA, SpockenpoItem.LAGARTO);
		assertEquals("Pedra deveria vencer de Lagarto", SpockenpoItem.PEDRA, winner);
		winner = spockenpo.resolveWinner(SpockenpoItem.LAGARTO, SpockenpoItem.PEDRA);
		assertEquals("Pedra deveria vencer de Lagarto", SpockenpoItem.PEDRA, winner);
	}
	@Test
	public void pedraDeveEmpatarComPedra() {
		SpockenpoItem winner = spockenpo.resolveWinner(SpockenpoItem.PEDRA, SpockenpoItem.PEDRA);
		assertNull("Empate não deve ter resultado", winner);
	}
	@Test
	public void lagartoDeveVencerPapel() {
		SpockenpoItem winner = spockenpo.resolveWinner(SpockenpoItem.LAGARTO, SpockenpoItem.PAPEL);
		assertEquals("Lagarto deveria vencer de Papel", SpockenpoItem.LAGARTO, winner);
		winner = spockenpo.resolveWinner(SpockenpoItem.PAPEL, SpockenpoItem.LAGARTO);
		assertEquals("Lagarto deveria vencer de Papel", SpockenpoItem.LAGARTO, winner);
	}
	@Test
	public void lagartoDeveVencerSpock() {
		SpockenpoItem winner = spockenpo.resolveWinner(SpockenpoItem.LAGARTO, SpockenpoItem.SPOCK);
		assertEquals("Lagarto deveria vencer de Spock", SpockenpoItem.LAGARTO, winner);
		winner = spockenpo.resolveWinner(SpockenpoItem.SPOCK, SpockenpoItem.LAGARTO);
		assertEquals("Lagarto deveria vencer de Spock", SpockenpoItem.LAGARTO, winner);
	}
	@Test
	public void lagartoDeveEmpatarComLagarto() {
		SpockenpoItem winner = spockenpo.resolveWinner(SpockenpoItem.LAGARTO, SpockenpoItem.LAGARTO);
		assertNull("Empate não deve ter resultado", winner);
	}
	@Test
	public void spockDeveVencerPedra() {
		SpockenpoItem winner = spockenpo.resolveWinner(SpockenpoItem.SPOCK, SpockenpoItem.PEDRA);
		assertEquals("Spock deveria vencer de Pedra", SpockenpoItem.SPOCK, winner);
		winner = spockenpo.resolveWinner(SpockenpoItem.PEDRA, SpockenpoItem.SPOCK);
		assertEquals("Spock deveria vencer de Pedra", SpockenpoItem.SPOCK, winner);
	}
	@Test
	public void spockDeveEmpatarComSpock() {
		SpockenpoItem winner = spockenpo.resolveWinner(SpockenpoItem.SPOCK, SpockenpoItem.SPOCK);
		assertNull("Empate não deve ter resultado", winner);
	}
	@Test
	public void parametrosNulosNaoDeveRetornarVencedor() {
		SpockenpoItem winner = spockenpo.resolveWinner(null, SpockenpoItem.SPOCK);
		assertNull("Não deve retornar vencedor com parâmetros nulos", winner);
		winner = spockenpo.resolveWinner(SpockenpoItem.SPOCK, null);
		assertNull("Não deve retornar vencedor com parâmetros nulos", winner);
	}
}
