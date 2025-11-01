public class Main {
    private static int countDivisor(int holder){
    int count = 0;
    int sqrt = (int) Math.sqrt(holder);
    for(int i = 1; i <= sqrt; i++){
        if(holder % i == 0){
            count += 2;
        }

    }
    if(sqrt * sqrt == holder){
        count--;
    }
    return count;
}

public static int DivisorFinder(int n){
    int i = 1;
    int triangle = 1;
    while(countDivisor(triangle) <= n){
        i++;
        triangle += i;
    }
    return triangle;
}

    public static void main(String[] args){

        int n = 100;
        int result = DivisorFinder(n);
        System.out.println(result + " is  the 1st number that has 100 divisors.");
    }
}