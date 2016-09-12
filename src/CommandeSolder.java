import java.util.ArrayList;

/**
 * Created by yassirhessane on 17/08/16.
 */
public class CommandeSolder {

    protected ListeVehicule vehiculeSoldes;
    protected long aujourdhui;
    protected long dureeStock;
    protected double tauxRemise;

    public CommandeSolder(long aujourdhui, long dureeStock, double tauxRemise) {
        this.vehiculeSoldes = new ListeVehicule();
        this.aujourdhui = aujourdhui;
        this.dureeStock = dureeStock;
        this.tauxRemise = tauxRemise;
    }

    public void solde(ListeVehicule listeVehicule)
    {

        for (Vehicule v: listeVehicule.getArrayListeVahicule())
        {
            if(v.getDureeStockage(this.aujourdhui) >= this.dureeStock)
            {
                this.vehiculeSoldes.add(v);
            }
        }
        for (Vehicule v: listeVehicule.getArrayListeVahicule())
        {
            v.modiferPrix(1.0 - this.tauxRemise);
        }
    }

    public void annule()
    {
        for (Vehicule v: this.vehiculeSoldes.getArrayListeVahicule())
        {
            v.modiferPrix(1.0/(1.0 - this.tauxRemise));
        }
    }

    public void retablit()
    {
        for (Vehicule v : this.vehiculeSoldes.getArrayListeVahicule())
        {
            v.modiferPrix(1.0 - this.tauxRemise);
        }
    }
}
