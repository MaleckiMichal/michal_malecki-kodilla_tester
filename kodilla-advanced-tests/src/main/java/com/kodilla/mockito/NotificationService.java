package com.kodilla.mockito;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private List<Client> clients = new ArrayList<>();

    public void addSubscriber(Client client) {
        this.clients.add(client);
    }

    public void sendNotification(Notification notification) {
        this.clients.forEach(client -> client.receive(notification));
    }

    public void removeSubscriber(Client client) {
        this.clients.remove(client);
    }
}