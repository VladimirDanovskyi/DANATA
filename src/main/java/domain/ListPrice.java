package domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Admin on 21.02.2017.
 */
@Entity
@Table(name = "listprice")
public class ListPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "lp_seq")
    @SequenceGenerator(name = "lp_seq", sequenceName = "public.\"Prises_id_seq\"", allocationSize =0)
    private Integer id;

    @ManyToOne(cascade= {CascadeType.REFRESH}, fetch=FetchType.LAZY)
    @JoinColumn(name = "kindabid")
    private AbonementKind abonemenKind;

    @ManyToOne(cascade= {CascadeType.REFRESH}, fetch=FetchType.LAZY)
    @JoinColumn (name = "otherserviceid")
    private OtherServices otherSrvice;

    @Column (name = "datebegin")

    private Date dateBegin;

    @Column(name = "dateend")
    private Date dateEnd;

    @Column (name = "price")
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AbonementKind getAbonemenKind() {
        return abonemenKind;
    }

    public void setAbonemenKind(AbonementKind kindAb) {
        this.abonemenKind = kindAb;
    }

    public OtherServices getOtherSrvice() {
        return otherSrvice;
    }

    public void setOtherSrvice(OtherServices otherSrvice) {
        this.otherSrvice = otherSrvice;
    }

    public Date getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListPrice)) return false;

        ListPrice listPrice = (ListPrice) o;

        if (id != null ? !id.equals(listPrice.id) : listPrice.id != null) return false;
        if (dateBegin != null ? !dateBegin.equals(listPrice.dateBegin) : listPrice.dateBegin != null) return false;
        if (dateEnd != null ? !dateEnd.equals(listPrice.dateEnd) : listPrice.dateEnd != null) return false;
        return price != null ? price.equals(listPrice.price) : listPrice.price == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dateBegin != null ? dateBegin.hashCode() : 0);
        result = 31 * result + (dateEnd != null ? dateEnd.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
