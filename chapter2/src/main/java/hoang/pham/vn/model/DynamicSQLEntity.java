package hoang.pham.vn.model;

import org.hibernate.annotations.DynamicInsert;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by hoangpvm on 8/24/2015.
 */
@Entity
@DynamicInsert
public class DynamicSQLEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String field1, field2, field3, field4, field5, field6, field7, field8;

    public DynamicSQLEntity() {
    }

    public DynamicSQLEntity(String field1, String field2, String field3, String field4, String field5, String field6, String field7, String field8) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
        this.field5 = field5;
        this.field6 = field6;
        this.field7 = field7;
        this.field8 = field8;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5;
    }

    public String getField6() {
        return field6;
    }

    public void setField6(String field6) {
        this.field6 = field6;
    }

    public String getField7() {
        return field7;
    }

    public void setField7(String field7) {
        this.field7 = field7;
    }

    public String getField8() {
        return field8;
    }

    public void setField8(String field8) {
        this.field8 = field8;
    }
}
