package domain;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Admin on 21.02.2017.
 */
@Entity
@Table(name = "abonementkinds")
public class AbonementKind implements Serializable {

    public AbonementKind() {
    }

    public AbonementKind(Traindirections traindirections) {
        this.traindirections = traindirections;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;



    @OneToMany(mappedBy = "abonementKind", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<Abonement> abonements=new HashSet<>();
    public Set<Abonement> getAbonements() {
        return abonements;
    }
    public void setAbonements(Set<Abonement> abonements) {
        this.abonements = abonements;
    }



    @OneToMany(mappedBy = "abonemenKind",cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<ListPrice> listPrices= new HashSet<>();
    public Set<ListPrice> getListPrices(){return listPrices;}
    public void setListPrices (Set<ListPrice> listPricec){
        this.listPrices=listPricec;
    }

    @ManyToOne
    @JoinColumn(name = "traindirectionid")
    private Traindirections traindirections;
    public Traindirections getTraindirections(){
        return this.traindirections;
    }
    public void setTraindirections(Traindirections traindirections) {
        this.traindirections = traindirections;
    }


    @Column(name="datecreate")
    private Date dateCreate;

    @Column(name = "\"nameAB\"")
    private String nameAb;

    @Column(name = "\"daysValid\"")
    private Integer daysValid;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameAb() {
        return nameAb;
    }

    public void setNameAb(String nameAb) {
        this.nameAb = nameAb;
    }

    public Integer getDaysValid() {
        return daysValid;
    }

    public void setDaysValid(Integer daysValid) {
        this.daysValid = daysValid;
    }


    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbonementKind that = (AbonementKind) o;

        if (id != that.id) return false;
        if (daysValid != that.daysValid) return false;
        if (!dateCreate.equals(that.dateCreate)) return false;
        return nameAb.equals(that.nameAb);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (dateCreate!=null?dateCreate.hashCode():0);
        result = 31 * result + (nameAb!=null?nameAb.hashCode():0);
        result = 31 * result + (daysValid!=null?daysValid.hashCode():0);
        return result;
    }
}
