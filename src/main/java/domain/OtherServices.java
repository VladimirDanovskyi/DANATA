package domain;

import javax.persistence.*;

/**
 * Created by Admin on 21.02.2017.
 */
@Entity
@Table(name = "otherservices")
public class OtherServices {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "othServ_seq")
    @SequenceGenerator(name = "othServ_seq", sequenceName = "public.\"OtherServices_id_seq\"",allocationSize = 0)
    private Integer id;

    @Column (name = "name")
    private String name;

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
}
