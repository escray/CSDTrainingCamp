## TDD-MarsRover-Java

实现一个简单的火星探索器，使用TDD的方法实现。

### Kata介绍：

1. 通过文本文件向应用程序提供输入数据testData.txt(src/main/resources/testData.txt)。
2. 在AppRunner.java中集成你写的代码，并将结果赋值给receipt变量。

- args[0]为resources下的测试数据文件名，例如传入的args[0]值为"testData.txt"。
- 你写的程序将把testDataFile作为参数加载此文件并读取文件内的测试数据，并对每条测试数据计算结果。
- 将所有计费结果拼接并使用\n分割，然后保存到result变量中。

3. 不必为AppRunner.java写单元测试，AppRunner.java也不会统计测试覆盖率。
4. 不得修改build.gradle与checkstyle.xml文件。

### 详细描述：

#### Mars Rover

假想你在火星探索团队中负责软件开发。现在你要给登陆火星的探索小⻋编写控制程序，根据地球发送的控制指令来控制火星⻋的行动。

#### 火星⻋收到的指令分为四类:

1. 探索区域信息: 假设无限大;
2. 初始化信息: 火星⻋的降落地点(x, y)和朝向(N, S, E, W)信息;
3. 移动指令: 火星⻋可以前进(f)或后退(b);
4. 转向指令: 火星⻋可以左转90度(l)或右转90度(r)。
5. 由于地球和火星之间的距离很远，指令必须批量发送，火星⻋执行完整批指令之后，再回报自己所在的位置坐标和朝向。

#### 测试数据

\n为文件中的不可见的换行字符

position:1,2,N;command:L,F,L,F,L,F,L,F,F,B,R,F
position:3,3,E;command:F,F,R,F,F,R,F,R,R,F,L,F

#### 期望输出

\n为console输出中的不可见的换行字符

2,2,E\n
5,2,N\n

#### 通过标准：

1. 通过checkstyle规则(配置文件见config/checkstyle/checkstyle.xml)：

- 单个Java文件不得超过50行。
- 单行代码长度不得超过150个字符。
- 单个方法长度不得超过10行。
- 单个方法的圈复杂度不得超过4。
- 单个方法参数个数不得超过3。
- 友好的方法命名。

2. 在规定考试时间内完成答题，并完成所有需求。
3. 测试覆盖率100%，没有严重的Sonar问题。
4. 采用TDD开发模式。
