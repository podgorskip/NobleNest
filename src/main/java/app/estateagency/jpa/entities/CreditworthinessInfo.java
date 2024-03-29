package app.estateagency.jpa.entities;

import app.estateagency.enums.credit.EducationLevel;
import app.estateagency.enums.credit.EmploymentStatus;
import app.estateagency.enums.credit.Gender;
import app.estateagency.enums.credit.MaritalStatus;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "credit_worthiness", schema = "real_estate")
@Data
public class CreditworthinessInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private int age;

    @Enumerated(value = EnumType.STRING)
    private MaritalStatus maritalStatus;

    @Enumerated(value = EnumType.STRING)
    private EmploymentStatus employmentStatus;

    private double income;

    private double debts;

    @Enumerated(value = EnumType.STRING)
    private EducationLevel educationLevel;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    private double expenses;
}
