import java.util.Arrays;

public class SortsArray {

	public static void main(String[] args) {
		int[] data = { 10, 30, 50, 20, 40, 100, 90, 76, 0};

		// BubbleSort(data);
		// BubbleSortInverted(data);

		//Reverse(data);
		ReverseInverted(data);
		
		System.out.println(Arrays.toString(data));

	}

	private static int[] ReverseInverted(int[] data) {

		for (int index = data.length / 2-1; index >= 0; index--) {

			swap(data, index, data.length - 1 - index);
		}
		return data;
	}

	private static int[] Reverse(int[] data) {

		for (int index = 0; index < data.length / 2; index++) {

			swap(data, index, data.length - 1 - index);
		}
		return data;
	}

	private static int[] BubbleSort(int[] data) {
		for (int last_index = data.length - 1; last_index >= 0; last_index--) {
			for (int element_index = 0; element_index < last_index; element_index++) {
				ConditionalSwap(data, element_index);
			}
		}
		return data;
	}

	private static int[] BubbleSortInverted(int[] data) {
		for (int first_index = 0; first_index < data.length - 1; first_index++) {
			for (int element_index = first_index; element_index < data.length - 1; element_index++) {
				ConditionalSwap(data, element_index);
			}
		}
		return data;
	}

	private static int[] ConditionalSwap(int[] data, int index) {

		if (data[index] > data[index + 1]) {
			swap(data, index);
		}
		return data;

	}

	private static void swap(int[] data, int index) {
		int tmp = data[index];
		data[index] = data[index + 1];
		data[index + 1] = tmp;

	}

	private static void swap(int[] data, int index, int mirror_index) {
		int tmp = data[index];
		data[index] = data[mirror_index];
		data[mirror_index] = tmp;

	}

}
