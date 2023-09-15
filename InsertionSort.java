public class InsertionSort {
  public static void main(String[] args) {
    int[] vet = {60, 5, 3, 4, 70, 65};
    for (int i = 1; i < vet.length; i++){
      int elemesc = vet[i];
      int j = i - 1;
      while (j >= 0 && elemesc < vet[j]){
        int elemecomp = vet[j];
        vet[j + 1] = elemecomp;
        j--;
      }
      vet[j + 1] = elemesc;
    }
    for (int i = 0; i < vet.length; i++){
      System.out.println(vet[i]);
    }
  }
}