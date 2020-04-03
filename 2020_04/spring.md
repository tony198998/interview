Bean 的生命周期概括起来就是 4 个阶段：

bean检查：设置scope：单例和原型，检查是否循环引用  
实例化（Instantiation）
属性赋值（Populate）
初始化（Initialization）：BeanPostProcessor 前置处理 ，BeanPostProcessor 后置处理，
中细节较多的便是初始化，涉及了 Aware、BeanPostProcessor、InitializingBean、init-method 的概念。
销毁（Destruction）