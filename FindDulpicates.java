package Week3day2;

	import java.util.LinkedHashSet;
	import java.util.Set;

	public class FindDulpicates {

		public static void main(String[] args) {
			int [] num1 = { 10, 24, 32, 64, 85, 37, 12, 10};
			Set<Integer> num2 = new LinkedHashSet<Integer>();
			boolean duplicate = false;
			int size = num1.length;
			for (int i=0; i< size ; i++)
			{
				if(num2.add(num1[i]) == false)
				{
					System.out.println("duplicate element "+ num1[i]);
					duplicate= true;
				}
			}
			System.out.println(num2);
			
			if (!duplicate) {
				
				System.out.println("All are Unique");
			}
			
			
		
			
			
			
		}

	}


