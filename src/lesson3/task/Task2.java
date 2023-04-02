package lesson3.task;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Venus");
        planets.add("Mars");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Venus");
        planets.add("Venus");
        planets.add("Jupiter");

        List<String> temp = new ArrayList<>();
        List<String> result = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < planets.size(); i++) {
            if(!temp.contains(planets.get(i))){
                temp.add(planets.get(i));
                int count = 0;
                for (String planet : planets) {
                    if (planet.equals(planets.get(i))) {
                        count++;
                    }
                }
                result.add(planets.get(i)+" : "+count);
            }
        }
        System.out.println(result);
        System.out.println(System.currentTimeMillis() - startTime);

    }
}
