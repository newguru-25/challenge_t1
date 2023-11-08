package com.example.challenge.dto;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class RequestDto {

  private Double monto;
  private String monedaOrigen;
  private String monedaDestino;

}
