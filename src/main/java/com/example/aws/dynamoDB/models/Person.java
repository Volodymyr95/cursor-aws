package com.example.aws.dynamoDB.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@DynamoDBTable(tableName = "person")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @DynamoDBHashKey(attributeName = "person_id")
    public Long id;

    @DynamoDBAttribute
    public String name;

    @DynamoDBAttribute
    public int age;
}
