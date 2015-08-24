package hoang.pham.vn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by hoangpvm on 8/24/2015.
 */
@Entity
@Table (name = "tbl_book")
public class BookEntity {

    @Id
    private ISBN id;

    @Column
    private String title;

    public BookEntity() {
    }

    public BookEntity(int ean, int group, int publisher, int titleRef, int checkDigit, String title) {
       id = new ISBN(ean, group, publisher, titleRef, checkDigit);
        this.title = title;
    }

    public ISBN getId() {
        return id;
    }

    public void setId(ISBN id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
