import java.util.ArrayList;
import java.util.List;

public class Telecommande {
    private List<Lampe> lampes;

    public Telecommande(){
        this.lampes = new ArrayList<>();
    }

    public void ajouterLampe(Lampe l){
        this.lampes.add(l);
    }
    public void activerLampe(int x){
        if (x >= 0 && x < lampes.size()) {
            this.lampes.get(x).allumer();
        }
    }
    public void desactiverLampe(int x){
        if (x >= 0 && x < lampes.size()) {
            this.lampes.get(x).eteindre();
        }
    }
    public void activerTout(){
        for (Lampe l : lampes) {
            l.allumer();
        }
    }
    public String toString(){
        String res = "Contenu de la télécommande :\n";
        for (int i = 0; i < lampes.size(); i++) {
            res += i + " : " + lampes.get(i).toString() + "\n";
        }
        return res;
    }
}