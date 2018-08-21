package com.example.CarSharing.repository;

import com.example.CarSharing.model.Advertisement;
import com.example.CarSharing.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdsRepository extends CrudRepository<Advertisement, Long> {
    List<Advertisement> findByAuthor(User author);
}
