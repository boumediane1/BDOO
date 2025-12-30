package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Emprunt {
  @Id private Long id;

  @ManyToOne
  @JoinColumn(name = "membre_id")
  private Membre membre;

  @ManyToOne
  @JoinColumn(name = "livre_id")
  private Livre livre;

  private LocalDate dateEmprunt;
  private LocalDate dateRetourPrevue;

  public Livre getLivre() {
    return livre;
  }

  public void setLivre(Livre livre) {
    this.livre = livre;
  }

  public Membre getMembre() {
    return membre;
  }

  public void setMembre(Membre membre) {
    this.membre = membre;
  }

  public Emprunt() {}

  public Emprunt(LocalDate dateEmprunt, LocalDate dateRetourPrevue) {
    this.dateEmprunt = dateEmprunt;
    this.dateRetourPrevue = dateRetourPrevue;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDate getDateEmprunt() {
    return dateEmprunt;
  }

  public void setDateEmprunt(LocalDate dateEmprunt) {
    this.dateEmprunt = dateEmprunt;
  }

  public LocalDate getDateRetourPrevue() {
    return dateRetourPrevue;
  }

  public void setDateRetourPrevue(LocalDate dateRetourPrevue) {
    this.dateRetourPrevue = dateRetourPrevue;
  }
}
