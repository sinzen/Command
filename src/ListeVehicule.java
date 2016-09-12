import java.util.ArrayList;

/**
 * Created by yassirhessane on 17/08/16.
 */
public class ListeVehicule {

    private ArrayList<Vehicule> vehicules;

    public ListeVehicule( ) {
        this.vehicules = new ArrayList<>();
    }

    public void add(Vehicule vehicule)
    {
        this.vehicules.add(vehicule);
    }
    public ArrayList<Vehicule> getArrayListeVahicule()
    {
        return this.vehicules;
    }

}
