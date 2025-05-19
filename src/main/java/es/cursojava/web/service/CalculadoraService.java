package main.java.es.cursojava.web.service;

import main.java.es.cursojava.web.dto.CalculadoraDTO;

public class CalculadoraService {
    public CalculadoraDTO ejecutaOperacion1 (CalculadoraDTO dto) {
            
        String operacion = dto.getOperacion();
        int resultado = 0;
        int numero1 = dto.getNumero1();
        int numero2 = dto.getNumero2();
        switch(operacion) {
            case "suma" : resultado = numero1 + numero2; break;
            case "resta" : resultado = numero1 - numero2; break;
            case "multiplica" : resultado = numero1 * numero2; break;
            case "divide" : resultado = numero1 / numero2; break;
            default : ; break;
        }
        dto.setMensaje("El resultado de la operación es ");
        dto.setResultado(resultado);
        return dto;
    }
        
    public void ejecutaOperacion2 (CalculadoraDTO dto) {
        
        String operacion = dto.getOperacion();
        int resultado = 0;
        int numero1 = dto.getNumero1();
        int numero2 = dto.getNumero2();
        switch(operacion) {
            case "suma" : resultado = numero1 + numero2; break;
            case "resta" : resultado = numero1 - numero2; break;
            case "multiplica" : resultado = numero1 * numero2; break;
            case "divide" : resultado = numero1 / numero2; break;
            default : ; break;
        }
        dto.setMensaje("El resultado de la operación es ");
        dto.setResultado(resultado);
        //return dto;
    }
}
