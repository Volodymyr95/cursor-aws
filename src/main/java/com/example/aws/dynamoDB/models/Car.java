package com.example.aws.dynamoDB.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@DynamoDBTable(tableName = "car")
public class Car {

    @DynamoDBHashKey(attributeName = "car_id")
    private Long id;

    private String name;

    private double price;
}
