package domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by lily on 2016/4/3.
 */
public class Good implements Serializable {
    private int gId;
    private String name;
    private BigDecimal price;
    private BigDecimal priceRate;
    private BigDecimal gReputation;
    private BigDecimal gReputationRate;
    private BigDecimal gQos;
    private BigDecimal gQosRate;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
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
        return priceRate;
    }

    public void setPriceRate(BigDecimal priceRate) {
        this.priceRate = priceRate;
    }

    public BigDecimal getgReputation() {
        return gReputation;
    }

    public void setgReputation(BigDecimal gReputation) {
        this.gReputation = gReputation;
    }

    public BigDecimal getgReputationRate() {
        return gReputationRate;
    }

    public void setgReputationRate(BigDecimal gReputationRate) {
        this.gReputationRate = gReputationRate;
    }

    public BigDecimal getgQos() {
        return gQos;
    }

    public void setgQos(BigDecimal gQos) {
        this.gQos = gQos;
    }

    public BigDecimal getgQosRate() {
        return gQosRate;
    }

    public void setgQosRate(BigDecimal gQosRate) {
        this.gQosRate = gQosRate;
    }
}
