import java.util.Arrays;
public class App {
	public static void main(String[] args) {
		Darray<Integer> dizi=new Darray<>();
		dizi.put(5);
		dizi.put(12);
		dizi.put(13);
		dizi.put(14);
		dizi.put(15);
		
		System.out.println(dizi.getSize());
		
	}
}
class Darray<T>{
	Object[] data;
	int size=0;
	
	public Darray() {
		data=new Object[1];
	}
	public int getSize() {
		return data.length;
	}
	public T get(int index) {
		return (T) data[index];
	}
	public void put(T var) {
		ensureCapacity(size+1);
		data[size++]=var;
	}
	private void ensureCapacity(int minCapacity) {
		int oldCapacity=getSize();
		
		if (minCapacity>oldCapacity) {
			int newCapacity=oldCapacity*2;
			
			if (minCapacity>newCapacity) {
				newCapacity=minCapacity;
			}
			
			data=Arrays.copyOf(data, newCapacity);
		}
		
	}
	
}
