package com.pruebatecnica.onnovacion.financiera.adaptadores.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CuentaDto {
    private Long idCliente;
    private String tipoMoneda;
    private BigDecimal saldo;
}
