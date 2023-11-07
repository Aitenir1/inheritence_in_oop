import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        String[] deviceTypes = {"Smartphone", "Tablet", "TV"};
        String[] brands = {"Apple", "Samsung", "Xiaomi", "Huawei", "LG", "Microsoft", "Lenovo"};
        String[] displayTechs = {"LED", "PLASMA", "OLED"};

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int total_price = 0;
        int total_weight = 0;


        for (int i = 0; i < n; i++) {
            String deviceType = deviceTypes[rand.nextInt(deviceTypes.length)];
            if (deviceType.equals("Smartphone")) {
                double weight = 100 + 400 * rand.nextDouble(); // Random weight in grams (100 - 500)
                int price = 5000 + (int) (100000 * rand.nextDouble());
                String brand = brands[rand.nextInt(brands.length)];
                int ssd = (int) Math.pow(2, rand.nextInt(6) + 2);
                int ram = (int) Math.pow(2, rand.nextInt(4) + 1);
                double cameraResolution = 1 + 9 * rand.nextDouble();

                Smartphone phone = new Smartphone(
                         deviceType,
                        price,
                        weight,
                        brand,
                        brand,
                        ssd,
                        ram,
                        cameraResolution
                );

                total_price += price;
                total_weight += weight;

                phone.showInfo();

            } else if (deviceType.equals("Tablet")) {

                double weight = 200 + 400 * rand.nextDouble(); // Random weight in grams (100 - 500)
                int price = 10000 + (int) (100000 * rand.nextDouble());
                String brand = brands[rand.nextInt(brands.length)];
                int ssd = (int) Math.pow(2, rand.nextInt(6) + 2);
                int ram = (int) Math.pow(2, rand.nextInt(4) + 1);
                double cameraResolution = 1 + 9 * rand.nextDouble();

                Tablet tablet = new Tablet(
                        deviceType,
                        price,
                        weight,
                        brand,
                        brand,
                        rand.nextInt(2) == 1
                );
                total_price += price;
                total_weight += weight;

            } else {
                double weight = 500 + 400 * rand.nextDouble(); // Random weight in grams (100 - 500)
                int price = 20000 + (int) (100000 * rand.nextDouble());
                String brand = brands[rand.nextInt(brands.length)];
                String displayTech = displayTechs[rand.nextInt(displayTechs.length)];
                int ssd = (int) Math.pow(2, rand.nextInt(6) + 2);
                int ram = (int) Math.pow(2, rand.nextInt(4) + 1);
                double screenSize = 5 + 20 * rand.nextDouble();
                int refreshRate = 20 + rand.nextInt(100);

                TV tv = new TV(
                        deviceType,
                        price,
                        weight,
                        brand,
                        brand,
                        displayTech,
                        screenSize,
                        refreshRate
                );
                tv.showInfo();
                total_price += price;
                total_weight += weight;
            }
        }

        System.out.printf("DISTINCT: %d", n);
        System.out.printf("TOTAL PRICE: %d soms\n", total_price);
        System.out.printf("TOTAL WEIGHT: %d grams", total_weight);

    }
}