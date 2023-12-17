package es.nextdigital.demo.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private CardType type; // ENUM: DEBITO, CREDITO

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
}
