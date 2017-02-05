/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domaine;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author theXuser
 */
@Entity
@Table(name = "livres")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Livres.findAll", query = "SELECT l FROM Livres l")
    , @NamedQuery(name = "Livres.findById", query = "SELECT l FROM Livres l WHERE l.id = :id")
    , @NamedQuery(name = "Livres.findByTitre", query = "SELECT l FROM Livres l WHERE l.titre = :titre")
    , @NamedQuery(name = "Livres.findByAuteur", query = "SELECT l FROM Livres l WHERE l.auteur = :auteur")
    , @NamedQuery(name = "Livres.findByCategorie", query = "SELECT l FROM Livres l WHERE l.categorie = :categorie")
    , @NamedQuery(name = "Livres.findByIdentifiant", query = "SELECT l FROM Livres l WHERE l.identifiant = :identifiant")
    , @NamedQuery(name = "Livres.findByNbrExmpl", query = "SELECT l FROM Livres l WHERE l.nbrExmpl = :nbrExmpl")})
public class Livres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "titre")
    private String titre;
    @Size(max = 255)
    @Column(name = "auteur")
    private String auteur;
    @Size(max = 255)
    @Column(name = "categorie")
    private String categorie;
    @Size(max = 255)
    @Column(name = "identifiant")
    private String identifiant;
    @Column(name = "nbr_exmpl")
    private Integer nbrExmpl;

    public Livres() {
    }

    public Livres(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public Integer getNbrExmpl() {
        return nbrExmpl;
    }

    public void setNbrExmpl(Integer nbrExmpl) {
        this.nbrExmpl = nbrExmpl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livres)) {
            return false;
        }
        Livres other = (Livres) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domaine.Livres[ id=" + id + " ]";
    }
    
}
