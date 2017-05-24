package domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Admin on 21.02.2017.
 */
@Entity
@Table(name = "worklist")
public class WorkList {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "work_seq")
    @SequenceGenerator(name = "work_seq",sequenceName = "public.worklist_id_seq")
    private Integer id;

    @ManyToOne(cascade= {CascadeType.REFRESH}, fetch=FetchType.LAZY)
    @JoinColumn (name ="idinstructor" )
    private Instructor instructor;

    @ManyToOne(cascade= {CascadeType.REFRESH}, fetch=FetchType.LAZY)
    @JoinColumn(name = "trainkindsid")
    private Traindirections trainDirection;

    @Column(name = "begin")
    private Date begin;

    @Column(name="end")
    private  Date end;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Traindirections getTrainDirection() {
        return trainDirection;
    }

    public void setTrainDirection(Traindirections trainDirection) {
        this.trainDirection = trainDirection;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
