package com.xworkz.rapdio.external;

import com.xworkz.rapdio.dto.RapdioDetails;
import com.xworkz.rapdio.internal.Rapdio;

public class RapdioRunner {
    public static void main(String[] args) {
        RapdioDetails rapdioDetails = new RapdioDetails(3,"sanjay",23,"sanjay@gmail.copm");
        Rapdio rapdio = new Rapdio();
        String rows=rapdio.save(rapdioDetails);
        // String saved = rapdio.save(rapdioDetails);

        // rapdioDetails.setId(1);
//        String name=rapdio.getNameById(1);
//        System.out.println(name);
        // System.out.println(saved);
    }
}