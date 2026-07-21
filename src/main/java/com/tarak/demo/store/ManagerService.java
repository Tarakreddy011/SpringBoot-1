package com.tarak.demo.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    @Autowired
    ManagerRepo managerRepo;

    public ManagerResponseDTO savemanger(ManagerRequestDTO request) {
        Manager manager = mapToRequest(request);
        managerRepo.save(manager);
        return mapToResponse(manager);
    }

    private Manager mapToRequest(ManagerRequestDTO request) {
        Manager manager = new Manager();
        manager.setName(request.getName());
        manager.setAge(request.getAge());
        manager.setManagerstorename(request.getManagerstorename());
        return manager;
    }

    private ManagerResponseDTO mapToResponse(Manager manager) {
        ManagerResponseDTO response = new ManagerResponseDTO();
        response.setName(manager.getName());
        response.setManagerstorename(manager.getManagerstorename());
        return response;
    }
}
