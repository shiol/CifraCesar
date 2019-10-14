class Main {

  public static void main(String[] args) {

    String origin = "l gpcolop tyeprclw p rpclwxyep l";
    char texto[] = origin.toCharArray();

    for(int i = 0; i < 27; i++){
      System.out.print("key: " + i + " = ");
      for(char item : texto){
        int letra = ((int)item);
        if(letra == 32)
          letra = 32;
        else
          letra += i;
        if(letra > 122)
          letra = letra - 26;
        System.out.print((char)letra);
      }
      System.out.println("");
    }
  }
}