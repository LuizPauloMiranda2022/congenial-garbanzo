package org.example;

import org.example.util.ConversorDeMedida;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversordeMedidas {

    private static Logger LOGGER = (Logger) LoggerFactory.getLogger(ConversordeMedidas.class);
    @Test
    @DisplayName("Converter")
    public void testaInchParaCentimer(){
        LOGGER.info("Testando método InchToCm");
       ConversorDeMedida conversorDeMedida= new ConversorDeMedida();
       double Inch = conversorDeMedida.InchToCm(0D);
       assertEquals(2.54,2.54);
    }
    @Test
    @DisplayName("Converter Polegadas para Centímetros")
    public void testaInchParaCentimeter() {
        ConversorDeMedida conversorDeMedida = new ConversorDeMedida();
        double inch = 1.0; // Valor de entrada: 1 polegada
        double resultadoEsperado = 2.54; // Valor esperado: 2.54 centímetros
        double resultadoObtido = conversorDeMedida.InchToCm(inch);
        assertEquals(resultadoEsperado, resultadoObtido, 0.01); // Testa com uma margem de erro
    }
    private final ConversorDeMedida conversorDeMedida = new ConversorDeMedida();

    @Test
    @DisplayName("Converter Polegadas para Centímetros")
    public void testInchToCm() {
        assertEquals(2.54, conversorDeMedida.InchToCm(1.0), 0.01);
    }

    @Test
    @DisplayName("Converter Centímetros para Polegadas")
    public void testCmToInch() {
        assertEquals(1.0, conversorDeMedida.CmToInch(2.54), 0.01);
    }

    @Test
    @DisplayName("Converter Pés para Metros")
    public void testFeetToMeters() {
        assertEquals(0.3048, conversorDeMedida.FeetToMeters(1.0), 0.01);
    }

    @Test
    @DisplayName("Converter Metros para Pés")
    public void testMetersToFeet() {
        assertEquals(1.0, conversorDeMedida.MetersToFeet(0.3048), 0.01);
    }

    @Test
    @DisplayName("Converter Milhas para Quilômetros")
    public void testMilesToKm() {
        assertEquals(1.60934, conversorDeMedida.MilesToKm(1.0), 0.01);
    }

    @Test
    @DisplayName("Converter Quilômetros para Milhas")
    public void testKmToMiles() {
        assertEquals(1.0, conversorDeMedida.KmToMiles(1.60934), 0.01);
    }
    @Test
    @DisplayName("Converter Jardas para Metros")
    public void testYardsToMeters() {
        assertEquals(0.9144, conversorDeMedida.YardsToMeters(1.0), 0.01);
    }

    @Test
    @DisplayName("Converter Metros para Jardas")
    public void testMetersToYards() {
        assertEquals(1.0, conversorDeMedida.MetersToYards(0.9144), 0.01);
    }

    @Test
    @DisplayName("Converter Galões para Litros")
    public void testGallonsToLiters() {
        assertEquals(3.78541, conversorDeMedida.GallonsToLiters(1.0), 0.01);
    }

    @Test
    @DisplayName("Converter Litros para Galões")
    public void testLitersToGallons() {
        assertEquals(1.0, conversorDeMedida.LitersToGallons(3.78541), 0.01);
    }

    @Test
    @DisplayName("Converter Onças para Gramas")
    public void testOuncesToGrams() {
        assertEquals(28.3495, conversorDeMedida.OuncesToGrams(1.0), 0.01);
    }

    @Test
    @DisplayName("Converter Gramas para Onças")
    public void testGramsToOunces() {
        assertEquals(1.0, conversorDeMedida.GramsToOunces(28.3495), 0.01);
    }

    @Test
    @DisplayName("Converter Libras para Quilogramas")
    public void testPoundsToKg() {
        assertEquals(0.453592, conversorDeMedida.PoundsToKg(1.0), 0.01);
    }

    @Test
    @DisplayName("Converter Quilogramas para Libras")
    public void testKgToPounds() {
        assertEquals(1.0, conversorDeMedida.KgToPounds(0.453592), 0.01);
    }

    @Test
    @DisplayName("Converter Celsius para Fahrenheit")
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, conversorDeMedida.CelsiusToFahrenheit(0.0), 0.01);
    }

    @Test
    @DisplayName("Converter Fahrenheit para Celsius")
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, conversorDeMedida.FahrenheitToCelsius(32.0), 0.01);
    }

    @Test
    @DisplayName("Converter Quilômetros por hora para Milhas por hora")
    public void testKmHToMph() {
        assertEquals(1.0, conversorDeMedida.KmHToMph(1.60934), 0.01);
    }

    @Test
    @DisplayName("Converter Milhas por hora para Quilômetros por hora")
    public void testMphToKmH() {
        assertEquals(1.60934, conversorDeMedida.MphToKmH(1.0), 0.01);
    }

    @Test
    @DisplayName("Converter Acres para Hectares")
    public void testAcresToHectares() {
        assertEquals(0.404686, conversorDeMedida.AcresToHectares(1.0), 0.01);
    }

    @Test
    @DisplayName("Converter Hectares para Acres")
    public void testHectaresToAcres() {
        assertEquals(1.0, conversorDeMedida.HectaresToAcres(0.404686), 0.01);

    }


}
