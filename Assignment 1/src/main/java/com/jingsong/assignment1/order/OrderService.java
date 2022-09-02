package com.jingsong.assignment1.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired private OrderRepository repository;

    public List<Order>listAll(){
        return (List<Order>) repository.findAll();
    }

    public void save(Order order) {
        repository.save(order);
    }

    public Order get(Integer id) throws OrderNotFoundException {
        Optional<Order> result = repository.findById(id);
        if (result.isPresent()){
            return result.get();
        }
        throw new OrderNotFoundException("Can not find this order");
    }

    //public void delete(Integer id) throws OrderNotFoundException {
    //    Long count = repository.countByID(id);
    //    if (count == null) {
    //        throw new OrderNotFoundException("Can not find this order");
    //    }
    //    repository.deleteById(id);
    //}
}
