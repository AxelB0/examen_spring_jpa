package be.intecbrussel.examspringjpa.model;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Objects;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="employee_id")
    @Min(0)
    private Long id;

    @NotNull
    private String firstname;

    @NotNull
    @NotBlank
    private String lastname;

    @NotBlank
    @NotEmpty
    @Lob
    @Column(nullable = false, unique = true)
    @NotNull
    @Email
    @Max(10000000)
    private String email;

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
