package Converter.dev;

/**
 * Created by theXuser on 29/12/2016.
 */
public class EuroImp extends EuroPOA {
    private String devise;
    private float taux;

    @Override
    public String Devise() {
        return this.devise;
    }

    @Override
    public void Devise(String newDevise) {
        this.devise = newDevise;
    }

    @Override
    public float Taux() {
        return this.taux;
    }

    @Override
    public void Taux(float newTaux) {
        this.taux = newTaux;
    }

    @Override
    public float toEuro(float devise) {
        return devise * this.taux;
    }

    @Override
    public float toDevise(float euro) {
        return euro / this.taux;
    }
}
