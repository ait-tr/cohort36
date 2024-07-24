package src.app.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import src.app.staff.administration.Director;
import src.app.staff.administration.ProductionChief;
import src.app.staff.administration.SalesChief;
import src.app.staff.specialists.Secretary;
import src.app.staff.specialists.production.MachineOperator;
import src.app.staff.specialists.production.Storekeeper;
import src.app.staff.specialists.sales.Merchandiser;
import src.app.staff.specialists.sales.SalesManager;

// Алгоритм работы Спринга:
// 1. Стартует приложение
// 2. Спринг сканирует наше приложение и находит класс,
//    помеченный аннотацией @Configuration
// 3. Из этого класса Спринг запускает все методы,
//    помеченные аннотацией @Bean
// 4. Все объекты, которые возвращают эти методы, Спринг делает бинами,
//    то есть - помещает их в Спринг-контекст (хранилище бинов).
// 5. Сканирует созданные бины на предмет наличия аннотации @Autowired на полях.
// 6. Для тех полей, которые помечены аннотацией @Autowired,
//    Спринг находит соответствующие бины в Спринг-контексте
//    и внедряет эти бины в соответствующие поля,
//    например поле secretary в классе Director.
// 7. Таким образом мы на старте приложения имеем Спринг-контекст,
//    в котором уже лежат все созданные и готовые к работе бины,
//    с заполненными полями.

@Configuration
public class AppConfig {

    @Bean
    public Director director() {
        return new Director();
    }

    @Bean
    public ProductionChief productionChief() {
        return new ProductionChief();
    }

    @Bean
    public SalesChief salesChief() {
        return new SalesChief();
    }

    @Bean
    public Secretary secretary() {
        return new Secretary();
    }

    @Bean
    public MachineOperator machineOperator() {
        return new MachineOperator();
    }

    @Bean
    public Storekeeper storekeeper() {
        return new Storekeeper();
    }

    @Bean
    public Merchandiser merchandiser() {
        return new Merchandiser();
    }

    @Bean
    public SalesManager salesManager() {
        return new SalesManager();
    }
}