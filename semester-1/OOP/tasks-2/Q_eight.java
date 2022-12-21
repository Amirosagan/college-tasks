public class Q_eight {
  public static void main(String[] args) {
    if(sumDigits(234) == 9)
    {
      System.out.println("test success");
    }
    else
    {
      System.out.println("test faild");
    }
  }
  public static int sumDigits(long n)
  {
    int ans = 0;
    while(n > 0)
    {
      ans += (n % 10);
      n = n /10;
    }
    return ans;
  }
}
