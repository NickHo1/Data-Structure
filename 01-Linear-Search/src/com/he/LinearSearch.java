package com.he;

public class LinearSearch<E> {
  /**
   * 私有化构造器
   */
  private LinearSearch() {
  }

  /**
   * @param array  数组
   * @param target 目标值
   * @param <E>    数组中的元素类型
   * @return 目标值在数组中的索引
   */
  public static <E> int search(E[] array, E target) {
    // 从数组的左边开始遍历
    for (int i = 0; i < array.length; i++) {
      // 如果数组中的某一个元素等于目标值
      if (array[i].equals(target)) {
        return i;
      }
    }
    // 如果数组中不存在目标值，返回 -1
    return -1;
  }
}