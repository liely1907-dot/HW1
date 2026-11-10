public class Assignment01Q03 {
    public static void main(String[] args){
        int p1 = 1, p2 = 1;
        int in = Integer.parseInt(args[0]);
        int count = 2, count_odd = 2;
        String res = "1 1";
        int fib = p1 + p2;
        while (count < in){
            res += " " + fib;
            count++;
            p1 = p2;
            p2 = fib;
            if (fib % 2 == 1){
                count_odd++;
            }
            fib = p1 + p2;
            
        }
        System.out.println("The first " + args[0] + " Fibonacci numbers are:");
        System.out.println(res);
        System.out.println("The number of odd numbers is: " + count_odd);
        
    }
}
