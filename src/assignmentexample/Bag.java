/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignmentexample;

/**
 *
 * @author hnd
 */
public class Bag {
    private String bName, bCategory;
    private double bPrice;
    private int bagQty;

    // Getter for bag quantity
    public int getBagQty() {
        return bagQty;
    }

    // Setter for bag quantity
    public void setBagQty(int bagQty) {
        this.bagQty = bagQty;
    }
    
    // Getter for bag name
    public String getbName() {
        return bName;
    }

    // Setter for bag name
    public void setbName(String bName) {
        this.bName = bName;
    }

    // Getter for bag category
    public String getbCategory() {
        return bCategory;
    }

    // Setter for bag category
    public void setbCategory(String bCategory) {
        this.bCategory = bCategory;
    }

    // Getter for bag price
    public double getbPrice() {
        return bPrice;
    }

    // Setter for bag price
    public void setbPrice(double bPrice) {
        this.bPrice = bPrice;
    }
}
