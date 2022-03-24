import lombok.ToString;

@ToString
public class Vehicule {
    private String marque;
    private String couleur;
    private int puissance;
    private int kilometrage;
    private int nbPlaces;
    private int nbRoues;

    public Vehicule(VehiculeBuilder vehiculeBuilder) {
        this.marque = vehiculeBuilder.marque;
        this.couleur = vehiculeBuilder.couleur;
        this.puissance = vehiculeBuilder.puissance;
        this.kilometrage = vehiculeBuilder.kilometrage;
        this.nbPlaces = vehiculeBuilder.nbPlaces;
        this.nbRoues = vehiculeBuilder.nbRoues;
    }

    public Vehicule(String marque) {
        this.marque = marque;
    }

    public static class VehiculeBuilder{
        private String marque = "Attribut non définit";
        private String couleur = "Attribut non définit";
        private int puissance = 0;
        private int kilometrage = 0;
        private int nbPlaces = 0;
        private int nbRoues = 0;

        //Permet de rendre l'attribut marque obligatoire dans le builder
        public VehiculeBuilder(String marque) {
            this.marque = marque;
        }

        public VehiculeBuilder marque(String marque){
            this.marque = marque;
            return this;
        }

        public VehiculeBuilder couleur(String couleur){
            this.couleur = couleur;
            return this;
        }

        public VehiculeBuilder puissance(int puissance){
            this.puissance = puissance;
            return this;
        }

        public VehiculeBuilder kilometrage(int kilometrage){
            this.kilometrage = kilometrage;
            return this;
        }

        public VehiculeBuilder nbPlaces(int nbPlaces){
            this.nbPlaces = nbPlaces;
            return this;
        }

        public VehiculeBuilder nbRoues(int nbRoues){
            this.nbRoues = nbRoues;
            return this;
        }

        public Vehicule build(){
            return new Vehicule(this);
        }
    }
}
