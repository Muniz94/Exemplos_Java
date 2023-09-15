  public class selection {
  public static void main(String[] args) {
    int[] array = {25,12,34,11,22,64,90};
  for (int i = 0; i < array.length; i++) {
    int min = array[i];
    int minId = i;
    for (int j = i+1; j < array.length; j++) {
      System.out.printf("%d ", array[j]);
        if (array[j] < min) {
            min = array[j];
            minId = j;
        }
    }
    int temp = array[i];
    array[i] = min;
    array[minId] = temp;
  }
  for (int i = 0; i < array.length; i++)
    System.out.printf("%d ", array[i]);
}
}

