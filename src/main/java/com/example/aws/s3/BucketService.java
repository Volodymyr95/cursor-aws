package com.example.aws.s3;

import com.amazonaws.services.s3.AmazonS3;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BucketService {

    private final AmazonS3 s3;

    public void createS3Bucket(String bucketName) {
        if (!s3.doesBucketExist(bucketName)) {
            s3.createBucket(bucketName);
        } else {
            System.out.println("Bucket with this name already exist!");
        }
    }
}
