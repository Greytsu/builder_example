import lombok.ToString;

@ToString
public class Animal {
    private String nom;
    private int age;
    private String race;
    private int nbPattes;
    private String couleur;
    private double poids;

    public Animal(String nom, int age, String race, int nbPattes, String couleur, double poids) {
        this.nom = nom;
        this.age = age;
        this.race = race;
        this.nbPattes = nbPattes;
        this.couleur = couleur;
        this.poids = poids;
    }
}

