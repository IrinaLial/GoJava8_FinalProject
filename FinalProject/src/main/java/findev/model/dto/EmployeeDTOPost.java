package findev.model.dto;

import java.math.BigDecimal;

public class EmployeeDTOPost {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private BigDecimal hourRate;
    private Long positionId;
    private Long departmentId;
    private Long statusId;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getHourRate() {
        return hourRate;
    }
    public void setHourRate(BigDecimal hourRate) {
        this.hourRate = hourRate;
    }

    public Long getPositionId() {
        return positionId;
    }
    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getStatusId() {
        return statusId;
    }
    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }
}
