package sortCase;

public interface LinkList<T> {
	boolean isEmpty();			// 判断线性表是否为空
	int length();				// 返回线性表长度
	T get(int i);				// 返回第i(i>0)个元素
	void set(int i,T data);		// 设置第i个元素的值为data
	void insert(int i,T data);	// 输入data作为第i个元素
	void append(T data);		// 在线性表最后输入data元素
	T remove(int i);			// 删除第i个元素并返回被删除的对象
	void removeAll();			// 删除线性表所有元素
	int search(T key);	
}
