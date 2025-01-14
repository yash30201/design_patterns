package com.composite;

import java.util.ArrayList;
import java.util.List;

interface Component {
    void execute();
}

class Leaf implements Component {
    final private int val;
    Leaf(int val) {
        this.val = val;
    }
    @Override
    public void execute() {
        System.out.println("My value is " + val);
    }
}

class Composite implements Component {
    private final List<Component> children;
    Composite() {
        children = new ArrayList<>();
    }

    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void execute() {
        for (Component child : children) {
            child.execute();
        }
    }
}

class Runner {
    public static void main(String[] args) {
        Composite root = new Composite();
        root.add(new Leaf(1));
        root.add(new Leaf(2));
        Composite child = new Composite();
        child.add(new Leaf(3));
        child.add(new Leaf(4));
        root.add(child);
        root.execute();
    }
}
