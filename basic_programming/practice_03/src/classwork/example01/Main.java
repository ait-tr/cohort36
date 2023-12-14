package classwork.example01;

public class Main {
    public static void printMetals(Metal[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName() + ", melt temp: " + arr[i].getMeltingTemperature());
        }
    }

    public static void sortMetalsAlphabetically(Metal[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index].getName().charAt(0) > arr[j].getName().charAt(0)) {
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

    public static void sortMetalsByMeltingTemp(Metal[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index].getMeltingTemperature() > arr[j].getMeltingTemperature()) {
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
        System.out.println("Sorted by name:");
        sortMetalsAlphabetically(metals);
        printMetals(metals);
        System.out.println("Sorted by melting temperature:");
        sortMetalsByMeltingTemp(metals);
        printMetals(metals);

    }
}
