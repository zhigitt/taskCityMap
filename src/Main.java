import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<City> cities = new LinkedHashSet<>(Set.of(
                new City(1, "Bishkek", "Kyrgyzstan"),
                new City(2, "Berlin", "Germany"),
                new City(3, "Moscow", "Russia"),
                new City(4,"Almaty", "Kazahstan"),
                new City(5, "Paris", "France"),
                new City(6, "Chikago", "USA"),
                new City(7, "Hamburg", "Germany")
        ));
        TreeSet<City> treeSet = new TreeSet<>();

        for (City city : cities) {
            if (!(city.getId() % 2 == 0)) {
                treeSet.add(city);
            }
        }

        System.out.println(treeSet.reversed());
    }
}