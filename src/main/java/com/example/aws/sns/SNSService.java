package com.example.aws.sns;

import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.SubscribeRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SNSService {

    private String TOPIC_ARN = "arn:aws:sns:us-east-1:335453571824:aws-cursor";

    private final AmazonSNSClient amazonSNSClient;

    public void subscribeToSNSTopic(String email) {
        SubscribeRequest subscribeRequest = new SubscribeRequest(TOPIC_ARN, "email", email);
        amazonSNSClient.subscribe(subscribeRequest);
    }

    public void publishToTopic(String message) {
        PublishRequest publishRequest = new PublishRequest(TOPIC_ARN, message, "Email notification");
        amazonSNSClient.publish(publishRequest);
    }
}
