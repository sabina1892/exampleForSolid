package org.example.liskov;

public class CashierLiskov extends MarketWorker{
    @Override
    void work() {
        System.out.println("Calculate every product");
    }
}
