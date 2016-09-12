import java.util.ArrayList;

/**
 * Created by yassirhessane on 17/08/16.
 */
public class Catalogue {

    protected ListeVehicule vehiculeStock;
    protected ArrayList<CommandeSolder> commande  = new ArrayList<>();

    public Catalogue() {
        this.vehiculeStock = new ListeVehicule();
    }

    public void lanceCommandeSolder(CommandeSolder commande)
    {
        this.commande.add(commande);
        commande.solde(this.vehiculeStock);
    }

    public void annuleCommandeSolder(int ordre)
    {
        this.commande.get(ordre).annule();
    }

    public void retablitCommandeSolder(int ordre)
    {
        this.commande.get(ordre).retablit();
    }

    public void ajoute(Vehicule vehicule)
    {
        this.vehiculeStock.add(vehicule);
    }

    public void affiche()
    {
        for (Vehicule v: this.vehiculeStock.getArrayListeVahicule())
        {
            v.affiche();
        }
    }

}
