# Week 07 总结

## 位运算

1. 判断整型的奇偶性: `n & 1 == 0`
2. 判断第 n 位是否设置为 1  `n & (1<<n) == 0`
3. 将第 n 位设置为 1    `x | (1<<n)`
4. 将第 n 位设置为 0   `x & ~(1<<n)`
5. 将第 n 位的值取反 `x ^ (1<<n)`
6. 将最右边的 1 设为 0  `x & (x-1)`
7. 位掩码（较常用，用途：一个人可拥有多个角色，角色与角色之间无关联）

### 面试题：
1. 老鼠试药 
2. 挨个吃枪子

## 排序算法总结
需多练，记住排序算法的时间复杂度以及逻辑

冒泡排序（稳定）	O(n)[最好]  O(n^2)[平均] O(n^2)[最坏]<br/>
直接插入（稳定）	O(n)[最好]  O(n^2)[平均]	O(n^2)[最坏]<br/>
简单选择（不稳定）	O(n^2)[最好]    O(n^2)[平均]	O(n^2)[最坏]<br/>
快速排序（不稳定）	O(n log(n))[最好]   O(n log(n))[平均]	O(n^2)[最坏]<br/>
堆排序（不稳定）	O(n log(n))[最好]	O(n log(n))[平均]	O(n log(n))[最坏]<br/>
归并排序（稳定）	O(n log(n))[最好]	O(n log(n))[平均]	O(n log(n))[最坏]	O(n)<br/>
