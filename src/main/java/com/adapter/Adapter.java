package com.adapter;

interface Service {
    void getLatestMessage(int x);
}

class ServiceImpl implements Service {
    @Override
    public void getLatestMessage(int x) {
        System.out.println("Value = " + x);
    }
}

interface Client {
    void getLatestMessage(String s);
}

class Adapter implements Client {
    private final Service service;

    public Adapter(Service service) {
        this.service = service;
    }

    @Override
    public void getLatestMessage(String s) {
        service.getLatestMessage(Integer.parseInt(s));
    }
}

class User {
    public static void main(String[] args) {
        Service service = new ServiceImpl();
        Client client = new Adapter(service);
        client.getLatestMessage("12345");
    }
}
