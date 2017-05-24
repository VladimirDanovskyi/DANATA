package domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Admin on 21.02.2017.
 */
@Entity
@Table(name = "abonements")
public class Abonement {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ab_seq")
    @SequenceGenerator(name = "ab_seq",sequenceName = "public.\"Abonements_id_seq\"", allocationSize = 0)
      private Long id;


    @ManyToOne(cascade= CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name = "kindid")
    private AbonementKind abonementKind;
    public AbonementKind getAbonementKind() {
        return abonementKind;
    }
    public void setAbonementKind(AbonementKind abonementKind) {
        this.abonementKind = abonementKind;
    }

    @ManyToOne(cascade= {CascadeType.REFRESH}, fetch=FetchType.LAZY)
    @JoinColumn(name = "clientid")
    private Client client;




    @Column(name = "datecreation")
    private Date dateCreation;

    @Column(name = "dateend")
    private Date dateEnd;

    @Column(name = "valid")
    private Boolean valid;

    @Column(name = "numvisits")
    private Integer numVisits;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Integer getNumVisits() {
        return numVisits;
    }

    public void setNumVisits(Integer numVisits) {
        this.numVisits = numVisits;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Abonement)) return false;

        Abonement abonement = (Abonement) o;

        if (id != null ? !id.equals(abonement.id) : abonement.id != null) return false;
        if (dateCreation != null ? !dateCreation.equals(abonement.dateCreation) : abonement.dateCreation != null)
            return false;
        if (dateEnd != null ? !dateEnd.equals(abonement.dateEnd) : abonement.dateEnd != null) return false;
        if (valid != null ? !valid.equals(abonement.valid) : abonement.valid != null) return false;
        return numVisits != null ? numVisits.equals(abonement.numVisits) : abonement.numVisits == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dateCreation != null ? dateCreation.hashCode() : 0);
        result = 31 * result + (dateEnd != null ? dateEnd.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        result = 31 * result + (numVisits != null ? numVisits.hashCode() : 0);
        return result;
    }
}
