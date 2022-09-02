package com.jingsong.assignment1;

import com.jingsong.assignment1.order.Order;
import com.jingsong.assignment1.order.OrderRepository;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.apache.catalina.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class OrderRepositoryTests {
    @Autowired private OrderRepository  repository;

    @Test
    public void testAddNew(){
        Order order = new Order();
        order.setCustomerEmail("IRIS.Wang@student.uts.edu.au");
        order.setProductName("BBQ pork");
        order.setQuantity(1);
        order.setPrice(14.99);

        Order savedOrder = repository.save(order);

        Assertions.assertThat(savedOrder).isNotNull();
        Assertions.assertThat(savedOrder.getOrderID()).isGreaterThan(0);
    }

    @Test
    public void testListAll(){
        Iterable<Order> orders = repository.findAll();
        Assertions.assertThat(orders).hasSizeGreaterThan(0);

        for (Order order : orders) {
            System.out.println(order);
        }
    }

    @Test
    public void testUpdate(){
        Integer orderID = 1;
        Optional<Order> optionalOrder = repository.findById(orderID);
        Order order = optionalOrder.get();
        order.setPrice(17.99);
        repository.save(order);

        Order updatedOrder = repository.findById(orderID).get();
        Assertions.assertThat(updatedOrder.getPrice()).isEqualTo(17.99);
    }

    @Test
    public void testGet(){
        Integer orderID = 1;
        Optional<Order> optionalOrder = repository.findById(orderID);
        Order order = optionalOrder.get();

        Assertions.assertThat(optionalOrder).isPresent();
        System.out.println(optionalOrder.get());
    }

    @Test
    public void testDelete(){
        Integer orderID = 2;
        repository.deleteById(orderID);

        Optional<Order> optionalOrder = repository.findById(orderID);
        Assertions.assertThat(optionalOrder).isNotPresent();
    }
}