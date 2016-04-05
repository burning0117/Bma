package domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by lily on 2016/4/3.
 */
public class Production implements Serializable{
    private int pId;
    private String name;
    private BigDecimal price;
    private BigDecimal PriceRate;
    private BigDecimal pReputation;
    private BigDecimal pReputationRate;
    private BigDecimal pQos;
    private int sId;

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPriceRate() {
        return PriceRate;
    }

    public void setPriceRate(BigDecimal priceRate) {
        PriceRate = priceRate;
    }

    public BigDecimal getpReputation() {
        return pReputation;
    }

    public void setpReputation(BigDecimal pReputation) {
        this.pReputation = pReputation;
    }

    public BigDecimal getpReputationRate() {
        return pReputationRate;
    }

    public void setpReputationRate(BigDecimal pReputationRate) {
        this.pReputationRate = pReputationRate;
    }

    public BigDecimal getpQos() {
        return pQos;
    }

    public void setpQos(BigDecimal pQos) {
        this.pQos = pQos;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }
}
