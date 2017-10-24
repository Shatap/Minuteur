package MinuteurTest;

import minuteur.MinuteurControleur;
import minuteur.MinuteurModele;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinuteurTests {
	static int HMS_VALEUR = 10;
	static int ZERO = 0;
	static int UN = 1;
	static int DEUX = 2;
	static int NEG_UN = -1;
	MinuteurModele modele;
	MinuteurControleur  controleur;

	// initialiser les variables modele controleur.
	//annotation "@Before" : initial() est ex�cut� les tests
	@Before
	public void initial() {
		modele = new MinuteurModele(ZERO,ZERO,ZERO);
		controleur = new MinuteurControleur(modele);
	}

	//annotation "@Test" : m�thode suivante est un test
		// tester les m�thodes setHeure(), getHeure(), setMinute(), getMinute(), setSeconde() et getSeconde()
		// MinuteurModele.MAX_HEURE == 24
	    // MinuteurModele.MAX_MINSEC== 60
	 	@Test
		public void testSetEtGet() {
			testSetHeure(); testSetMinute(); testSetSeconde();
		}
		
	// tester les m�thodes setHeure() et getHeure()
	// MinuteurModele.MAX_HEURE == 24
	public void testSetHeure() {
		controleur.setHeure(MinuteurModele.MAX_HEURE -  UN);
		assertEquals(MinuteurModele.MAX_HEURE - UN, modele.getHeure());
		controleur.setHeure( HMS_VALEUR);
		assertEquals(HMS_VALEUR, modele.getHeure());
		controleur.setHeure(ZERO);
		assertEquals(ZERO, modele.getHeure());
	}

	// tester les m�thodes setMinute() et getMinute()
	public void testSetMinute() {
		controleur.setMinute(MinuteurModele.MAX_MINSEC-UN);
		assertEquals(MinuteurModele.MAX_MINSEC - UN, modele.getMinute());
		controleur.setMinute(HMS_VALEUR);
		assertEquals(HMS_VALEUR, modele.getMinute());
		controleur.setMinute(ZERO);
		assertEquals(ZERO, modele.getMinute());
	}

	// tester les m�thodes setSeconde() et getSeconde()
	public void testSetSeconde() {
		controleur.setSeconde(MinuteurModele.MAX_MINSEC-UN);
		assertEquals(MinuteurModele.MAX_MINSEC  -  UN, modele.getSeconde());
		controleur.setSeconde(HMS_VALEUR);
		assertEquals(HMS_VALEUR, modele.getSeconde());
		controleur.setSeconde(ZERO);
		assertEquals(ZERO, modele.getSeconde());
	}

	// tester la m�thode incHeure(x) avec x = 1 et avec x=-1;
		@Test
		public void testIncEtDecHeure() {
			testIncHeure();
			testDecHeure();
		}
		
	// tester la m�thode incHeure(x) avec x = 1;
	public void testIncHeure() {
		/* 23h plus une heure donne 0h */
		controleur.setHeure(MinuteurModele.MAX_HEURE - 1);
		controleur.incHeure(UN);
		assertEquals(ZERO, modele.getHeure());
		/* 0h plus une heure donne 1h */
		controleur.incHeure(UN);
		assertEquals(UN, modele.getHeure());
	}

	// tester la m�thode incHeure(x) avec x = -1;
	public void testDecHeure() {
		/* 0h moins une heure donne 23h */
		controleur.setHeure(ZERO);
		controleur.incHeure(NEG_UN);
		assertEquals(MinuteurModele.MAX_HEURE - UN, modele.getHeure());
		/* 23h moins une heure donne 22h */
		controleur.incHeure(NEG_UN);
		assertEquals(MinuteurModele.MAX_HEURE - DEUX, modele.getHeure());
	}
	
	// tester la m�thode incHeure(x) avec x = 1 et avec x=-1;
	@Test
	public void testIncEtDecMinute() {
			testIncMinute();
			testDecMinute();
	}

	// tester la m�thode incMinute(x) avec x = 1;
	public void testIncMinute() {
		/* 10h:59m plus une minute donne 11h:0m */
		controleur.setHeure(HMS_VALEUR);
		controleur.setMinute(MinuteurModele.MAX_MINSEC - UN);
		controleur.incMinute(UN);
                System.out.println("AZDIUAHZDIUAHZDIUHAZIDUHAZIUDH" +modele.getHeure());
		assertEquals(HMS_VALEUR + UN, modele.getHeure());
		assertEquals(ZERO,modele.getMinute());
		/* 11h:0m plus une minute donne 11h:1m */
		controleur.incMinute(UN);
		assertEquals(HMS_VALEUR + UN, modele.getHeure());
		assertEquals(UN, modele.getMinute());
		}
	
	// tester la m�thode incMinute(x) avec x = -1;
	public void testDecMinute() {
		/* 10h:0m moins une minute donne 9h:59m */
		controleur.setHeure(HMS_VALEUR); controleur.setMinute(ZERO);
		controleur.incMinute(NEG_UN);
		assertEquals(HMS_VALEUR - UN, modele.getHeure());
		assertEquals(MinuteurModele.MAX_MINSEC - UN, modele.getMinute());
		/* 9h:59m moins une minute donne 9h:58m */
		controleur.incMinute(NEG_UN);
		assertEquals(HMS_VALEUR - UN, modele.getHeure());
		assertEquals(MinuteurModele.MAX_MINSEC - DEUX, modele.getMinute());
		}
	
	// tester la m�thode incSeconde(x) avec x = 1;
	@Test
	public void testIncSeconde() {
		/* 10m:59s plus une seconde donne 11m:0s */
		controleur.setMinute(HMS_VALEUR);
		controleur.setSeconde(MinuteurModele.MAX_MINSEC - UN);
		controleur.incSeconde(UN);
		assertEquals(HMS_VALEUR + UN, modele.getMinute());
		assertEquals(ZERO, modele.getSeconde());
		/* 11m:0s plus une seconde donne 11m:1s */
		controleur.incSeconde(UN);
		assertEquals(HMS_VALEUR + UN, modele.getMinute());
		assertEquals(UN, modele.getSeconde());
		/* 10h:59m:59s plus une seconde donne 11h:0m:0s */
		controleur.setHeure(HMS_VALEUR);
		controleur.setMinute(MinuteurModele.MAX_MINSEC - UN);
		controleur.setSeconde(MinuteurModele.MAX_MINSEC - UN);
		controleur.incSeconde(UN);
		assertEquals(HMS_VALEUR + UN, modele.getHeure());
		assertEquals(ZERO, modele.getMinute());
		assertEquals(ZERO, modele.getSeconde());
		/* 23h:59m:59s plus une seconde donne 0h:0m:0s */
		controleur.setHeure(MinuteurModele.MAX_HEURE - UN);
		controleur.setMinute(MinuteurModele.MAX_MINSEC - UN);
		controleur.setSeconde(MinuteurModele.MAX_MINSEC - UN);
		controleur.incSeconde(UN);
		assertEquals(ZERO, modele.getHeure());
		assertEquals(ZERO, modele.getMinute());
		assertEquals(ZERO, modele.getSeconde());
		}
	
	// tester la m�thode incSeconde(x) avec x = -1;
	@Test
	public void testDecSeconde() {
		/* 10m:0s moins une seconde donne 9m:59s */
		controleur.setMinute(HMS_VALEUR); controleur.setSeconde(ZERO);
		controleur.incSeconde(NEG_UN);
		assertEquals(HMS_VALEUR-UN, modele.getMinute());
		assertEquals(MinuteurModele.MAX_MINSEC - UN, modele.getSeconde());
		/* 9m:59s moins une seconde donne 9m:58s */
		controleur.incSeconde(NEG_UN);
		assertEquals(HMS_VALEUR - UN, modele.getMinute());
		assertEquals(MinuteurModele.MAX_MINSEC - DEUX, modele.getSeconde());
		/* 10h:0m:0s moins une seconde donne 9h:59m:59s */
		controleur.setHeure(HMS_VALEUR); controleur.setMinute(ZERO); controleur.setSeconde(ZERO);
		controleur.incSeconde(NEG_UN);
		assertEquals(HMS_VALEUR - UN, modele.getHeure());
		assertEquals(MinuteurModele.MAX_MINSEC - UN, modele.getMinute());
		assertEquals(MinuteurModele.MAX_MINSEC  -UN, modele.getSeconde());
		/* 0h:0m:0s moins une seconde donne 23h:59m:59s */
		controleur.setHeure(ZERO); controleur.setMinute(ZERO); controleur.setSeconde(ZERO);
		controleur.incSeconde(NEG_UN);
		assertEquals(MinuteurModele.MAX_HEURE - UN, modele.getHeure());
		assertEquals(MinuteurModele.MAX_MINSEC - UN, modele.getMinute());
		assertEquals(MinuteurModele.MAX_MINSEC - UN, modele.getSeconde());
		}
	
	
}


