package hoang.pham.vn.model;

import org.hibernate.id.*;

import javax.persistence.*;

/**
 * Created by hoangpvm on 8/19/2015.
 */
@Entity
public class IncrementIdEntity {

    @Id
    @GeneratedValue (generator = "increment")
    private Long id;

    @Column
    private String field;

    public IncrementIdEntity() {
    }

    public IncrementIdEntity(Long id, String field) {
        this.id = id;
        this.field = field;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
