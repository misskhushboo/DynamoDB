package com.hcl.springproject.springproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

@Configuration
public class DynamoDBConfig {

	@Bean
	public DynamoDBMapper dynamodbmapper() {
		return new DynamoDBMapper(amazonDynamoDB());
	}

	public AmazonDynamoDB amazonDynamoDB() {
		return AmazonDynamoDBClientBuilder.standard()
				.withEndpointConfiguration(
						new AwsClientBuilder.EndpointConfiguration("dynamodb.us-west-2.amazonaws.com", "us-west-2"))
				.withCredentials( new AWSStaticCredentialsProvider(new BasicAWSCredentials("AKIAQ3QTFUCTFMT....", ".........zlUHRvbaAthn")))
				.build();
	}

}
