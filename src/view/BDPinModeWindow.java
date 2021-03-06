/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.StageStyle;
import model.BDPinModeWindowModel;

/**
 *
 * @author gsh
 */
public class BDPinModeWindow extends BDWindow
{
    public Button submitBtn = new Button("确定");
    
    public ComboBox<String> combPin = new ComboBox<String>();
    public ComboBox<String> combMode = new ComboBox<String>();

    public BDPinModeWindow()
    {
        // 窗口初始化
        super.init(570, 60);
        
       // 总在最前方
       this.setAlwaysOnTop(true);
       
       // 只有关闭按钮的窗口
       this.initStyle(StageStyle.UTILITY);
       this.setResizable(false);
       
       this.setTitle("  定义端口");
       this.setScene(scene);
       
       HBox contain  = new HBox();

       Label lbPin     = new Label("端口：");
       Label lbMode    = new Label("模式：");
       
       combPin.setPrefWidth(90);
       combMode.setPrefWidth(220);
       
       BDPinModeWindowModel pmwm = new BDPinModeWindowModel();
       
       combPin.setItems(pmwm.pinList);
       combMode.setItems(pmwm.modeList);
       
       combPin.getSelectionModel().select(0);
       combMode.getSelectionModel().select(1);
       
       submitBtn.setPrefSize(80, 30);
       
       combPin.setStyle("-fx-background-radius: 0, 0;-fx-font-size: 15;");
       combMode.setStyle("-fx-background-radius: 0, 0;-fx-font-size: 15;");
       submitBtn.setStyle("-fx-background-radius: 0, 0;");
       
       contain.setPadding(new Insets(15, 15, 15, 15));  // 设置边距
       contain.setSpacing(10);                          // 设置间距
       contain.setAlignment(Pos.CENTER);                // 居中排列
       
       contain.getChildren().add(lbPin);
       contain.getChildren().add(combPin);
       contain.getChildren().add(lbMode);
       contain.getChildren().add(combMode);
       contain.getChildren().add(submitBtn);
       
       rootPanel.getChildren().add(contain);
    }
}
