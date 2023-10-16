package org.launchcode;

public class CD extends BaseDisc implements StorageDisc {
    public CD(int rmpSpeed, String title) {
        super(rmpSpeed, title);
    }

    @Override
    public void spinDisc() {
        System.out.println("The spin rate of " + this.getTitle() + "is " + this.getRmpSpeed)
    }

    @Override
    public void writeData
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately

//    private String name;
//    private int capacity; //in MB?
//    private String contents;
//    private String discType;
//    private boolean isSpinning;
//
//    public CD(String name, int capacity, String discType) {
//        this.name = name;
//        this.capacity = capacity;
//        this.discType = discType;
//        this.contents = "";
//        this.isSpinning = false;
//    }
//
//    public void spin() {
//        isSpinning = true;
//        System.out.println("CD is spinning.");
//    }
//
//    public void stopSpinning() {
//        isSpinning = false;
//        System.out.println("CD has stopped spinning.");
//    }
}
