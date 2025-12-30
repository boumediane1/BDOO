package ma.supmti;

import jakarta.persistence.*;

@Entity
public class Produit {
  @Id private int id;
  private String libelle;
  private double prix;
  private int quantiteStock;

  public Produit() {}

  public Produit(int id, String libelle, double prix, int quantiteStock) {
    this.id = id;
    this.libelle = libelle;
    this.prix = prix;
    this.quantiteStock = quantiteStock;
  }

  // Getters et setters
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  public double getPrix() {
    return prix;
  }

  public void setPrix(double prix) {
    this.prix = prix;
  }

  public int getQuantiteStock() {
    return quantiteStock;
  }

  public void setQuantiteStock(int quantiteStock) {
    this.quantiteStock = quantiteStock;
  }
}
