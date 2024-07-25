package src.app.code;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import src.app.staff.administration.Director;
import src.app.staff.administration.ProductionChief;
import src.app.staff.administration.SalesChief;
import src.app.staff.specialists.Secretary;
import src.app.staff.specialists.production.MachineOperator;
import src.app.staff.specialists.production.Storekeeper;
import src.app.staff.specialists.sales.Merchandiser;
import src.app.staff.specialists.sales.SalesManager;


public class Application {

    public static void main(String[] args) {

        // Вариант кода без использования Spring
//        MachineOperator machineOperator = new MachineOperator();
//        Storekeeper storekeeper = new Storekeeper();
//
//        Merchandiser merchandiser = new Merchandiser();
//        SalesManager salesManager = new SalesManager();
//
//        Secretary secretary = new Secretary();
//
//        ProductionChief productionChief = new ProductionChief();
//        productionChief.setMachineOperator(machineOperator);
//        productionChief.setStorekeeper(storekeeper);
//
//        SalesChief salesChief = new SalesChief();
//        salesChief.setMerchandiser(merchandiser);
//        salesChief.setSalesManager(salesManager);
//
//        Director director = new Director();
//        director.setSecretary(secretary);
//        director.setProductionChief(productionChief);
//        director.setSalesChief(salesChief);
//
//        director.manageCompany();

        // Вариант кода с использованием Spring
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("src.app.config");
        Director director = context.getBean(Director.class);
        director.manageCompany();
    }
}