private static int countDivisor(int holder){
    int count = 0;
    int sqrt = (int) Math.sqrt(holder);
    for(int i = 1; i <= sqrt; i++){
        if(holder % i == 0){
            count += 2;
        }

    }
    if(sqrt * sqrt == num){
        return count;
    }
}

public static int DivisorFinder(int n){
    int i = 1;
    int triangle = 1;
    while(countDivisor(triangle) <= n){
        i++;
        triangle += 1;
    }
    return triangle;
}

public class Main {
    public static void main(String[] args){
        System.out.println(countDivisor(100) + " is  the 1st number that has 100 divisors.");
    }
}