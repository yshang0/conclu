//551_Nested_List_Weight_Sum

public int depthSum(List<NestedInteger> nestedList) {
    int result = 0;
    result = helper (nestedList, 1);
    return result;
}
private int helper (List<NestedInteger> list, int level) {
    int result = 0;
    
    for (NestedInteger o : list) {
        if (o.isInteger()) {
            result += o.getInteger() * level;
        } else {
            result += helper (o.getList(), level + 1);
        }
    }
    return result;
}