##1.哈希算法
>哈希表(Hash Table)也叫散列表，是根据关键码值（Key Value）而直接进行访问的数据结构。  
解决哈希冲突： 链地址法，线性探测法   
常见哈希算法：MD4,MD5，SHA-1  
线性探测：地址增量di = 1, 2, ... , m-1，其中，i为探测次数。该方法一次探测下一个地址，知道有空的地址后插入，若整个空间都找不到空余的地址，则产生溢出。  
链地址法：数组加链表，先查找索引值，再equals比较每个值  


##hashmap的多线程扩容造成链表死循环问题  
### 博客地址： https://blog.csdn.net/J080624/article/details/87923678?depth_1-utm_source=distribute.pc_relevant.none-task&utm_source=distribute.pc_relevant.none-task 
###条件1:扩容  
###条件2:多线程，rehash