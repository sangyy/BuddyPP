/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.BDPluginWindow;

/**
 *
 * @author gsh
 */
public class BDPluginWindowCtrl
{
    public BDPluginWindowCtrl(BDPluginWindow pluginWindow, BDWorkspaceCtrl workspaceCtrl)
    {
        pluginWindow.magLedsBtn.setOnAction(new EventHandler<ActionEvent>() 
        {    
            @Override
            public void handle(ActionEvent event) 
            {
                // 创建控制器
                BDLEDsWindowCtrl ledsWindowCtrl = new BDLEDsWindowCtrl(pluginWindow.ledsWindow, workspaceCtrl);
                
                // 显示工具窗口
                pluginWindow.ledsWindow.show();
                
                // 关闭窗口
                pluginWindow.root.close();
            }
        });
        
        pluginWindow.magMusicBtn.setOnAction(new EventHandler<ActionEvent>() 
        {    
            @Override
            public void handle(ActionEvent event) 
            {
            	
                // 创建控制器
                BDMusicWindowCtrl musicWindowCtrl = new BDMusicWindowCtrl(pluginWindow.musicWindow, workspaceCtrl);
                
                // 显示工具窗口
                pluginWindow.musicWindow.show();
                
                // 关闭窗口
                pluginWindow.root.close();
            }
        });
        
        pluginWindow.magColorBtn.setOnAction(new EventHandler<ActionEvent>() 
        {    
            @Override
            public void handle(ActionEvent event) 
            {
            	
                // 创建控制器
                BDColorWindowCtrl colorWindowCtrl = new BDColorWindowCtrl(pluginWindow.colorWindow, workspaceCtrl);
                
                // 显示工具窗口
                pluginWindow.colorWindow.show();
                
                // 关闭窗口
                pluginWindow.root.close();
            }
        });
    }
}
