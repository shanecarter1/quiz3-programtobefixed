package main;

import java.util.UUID;

public class Section {
	private UUID CourseID;
	private UUID SemesterID;
	private int RoomID;
	
	public UUID getCourseID() {
		return CourseID;
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}
	public Section(int roomID) {
		CourseID = UUID.randomUUID();
		SemesterID = UUID.randomUUID();
		RoomID = roomID;
	}
	
}
