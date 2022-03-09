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

