import lombok.Builder;
import lombok.ToString;

@ToString
@Builder(builderMethodName = "subBuilder")
public class Personne {

    private String prenom;
    @Builder.Default
    private String nom = "Attribut non définit";
    @Builder.Default
    private String adresse = "Attribut non définit";
    @Builder.Default
    private String telephone = "Attribut non définit";
    @Builder.Default
    private int age = 0;
    @Builder.Default
    private double poids = 0d;

    //Rend l'attribut prenom obligatoire
    public static PersonneBuilder builder(String prenom) {
        return subBuilder().prenom(prenom);
    }

}
