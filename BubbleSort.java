public class BubbleSort{
  public static void main(String[] args) {
  int[] vet = {1,10,7,6,-3,5,2,-1};
  int aux = 0;

  for (int i = 0; i < vet.length; i++)
  {
    for (int j = i + 1; j < vet.length; j++)
    {
      if (vet[j] < vet[i]){
        aux = vet[j];
        vet[j] = vet[i];
        vet[i] = aux;
      }
    }
    System.out.println(vet[i]);
  }
  }
}