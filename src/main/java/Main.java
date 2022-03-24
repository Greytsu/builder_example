public class Main {
    public static void main(String[] args) {

        //Premier exemple sans builder
        Animal animal = new Animal("Paul", 5, null, 4, null, 24.6);
        System.out.println(animal);

        //Deuxième exemple avec builder
        Vehicule vehicule = new Vehicule.VehiculeBuilder("Peugeot")
                .puissance(96)
                .nbPlaces(5)
                .build();
        System.out.println(vehicule);

        //Troisième exemple avec builder Lombok
        Personne personne = Personne.builder("Jake")
                .nom("Peralta")
                .age(43)
                .build();
        System.out.println(personne);







    }
}
