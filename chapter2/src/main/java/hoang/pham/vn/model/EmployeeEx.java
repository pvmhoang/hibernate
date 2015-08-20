package hoang.pham.vn.model;

import javax.persistence.*;

/**
 * Created by hoangpvm on 8/20/2015.
 */
@Entity
@Table(name = "EMPLOYEE_EX")
@IdClass(EmployeeId.class)
public class EmployeeEx {
    @Id
    private Long department;

    @Id
    private Long idCard;

    @Column(nullable = false)
    private String name;

    public EmployeeEx() {
    }

    public EmployeeEx(Long department, Long idCard, String name) {
        this.department = department;
        this.idCard = idCard;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
