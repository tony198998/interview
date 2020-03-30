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

###计算机中磁盘存储数据最小单元是扇区，一个扇区的大小是 512 字节   
### 而文件系统（例如XFS/EXT4）他的最小单元是块，一个块的大小是 4k   
### 我们的 InnoDB 存储引擎也有自己的最小储存单元——页（Page），一个页的大小是 16K。

##![Image text](2020_04/innodb底层存储.png)

###innodb:数据存储由索引页和数据页组成，数据页存放具体的数据，一个页能存放16k数据，假设一条数据1k，就能存放16条数据，  
索引页由：键值+指针组成（指针指向具体的页）  
查找时，先找索引页，二分查找找到键值，对应的根页找到，在根页中，通过2分查找，找出具体的值； 
InnoDB 存储引擎的最小存储单元是页，页可以用于存放数据也可以用于存放键值 + 指针，在 B+ 树中叶子节点存放数据，非叶子节点存放键值 + 指针。
索引组织表通过非叶子节点的二分查找法以及指针确定数据在哪个页中，进而在去数据页中查找到需要的数据；

####jdk1.7 
hashMap：数组+链表（头插法），String,Integer都是final类，保证hashcode不变；  
currentHashMap：16段segment,每个segment继承了ReentrantLock(粗粒度下性能好)，每个segment下是entry数组加链表   


####jdk1.7 
hashMap：node数组，转为红黑树treeNode，数组+链表（尾插法），String,Integer都是final类，保证hashcode不变；  
链表长度 > 8,转为红黑树（平衡2叉树）,<6的话，转为链表，中间有个7，避免频繁转换，   

currentHashMap：数组+链表， 数组由synchronized （细粒度下性能不比ReentrantLock差），
链表长度 > 8,转为红黑树（平衡2叉树）,<6的话，转为链表，中间有个7，避免频繁转换， 