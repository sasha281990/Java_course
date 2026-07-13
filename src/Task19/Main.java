package src.Task19;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // 1. Интерфейс + лямбда: перевод строки в верхний регистр
        StringProcessor toUpperCase = input -> input.toUpperCase();
        System.out.println("Uppercase: " + toUpperCase.process("hello java"));

        // 2. Создаем города
        List<City> cities = new ArrayList<>();
        cities.add(new City(1, "Minsk", 2000000, Continent.EUROPE));
        cities.add(new City(2, "Warsaw", 1800000, Continent.EUROPE));
        cities.add(new City(3, "Tokyo", 37000000, Continent.ASIA));
        cities.add(new City(4, "Beijing", 21500000, Continent.ASIA));
        cities.add(new City(5, "Nairobi", 4400000, Continent.AFRICA));
        cities.add(new City(6, "Cairo", 20000000, Continent.AFRICA));
        cities.add(new City(7, "Sydney", 5300000, Continent.AUSTRALIA));
        cities.add(new City(8, "Montevideo", 1400000, Continent.SOUTH_AMERICA));

        // 1.2 Самый густонаселённый город на континенте (пример: EUROPE)
        Optional<City> maxInEurope = cities.stream()
                .filter(city -> city.getContinent() == Continent.EUROPE)
                .max((c1, c2) -> Long.compare(c1.getPopulation(), c2.getPopulation()));

        System.out.println("Max in Europe: " + maxInEurope.orElse(null));

        // 1.3 Город с минимальным населением на континенте (пример: ASIA)
        Optional<City> minInAsia = cities.stream()
                .filter(city -> city.getContinent() == Continent.ASIA)
                .min((c1, c2) -> Long.compare(c1.getPopulation(), c2.getPopulation()));

        System.out.println("Min in Asia: " + minInAsia.orElse(null));

        // 1.4 Самый густонаселённый город
        Optional<City> maxCity = cities.stream()
                .max((c1, c2) -> Long.compare(c1.getPopulation(), c2.getPopulation()));

        System.out.println("Max city: " + maxCity.orElse(null));

        // 1.5 Город с самым маленьким населением
        Optional<City> minCity = cities.stream()
                .min((c1, c2) -> Long.compare(c1.getPopulation(), c2.getPopulation()));

        System.out.println("Min city: " + minCity.orElse(null));

        // 1.6 Первый город, у которого население больше 1 млн
        Optional<City> firstOverMillion = cities.stream()
                .filter(city -> city.getPopulation() > 1_000_000)
                .findFirst();

        System.out.println("First city over 1M: " + firstOverMillion.orElse(null));

        // 1.7 Отобрать города с населением больше 1 млн
        List<City> overMillionCities = cities.stream()
                .filter(city -> city.getPopulation() > 1_000_000)
                .collect(Collectors.toList());

        System.out.println("Cities over 1M:");
        overMillionCities.forEach(System.out::println);

        // 1.8 Коллекция из названий городов на основании объектов
        List<String> cityNames = cities.stream()
                .map(City::getName)
                .collect(Collectors.toList());

        System.out.println("City names:");
        System.out.println(cityNames);
    }
}
