学习笔记

# 递归模板

```java
// Java
public void recur(int level, int param) { 
  // terminator 
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process current logic 
  process(level, param); 
  // drill down 
  recur( level: level + 1, newParam); 
  // restore current status 
 
}
```

1.避免人肉递归

2.找到最近最简方法，将其拆解成可重 复解决的问题

3.数学归纳法思维

## 关键点

1.动态规划 和 递归或者分治 没有根本上的区别（关键看有无最优的子结构）

2.共性：找到重复子问题

3.差异性：动态规划 有最优子结构、中途可以淘汰次优解