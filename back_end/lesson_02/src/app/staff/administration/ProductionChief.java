package app.staff.administration;

import app.staff.specialists.production.MachineOperator;
import app.staff.specialists.production.Storekeeper;
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