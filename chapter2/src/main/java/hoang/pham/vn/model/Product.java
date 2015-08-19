package hoang.pham.vn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by hoangpvm on 8/19/2015.
 */
@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    private long sku;

    @Column
    private String title;

    @Column
    private String description;

    public Product() {
    }

    public Product(long sku, String title, String description) {
        this.sku = sku;
        this.title = title;
        this.description = description;
    }

    public long getSku() {
        return sku;
    }

    public void setSku(long sku) {
        this.sku = sku;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
