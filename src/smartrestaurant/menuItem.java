/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartrestaurant;

import java.awt.Image;
/**
 *
 * @author csc190
 */

public class menuItem {
    public menuItem(String name, String description, String price, String imagePath){
        this.name = name;
        this.description = description;
        this.price = price;
        this.imagePath = imagePath;
        
    }
    protected String name;
    protected String description;
    protected String price;
    protected String imagePath;
}