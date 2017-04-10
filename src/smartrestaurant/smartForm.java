/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
package smartrestaurant;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author csc190
 */
/*public class smartForm extends Stage {
    public smartForm(menuItem mi){
        int cuPos = 0;
        this.menuitem = mi;
        GridPane gp = new GridPane();
        Label lblName = new Label(arrMenu.get(cuPos).name);
        Label lblDes = new Label(arrMenu.get(cuPos).description);
        Label lblPrice = new Label(arrMenu.get(cuPos).price);
        ImageView lblImage = new ImageView(arrMenu.get(cuPos).imagePath);
        
        Button btn = new Button();
        btn.setText("Prev");
        Button btn2 = new Button();
        btn2. setText("Next");
        
        gp.add(lblName, 0, 0);
        gp.add(lblDes, 1, 1);
        gp.add(lblPrice, 1, 2);
        gp.add(lblImage, 1, 3);
        gp.add(btn, 0, 4);
        gp.add(btn2, 1, 4);
        
        btn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                if (cuPos != 0){
                    cuPos -= 1;
                    
                    gp.getChildren().remove(lblName);
                    gp.getChildren().remove(lblDes);
                    gp.getChildren().remove(lblPrice);
                    gp.getChildren().remove(lblImage);
                    Label lblName = new Label(arrMenu.get(cuPos).name);
                    Label lblDes = new Label(arrMenu.get(cuPos).description);
                    Label lblPrice = new Label(arrMenu.get(cuPos).price);
                    ImageView lblImage = new ImageView(arrMenu.get(cuPos).imagePath);
                    gp.add(lblName, 0, 0);
                    gp.add(lblDes, 1, 1);
                    gp.add(lblPrice, 1, 2);
                    gp.add(lblImage, 1, 3);
                }
                
            }
                
          
        });

        btn2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                if (cuPos != arrMenu.size()-1){
                    cuPos += 1;
                    
                    gp.getChildren().remove(lblName);
                    gp.getChildren().remove(lblDes);
                    gp.getChildren().remove(lblPrice);
                    gp.getChildren().remove(lblImage);
                    Label lblName = new Label(arrMenu.get(cuPos).name);
                    Label lblDes = new Label(arrMenu.get(cuPos).description);
                    Label lblPrice = new Label(arrMenu.get(cuPos).price);
                    ImageView lblImage = new ImageView(arrMenu.get(cuPos).imagePath);
                    gp.add(lblName, 0, 0);
                    gp.add(lblDes, 1, 1);
                    gp.add(lblPrice, 1, 2);
                    gp.add(lblImage, 1, 3);
                }
                
            }
                
          
        });

        Scene scene = new Scene(gp, 300, 250);
        
        primaryStage.setTitle("SmartRestaurant Table 2.1")
        primaryStage.setScene(scene);
        primaryStage.show()
    }
    
    public void save(){
        menuitem.name = this.tfName.getText();
        menuitem.description = this.tfDes.getText();
        menuitem.price = Integer.parseInt(this.tfPrice.getText());
        menuitem.imagePath = this.tfImage.getText();
        this.close();
    }
    
    protected TextField tfName;
    protected TextField tfDes;
    protected TextField tfPrice;
    protected TextField tfImage;
    protected menuItem menuitem;
        
}
    
*/ 