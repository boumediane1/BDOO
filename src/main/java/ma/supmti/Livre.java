package ma.supmti;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Livre {
  @Id private long id;
  private String titre;
  private String auteur;
  private int anneePublication;
  private boolean disponible;

  public Livre() {}

  public Livre(int id, String titre, String auteur, int anneePublication, boolean disponible) {
    this.id = id;
    this.titre = titre;
    this.auteur = auteur;
    this.anneePublication = anneePublication;
    this.disponible = disponible;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitre() {
    return titre;
  }

  public void setTitre(String nom) {
    this.titre = nom;
  }

  public String getAuteur() {
    return auteur;
  }

  public void setAuteur(String auteur) {
    this.auteur = auteur;
  }

  public int getAnneePublication() {
    return anneePublication;
  }

  public void setAnneePublication(int anneePublication) {
    this.anneePublication = anneePublication;
  }

  public boolean isDisponible() {
    return disponible;
  }

  public void setDisponible(boolean disponible) {
    this.disponible = disponible;
  }
}
