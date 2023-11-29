# Задание

`task01`

Сложность: легко (3/10)

```
Создать файл класса и скопировать в него приведенный ниже код.
Исправить возможные ошибки в методах и/или описании класса (новые методы дописывать не нужно)
В классе Main в многострочном комментарии описать, где, по вашему мнению, можно использовать этот класс.
Также написать краткое Техническое Задание (ТЗ), которое больше всего подойдет для того, чтобы по нему другой
человек смог написать такой же класс.
В методе main привести простой пример использования объекта этого класса.
```

```java
public class LightBulb {

    private String barCode;
    private String manufacturer;
    private int brightness;
    private boolean rgb;
    private double price;

    public LightBulb(String barCode, String manufacturer, int brightness, int power, boolean rgb, double price) {
        this.barCode = barCode;
        this.manufacturer = manufacturer;
        this.brightness = brightness;

        this.rgb = rgb;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getBrightness() {
        return brightness;
    }

    public int getPower() {
        return power;
    }

    public boolean isRgb() {
        return rgb;
    }
}
```