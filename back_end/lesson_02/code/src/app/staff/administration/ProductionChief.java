package src.app.staff.administration;

import src.app.staff.specialists.production.MachineOperator;
import src.app.staff.specialists.production.Storekeeper;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductionChief {

    @Autowired
    private MachineOperator machineOperator;

    @Autowired
    private Storekeeper storekeeper;

    public void setMachineOperator(MachineOperator machineOperator) {
        this.machineOperator = machineOperator;
    }

    public void setStorekeeper(Storekeeper storekeeper) {
        this.storekeeper = storekeeper;
    }

    public void giveOrders() {
        machineOperator.work();
        storekeeper.work();
    }
}