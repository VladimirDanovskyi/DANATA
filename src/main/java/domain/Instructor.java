package domain;

        import javax.persistence.*;
        import java.util.Date;

/**
 * Created by Admin on 17.02.2017.
 */
@Entity
@Table(name ="instructors")
public class Instructor {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;

    @Column (name = "trainkindid")
    private Integer trainkind;

    @Column(name = "fn")
    private String fn;

    @Column(name="mn")
    private String mn;

    @Column(name = "ln")
    private String ln;

    @Column(name = "profesion")
    private String profesion;

    @Column(name = "datebirth")

    private Date dateBirth;

    @Column (name= "datehire")
    private Date dateHire;

    @Column (name = "datefire")
     private Date dateFire;

    @Column (name = "work")
    private Boolean work;

    @Column (name="sex")
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getMn() {
        return mn;
    }

    public void setMn(String mn) {
        this.mn = mn;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Date getDateHire() {
        return dateHire;
    }

    public void setDateHire(Date dateHire) {
        this.dateHire = dateHire;
    }

    public Date getDateFire() {
        return dateFire;
    }

    public void setDateFire(Date dateFire) {
        this.dateFire = dateFire;
    }

    public Boolean getWork() {
        return work;
    }

    public void setWork(Boolean work) {
        this.work = work;
    }
}
