class First
{
		public static void main (String ar[])
		{
			for(i=0;i<=a.length-1;i++){
				int a1=a[i];
				int b1=a[a.length-i-1];
				a[i]=b1;
				a[a.length-i]=a1;
			}
			for(i=0;i<=a.length-1;i++){
					System.out.println(a[i]);
			}
			
		}	
}

