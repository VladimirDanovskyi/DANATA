package domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Admin on 21.02.2017.
 */
@Entity
@Table(name = "trainkinds")
public class TrainKinds {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tr_seq")
    @SequenceGenerator(name = "tr_seq",sequenceName = "pulic.\"TrainDirection_id_seq\"",allocationSize = 0)
    private Integer id;




    @Column(name = "name")
    private String name;

    @Column (name = "datecreation")
    private Date dateCreation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
