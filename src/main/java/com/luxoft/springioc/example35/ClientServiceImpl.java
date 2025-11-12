package com.luxoft.springioc.example35;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired(required = false)
    private ClientDao dao;

    @Override
    public void setDao(ClientDao dao) {

    }

    @Override
    public void doTheJob() {

        if (dao != null)
        {
            System.out.println("ClientDao here not null.");
        }

        System.out.println("job from ClientServiceImpl");
    }
}
