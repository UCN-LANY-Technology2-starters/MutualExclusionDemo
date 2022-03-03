
public class Buffer {

	private int value = 0;
	
	public int setValue(int value) throws InterruptedException {
		Thread.sleep(1000);
		if (this.value == 0) {
			this.value = value;
			return this.value;
		}
		System.out.print("Buffer full! - ");
		return 0;
	}

	public int getValue() throws InterruptedException {
		Thread.sleep(2000);
		int res = this.value;
		this.value = 0;
		if(res == 0)
			System.out.print("Buffer empty - ");
		return res;
	}

}
