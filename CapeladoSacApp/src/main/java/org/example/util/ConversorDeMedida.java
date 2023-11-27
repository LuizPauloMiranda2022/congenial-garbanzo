package org.example.util;

public class ConversorDeMedida {

    // 1. Polegadas para Centímetros
    public double InchToCm(double inch) {
        if (inch < 0) {
            throw new IllegalArgumentException("Valor em polegadas não pode ser negativo.");
        }
        return inch * 2.54;
    }

    // 2. Centímetros para Polegadas
    public double CmToInch(double cm) {
        return cm / 2.54;
    }

    // 3. Pés para Metros
    public double FeetToMeters(double feet) {
        return feet * 0.3048;
    }

    // 4. Metros para Pés
    public double MetersToFeet(double meters) {
        return meters / 0.3048;
    }

    // 5. Milhas para Quilômetros
    public double MilesToKm(double miles) {
        return miles * 1.60934;
    }

    // 6. Quilômetros para Milhas
    public double KmToMiles(double km) {
        return km / 1.60934;
    }

    // 7. Jardas para Metros
    public double YardsToMeters(double yards) {
        return yards * 0.9144;
    }

    // 8. Metros para Jardas
    public double MetersToYards(double meters) {
        return meters / 0.9144;
    }

    // 9. Galões para Litros
    public double GallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // 10. Litros para Galões
    public double LitersToGallons(double liters) {
        return liters / 3.78541;
    }

    // 11. Onças para Gramas
    public double OuncesToGrams(double ounces) {
        return ounces * 28.3495;
    }

    // 12. Gramas para Onças
    public double GramsToOunces(double grams) {
        return grams / 28.3495;
    }

    // 13. Libras para Quilogramas
    public double PoundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    // 14. Quilogramas para Libras
    public double KgToPounds(double kg) {
        return kg / 0.453592;
    }

    // 15. Celsius para Fahrenheit
    public double CelsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // 16. Fahrenheit para Celsius
    public double FahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // 17. Quilômetros por hora para Milhas por hora
    public double KmHToMph(double kmh) {
        return kmh / 1.60934;
    }

    // 18. Milhas por hora para Quilômetros por hora
    public double MphToKmH(double mph) {
        return mph * 1.60934;
    }

    // 19. Acres para Hectares
    public double AcresToHectares(double acres) {
        return acres * 0.404686;
    }

    // 20. Hectares para Acres
    public double HectaresToAcres(double hectares) {
        return hectares / 0.404686;
    }
}
