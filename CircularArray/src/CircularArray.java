import java.util.Iterator;

/*
Circular Array: Implement a CircularArray class that supports an array-like data structure which can be efficiently rotated. 
If possible, the class should use a generic type (also called a template), and should support iteration via the standard for 
(Obj o : circularArray) notation.
*/
public class CircularArray<T> implements Iterable<T> {
	private int head;
	private int cur;
	private int size;
	private Object[] data;

	public CircularArray(int size) {
		this.head = 0;
		this.size = size;
		this.data = new Object[size];
	}

	public CircularArray(T[] data) {
		this.head = 0;
		this.size = data.length;
		this.data = data;
	}

	@SuppressWarnings("unchecked")
	public T get(int i) {
		return (T) data[(i + head) % size];
	}

	public void set(int i, Object o) {
		data[(i + head) % size] = o;
	}

	public void rotate(int i) {
		head += i;
		head %= size;
		if (head<0) {
			head = size+head;
		}
		cur = 0;
	}
	
	public int length() {
		return size;
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			@Override
			public boolean hasNext() {
				if (cur!=0 && (cur+head)%size==head) {
					cur = 0;
					return false;
				}
				return true;
			}

			@Override
			public T next() {
				if (hasNext()) {
					return get(cur++);
				}
				return null;
			}
		};
	}
}