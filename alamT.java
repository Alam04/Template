/*
 --> Vegeta
 --> Until I found you 
 --> Hey Buddy "Light Weight"
 --> Malika-E-Alam
 --> I Was Born Mage; Demacia Made Me A Criminal
*/
import java.util.*;
//import java.lang.*;
import java.io.*;

/* 
 * --> n-1 | n = n;
 * --> n-1 ^ n = 1;
 * --> 2^n hota hai if number of subsequence nikali ho kisi bhi string ki in which all are distinict element
 */
public class alamT
{
	
	static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}
	/*
	-->
	-->
	-->
	-->
	-->
	-->
	-->
	--> sort Array                      [O'nlogn]
	--> isPrime                         [prime or not]
	--> gcd                             [greatest common divisor]
	--> power                           [power applied]
	--> swapS                           [ string char swap ]
	*/
    private long MOD = 1_000_000_007;
    public static void main (String[] args) throws java.lang.Exception
    {
        FastReader sc = new FastReader();
        FastWriter out = new FastWriter();
        int test = sc.nextInt();
        while(test-->0)
        {
            //long n = sc.nextLong();
            //long m = sc.nextLong();
            //int n = sc.nextInt();
            //int m = sc.nextInt();
            /*
            int arr[] = new int[n];
            for (int i=0;i<n ;i++ )
            {
                arr[i]= sc.nextInt();
            }
            */
            
            
            
            out.println("");
           
        }
        
        out.close();
    }
    /*
	-->
	-->
	-->
	-->totient
	-->findDiv
	-->
	-->
	-->
	-->
	-->
	-->
	-->
	*/
    public static void sort(int[] arr)
    {
        //because Arrays.sort() uses quicksort which is dumb
        //Collections.sort() uses merge sort
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for(int x: arr)
            ls.add(x);
        Collections.sort(ls);
        for(int i=0; i < arr.length; i++)
            arr[i] = ls.get(i);
    }
    public static boolean isPrime(long n)
    {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        return true;
    }
    public static long gcd(long a, long b)
    {
        if(a > b)
            a = (a+b)-(b=a);
        if(a == 0L)
            return b;
        return gcd(b%a, a);
    }
    public static long totient(long n)
    {
        long result = n;
        for (int p = 2; p*p <= n; ++p)
            if (n % p == 0)
            {
                while(n%p == 0)
                    n /= p;
                result -= result/p;
            }
        if (n > 1)
            result -= result/n;
        return result;
        /*
        find phi(i) from 1 to N fast
        O(N*loglogN)
        long[] arr = new long[N+1];
        for(int i=1; i <= N; i++)
            arr[i] = i;
        for(int v=2; v <= N; v++)
            if(arr[v] == v)
                for(int a=v; a <= N; a+=v)
                    arr[a] -= arr[a]/v;
         */
    }
    public static ArrayList<Integer> findDiv(int N)
    {
        //gens all divisors of N
        ArrayList<Integer> ls1 = new ArrayList<Integer>();
        ArrayList<Integer> ls2 = new ArrayList<Integer>();
        for(int i=1; i <= (int)(Math.sqrt(N)+0.00000001); i++)
            if(N%i == 0)
            {
                ls1.add(i);
                ls2.add(N/i);
            }
        Collections.reverse(ls2);
        for(int b: ls2)
            if(b != ls1.get(ls1.size()-1))
                ls1.add(b);
        return ls1;
    }
    public static long power(long x, long y, long p)
    {
        //0^0 = 1
        long res = 1L;
        x = x%p;
        while(y > 0)
        {
            if((y&1)==1)
                res = (res*x)%p;
            y >>= 1;
            x = (x*x)%p;
        }
        return res;
    }
    public static String swapS(String s, int i, int j)
    {
        char temp;
        char[] strArray = s.toCharArray();
        temp = strArray[i] ;
        strArray[i] = strArray[j];
        strArray[j] = temp;
        return String.valueOf(strArray);
    }
    
}