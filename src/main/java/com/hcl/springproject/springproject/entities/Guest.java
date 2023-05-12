package com.hcl.springproject.springproject.entities;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "Guest")
@Data
public class Guest {

	@DynamoDBAttribute(attributeName="GuestId")
	private String GuestId;
	
	@DynamoDBAttribute
	private String guestName;
	
	@DynamoDBAttribute
	private String roomId;
}
