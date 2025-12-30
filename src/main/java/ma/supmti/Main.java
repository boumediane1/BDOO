package ma.supmti;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
  public static void main(String[] args) {
    ajouterLivre();
    String titre = trouverLivre(1L);
    System.out.println(titre);
  }

  public static void ajouterLivre() {
    EntityManagerFactory emf = null;
    EntityManager em = null;
    try {
      // À compléter : Créer l'EntityManagerFactory
      emf = Persistence.createEntityManagerFactory("objectdb:SupMti.odb");
      // À compléter : Créer l'EntityManager
      em = emf.createEntityManager();
      // À compléter : Démarrer une transaction
      em.getTransaction().begin();
      // Création du livre
      Livre livre = new Livre();
      livre.setId(1L);
      livre.setTitre("La Boîte à Merveilles");
      livre.setAuteur("Ahmed Sefrioui");
      livre.setAnneePublication(1954);
      livre.setDisponible(true);
      // À compléter : Persister le livre
      em.persist(livre);
      // À compléter : Valider la transaction
      em.getTransaction().commit();
      System.out.println("Livre ajouté avec succès !");
    } catch (Exception e) {
      // À compléter : Gérer l'annulation de la transaction en cas d'erreur
      e.printStackTrace();
      em.getTransaction().rollback();
    } finally {
      // À compléter : Fermer les ressources proprement
      em.close();
      emf.close();
    }
  }

  public static String trouverLivre(long id) {
    EntityManagerFactory emf = null;
    EntityManager em = null;

    try {
      emf = Persistence.createEntityManagerFactory("objectdb:SupMti.odb");
      em = emf.createEntityManager();

      Livre livre = em.find(Livre.class, id);

      return livre.getTitre();
    } catch (Exception e) {
      // À compléter : Gérer l'annulation de la transaction en cas d'erreur
      e.printStackTrace();
    } finally {
      em.close();
      emf.close();
    }

    return null;
  }
}
