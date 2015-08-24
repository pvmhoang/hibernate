package hoang.pham.vn.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by hoangpvm on 8/24/2015.
 */
@Embeddable
public class ISBN implements Serializable{

    @Column (name = "group_number")
    private int group;
    private int publisher;
    private int titleRef;
    private int checkDigit;

    public ISBN() {
    }

    public ISBN(int ean,int group, int publisher, int titleRef, int checkDigit) {
        this.group = group;
        this.publisher = publisher;
        this.titleRef = titleRef;
        this.checkDigit = checkDigit;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getPublisher() {
        return publisher;
    }

    public void setPublisher(int publisher) {
        this.publisher = publisher;
    }

    public int getTitleRef() {
        return titleRef;
    }

    public void setTitleRef(int titleRef) {
        this.titleRef = titleRef;
    }

    public int getCheckDigit() {
        return checkDigit;
    }

    public void setCheckDigit(int checkDigit) {
        this.checkDigit = checkDigit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ISBN isbn = (ISBN) o;

        if (group != isbn.group) return false;
        if (publisher != isbn.publisher) return false;
        if (titleRef != isbn.titleRef) return false;
        return checkDigit == isbn.checkDigit;

    }

    @Override
    public int hashCode() {
        int result = group;
        result = 31 * result + publisher;
        result = 31 * result + titleRef;
        result = 31 * result + checkDigit;
        return result;
    }
}
