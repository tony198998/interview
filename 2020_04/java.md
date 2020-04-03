JUnit4使用Java5中的注解（annotation），以下是JUnit4常用的几个annotation：
@Before：初始化方法 对于每一个测试方法都要执行一次（注意与BeforeClass区别，后者是对于所有方法执行一次）
@After：释放资源 对于每一个测试方法都要执行一次（注意与AfterClass区别，后者是对于所有方法执行一次）
@Test：测试方法，在这里可以测试期望异常和超时时间
@Test(expected=ArithmeticException.class)检查被测方法是否抛出ArithmeticException异常
@Ignore：忽略的测试方法
@BeforeClass：针对所有测试，只执行一次，且必须为static void
@AfterClass：针对所有测试，只执行一次，且必须为static void

一个JUnit4的单元测试用例执行顺序为：
@BeforeClass -> @Before -> @Test -> @After -> @AfterClass;

每一个测试方法的调用顺序为：
@Before -> @Test -> @After;


2、java中IO流和NIO（非阻塞IO）
IO流：要等所有流数据全部读取完毕后，才能执行后续操作
NIO：无需等待流读完，流放在一个缓冲区中， Java NIO的非阻塞模式，
使一个线程从某通道发送请求读取数据，但是它仅能得到目前可用的数据，
如果目前没有数据可用时，就什么都不会获取。而不是保持线程阻塞，
所以直至数据变的可以读取之前，该线程可以继续做其他的事情。 
非阻塞写也是如此。一个线程请求写入一些数据到某通道，但不需要等待它完全写入，
这个线程同时可以去做别的事情。 线程通常将非阻塞IO的空闲时间用于在其它通道
上执行IO操作，所以一个单独的线程现在可以管理多个输入和输出通道（channel）。