// q-2
import java.util.Random;

class SearchArray extends Thread
{
	static int[] arr;
	int start,end, num;
	long timeTaken;
	
	SearchArray(int start, int end, int num)
	{
        this.start=start;
        this.end=end;
        this.num=num;
	}

    void search()
	{
        long startTime=System.currentTimeMillis();
        for(int i=start;i<end;i++){
           if(arr[i]==num){
               System.out.println("Found " +num+ " at index " + i);
               break;
		   }
		}
        long endTime=System.currentTimeMillis();
        timeTaken=endTime-startTime;
	}
    
    public void run()
	{
        search();
        System.out.println("Time taken by thread for range " + start + " to " + end + ": " + timeTaken + "ms");
	}
}

class As62Test
{
    public static void main(String ar[])
	{
        int[] arr=new int[500];
        Random rand=new Random();
        
        // Fill the array with random numbers
        for(int i=0;i<500;i++){
            arr[i]=rand.nextInt(100);
		}
        int num=10;
        int numThreads=5;
        int part=500/numThreads;
        
        //Start threads
        SearchArray.arr=arr;
        Thread[] threads = new Thread[numThreads];
        
        for(int i=0;i<numThreads;i++){
            int start=i*part;
            int end=(i==numThreads-1) ? 500 : (i+1)*part;
            threads[i]=new SearchArray(start,end,num);
            threads[i].start();
		}
       
        for(int i=0;i<numThreads;i++){
            try{
                threads[i].join();
			}catch(InterruptedException e){
                System.out.println(e);
			}
		}
        System.out.println("Search completed.");
	}
}	