public class Main3 {

  public static void main(String[] args) {
    // переменная: именованная ячейка памяти
    // ТипДанных имяПеременной;
    String name;
    // запись в переменную:
    // имяПеременной = значение;
    // "=" - assignment operator (оператор присваивания)
    name = "Мефодий";
    System.out.println("Меня зовут " + name);
    // int - integer - целое число
    int age;
    age = 46;
    System.out.println("Мне " + age + " лет");
    // Можно объединить создание переменной и задание значения (инициализация)
    // ТипДанных имяПеременной = значение;
    String occupation = "банкир";
    System.out.println("Я " + occupation);
    // При записи значения в переменную предыдущее значение стирается
    age++; // age = age + 1; // увеличить age на 1
    System.out.println("В следующем году мне будет " + age + " лет");
  }
  // String name       : "Мефодий"
  // int age           : 47
  // String occupation : "банкир"
}
