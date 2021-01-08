### 1. 设计模式简介

`模式` 是在特定环境下人们解决某类重复出现问题的一套成功或有效的解决方案（A pattern is a successful or efficient solution to a recurring problem within a context）。

`设计模式（Design Pattern）` 是一套被反复使用的、多数人知晓的、经过分类编目的、代码设计经验的总结，使用设计模式是为了可重用代码、让代码更容易被他人理解并且保证代码可靠性。

`设计模式` 一般包含 **模式名称**、**问题**、**目的**、**解决方案**、**效果** 等组成要素，其中关键要素是 **模式名称**、**问题**、**解决方案** 和 **效果**。

> `模式名称（Pattern name）`：通过一两个词来为模式命名，以便我们更好地理解模式并方便开发人员之间的交流，绝大多数模式都是根据其功能或模式结构来命名的。

> `问题（Problem）`：描述了应该在何时使用模式，它包含了设计中存在的问题以及问题存在的原因。

> `解决方案（Solution）`：描述了一个设计模式的组成部分，以及这些组成部分之间的相互关系、各自的职责和协作方式，通常解决方案通过 UML 类图和核心代码进行描述。

> `效果（Consequence）`：描述了模式的优缺点以及在使用模式时应权衡的问题。

### 2. 设计模式分类

根据设计模式的用途，设计模式可分为 **创建型（Creational）**、**结构型（Structural）** 和 **行为型（Behavioral）** 三种。

`创建型模式` 主要用于描述如何创建对象；

`结构型模式` 主要用于描述如何实现类或对象的组合；

`行为型模式` 主要用于描述类或对象怎样交互以及怎样分配职责；

#### 2.1 创建型模式（Creational Pattern）

