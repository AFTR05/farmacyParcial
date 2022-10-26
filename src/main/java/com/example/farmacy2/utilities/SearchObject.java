package com.example.farmacy2.utilities;

import com.example.farmacy2.Model.Client;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class SearchObject {
    public Client getClient(String name, ArrayList<Client> ListClient){
        for (Client client : ListClient) {
            if(client.getName().equals(name)){
                return client;
            }
        }
        return null;
    }

    public String getClientAge(String name, ArrayList<Client> ListClient){
        String message="";
        for (Client client : ListClient) {
            if(client.getName().equals(name)){
                if (client.getAge()>18){
                    message="The client is over age";
                    return message;
                } else {
                    message="The client is under age";
                    return message;
                }
            }
        }
        return null;
    }
}
