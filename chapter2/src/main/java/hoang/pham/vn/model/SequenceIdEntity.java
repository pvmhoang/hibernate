package hoang.pham.vn.model;

import javax.persistence.*;

/**
 * Created by hoangpvm on 8/19/2015.
 */
@Entity
public class SequenceIdEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String field;

    public SequenceIdEntity() {
    }

    public SequenceIdEntity(Long id) {
        this.id = id;
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
