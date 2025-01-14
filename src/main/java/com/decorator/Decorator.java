package com.decorator;

interface Notifier {
    void sendNotification();
}

class BaseNotifier implements Notifier {
    @Override
    public void sendNotification() {
        System.out.println("Notification sent");
    }
}

class BaseDecorator implements Notifier {
    protected final Notifier wrappee;

    BaseDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void sendNotification() {
        wrappee.sendNotification();
    }
}

class FacebookDecorator extends BaseDecorator {
    FacebookDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendNotification() {
        System.out.println("Facebook notification configured");
        super.sendNotification();
    }
}

class TwitterDecorator extends BaseDecorator {
    TwitterDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendNotification() {
        System.out.println("Twitter notification configured");
        super.sendNotification();
    }
}

class Runner {
    private static void decoratorCustomizationExample() {
        System.out.println("Decorator customization example");
        System.out.println("-------------------------------");
        Notifier notifier = new BaseNotifier();

        // Usage as just a single custom notifier
        notifier = new TwitterDecorator(notifier);
        notifier.sendNotification();
        System.out.println("\n");
    }

    private static void customStackAsPerRuntimeConfigurationExample(boolean facebookNotifier, boolean twitterNotifier) {
        System.out.println("Custom notification stack as per runtime configuration example");
        System.out.println("--------------------------------------------------------------");
        Notifier notifier = new BaseNotifier();

        if (facebookNotifier) {
            notifier = new FacebookDecorator(notifier);
        }

        if (twitterNotifier) {
            notifier = new TwitterDecorator(notifier);
        }

        notifier.sendNotification();
    }
    public static void main(String[] args) {
        decoratorCustomizationExample();
        customStackAsPerRuntimeConfigurationExample(/*facebookNotifier=*/true, /*twitterNotifier=*/true);
    }
}
