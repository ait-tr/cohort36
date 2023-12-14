package classwork.example01;

import java.util.Comparator;

public class AdvancedMain {
    public static void printMetals(Metal[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName() + ", melt temp: " + arr[i].getMeltingTemperature());
        }
    }
    public static void sortMetals(Metal[] arr, Comparator<Metal> metalComparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (metalComparator.compare(arr[index], arr[j]) > 0) {
                    index = j;
                }
            }
            if (index == i) {
                continue;
            }
            Metal temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Metal[] metals = {
                new Metal("Silver", 962, "White", 10.49, true),
                new Metal("Gold", 1064, "Yellow", 19.32, true),
                new Metal("Iron", 1538, "Gray", 7.87, false),
                new Metal("Copper", 1085, "Reddish", 8.96, true),
                new Metal("Aluminum", 660, "Silvery", 2.70, false),
                new Metal("Platinum", 1768, "Silver", 21.45, true),
                new Metal("Lead", 327, "Blueish", 11.34, false),
                new Metal("Nickel", 1455, "Metallic", 8.90, false),
                new Metal("Zinc", 419, "Bluish-white", 7.14, false),
                new Metal("Tin", 232, "Silver-white", 7.31, false)
        };

        printMetals(metals);
        Comparator<Metal> metalComparator = Comparator.comparing(Metal::getName);
        sortMetals(metals, metalComparator);
        System.out.println("Sorted");
        printMetals(metals);

        Comparator<Metal> meltingPointMetalComparator =  Comparator.comparing(Metal::getMeltingTemperature);
        sortMetals(metals, meltingPointMetalComparator);
        System.out.println("Sorted by melting point");
        printMetals(metals);

    }
}
