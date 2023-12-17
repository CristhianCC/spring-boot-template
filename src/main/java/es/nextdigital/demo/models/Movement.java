package es.nextdigital.demo.models;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Movement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal amount;
    private MovementType type;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
}
