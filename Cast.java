class Cast {
  public static void main(String[] args) {
    int price = Integer.parseInt(args[0]);
    double rate = 0.08;
    int amount;

    amount = (int) (price * (1 + rate)); // (int)は小数点を切り捨てるための記述
    System.out.println("税込金額:" + amount + "円");
  }
}