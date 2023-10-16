package org.launchcode;

public abstract class DVD {
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    private String name;
    private int capacity; //in MB?
    private String contents;
    private String discType;
    private boolean isSpinning;

    public DVD(String name, int capacity, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.discType = discType;
        this.contents = "";
        this.isSpinning = false;
    }

    public void spin() {
        isSpinning = true;
        System.out.println("DVD is spinning.");
    }

    public void stopSpinning() {
        isSpinning = false;
        System.out.println("DVD has stopped spinning.");
    }
}
