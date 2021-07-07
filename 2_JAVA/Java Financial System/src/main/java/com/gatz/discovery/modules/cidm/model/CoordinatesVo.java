package com.gatz.discovery.modules.cidm.model;

public class CoordinatesVo {
	private String street;
	private byte[] coordinates;
	
	public byte[] getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(byte[] coordinates) {
		this.coordinates = coordinates;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public byte[] getGaodeCoordinates() {
		return gaodeCoordinates;
	}

	public void setGaodeCoordinates(byte[] gaodeCoordinates) {
		this.gaodeCoordinates = gaodeCoordinates;
	}

	private byte[] gaodeCoordinates;
}
