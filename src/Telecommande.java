import java.util.ArrayList;
import java.util.List;

public class Telecommande {
    private List<Appareils> appareils;

    public Telecommande(){
        this.appareils = new ArrayList<>();
    }

    public void ajouterA(Appareils a){
        this.appareils.add(a);
    }


    public void activerA(int x){
        if (x >= 0 && x < appareils.size()) {
            this.appareils.get(x).allumer();
        }
    }


    public void desactiverA(int x){
        if (x >= 0 && x < appareils.size()) {
            this.appareils.get(x).eteindre();
        }
    }


    public void activerTout(){
        for (Appareils a : appareils) {
            a.allumer();
        }
    }
    public String toString(){
        String res = "Contenu de la télécommande :\n";
        for (int i = 0; i < appareils.size(); i++) {
            res += i + " : " + appareils.get(i).toString() + "\n";
        }
        return res;
    }

    public int getNombre() {
        return this.appareils.size();
    }
}