package com.hcl.springproject.springproject.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.hcl.springproject.springproject.entities.Room;

/*@Repository
public class RoomRepository {
	
	@Autowired
	public DynamoDBMapper dynamodbmapper;
	
	public Room save(Room room) {
		dynamodbmapper.batchSave(room);
		return room;
	}

	public Room getRoomDetailsById(String roomId) {
		return dynamodbmapper.load(Room.class, roomId);
	}
	
	
}*/


public interface RoomRepository extends CrudRepository<Room, String> {
	

}