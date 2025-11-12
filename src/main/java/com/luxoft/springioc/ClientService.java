package com.luxoft.springioc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.val;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ClientService {
  String serviceType;
  boolean remote;

  public static ClientService createInstance(String serviceType) {

    val clientService = new ClientService()
        .setServiceType(serviceType);

    if (serviceType.equals("Software Development")) {
      clientService.setRemote(true);
    }

    // possibly perform some other operations
    // with clientService instance
    return clientService;
  }
}
