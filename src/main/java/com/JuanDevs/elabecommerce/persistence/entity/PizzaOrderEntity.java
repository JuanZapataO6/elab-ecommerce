package com.JuanDevs.elabecommerce.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "pizza_order")
@Getter
@Setter
@NoArgsConstructor
public class PizzaOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private Integer idOrder;
    @Column(name = "id_costumer", nullable = false)
    private String idCostumer;
    @Column(nullable = false, columnDefinition = "timestamp")
    private LocalDateTime date;
    @Column(nullable = false,columnDefinition = "DECIMAL(6,2)")
    private Integer total;
    @Column(nullable = false, columnDefinition = "CHAR(1)")
    private String method;
    @Column(name = "additional_notes",length = 200)
    private Integer additionalNotes;

}
