package com.Pojo;

import java.util.ArrayList;

public class TeamDetails {
	
	private String name;
	private String location;
	private ArrayList<Player> Player;

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setPlayer(ArrayList<Player> player) {
		Player = player;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public ArrayList<Player> getPlayer() {
		return Player;
	}

}
