package es.nextdigital.demo.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String transmitterIban;
    private String receiverIban;
    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client cliente;
}
