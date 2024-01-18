package com.example.unittest5.Service;

import java.util.stream.StreamSupport;

public class GSTService {
    private final GSTProvider gstProvider;

    public GSTService(GSTProvider gstProvider) {
        this.gstProvider = gstProvider;
    }

    public int calculateGst(){
        System.out.println("Calculate GST Start");
        int rate = this.gstProvider.getGSTDetails();
        System.out.println("Gst rate : " + rate);
        return rate;
    }
}
