class Solution {
    Map<String, List<Integer>> memo = new HashMap<>();
    
    public List<Integer> diffWaysToCompute(String expression) {
        if (memo.containsKey(expression)) return memo.get(expression);

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String leftExpr = expression.substring(0, i);
                String rightExpr = expression.substring(i + 1);

                List<Integer> leftVals = diffWaysToCompute(leftExpr);
                List<Integer> rightVals = diffWaysToCompute(rightExpr);

                for (int l : leftVals) {
                    for (int r : rightVals) {
                        if (c == '+') res.add(l + r);
                        else if (c == '-') res.add(l - r);
                        else if (c == '*') res.add(l * r);
                    }
                }
            }
        }
        if (res.isEmpty()) {
            res.add(Integer.parseInt(expression));
        }

        memo.put(expression, res);
        return res;
    }

}
