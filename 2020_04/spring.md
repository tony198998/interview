Bean 的生命周期概括起来就是 4 个阶段：

bean检查：设置scope：单例和原型，检查是否循环引用  
实例化（Instantiation）
属性赋值（Populate）
初始化（Initialization）：BeanPostProcessor 前置处理 ，BeanPostProcessor 后置处理，
中细节较多的便是初始化，涉及了 Aware、BeanPostProcessor、InitializingBean、init-method 的概念。
销毁（Destruction）

面试必备-Spring中Bean的加载到销毁（生命周期）
Spring对Bean的生命周期进行管理的过程
1. 通过构造器或工厂方法创建Bean实例
2. 为Bean设置属性值和对其他Bean的引用
3. 如果实现BeanNameAware接口，则执行其setBeanName()方法，可通过该方法获取为该Bean设置的id或者name。
4. 如果实现BeanFactoryAware接口，则执行其setBeanFactory()方法，可通过该方法获取管理该Bean的BeanFactory。
5. 如果实现ApplicationContextAware接口，则执行其setApplicationContext()方法，可通过该方法获取管理该Bean的ApplicationContext。
6. 如果关联了processor，将Bean实例传递给后置处理器BeanPostProcessor的postProcessBeforeInitialization方法。
7. 调用 Bean的初始化方法
8. 如果实现InitializingBean接口，则执行其afterPropertiesSet()方法。
9. 如果关联了processor，将Bean实例传递给后置处理器BeanPostProcessor的postProcessAfterInitialization方法。
10. 当容器关闭时，调用Bean的销毀方法
