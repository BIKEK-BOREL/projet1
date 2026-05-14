package mbemnova.projet1.model;

public class Etudiant {
    private Long id;
    private String nom;
    private String filiere;

    public Etudiant(Long id,String nom,String filiere){
        this.id = id;
        this.nom = nom;
        this.filiere=filiere;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getFiliere() {
        return filiere;
    }
}
