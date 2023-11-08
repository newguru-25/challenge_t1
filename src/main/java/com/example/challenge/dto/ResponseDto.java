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
public class ResponseDto {

  private Double monto;
  private Double montoExchangeRate;
  private String monedaOrigen;
  private String monedaDestino;
  private Double tipoCambio;


}
