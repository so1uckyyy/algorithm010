学习笔记

1.递归模板

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

2.reverse state 回溯

3.回溯是一种思想，本质上是枚举，递归是一种算法的实现方式

4.寻找问题的共同点，类似于做数学归纳法