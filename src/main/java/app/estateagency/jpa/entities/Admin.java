package app.estateagency.jpa.entities;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "admin", schema = "real_estate")
@Data
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
}
