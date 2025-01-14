package com.bridge;

interface Remote {
    void increaseVolume();
}

interface Device {
    void increaseVolume();
}

class Television implements Device {
    final private Remote remote;
    Television(Remote remote) {
        this.remote = remote;
    }

    @Override
    public void increaseVolume() {
        remote.increaseVolume();
    }
}

class AnalogRemote implements Remote {
    int volumeLevel;
    AnalogRemote() {
        volumeLevel = 0;
    }

    @Override
    public void increaseVolume() {
        volumeLevel += 1;
        System.out.println("Increased volume by 1");
    }
}

public class Bridge {
    public static void main(String[] args) {
        Remote analogRemote = new AnalogRemote();
        Device tv = new Television(analogRemote);
        tv.increaseVolume();
    }
}
