import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TelecommandeTest {

    @Test
    public void testAjouterLampe_vide() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");

        t.ajouterLampe(l);

        String r = "" + t;
        assertTrue(r.contains("lampe1"), "la telecommande devrait contenir la lampe");
    }

    @Test
    public void testAjouterLampe_unElement() {
        Telecommande t = new Telecommande();
        t.ajouterLampe(new Lampe("L1"));
        Lampe l2 = new Lampe("L2");

        t.ajouterLampe(l2);

        String r = "" + t;
        assertTrue(r.contains("L2"), "la deuxieme lampe devrait etre presente");
    }

    @Test
    public void testActiverLampe_pos0() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("L1");
        t.ajouterLampe(l);

        t.activerLampe(0);

        assertTrue(l.isAllume(), "la lampe en position 0 devrait etre allumee");
    }

    @Test
    public void testActiverLampe_pos1() {
        Telecommande t = new Telecommande();
        t.ajouterLampe(new Lampe("L0"));
        Lampe l1 = new Lampe("L1");
        t.ajouterLampe(l1);

        t.activerLampe(1);

        assertTrue(l1.isAllume(), "la lampe en position 1 devrait etre allumee");
    }

    @Test
    public void testActiverLampe_inexistante() {
        Telecommande t = new Telecommande();
        t.ajouterLampe(new Lampe("L0"));

        t.activerLampe(1);
    }
}