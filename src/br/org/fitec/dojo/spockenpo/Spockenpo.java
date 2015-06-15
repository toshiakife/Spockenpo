package br.org.fitec.dojo.spockenpo;

public class Spockenpo {

	public SpockenpoItem resolveWinner(SpockenpoItem item1, SpockenpoItem item2) {
		if (item1 != null && item2 != null) {
			if (item1.venceDe(item2)) {
				return item1;
			}
			if (item2.venceDe(item1)) {
				return item2;
			}
		}
		return null;
	}

}
