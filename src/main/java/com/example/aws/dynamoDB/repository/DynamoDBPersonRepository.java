package com.example.aws.dynamoDB.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.example.aws.dynamoDB.models.Car;
import com.example.aws.dynamoDB.models.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DynamoDBPersonRepository {

    private final DynamoDBMapper dynamoDBMapper;

    public void create(Person person) {
        dynamoDBMapper.save(person);
    }

    public void createCar(Car car) {
        dynamoDBMapper.save(car);
    }

}
