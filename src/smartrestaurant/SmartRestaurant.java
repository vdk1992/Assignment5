/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartrestaurant;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author csc190
 */
public class SmartRestaurant extends Application {
    ArrayList<menuItem> arrMenu = new ArrayList<>();
    public int cuPos = 0;
    //String theFile = new String("/resources/config.txt");
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        try{
            //FileReader myfile = new FileReader(theFile);
            Scanner scan = new Scanner (getClass().getResourceAsStream("/resources/config.txt"));
            while (scan.hasNextLine()){
                for (int i = 0; i < 4; i++){
                    String name = scan.nextLine();
                    String desc = scan.nextLine();
                    String price = scan.nextLine();
                    String imagePath = "/resources/" +scan.nextLine().substring(7);
                    menuItem item = new menuItem(name, desc, price, imagePath);
                    arrMenu.add(item);
                }
            }
        }
        
        catch(Exception ex){
            System.out.println("exception " + ex.getMessage() + "caught");
        }
        
        //int cuPos = 0;
        //this.menuitem = mi;
        GridPane gp = new GridPane();
        Label lblName = new Label(arrMenu.get(cuPos).name);
        Label lblDes = new Label(arrMenu.get(cuPos).description);
        Label lblPrice = new Label(arrMenu.get(cuPos).price);
        ImageView lblImage = new ImageView(arrMenu.get(cuPos).imagePath);
        
        Button btn = new Button();
        btn.setText("Prev");
        Button btn2 = new Button();
        btn2. setText("Next");
        
        lblDes.setWrapText(true);
        lblDes.setMaxWidth(350);
        gp.setVgap(5);
        gp.setHgap(10);
        gp.add(lblName, 2, 1, 1, 1);
        gp.add(lblDes, 2, 2, 1, 1);
        gp.add(lblPrice, 2, 3, 1, 1);
        gp.add(lblImage, 0, 1, 1, 3);
        
        gp.add(btn, 0, 5);
        gp.add(btn2, 2, 5);
        
        //if (cuPos > 0){
         btn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                if (cuPos != 0){
                    cuPos--;
                    gp.getChildren().clear();
                    Label lblName = new Label(arrMenu.get(cuPos).name);
                    Label lblDes = new Label(arrMenu.get(cuPos).description);
                    Label lblPrice = new Label(arrMenu.get(cuPos).price);
                    ImageView lblImage = new ImageView(arrMenu.get(cuPos).imagePath);
                    gp.add(lblName, 2, 1, 1, 1);
                    gp.add(lblDes, 2, 2, 1, 1);
                    gp.add(lblPrice, 2, 3, 1, 1);
                    gp.add(lblImage, 0, 1, 1, 3);
                    //cuPos--;
                    gp.add(btn, 0, 5);
                    gp.add(btn2, 2, 5);
                }
            }  
           });    
            
                
          
        

        //if (cuPos < 3){
         btn2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                if (cuPos != arrMenu.size()-1){
                    cuPos++;
                    gp.getChildren().clear();
                    Label lblName = new Label(arrMenu.get(cuPos).name);
                    Label lblDes = new Label(arrMenu.get(cuPos).description);
                    Label lblPrice = new Label(arrMenu.get(cuPos).price);
                    ImageView lblImage = new ImageView(arrMenu.get(cuPos).imagePath);
                    gp.add(lblName, 2, 1, 1, 1);
                    gp.add(lblDes, 2, 2, 1, 1);
                    gp.add(lblPrice, 2, 3, 1, 1);
                    gp.add(lblImage, 0, 1, 1, 3);
                    //cuPos++;
                    gp.add(btn, 0, 5);
                    gp.add(btn2, 2, 5);
                }
            }
           });
        

        Scene scene = new Scene(gp, 600, 500);
        
        primaryStage.setTitle("SmartRestaurant Table 2.1");
        primaryStage.setScene(scene);
        primaryStage.show();
    };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
