class A
{
        public static int maxGamesbyWinner(int N)
        {
            int dp[]=new int[N];

            dp[0]=1;
            dp[1]=2;

            int i=2;
            do
            {
                dp[i]=dp[i-1]+dp[i-2];
            }while(dp[i++]<N);

            return i-2;
        }
        public static void main(String args[])
        {
                int N=10;
                System.out.println(maxGamesbyWinner(N));
        }
}

