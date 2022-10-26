package com.example.farmacy2.Model;

import com.example.farmacy2.Service.impl.ClientServiceImpl;
import com.example.farmacy2.utilities.SearchObject;
import com.example.farmacy2.utilities.ShowMaquinatorList;

public class Laboratory {
    private final ClientServiceImpl clientService;
    private final SearchObject searchObject;
    private final ShowMaquinatorList showMaquinatorList;

    public Laboratory() {
        clientService = new ClientServiceImpl();
        searchObject=new SearchObject();
        showMaquinatorList=new ShowMaquinatorList();
    }

    public SearchObject getSearchObject() {
        return searchObject;
    }

    public ShowMaquinatorList getShowMaquinatorList() {
        return showMaquinatorList;
    }

    public ClientServiceImpl getClientService() {
        return clientService;
    }
}
