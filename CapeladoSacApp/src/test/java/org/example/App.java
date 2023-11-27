package org.example;

import com.sun.tools.javac.Main;
import org.example.util.ConversorDeMedida;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App{
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ConversorDeMedida conversor = new ConversorDeMedida();

            while (true) {

                LOGGER.info("Apresentando menu de opções de conversão");
                System.out.println("Escolha uma conversão:");
                System.out.println("1. Polegadas para Centímetros");
                System.out.println("2. Centímetros para Polegadas");
                System.out.println("3. Pés para Metros");
                System.out.println("4. Metros para Pés");
                System.out.println("5. Milhas para Quilômetros");
                System.out.println("6. Quilômetros para Milhas");
                System.out.println("7. Jardas para Metros");
                System.out.println("8. Metros para Jardas");
                System.out.println("9. Galões para Litros");
                System.out.println("10. Litros para Galões");
                System.out.println("11. Onças para Gramas");
                System.out.println("12. Gramas para Onças");
                System.out.println("13. Libras para Quilogramas");
                System.out.println("14. Quilogramas para Libras");
                System.out.println("15. Celsius para Fahrenheit");
                System.out.println("16. Fahrenheit para Celsius");
                System.out.println("17. Quilômetros por hora para Milhas por hora");
                System.out.println("18. Milhas por hora para Quilômetros por hora");
                System.out.println("19. Acres para Hectares");
                System.out.println("20. Hectares para Acres");
                System.out.println("21. Sair");

                System.out.print("Digite sua escolha: ");
                int escolha = scanner.nextInt();

                if (escolha == 21) {
                    break; // Sair do programa
                }

                System.out.print("Digite o valor a ser convertido: ");
                double valor = scanner.nextDouble();

                double resultado;
                switch (escolha) {
                    case 1:
                        resultado = conversor.InchToCm(valor);
                        break;
                    case 2:
                        resultado = conversor.CmToInch(valor);
                        break;
                    case 3:
                        resultado = conversor.FeetToMeters(valor);
                        break;
                    case 4:
                        resultado = conversor.MetersToFeet(valor);
                        break;
                    case 5:
                        resultado = conversor.MilesToKm(valor);
                        break;
                    case 6:
                        resultado = conversor.KmToMiles(valor);
                        break;
                    case 7:
                        resultado = conversor.YardsToMeters(valor);
                        break;
                    case 8:
                        resultado = conversor.MetersToYards(valor);
                        break;
                    case 9:
                        resultado = conversor.GallonsToLiters(valor);
                        break;
                    case 10:
                        resultado = conversor.LitersToGallons(valor);
                        break;
                    case 11:
                        resultado = conversor.OuncesToGrams(valor);
                        break;
                    case 12:
                        resultado = conversor.GramsToOunces(valor);
                        break;
                    case 13:
                        resultado = conversor.PoundsToKg(valor);
                        break;
                    case 14:
                        resultado = conversor.KgToPounds(valor);
                        break;
                    case 15:
                        resultado = conversor.CelsiusToFahrenheit(valor);
                        break;
                    case 16:
                        resultado = conversor.FahrenheitToCelsius(valor);
                        break;
                    case 17:
                        resultado = conversor.KmHToMph(valor);
                        break;
                    case 18:
                        resultado = conversor.MphToKmH(valor);
                        break;
                    case 19:
                        resultado = conversor.AcresToHectares(valor);
                        break;
                    case 20:
                        resultado = conversor.HectaresToAcres(valor);
                        break;
                    default:
                        System.out.println("Opção inválida");
                        continue;
                }

                System.out.println("Resultado da conversão: " + resultado);
                System.out.println();
            }

            scanner.close();
            System.out.println("Programa encerrado.");
        }
}