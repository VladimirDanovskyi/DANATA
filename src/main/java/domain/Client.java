package domain;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Admin on 21.02.2017.
 */
@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_seq")
    @SequenceGenerator(name = "client_seq", sequenceName = "public.\"Clients_id_seq\"", allocationSize =0)
    private Long id;

    @Column(name = "fn")
    private String fn;
    @Column(name = "mn")
    private String mn;
    @Column (name = "ln")
    private String ln;

    @Column(name = "profesion")
    private  String profesion;

    @Column(name = "datecreation")
    private Date dateCreation;

    @Column (name = "datebirth")
    private Date datebirth;

    @Column(name = "comment")
    private  String comment;

     @Column (name = "sex")
     private Boolean sex;



    @OneToMany
    private Set<Contact> contacts= new HashSet<>();

    public Set<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }

    @OneToMany
    private Set<Abonement>abonements =new HashSet<>();

    public Set<Abonement> getAbonements() {
        return abonements;
    }

    public void setAbonements(Set<Abonement> abonements) {
        this.abonements = abonements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;

        Client client = (Client) o;

        if (id != null ? !id.equals(client.id) : client.id != null) return false;
        if (fn != null ? !fn.equals(client.fn) : client.fn != null) return false;
        if (mn != null ? !mn.equals(client.mn) : client.mn != null) return false;
        if (ln != null ? !ln.equals(client.ln) : client.ln != null) return false;
        if (profesion != null ? !profesion.equals(client.profesion) : client.profesion != null) return false;
        if (dateCreation != null ? !dateCreation.equals(client.dateCreation) : client.dateCreation != null)
            return false;
        if (datebirth != null ? !datebirth.equals(client.datebirth) : client.datebirth != null) return false;
        if (comment != null ? !comment.equals(client.comment) : client.comment != null) return false;
        return sex != null ? sex.equals(client.sex) : client.sex == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (fn != null ? fn.hashCode() : 0);
        result = 31 * result + (mn != null ? mn.hashCode() : 0);
        result = 31 * result + (ln != null ? ln.hashCode() : 0);
        result = 31 * result + (profesion != null ? profesion.hashCode() : 0);
        result = 31 * result + (dateCreation != null ? dateCreation.hashCode() : 0);
        result = 31 * result + (datebirth != null ? datebirth.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        return result;
    }




    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDatebirth() {
        return datebirth;
    }

    public void setDatebirth(Date datebirth) {
        this.datebirth = datebirth;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesionn) {
        this.profesion = profesionn;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public String getMn() {
        return mn;
    }

    public void setMn(String mn) {
        this.mn = mn;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
