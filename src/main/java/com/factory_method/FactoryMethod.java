package com.factory_method;


interface Product {
    void sayHello();
}

class ProductA implements Product {
    @Override
    public void sayHello() {
        System.out.println("I'm product A");
    }
}

class ProductB implements Product {
    @Override
    public void sayHello() {
        System.out.println("I'm product B");
    }
}

abstract class Client {
    abstract protected Product createProduct();
    
    public void whichProduct() {
        Product product = createProduct();
        product.sayHello();
    }
}

final class ClientA extends Client {
    @Override
    protected Product createProduct() {
        return new ProductA();
    }
}

final class ClientB extends Client {
    @Override
    protected Product createProduct() {
        return new ProductB();
    }
}


public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0 ; i < 4 ; ++i) {
            Client client;
            if (i % 2 == 0) {
                client = new ClientA();
            } else {
                client = new ClientB();
            }
            client.whichProduct();
        }
    }

}
