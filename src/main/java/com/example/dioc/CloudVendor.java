package com.example.dioc;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {
    @Id
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;

    public CloudVendor(){
    }

    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber){
        this.vendorId=vendorId;
        this.vendorName=vendorName;
        this.vendorAddress=vendorAddress;
        this.vendorPhoneNumber=vendorPhoneNumber;
    }


}
