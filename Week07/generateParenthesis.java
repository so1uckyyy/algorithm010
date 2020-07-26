//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。 
//
// 
//
// 示例： 
//
// 输入：n = 3
//输出：[
//       "((()))",
//       "(()())",
//       "(())()",
//       "()(())",
//       "()()()"
//     ]
// 
// Related Topics 字符串 回溯算法


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrace(ans,new StringBuilder(),0,0,n);
        return ans;
    }

    public void backtrace(List<String> ans,StringBuilder cur,int open,int close,int max){
        if (cur.length() == max * 2){
            ans.add(cur.toString());
            return;
        }

        if(open < max){
            cur.append('(');
            backtrace(ans,cur,open + 1,close,max);
            cur.deleteCharAt(cur.length() - 1);
        }
        if (close < open){
            cur.append(')');
            backtrace(ans, cur, open, close + 1, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
