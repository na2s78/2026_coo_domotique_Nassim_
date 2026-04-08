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
        throw new Error ( " code non ecrit " );
    }
    public void activerTout(){
        throw new Error ( " code non ecrit " );
    }
    public String toString(){
        throw new Error ( " code non ecrit " );
    }
}