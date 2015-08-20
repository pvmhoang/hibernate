package hoang.pham.vn.model;

import java.io.Serializable;

/**
 * Created by hoangpvm on 8/20/2015.
 */
public class EmployeeId implements Serializable {
    private Long department;;
    private Long idCard;

    public EmployeeId() {
    }

    public EmployeeId(Long department, Long idCard) {
        this.department = department;
        this.idCard = idCard;
    }

    public Long getDepartment() {
        return department;
    }

    public void setDepartment(Long department) {
        this.department = department;
    }

    public Long getIdCard() {
        return idCard;
    }

    public void setIdCard(Long idCard) {
        this.idCard = idCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeId that = (EmployeeId) o;

        if (!department.equals(that.department)) return false;
        return idCard.equals(that.idCard);

    }

    @Override
    public int hashCode() {
        int result = department.hashCode();
        result = 31 * result + idCard.hashCode();
        return result;
    }
}
