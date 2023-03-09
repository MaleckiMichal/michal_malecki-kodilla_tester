package com.kodilla.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;

public class NotificationServiceTestSuite {

    NotificationService notificationService = new NotificationService();
    Client client = Mockito.mock(Client.class);
    Client secondClient = Mockito.mock(Client.class);
    Client thirdClient = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        notificationService.sendNotification(notification);

        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void subscribedClientShouldReceiveNotification() {
        notificationService.addSubscriber(client);

        notificationService.sendNotification(notification);

        Mockito.verify(client).receive(notification);
    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients() {
        addSubscribers(client, secondClient, thirdClient);

        notificationService.sendNotification(notification);

        Mockito.verify(client).receive(notification);
        Mockito.verify(secondClient).receive(notification);
        Mockito.verify(thirdClient).receive(notification);
    }


    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {
        addSubscribers(client, client, client);

        notificationService.sendNotification(notification);

        Mockito.verify(client).receive(notification);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {
        notificationService.addSubscriber(client);
        notificationService.removeSubscriber(client);

        notificationService.sendNotification(notification);

        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    private void addSubscribers(Client client1, Client client2, Client client3) {
        Set<Client> clients = new HashSet<>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        for(Client currentClient : clients) {
            notificationService.addSubscriber(currentClient);
        }
    }

}