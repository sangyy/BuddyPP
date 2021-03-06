/**
 ***************************************
 *
 * @file Shock.ino
 * @brief 震动传感器模块实验
 * 
 * 震动传感模块通过滚珠开关检测震动事件，当震动传感模块检测到震动事件。
 * SIG引脚将会输出一个高电平信号，通过使用螺丝刀调整模块上的电位器可以 
 * 适当调整传感器的灵敏程度，测试程序演示了如何通过震动传感模块检测震
 * 动事件。
 * 
 * @author gsh
 * @version 1.0
 * @date 2015.12.1
 *
 ***************************************
 */
 
int shockPin = 3;	// 定义变量shockPin指向数字端口D3
int buffer   = 0;	// 定义变量buffer用于暂存震动传感器读数

// 初始化
void setup()
{
	// 设定串口波特率为9600
	Serial.begin(9600);
}

// 主循环
void loop()
{
	// 读取震动传感器数据
	buffer = digitalRead(shockPin);
  
	// 显示震动传感器的读数（每0.5秒更新一次）
	Serial.print("value = ");
	Serial.println(buffer);
  
	// 延时0.5秒
	delay(500);
}

