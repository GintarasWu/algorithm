package com.wujinhua.algorithm.dynamic_array;

/**
 * 自定义一个动态数组，可以实现JDK中ArrayList的功能
 *
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/6/10 23:16
 */
public class ArrayList {
    /**
     * 数组的数量
     */
    private int size;

    /**
     * 数组的全部元素
     */
    private int[] elements;

    /**
     * 数组的默认长度为10
     */
    private final static int DEFAULT_SIZE = 10;

    /**
     * 没有找到元素
     */
    private final static int ELEMENT_NOT_FOUNT = -1;

    public ArrayList(int capacity) {
        capacity = capacity <= DEFAULT_SIZE ? DEFAULT_SIZE : capacity;
        elements = new int[capacity];
    }

    public ArrayList() {
        this(DEFAULT_SIZE);
    }

    /**
     * 清除所有元素
     */
    public void clear() {

    }

    /**
     * 数组的数量
     *
     * @return 返回结果
     */
    public int size() {
        return size;
    }

    /**
     * 是否为空
     *
     * @return true表示空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 是否包含某个元素
     *
     * @param element 需要判断的元素值
     * @return true:表示包含
     */
    public boolean contains(int element) {
        return indexOf(element) != ELEMENT_NOT_FOUNT;
    }

    /**
     * 添加元素到尾部
     *
     * @param element 需要添加的元素
     */
    public void add(int element) {

    }

    /**
     * 在index位置添加元素
     *
     * @param index   索引
     * @param element 需要添加的元素
     */
    public void add(int index, int element) {

    }

    /**
     * 获取索引index位置的元素
     *
     * @param index 索引
     * @return 返回该索引对应的值
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index out of bound exception, index: " + index + " , size: " + size);
        }
        return elements[index];
    }

    /**
     * 设置index位置的元素
     *
     * @param index   索引位置
     * @param element 元素的值
     * @return 返回旧元素的值
     */
    public int set(int index, int element) {
        int old = get(index);
        elements[index] = element;
        return old;
    }

    /**
     * 删除index位置上的元素
     *
     * @param index 索引
     * @return 返回删除的值
     */
    public int remove(int index) {
        return 0;
    }

    /**
     * 查询元素的索引
     *
     * @param element 需要查询的元素
     * @return 返回索引, 不存在返回-1
     */
    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return i;
            }
        }
        return ELEMENT_NOT_FOUNT;
    }
}
