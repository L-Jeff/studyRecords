# 第一章 Java概述

#### 1.1 程序

程序：计算机执行某些操作或解决某个问题而编写的一系列有序指令的集合

#### 1.2 Java 历史

1992 创建oak (橡树)语言->java
1994 gosling参加硅谷大会演示java功能,震惊世界。
1995 sun正式发布java第1个版本。
2009年，甲骨文公司宣布收购Sun。2011,发布java7
其它java版本发布详情htps://www.oracle com/java/technologies/java-se-support-roadmap.html

#### 1.3 Java技术体系平台

**Java SE(Java Standard Edition)标准版**

支持面向桌面级应用(如Windows 下的应用程序)的Java平台，提供了完整的Java核心API,此版本以前称为J2SE

**Java EE(Java Enterprise Edition)企业版**

是为开发企业环境下的应用程序提供的一套解决方案。该技术体系中包含的技术如:ServletJsp等，主要针对于Web应用程序开发。版本以前称为J2EE

**Java ME(Java Micro Edition)小型版**

支持Java程序运行在移动终端(手机、PDA). 上的平台， 对Java API有所精简，并加入了针对移动终端的支持，此版本以前称为J2ME

#### 1.4 Java 重要特点

1. Java 语言是面向对象的(oop) 

2. Java 语言是健壮的。Java 的强类型机制、异常处理、垃圾的自动收集等是 Java 程序健壮性的重要保证 

3.  Java 语言是**跨平台性**的。[即: 一个编译好的.class 文件可以在多个系统下运行，这种特性称为跨平台]

   ![image-20220309164117500](D:\JavaProjects\studyRecords\img\image-20220309164117500.png)

4. Java 语言是解释型的[了解] 

   解释性语言：javascript,PHP, java 

   编译性语言: c / c++ 

   区别是：解释性语言，编译后的代码，不能直接被机器执行,需要解释器来执行, 编译性语言, 编译后的代码, 可 以直接被机器执行, c /c+

#### 1.5 Java 运行机制及运行过程

##### 1.5.1 跨平台性

![image-20220309164425642](D:\JavaProjects\studyRecords\img\image-20220309164425642.png)

##### 1.5.2 核心机制 JVM

1) JVM 是一个虚拟的计算机，具有指令集并使用不同的存储区域。负责执行指令，管理数据、内存、寄存器，包含在 JDK 中。
2)  对于不同的平台，有不同的虚拟机。 
3)  Java 虚拟机机制屏蔽了底层运行平台的差别，实现了“一次编译，到处运行” [说明]

![image-20220309164622712](D:\JavaProjects\studyRecords\img\image-20220309164622712.png)

#### 1.6 什么是 JDK，JRE 

##### 1.6.1 JDK 基本介绍 

1. JDK 的全称(Java Development Kit Java 开发工具包) JDK = JRE + java 的开发工具 [java, javac,javadoc,javap 等]

2. JDK 是提供给 Java 开发人员使用的，其中包含了 java 的开发工具，也包括了 JRE。所以安装了 JDK，就不用在单独 安装 JRE 了。 

##### 1.6.2 JRE 基本介绍 

1) JRE(Java Runtime Environment Java 运行环境) JRE = JVM + Java 的核心类库[类] 
2. 包括 Java 虚拟机(JVM Java Virtual Machine)和 Java 程序所需的核心类库等，如果想要运行一个开发好的 Java 程序， 计算机中只需要安装 JRE 即可。 

##### 1.6.3 JDK、JRE 和 JVM 的包含关系 
1) JDK = JRE + 开发工具集（例如 Javac,java 编译工具等) 
2)  JRE = JVM + Java SE 标准类库（java 核心类库） 
3) 如果只想运行开发好的 .class 文件 只需要 JRE

#### 1.7 Java 开发注意事项和细节

1. Java源文件以java为扩展名。源文件的基本组成部分是类(class) ，如本类中的Hello类。

2. Java应用程序的执行入口是main(方法。 它有固定的书写格式:

  `public static void main(String[] args) {..}`

3. Java语言严格区分大小写。

4. Java方法由一条条语句构成，每个语句以","结束。

5. 大括号都是成对出现的，缺一不可。[习惯， 先写{}再写代码]

6. 一个源文件中最多只能有一个public类。其它类的个数不限。[演示]

7. 如果源文件包含一个public类， 则文件名必须按该类名命名! [演示]

8. 一个源文件中最多只能有一个public类。 其它类的个数不限，也可以将main方法写在非public类中，然后指定运行非public类，这样入口方法就是非public 的main方法

![image-20220309174527080](D:\JavaProjects\studyRecords\img\image-20220309174527080.png)

#### 1.8 注释

1) 单行注释 // 
2) 多行注释 /* */ 
3) 文档注释 /** */

#### 1.9 DOS命令（了解）

##### 1.9.1 DOS介绍

Dos： Disk Operating System 磁盘操作系统。

##### 1.9.2 相对路径、绝对路径

![image-20220309175018529](D:\JavaProjects\studyRecords\img\image-20220309175018529.png)

##### 1.9.3 常用DOS命令

1、查看当前目录内容 dir

dir d:\abc2\test200

2、切换到其他盘下	盘符号 cd :chang directory

cd /D c:

3、切换到当前盘的其他目录下 (使用相对路径和绝对路径演示), ..\表示上一级目录 

cd d:\abc2\test200 

4、切换到上一级

 cd ..

5、切换到根目录

cd \

6、查看指定的目录下所有的子级目录

tree

7、清屏 cls

8、退出 DOS exit

# 第二章 变量

#### 2.1 变量

##### 2.1.1概念

​	**变量相当于内存中一个数据存储空间**的表示，你可以把变量看做是一个房间的**门牌号**，通过门牌号我们可以找到房 间，而通过变量名可以访问到变量(值)。

##### 2.1.2 使用变量

```java
//1) 声明变量
	int a;
//2) 赋值
	a = 60;
	System.out.println(a);
```

#### 2.2 变量使用注意事项

1、变量表示内存中的一个存储区域 [不同的变量，类型不同，占用的空间大小不同，比如：int 4个字节，double 8个字节]

2、该区域有自己的名称[变量名]和类型[数据类型]