| 模式名称 | 学习难度 | 使用频率 |
| :---   | :---   | :---  |
|[单例模式（Singleton Pattern）](https://walkerdenial.com/2017/02/15/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F/)|✨|✨✨✨✨|
|[简单工厂模式（Simple Factory Pattern）](https://walkerdenial.com/2017/02/15/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E7%AE%80%E5%8D%95%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F/)|✨✨|✨✨✨|
|[工厂方法模式（Factory Method Pattern）](https://walkerdenial.com/2017/02/15/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F/)|✨✨|✨✨✨✨✨|
|[抽象工厂模式（Abstract Factory Pattern）](https://walkerdenial.com/2017/02/15/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F/)|✨✨✨✨|✨✨✨✨✨|
|[原型模式（Prototype Pattern）](https://walkerdenial.com/2017/02/16/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E5%8E%9F%E5%9E%8B%E6%A8%A1%E5%BC%8F/)|✨✨✨|✨✨✨|
|[建造者模式（Builder Pattern）](https://walkerdenial.com/2017/02/17/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E5%BB%BA%E9%80%A0%E8%80%85%E6%A8%A1%E5%BC%8F/)|✨✨✨✨|✨✨|

#### 2.2 结构型模式（Structural Pattern）

| 模式名称 | 学习难度 | 使用频率 |
| :---   | :---   | :---  |
|[适配器模式（Adapter Pattern）](https://walkerdenial.com/2017/02/20/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8F/)|✨✨|✨✨✨✨|
|[桥接模式（Bridge Pattern）](https://walkerdenial.com/2017/02/21/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E6%A1%A5%E6%8E%A5%E6%A8%A1%E5%BC%8F/)|✨✨✨|✨✨✨|
|[组合模式（Composite Pattern）](https://walkerdenial.com/2017/02/23/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E7%BB%84%E5%90%88%E6%A8%A1%E5%BC%8F/)|✨✨✨|✨✨✨✨|
|[装饰模式（Decorator Pattern）](https://walkerdenial.com/2017/02/23/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E8%A3%85%E9%A5%B0%E6%A8%A1%E5%BC%8F/)|✨✨✨|✨✨✨|
|[外观模式（Facade Pattern）](https://walkerdenial.com/2017/02/24/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E5%A4%96%E8%A7%82%E6%A8%A1%E5%BC%8F/)|✨|✨✨✨✨✨|
|[享元模式（Flyweight Pattern）](https://walkerdenial.com/2017/02/24/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E4%BA%AB%E5%85%83%E6%A8%A1%E5%BC%8F/)|✨✨✨✨|✨|
|[代理模式（Proxy Pattern）](https://walkerdenial.com/2017/02/24/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E4%BB%A3%E7%90%86%E6%A8%A1%E5%BC%8F/)|✨✨✨|✨✨✨✨|

#### 2.3 行为型模式（Behavioral Pattern）

| 模式名称 | 学习难度 | 使用频率 |
| :---   | :---   | :---  |
|[职责链模式（Chain of Responsibility Pattern）](https://walkerdenial.com/2017/02/27/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E8%81%8C%E8%B4%A3%E9%93%BE%E6%A8%A1%E5%BC%8F/)|✨✨✨|✨✨|
|[命令模式（Command Pattern）](https://walkerdenial.com/2017/02/27/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E5%91%BD%E4%BB%A4%E6%A8%A1%E5%BC%8F/)|✨✨✨|✨✨✨✨|
|[解释器模式（Interpreter Pattern）](https://walkerdenial.com/2017/02/27/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E8%A7%A3%E9%87%8A%E5%99%A8%E6%A8%A1%E5%BC%8F/)|✨✨✨✨✨|✨|
|[迭代器模式（Iterator Pattern）](https://walkerdenial.com/2017/02/27/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E8%BF%AD%E4%BB%A3%E5%99%A8%E6%A8%A1%E5%BC%8F/)|✨✨✨|✨✨✨✨✨|
|[中介者模式（Mediator Pattern）](https://walkerdenial.com/2017/02/28/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E4%B8%AD%E4%BB%8B%E8%80%85%E6%A8%A1%E5%BC%8F/)|✨✨✨|✨✨|
|[备忘录模式（Memento Pattern）](https://walkerdenial.com/2017/03/01/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E5%A4%87%E5%BF%98%E5%BD%95%E6%A8%A1%E5%BC%8F/)|✨✨|✨✨|
|[观察者模式（Observer Pattern）](https://walkerdenial.com/2017/03/01/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E8%A7%82%E5%AF%9F%E8%80%85%E6%A8%A1%E5%BC%8F/)|✨✨✨|✨✨✨✨✨|
|[状态模式（State Pattern）](https://walkerdenial.com/2017/03/01/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E7%8A%B6%E6%80%81%E6%A8%A1%E5%BC%8F/)|✨✨✨|✨✨✨|
|[策略模式（Strategy Pattern）](https://walkerdenial.com/2017/03/01/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E7%AD%96%E7%95%A5%E6%A8%A1%E5%BC%8F/)|✨|✨✨✨✨|
|[模板方法模式（Template Method Pattern）](https://walkerdenial.com/2017/03/02/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E6%A8%A1%E6%9D%BF%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F/)|✨✨|✨✨✨|
|[访问者模式（Visitor Pattern）](https://walkerdenial.com/2017/03/02/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E8%AE%BF%E9%97%AE%E8%80%85%E6%A8%A1%E5%BC%8F/)|✨✨✨✨|✨|

### 3. 设计模式用途

1. 可以避免做一些重复性的工作，有助于提高设计和开发效率；
2. 提供了一套通用的设计词汇和一种通用的形式来方便开发人员之间的交流和沟通，使得设计方案更加通熟易懂；
3. 使开发人员可以更好地重用一些已有的设计方案、功能模块甚至一个完整的软件系统，避免经常做一些重复的设计、编写一些重复的代码；
4. 有助于别人更快地理解系统；
5. 有助于深入地理解面向对象思想；
