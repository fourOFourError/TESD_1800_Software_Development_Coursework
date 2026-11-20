// Brandon Brower
// nov 19, 2026


public class MyIntegerTest {
    public static void main(String[] args) throws Exception {
        MyInteger myInteger = new MyInteger(10);
        System.out.println("The myInteger is "+myInteger.getValue());
        System.out.println("The myInteger is even? "+myInteger.isEven());
        System.out.println("The integer 9 is even? "+MyInteger.isEven(9));
        System.out.println("The myInteger 9 is even? "+MyInteger.isEven(new MyInteger(9)));
        System.out.println("The myInteger is odd? "+myInteger.isOdd());
        System.out.println("The integer 9 is odd? "+MyInteger.isOdd(9));
        System.out.println("The myInteger 9 is odd? "+MyInteger.isOdd(new MyInteger(9)));
        System.out.println("The myInteger is prime? "+myInteger.isPrime());
        System.out.println("The integer 7 is prime? "+MyInteger.isPrime(7));
        System.out.println("The myInteger 9 is prime? "+MyInteger.isPrime(new MyInteger(9)));
        System.out.println("The myInteger equals 10? "+myInteger.equals(10));
        System.out.println("The myInteger equals the myInteger 8? "+myInteger.equals(new MyInteger(8)));
        System.out.println("The char[] '1','2','3' parsed is "+MyInteger.parseInt(new char[] {'1','2','3'}));
        System.out.println("The String \"456\" parsed is "+MyInteger.parseInt("456"));
    }
}

class MyInteger {
    int value = 0;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        if (value%2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEven(int value) {
        if (value%2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEven(MyInteger value) {
        if (value.getValue()%2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOdd() {
        if (value%2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(int value) {
        if (value%2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(MyInteger value) {
        if (value.getValue()%2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPrime() {
        for (int i = 2; i < value; i++) {
            if (value%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int value) {
        for (int i = 2; i < value; i++) {
            if (value%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(MyInteger value) {
        for (int i = 2; i < value.getValue(); i++) {
            if (value.getValue()%i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(int value) {
        if (this.value == value) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(MyInteger value) {
        if (this.value == value.getValue()) {
            return true;
        } else {
            return false;
        }
    }

    public static int parseInt(char[] value) {
        String stringValue = String.valueOf(value);
        return Integer.parseInt(stringValue);
    }

    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }
    
}