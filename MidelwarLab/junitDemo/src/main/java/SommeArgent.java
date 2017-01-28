/**
 * Created by theXuser on 1/14/2017.
 */
public class SommeArgent {
    private int quantite;
    private String unite;

    public SommeArgent(int amount, String currency) {
        quantite = amount;
        unite = currency;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getUnite() {
        return unite;
    }

    public SommeArgent add(SommeArgent m) {
        return new SommeArgent(getQuantite() + m.getQuantite(), getUnite());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj instanceof SommeArgent){
            SommeArgent sommeArgent = (SommeArgent) obj;
            if (this.unite.equals(sommeArgent.getUnite())
                    && this.quantite == sommeArgent.getQuantite()){
                return true;
            }
        }
        return false;
    }
}
