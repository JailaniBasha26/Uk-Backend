package com.uk.uk.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cache.annotation.Cacheable;

import java.sql.Timestamp;

@Entity
@Table(name = "PricingInsights")
@Getter
@Setter
@Cacheable
@NoArgsConstructor

public class PricingInsightsDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public Integer no;
    public Integer productMasterDataNo;
    public Double price;
    public Boolean availability;
    public String ImageRef;
    public Timestamp createdAtDateTime;

    public String getImageRef() {
        return ImageRef;
    }

    public void setImageRef(String imageRef) {
        ImageRef = imageRef;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Integer getProductMasterDataNo() {
        return productMasterDataNo;
    }

    public void setProductMasterDataNo(Integer productMasterDataNo) {
        this.productMasterDataNo = productMasterDataNo;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public Timestamp getCreatedAtDateTime() {
        return createdAtDateTime;
    }

    public void setCreatedAtDateTime(Timestamp createdAtDateTime) {
        this.createdAtDateTime = createdAtDateTime;
    }
}