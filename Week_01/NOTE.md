#学习笔记
 ## 复杂度分析总结
      一 、 时间复杂度
       O(1)常数级的，和变量无关 等价于程序每次都执行固定行数的代码
       O(n)线性级的，一般是单个循环 如for,while等 
       O(logN)对数级的，典型的是排序的数组进行二分查找
       O(nlogN)常数对数级，典型的是循环里面嵌套二分查找
       O(n*2) 幂数级，一般是双层循环嵌套，而且变量是往回走的
       O(2*n) 指数级， 一般是递归
      二 、 空间复杂度
       常见的是O(1)、O(n)、O(n*2)
       
 ## 数组、链表的总结      
     一 、数组
        数组定义是：相同的数据类型，连续的存储空间，固定大小
        数组的特点： 添加O(n),如果在尾部添加是O(1)
                    查找O(n),如果知道下标是O(n)
                    删除O(n),如果是在末尾删除是O(1)
                    修改O(1)直接通过下标修改
        动态数组ArrayList: 可以进行动态扩容，每次扩展2倍
        
     二 、 链表
       定义； 是由一个个节点连接起来，不连续的，长度可以无限
       特点： 添加： O(1)头节点或知道前置节点， O(n)不知道前置节点，需要遍历
             查找： O(n),如果知道前置节点O(1)
             修改： O(n),如果知道前置节点O(1)
             删除:  O(n),如果知道前置节点O(1)
       常用LinkedList
       
 ##  队列和栈
     一 、队列 
        可以由数组实现页可以由链表实现，特点是FIFO
        
     二、栈
         可以由数组实现，也可以由链表实现 ，特点FILO
         典型的是用在括号匹配问题上
                                   
     