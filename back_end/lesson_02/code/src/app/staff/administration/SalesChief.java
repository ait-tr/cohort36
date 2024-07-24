package src.app.staff.administration;

import org.springframework.beans.factory.annotation.Autowired;
import src.app.staff.specialists.sales.Merchandiser;
import src.app.staff.specialists.sales.SalesManager;


public class SalesChief {

    @Autowired
    private Merchandiser merchandiser;

    @Autowired
    private SalesManager salesManager;

    public void setMerchandiser(Merchandiser merchandiser) {
        this.merchandiser = merchandiser;
    }

    public void setSalesManager(SalesManager salesManager) {
        this.salesManager = salesManager;
    }

    public void giveOrders() {
        merchandiser.work();
        salesManager.work();
    }
}