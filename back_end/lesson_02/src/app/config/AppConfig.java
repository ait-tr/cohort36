package app.config;

import app.staff.administration.Director;
import app.staff.administration.ProductionChief;
import app.staff.administration.SalesChief;
import app.staff.specialists.Secretary;
import app.staff.specialists.production.MachineOperator;
import app.staff.specialists.production.Storekeeper;
import app.staff.specialists.sales.Merchandiser;
import app.staff.specialists.sales.SalesManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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