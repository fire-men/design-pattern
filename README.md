# design-pattern
设计模式

目标 ：深入了解设计模式及更好的应用到业务系统中

项目目录结构：
    
    principle 设计模式原则
    
    createPattern 设计模式-创建型
    
    structorPattern 设计模式-结构型
    
    behavePattern 设计模式-行为型
    
    domain 实体类
    
    resources 静态资源



**一、设计模式的七大原则**

1、单一职责原则(Single Responsibility Principle)
一个类只负责一个功能领域中的相应职责，或者可以定义为，就一个类而言，应该只有一个引起它变化的原因
 
   场景：
 
   未使用单一职责原则：
      
     CustomerDataChart类中的方法说明如下：
   
     getConnection()方法用于连接数据库，findCustomers()用于查询所有的客户信息，createChart()用于创建图表，displayChart()用于显示图表。
   
   使用单一原则后：
   
    DBUtil类负责数据库的操作
    
    CustomerDAO类负责客户的curd操作
    
    CustomerDataChart类负责图标的生成和显示

2、开闭原则（Open Close Principle）

  开闭原则的意思是：对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。
 简言之，是为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类，后面的具体设计中我们会提到这点。
  
    
3、里氏代换原则（Liskov Substitution Principle）

  里氏代换原则是面向对象设计的基本原则之一。 里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。LSP 是继承复用的基石，
只有当派生类可以替换掉基类，且软件单位的功能不受到影响时，基类才能真正被复用，而派生类也能够在基类的基础上增加新的行为。里氏代换原
则是对开闭原则的补充。实现开闭原则的关键步骤就是抽象化，而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化
的具体步骤的规范。

4、依赖倒转原则（Dependence Inversion Principle）

这个原则是开闭原则的基础，具体内容：针对接口编程，依赖于抽象而不依赖于具体。

5、接口隔离原则（Interface Segregation Principle）

  这个原则的意思是：使用多个隔离的接口，比使用单个接口要好。它还有另外一个意思是：降低类之间的耦合度。
由此可见，其实设计模式就是从大型软件架构出发、便于升级和维护的软件设计思想，它强调降低依赖，降低耦合。

场景：
  接口CustomerDataDisplay中有如下方法
  
  反例：
  其中方法dataRead()用于从文件中读取数据
  方法transformToXML()用于将数据转换成XML格式
  方法createChart()用于创建图表
  方法displayChart()用于显示图表
  方法createReport()用于创建文字报表
  方法displayReport()用于显示文字报表
  
  正例：
  DataHandle接口 处理从文件中读取数据
  XmlTransFormer接口 用于将数据转换xml
  chartHandle接口 创建图表+显示图表
  reportHandle接口 创建文字报表+显示文字报表
  
  总结：类似于单一职责原则

6、迪米特法则，又称最少知道原则（Demeter Principle）

 最少知道原则是指：一个实体应当尽量少地与其他实体之间发生相互作用，使得系统功能模块相对独立。
 
 场景：
 反例：
 当一个按钮(Button)被单击时，对应的列表框(List)、组合框(ComboBox)、文本框(TextBox)、文本标签(Label)等都将发生改变
 如图所示：classpath: 设计模式-迪米特法则-反例.jpg
 
 正例：
  可以通过引入一个专门用于控制界面控件交互的中间类(Mediator)来降低界面控件之间的耦合度。引入中间类之后，界面控件之间不
 再发生直接引用，而是将请求先转发给中间类，再由中间类来完成对其他控件的调用。当需要增加或删除新的控件时，只需修改中间类
 即可，无须修改新增控件或已有控件的源代码
 如图所示：classpath: 设计模式-迪米特法则-正例.jpg

 
7、合成复用原则（Composite Reuse Principle）

合成复用原则是指：尽量使用合成/聚合的方式，而不是使用继承

 注意：
 开闭原则是目标，里氏代换原则是基础，依赖倒转原则是手段，它们相辅相成，相互补充，目标一致，只是分析问题时所站角度不同而已
 
**二、设计模式分类**

创建型模式（Creational Patterns）
 
结构型模式（Structural Patterns）

行为型模式（Behavioral Patterns）

J2EE 设计模式


**三、创建型模式（Creational Patterns）**

  这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，
而不是使用 new 运算符直接实例化对象。这使得程序在判断针对某
个给定实例需要创建哪些对象时更加灵活。

工厂模式（Factory Pattern）

抽象工厂模式（Abstract Factory Pattern）

单例模式（Singleton Pattern）

建造者模式（Builder Pattern）

原型模式（Prototype Pattern）


**四、结构型模式（Structural Patterns）**

这些设计模式关注类和对象的组合。继承的概念被用来组合接口和定义组合对象获得新功能的方式。

适配器模式（Adapter Pattern）

桥接模式（Bridge Pattern）

过滤器模式（Filter、Criteria Pattern）

组合模式（Composite Pattern）

装饰器模式（Decorator Pattern）

外观模式（Facade Pattern）

享元模式（Flyweight Pattern）

代理模式（Proxy Pattern）


**五、行为型模式（Behavioral Patterns）**

这些设计模式特别关注对象之间的通信

责任链模式（Chain of Responsibility Pattern）

命令模式（Command Pattern）

解释器模式（Interpreter Pattern）

迭代器模式（Iterator Pattern）

中介者模式（Mediator Pattern）

备忘录模式（Memento Pattern）

观察者模式（Observer Pattern）

状态模式（State Pattern）

空对象模式（Null Object Pattern）

策略模式（Strategy Pattern）

模板模式（Template Pattern）

访问者模式（Visitor Pattern）


**六、J2EE 设计模式**

这些设计模式特别关注表示层

MVC 模式（MVC Pattern）

业务代表模式（Business Delegate Pattern）

组合实体模式（Composite Entity Pattern）

数据访问对象模式（Data Access Object Pattern）

前端控制器模式（Front Controller Pattern）

拦截过滤器模式（Intercepting Filter Pattern）

服务定位器模式（Service Locator Pattern）

传输对象模式（Transfer Object Pattern）