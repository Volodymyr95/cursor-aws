package com.example.aws;

import com.example.aws.dynamoDB.repository.DynamoDBPersonRepository;
import com.example.aws.sns.SNSService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class CursorAwsApplication implements CommandLineRunner {

    public final SNSService snsService;
    public final DynamoDBPersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(CursorAwsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        snsService.publishToTopic(" New SOM1E message");
        //snsService.subscribeToSNSTopic("sebon69713@razuz.com");
    }
}
