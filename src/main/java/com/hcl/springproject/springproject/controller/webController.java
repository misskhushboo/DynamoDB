package com.hcl.springproject.springproject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.springproject.springproject.entities.Room;
import com.hcl.springproject.springproject.repository.RoomRepository;

@RestController
public class webController {
	
	@Autowired
	private RoomRepository roomRepository;
	
	@PostMapping("/room")
	public Room saveRoom(@RequestBody Room room) {
		return (Room) roomRepository.save(room);
	}
	
	@GetMapping("/getRoom/{id}")
	public Optional getRoom(@PathVariable("id") String roomId) {
		return roomRepository.findById(roomId);
		//return roomRepository.getRoomDetailsById(roomId);
	}

}
