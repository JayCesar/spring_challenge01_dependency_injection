package org.jaycesar.challenge01_injecaodedependencia.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {
    private Integer code;
    private Double basic;
    private Double discount;
}
