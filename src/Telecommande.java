import java.util.ArrayList;
import java.util.List;

public class Telecommande {
    private List<Lampe> lampes;
    private List<Hifi> hifis;

    public Telecommande(){
        this.lampes = new ArrayList<>();
        this.hifis = new ArrayList<>();
    }

    public void ajouterLampe(Lampe l){
        this.lampes.add(l);
    }

    public void ajouterHifi(Hifi h){
        hifis.add(h);
    }
    public void activerLampe(int x){
        if (x >= 0 && x < lampes.size()) {
            this.lampes.get(x).allumer();
        }
    }

    public void activerHifi(int indice) {
        if (indice >= 0 && indice < hifis.size()) {
            hifis.get(indice).allumer();
        }
    }


    public void desactiverLampe(int x){
        if (x >= 0 && x < lampes.size()) {
            this.lampes.get(x).eteindre();
        }
    }

    public void desactiverHifi(int indice) {
        if (indice >= 0 && indice < hifis.size()) {
            hifis.get(indice).eteindre();
        }
    }


    public void activerTout(){
        for (Lampe l : lampes) {
            l.allumer();
        }
        for(Hifi h : hifis){
           h.allumer();
        }
    }
    public String toString(){
        String res = "Contenu de la télécommande :\n";
        for (int i = 0; i < lampes.size(); i++) {
            res += i + " : " + lampes.get(i).toString() + "\n";
        }

        res += "Liste des Hifis :\n";
        for (int i = 0; i < hifis.size(); i++) {
            res += i + " : " + hifis.get(i).toString() + "\n";
        }
        return res;
    }
}