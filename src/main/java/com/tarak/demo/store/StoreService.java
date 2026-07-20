package com.tarak.demo.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

    @Autowired
    StoreRepo storeRepo;

    public CreateStoreResponseDTO savedetails(CreateStoreRequestDTO request) {
        Store store = mapToStore(request);
        storeRepo.save(store);
        return mapToReponseDTO(store);
    }

    private Store mapToStore(CreateStoreRequestDTO request) {
        Store store = new Store();
        store.setAge(request.getAge());
        store.setEmail(request.getEmail());
        store.setName(request.getName());
        store.setPhone(request.getPhone());
        return store;
    }

    private CreateStoreResponseDTO mapToReponseDTO(Store store) {
        CreateStoreResponseDTO response = new CreateStoreResponseDTO();
        response.setName(store.getName());
        response.setAge(store.getAge());
        response.setEmail(store.getEmail());
        response.setPhone(store.getPhone());
        return response;
    }
}