package app.estateagency.jpa.entities;

import javax.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "archived_offer", schema = "real_estate")
@Data
public class ArchivedOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "estate_id")
    private Estate estate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private double price;

    private String description;

    private LocalDateTime archiveDate;

    @OneToOne(mappedBy = "archivedOffer", cascade = CascadeType.ALL)
    private Review review;

    @Transient
    private Boolean isReviewed = Objects.nonNull(review);

    @PrePersist
    private void prePersist() {
        archiveDate = LocalDateTime.now();
    }
}
