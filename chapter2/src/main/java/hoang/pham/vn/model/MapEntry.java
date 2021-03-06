package hoang.pham.vn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by hoangpvm on 8/24/2015.
 */

@Entity
public class MapEntry {

    @Id
    private String key;

    @Column
    private String value;

    public MapEntry() {
    }

    public MapEntry(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
