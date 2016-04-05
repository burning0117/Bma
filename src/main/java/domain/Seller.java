package domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by lily on 2016/4/3.
 */
public class Seller implements Serializable{
    private int sId;
    private String name;
    private String password;
    private String description;
    private String phone;
    private BigDecimal sReputation;
    private String address;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BigDecimal getsReputation() {
        return sReputation;
    }

    public void setsReputation(BigDecimal sReputation) {
        this.sReputation = sReputation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
