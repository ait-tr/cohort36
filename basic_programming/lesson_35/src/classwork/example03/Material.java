package classwork.example03;

public class Material {
    private double price;
    private String name;
    private String category;
    private int amount;
    private long barcode;

    private int sale;

    public Material(double price, String name, String category, int amount, long barcode) {
        this.price = price;
        this.name = name;
        this.category = category;
        this.amount = amount;
        this.barcode = barcode;
        sale = 0;
    }

    // передаем скидку в процентах
    public void discount(int discount) {
        // если не от 0 до 100, то неправильный ввод, ничего не делаем
        if (discount < 0 || discount > 100) {
            return;
        }
        // если скидка 0, убираем скидку
        if (discount == 0) {
            price = (price / (100.0 - sale)) * 100;
        } else {
            // в ином случае, применяем скидку
            price -= price * discount / 100.0;
        }
        // в конце, сохраняем скидку чтобы потом можно было обратно посчитать новую цену
        sale = discount;
    }

    public int getSale() {
        return sale;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getAmount() {
        return amount;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
