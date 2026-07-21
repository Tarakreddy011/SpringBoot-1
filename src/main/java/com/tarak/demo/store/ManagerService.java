package com.tarak.demo.store;

import org.springframework.beans.factory.annotation.Autowired;

public class ManagerService {

    @Autowired
    ManagerRepo managerRepo;

//    public CreateStoreResponseDTO createStore(CreateStoreRequestDTO request) {
//        Manager manager = mapToRequest(request);
//    }

    private Manager mapToRequest(CreateStoreRequestDTO request) {
        Manager manager = new Manager();
        manager.setName(request.getName());
//        manager.getManagerstorename(request.get)
        manager.setAge(request.getAge());
        return manager;
    }

}
