/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.BDToolsView;

/**
 *
 * @author gsh
 */
public class BDToolsCtrl 
{
    public BDWorkspaceCtrl workspaceCtrl;
    
    public BDToolsCtrl(BDToolsView toolsView)
    {
       // 定义变量窗口弹出
       toolsView.toolsDe.setOnAction(new EventHandler<ActionEvent>() 
       {
            @Override
            public void handle(ActionEvent event) 
            {
                BDDefineVariableWindowCtrl defineVariableWindowCtrl = new BDDefineVariableWindowCtrl(toolsView.dfvWindow, workspaceCtrl);
                
                // 弹出变量定义窗口
                toolsView.dfvWindow.show();
            }
        });
       
       // If条件分支窗口弹出
       toolsView.toolsIF.setOnAction(new EventHandler<ActionEvent>() 
       {
            @Override
            public void handle(ActionEvent event) 
            {
                BDIfWindowCtrl ifWindowCtrl = new BDIfWindowCtrl(toolsView.ifWindow, workspaceCtrl);
                
                toolsView.ifWindow.show();
            }
        });
       
       // PinMode端口设置窗口弹出
       toolsView.toolsPinMode.setOnAction(new EventHandler<ActionEvent>() 
       {
            @Override
            public void handle(ActionEvent event) 
            {
                BDPinModeWindowCtrl pinModeWindowCtrl = new BDPinModeWindowCtrl(toolsView.pinModeWindow, workspaceCtrl);
                
                // 弹出端口定义窗口
                toolsView.pinModeWindow.show();
            }
        });
       
       // While条件循环窗口弹出
       toolsView.toolsWhile.setOnAction(new EventHandler<ActionEvent>() 
       {  
            @Override
            public void handle(ActionEvent event) 
            {   
                BDWhileWindowCtrl whileWindowCtrl = new BDWhileWindowCtrl(toolsView.whileWindow, workspaceCtrl);

                // 弹出while循环语句设置窗口
                toolsView.whileWindow.show();
            }
        });
       
       // For条件循环窗口弹出
       toolsView.toolsFor.setOnAction(new EventHandler<ActionEvent>() 
       {  
            @Override
            public void handle(ActionEvent event) 
            {   
                //forWindow = new BDForWindow();
                
                BDForWindowCtrl forWindowCtrl = new BDForWindowCtrl(toolsView.forWindow, workspaceCtrl);

                // 弹出循环语句设置窗口
                toolsView.forWindow.show();
            }
        });
       
       // Switch-Case条件循环窗口弹出
       toolsView.toolsSwitch.setOnAction(new EventHandler<ActionEvent>() 
       {  
            @Override
            public void handle(ActionEvent event) 
            {   

                BDSwitchWindowCtrl switchWindowCtrl = new BDSwitchWindowCtrl(toolsView.switchWindow, workspaceCtrl);

                // 弹出循环语句设置窗口
                toolsView.switchWindow.show();
            }
        });
       
       // digitalRead数字端口读取窗口弹出
       toolsView.toolsDR.setOnAction(new EventHandler<ActionEvent>() 
       {
            @Override
            public void handle(ActionEvent event) 
            {
                //ifWindow = new BDIfWindow();
                
                BDDrWindowCtrl drWindowCtrl = new BDDrWindowCtrl(toolsView.drWindow, workspaceCtrl);
                
                toolsView.drWindow.show();
            }
        });
       
       // analogRead模拟端口读取窗口弹出
       toolsView.toolsAR.setOnAction(new EventHandler<ActionEvent>() 
       {
            @Override
            public void handle(ActionEvent event) 
            {
                BDArWindowCtrl arWindowCtrl = new BDArWindowCtrl(toolsView.arWindow, workspaceCtrl);
                
                toolsView.arWindow.show();
            }
        });
       
       // digitalWrite数字端口写入窗口弹出
       toolsView.toolsDW.setOnAction(new EventHandler<ActionEvent>() 
       {
            @Override
            public void handle(ActionEvent event) 
            {
                BDDwWindowCtrl dwWindowCtrl = new BDDwWindowCtrl(toolsView.dwWindow, workspaceCtrl);
                
                toolsView.dwWindow.show();
            }
        });
       
       // analogWrite模拟端口写入窗口弹出
       toolsView.toolsAW.setOnAction(new EventHandler<ActionEvent>() 
       {
            @Override
            public void handle(ActionEvent event) 
            {
                BDAwWindowCtrl awWindowCtrl = new BDAwWindowCtrl(toolsView.awWindow, workspaceCtrl);
                
                toolsView.awWindow.show();
            }
        });
       
       // Delay延时设置窗口弹出
       toolsView.toolsDelay.setOnAction(new EventHandler<ActionEvent>() 
       {
            @Override
            public void handle(ActionEvent event) 
            {
                //delayWindow = new BDDelayWindow();
                
                // 设置延时函数控制器
                BDDelayWindowCtrl delayWindowCtrl = new BDDelayWindowCtrl(toolsView.delayWindow, workspaceCtrl);

                // 弹出延时设置窗口
                toolsView.delayWindow.show();
            }
        });
       
       // Serial串口通讯模板窗口弹出
       toolsView.toolsSerial.setOnAction(new EventHandler<ActionEvent>() 
       {
            @Override
            public void handle(ActionEvent event) 
            {
                // 创建串口模版生成控制器
                BDSerialWindowCtrl comtWindowCtrl = new BDSerialWindowCtrl(toolsView.serialWindow, workspaceCtrl);
                
                // 显示串口通讯模板
                toolsView.serialWindow.show();
            }
        });
       
       // 扩展工具窗口弹出
       toolsView.toolsPlugs.setOnAction(new EventHandler<ActionEvent>() 
       {
            @Override
            public void handle(ActionEvent event) 
            {
            	// 弹出扩展工具窗口
            	BDPluginWindowCtrl pluginWindowVtrl = new BDPluginWindowCtrl(toolsView.pluginWindow, workspaceCtrl);
            	
            	toolsView.pluginWindow.show();
            }
        });
       
       /*
       // 8*8 LED阵列生成工具
       toolsView.toolsLEDs.setOnAction(new EventHandler<ActionEvent>() 
       {
            
            @Override
            public void handle(ActionEvent event) 
            {
                toolsView.ledsWindow = new BDLEDsWindow();
                
                // 创建控制器
                BDLEDsWindowCtrl ledsWindowCtrl = new BDLEDsWindowCtrl(toolsView.ledsWindow, workspaceCtrl);
                
                // 显示工具窗口
                toolsView.ledsWindow.show();
            }
        });
        */
    }
}
