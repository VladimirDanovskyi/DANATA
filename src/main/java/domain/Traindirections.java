package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Admin on 09.03.2017.
 */
@Entity
@Table(name="traindirections")
public class Traindirections implements Serializable {

    private Integer id;
    private String name;
    private Date dateCreate;
    private Boolean valid;




    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    private  Set <AbonementKind> abonementKinds= new HashSet<>();

    @OneToMany (mappedBy = "traindirections", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    public Set<AbonementKind> getAbonementKinds() {
        return this.abonementKinds;
    }
    public void setAbonementKinds(Set<AbonementKind> abonementKinds) {
        this.abonementKinds = abonementKinds;
    }



 @Column (name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

@Column(name = "datecreate")
    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

@Column(name = "valid")
    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Traindirections that = (Traindirections) o;

        if (!id.equals(that.id)) return false;
        if (!name.equals(that.name)) return false;
        if (!dateCreate.equals(that.dateCreate)) return false;
        return valid.equals(that.valid);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + dateCreate.hashCode();
        result = 31 * result + valid.hashCode();
        return result;
    }
}
