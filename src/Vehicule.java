/**
 * Created by yassirhessane on 17/08/16.
 */
public class Vehicule {

    protected String nom;
    protected long dateEntreeStock;
    protected double prixDeVente;

    public Vehicule(String nom, long dateEntreeStock, double prixDeVente) {
        this.nom = nom;
        this.dateEntreeStock = dateEntreeStock;
        this.prixDeVente = prixDeVente;
    }

    public long getDureeStockage(long aujourdhui)
    {
        return aujourdhui - this.dateEntreeStock;
    }

    public void modiferPrix(double coefficient)
    {
        this.prixDeVente = Math.round(coefficient * this.prixDeVente);
    }

    public void affiche()
    {
        System.out.println(this.nom+" prix: "+ this.prixDeVente+" date entrée en stock "+ this.dateEntreeStock);
    }
}
