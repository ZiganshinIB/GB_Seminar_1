package lesson6.homework;

import java.util.*;

// Магазин Ноутбуков
public class LaptopStore {
    private List<Laptop> laptops;
    private Double profits=0.0;

    public LaptopStore(){ laptops = new ArrayList<>();}
    public LaptopStore(List<Laptop> laptops){
        this.laptops = laptops;
    }
    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public void sell(Laptop laptop){
        laptops.remove(laptop);
        profits += laptop.getPrice();
    }

    public void filterLaptops(Map<String, Object> filters) {
        for (Laptop laptop : laptops) {
            boolean matchesFilter = true;

            for (Map.Entry<String, Object> entry : filters.entrySet()) {
                String field = entry.getKey();
                Object value = entry.getValue();

                switch (field) {
                    case "brand":
                        matchesFilter &= laptop.getBrand().equals(value);
                        break;
                    case "model":
                        matchesFilter &= laptop.getModel().equals(value);
                        break;
                    case "price":
                        matchesFilter &= laptop.getPrice() >= (double) value;
                        break;
                    case "screen_size":
                        matchesFilter &= laptop.getScreenSize() >= (double) value;
                        break;
                    case "ram":
                        matchesFilter &= laptop.getRam() >= (int) value;
                        break;
                    case "storage":
                        matchesFilter &= laptop.getStorage() >= (int) value;
                        break;
                    case "processor":
                        matchesFilter &= laptop.getProcessor().equals(value);
                        break;
                    case "graphics_card":
                        matchesFilter &= laptop.getGraphicsCard().equals(value);
                        break;
                    case "OS":
                        matchesFilter &= laptop.getOS_name().equals(value);
                    default:
                        System.out.println("Unknown filter: " + field);
                        break;
                }
            }

            if (matchesFilter) {
                System.out.println(laptop.getBrand() + " " + laptop.getModel() + " - " + laptop.getPrice() + " USD");
            }
        }
    }

    public static void main(String[] args) {
        LaptopStore store = new LaptopStore();

        Laptop laptop1 = new Laptop("Apple", "MacBook Pro", 1799.99, 13.3, 8, 256, "Intel Core i5", "Intel Iris Plus Graphics 645", "Windows");
        Laptop laptop2 = new Laptop("Dell", "XPS 13", 1099.99, 13.4, 8, 256, "Intel Core i5", "Intel UHD Graphics", "Linux");
        Laptop laptop3 = new Laptop("HP", "Envy x360", 999.99, 15.6, 16, 512, "AMD Ryzen 7", "AMD Radeon Graphics", "FreeOS");

        store.addLaptop(laptop1);
        store.addLaptop(laptop2);
        store.addLaptop(laptop3);

        Map<String, Object> filters = new HashMap<>();
        filters.put("price", 1000.0);
        filters.put("ram", 8);

        System.out.println("Laptops matching filter:");
        store.filterLaptops(filters);
    }
}
