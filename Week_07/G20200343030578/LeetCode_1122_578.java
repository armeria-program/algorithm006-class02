//给你两个数组，arr1 和 arr2，
//
//
// arr2 中的元素各不相同
// arr2 中的每个元素都出现在 arr1 中
//
//
// 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末
//尾。
//
//
//
// 示例：
//
// 输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
//输出：[2,2,2,1,4,3,3,9,6,7,19]
//
//
//
//
// 提示：
//
//
// arr1.length, arr2.length <= 1000
// 0 <= arr1[i], arr2[i] <= 1000
// arr2 中的元素 arr2[i] 各不相同
// arr2 中的每个元素 arr2[i] 都出现在 arr1 中
//
// Related Topics 排序 数组


import java.util.Arrays;
import java.util.HashMap;

class Solution1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int value : arr2) {
            map.put(value, 0);
        }

        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])){
                map.put(arr1[i], map.get(arr1[i]) + 1);
                arr1[i] = -1;
            }
        }
        Arrays.sort(arr1);

        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            int len = map.get(arr2[i]);
            for (int j = 0; j < len; j++) {
                arr1[k++] = arr2[i];
            }
        }

        return arr1;
    }
}