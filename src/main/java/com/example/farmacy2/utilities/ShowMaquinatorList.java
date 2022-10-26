package com.example.farmacy2.utilities;

import com.example.farmacy2.Model.Client;

import java.util.ArrayList;

public class ShowMaquinatorList {
    public String ShowList(ArrayList<Client> clients){
        String message="";
        if (clients==null){
            message="No data yet";
            return message;
        }
        for (int x=0;x<clients.size();x++){
            message+=clients.get(x).getName()+"-"+clients.get(x).getAge()+"\n";
        }
        return message;
    }
}
