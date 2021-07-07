package com.gatz.discovery.modules.cidm.model;

public class TStreetCoordinateWithBLOBs extends TStreetCoordinate {
    private byte[] coordinates;

    private byte[] gaodeCoordinates;

    public byte[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(byte[] coordinates) {
        this.coordinates = coordinates;
    }

    public byte[] getGaodeCoordinates() {
        return gaodeCoordinates;
    }

    public void setGaodeCoordinates(byte[] gaodeCoordinates) {
        this.gaodeCoordinates = gaodeCoordinates;
    }
}