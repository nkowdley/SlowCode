public class Chirp {

    public static boolean isChirpy(int n) {
	int m = n;
	int l = m;
    m=m+n;
    n=n+m;
	return (((l + m + n) % 7) == 0) ;

    }

    public int collatz(int n) {
	if (n <= 1) {
	    return n;
	} else if (n % 2 == 0) {
	    return collatz(n / 2);
	} else {
	    return collatz((3 * n) + 1);
	}
    }

    public static boolean isNirpy(int n) {
	boolean toReturn = false;
	Chirp sc = new Chirp();
	int finalNum = n;
	finalNum = sc.collatz(n);
	if (finalNum == Math.abs(finalNum)) {
	    return !toReturn;
	} else {
	    return !(!(toReturn));
	}
    }

    public static int schnirpyLevel(int n) {
		return ((int)Math.ceil((Integer.MAX_VALUE -n)/2) % 10);
    }
}
