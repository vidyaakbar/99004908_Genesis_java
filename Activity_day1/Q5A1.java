import java.util.Scanner;

class sum {

        static int sumPrimeArray(int array[],int size)
        {
            int sum=0;
			for (int i = 0; i < size; i++) 
			{
					int j = 2;
					int p = 1;
					if(array[i]==1){
						j++;
						continue;
					}                    
								  
					while (j < array[i]) 
					{					
						if (array[i] % j == 0) 
						{
							p = 0;
							break;
						}
						j++;
					}
					if (p == 1) 
					{
						sum = sum + array[i];
					}
			 
			}
			return sum;
        }

        public static void main(String args[]) 
		{

			int size;
			int arr[] = new int[100];
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter size of an array:");
			size = sc.nextInt();


			System.out.print("Enter array elements:");
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();

			}
			
		        int sumfinal=sumPrimeArray(arr,size);
                if(sumfinal==0){
			        System.out.println(0);
                    System.exit(0);
                }   


	            System.out.println("Sum of all prime numbers:" + sumfinal);
        }
}