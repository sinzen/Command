public class Main {

    public static void main(String[] args) {
       // System.out.println("Hello World!");

        Vehicule v1 = new Vehicule("A01",1,1000.0);
        Vehicule v2 = new Vehicule("A11",6,2000.0);
        Vehicule v3 = new Vehicule("Z03",2,3000.0);

        Catalogue catalogue = new Catalogue();

        catalogue.ajoute(v1);
        catalogue.ajoute(v2);
        catalogue.ajoute(v3);

        System.out.println("Affichage du catalogue initial");
        catalogue.affiche();

        CommandeSolder commandeSolder = new CommandeSolder(10,5,0.1);
        catalogue.lanceCommandeSolder(commandeSolder);

        System.out.println("Affichage du catalogue après exécution de la première commande");
        catalogue.affiche();

        CommandeSolder commandeSolder1 = new CommandeSolder(10,5,0.5);
        catalogue.lanceCommandeSolder(commandeSolder1);

        System.out.println("Affichage du catalogue après exécution de la seconde commande");
        catalogue.affiche();

        catalogue.annuleCommandeSolder(0);
        System.out.println("Affichage de ctalogue après annulation de la première commande");
        catalogue.affiche();

        catalogue.retablitCommandeSolder(0);
        System.out.println("Affichage de ctalogue après rétablissement de la première commande");
        catalogue.affiche();


    }
}
