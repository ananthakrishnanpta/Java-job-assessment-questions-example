//Problem statement:
//For any array, return the minimum number of elements to be removed so that no sequence of 3 consecutive numbers is increasing or decreasing:
// For example, for array {1,2,4,1,2}. the sequence 1,2,4 is increasing. Removing 4 is the minimum no. of changes required so that no set of
//3 consecutive numbers in the array is increasing or decreasing. thereby making it {1,2,1,2}

class Main

{
    static int solve(int ar[])

    {
        int n = ar.length;
        if (n <= 2)
            return 0;

        int count = 0;
        for (int i = 0; i < n - 2; i++)
        {

            if ((ar[i] < ar[i + 1] && ar[i + 1] < ar[i + 2]) || (ar[i] > ar[i + 1] && ar[i + 1] > ar[i + 2]))
                count++;
        }

        return count;
    }

// Testing...
    public static void main (String[] args)
    {
        int r[] = { 1,2,4,1,2 };

        System.out.println(solve(r));
    }
}
