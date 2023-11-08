package com.example.challenge.controller;


import com.example.challenge.dto.RequestDto;
import com.example.challenge.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

  public static final String RECEIVE = "receive";
  public static final Double TIPO_CAMBIO = 0.26;

  @PostMapping(RECEIVE)
  public @ResponseBody
  ResponseEntity<ResponseDto> post(@RequestBody RequestDto requestDto) {
    Double amountExchangeRate = requestDto.getMonto() * TIPO_CAMBIO;
    ResponseDto build = ResponseDto.builder().monedaOrigen(requestDto.getMonedaOrigen())
        .monedaDestino(requestDto.getMonedaDestino())
        .monto(requestDto.getMonto())
        .montoExchangeRate(amountExchangeRate)
        .tipoCambio(TIPO_CAMBIO).build();
    return new ResponseEntity<>(build, HttpStatus.OK);
  }

}
