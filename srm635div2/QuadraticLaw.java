public class QuadraticLaw

{
		public static void main(String args[])
		{
			System.out.println(getTime(1));
			System.out.println(getTime(2));
			System.out.println(getTime(5));
			System.out.println(getTime(6));
			System.out.println(getTime(7));
			System.out.println(getTime(1482));
			System.out.println(getTime(1000000000000000000l));
			System.out.println(getTime(31958809614643170l));
			
		}
		public static long getTime(long d)
		{
			long dis=1+4*d;
			double root_d=Math.sqrt(dis);
			double root=(root_d-1)/2.0;
			long ans=(long)Math.floor(root);
			return ans;
		}
}

