package Array;

public class Find_Second_highest_lowest {

static	String[] players= {"santhiya","mano","benson","murali","sathish","dhanraj"};
static	float[] time= {25.2f,23.6f,28.7f,19.2f,16.5f,30.5f};
	public static void main(String[] args) {
		float temp = 0;
		String temp1;
		for (int i = 0; i < time.length; i++) {
			for (int j = i + 1; j < time.length; j++) {
				if (time[i] > time[j]) {
					temp = time[i];
					temp1=players[i];
					time[i] = time[j];
					players[i]=players[j];
					time[j] = temp;
					players[j]=temp1;
				}
			}
		}
		for(int i=0;i<time.length;i++) {
		System.out.println("Rank"+(i+1)+":  "+players[i]+" "+time[i]);
		temp++;
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	for(String players1:players) {
			System.out.print(players1+" ");
		}
		System.out.println();
		for(float time1:time) {
			System.out.print(time1+"    ");
		}
		}*/
	/*static float first_rank;
	static float last_rank;
	

	public static void main(String[] args) {
		Find_Second_highest_lowest obj = new Find_Second_highest_lowest();
		first_rank=obj.First_Rank();
		obj.second_rank(); 
		 last_rank=obj.Last_Rank();
		 obj.Second_from_Last_Rank();
	}

	private void Second_from_Last_Rank() {
		float high=0;
		int no_of_person =0;
		 for(int i=0;i<time.length;i++) {
			 if(time[i]>high) {
				 if(last_rank==time[i]) {
					 continue;
				 }
				 else {
				 high=time[i];
				 no_of_person=i;
				 }
			 }
		 }
		 System.out.println("Second From Last Rank");
		 System.out.println(players[no_of_person]);
		 System.out.println(time[no_of_person]);
		 System.out.println();
	
		
	}

	private void second_rank() {
		float low=Float.MAX_VALUE;
		int no_of_person=0;
	 for(int i=0;i<time.length;i++) {
		 if(time[i]<low) {
			 if(first_rank==time[i]) {
				
			 }else {
			 low=time[i];
			 no_of_person=i;
		 }
			 }
	 }
	 System.out.println("Second Rank : ");
	 System.out.println(players[no_of_person]);
	 System.out.println(time[no_of_person]);
	 System.out.println();
		
	}

	private float Last_Rank() {
		float high=0;
		int no_of_person =0;
		 for(int i=0;i<time.length;i++) {
			 if(time[i]>high) {
				 high=time[i];
				 no_of_person=i;
			 }
		 }
		 System.out.println("Last Rank");
		 System.out.println(players[no_of_person]);
		 System.out.println(time[no_of_person]);
		 System.out.println();
		 return time[no_of_person];
	}

	private float First_Rank() {
				//Task1 --->  Get 1st rank ---Name ans time
		float low=Float.MAX_VALUE;
		int no_of_person=0;
	 for(int i=0;i<time.length;i++) {
		 if(time[i]<low) {
			 low=time[i];
			 no_of_person=i;
		 }
	 }
	 System.out.println("First Rank : ");
	 System.out.println(players[no_of_person]);
	 System.out.println(time[no_of_person]);
	 System.out.println();
		return time[no_of_person];
	}*/

	/*static String  players[]= {"Santhiya","Mano","Benson","Murali","Sathish","Dhanraj"};
    static float time[]= {25.2f,23.6f,28.4f,19.2f,16.5f,30.3f};
    String namecheck;
    int no_of_person=0,no=0;
    float sec,high=0;
	float low=Integer.MAX_VALUE;

			public static void main(String[] args) {
			  
				Find_Second_highest_lowest AP=new Find_Second_highest_lowest();
			  AP.First_Rank(players, time);
			  AP.Last_Rank(players,time);
			  AP.Second_Rank(players,time);
			  AP.Second_From_Last(players,time);
			}
			public void Second_From_Last(String[] players, float[] time) {
			  // TODO Auto-generated method stub
			  low=sec=Float.MIN_VALUE;
			  for(int i=0;i<time.length;i++)
			  {
			    if(time[i]>low)
			    {
			      sec=low;
			      no=no_of_person;
			      low=time[i];
			      no_of_person=i;
			      
			      //System.out.println(low+"\t "+sec+"\t "+  no_of_person);
			    }
			    else if(time[i]>sec&&time[i]!=low)
			    {
			      sec=time[i];
			      no=i;
			    }
			    namecheck=players[no];
			  }
			  
			  System.out.println("Second Rank From Last   : "+ sec+" Name Of The Person  : "+namecheck );
			}

			public void Second_Rank(String[] players, float[] time) {
			  
			  low=sec=Float.MAX_VALUE;
			  for(int i=0;i<time.length;i++)
			  {
			    if(time[i]<low)
			    {
			      sec=low;
			      no=no_of_person;
			      low=time[i];
			      no_of_person=i;
			      
			      //System.out.println(low+"\t "+sec+"\t "+  no_of_person);
			    }
			    namecheck=players[no];
			  }
			  
			  System.out.println("Second Rank             : "+ sec+" Name Of The Person  : "+namecheck );
			}
			public void Last_Rank(String players[],float time[])
			{
			  String namecheck = null;
			    int no_of_person=0;
			    float high=0;
			  for(int i=0;i<time.length;i++)
			  {
			    if(time[i]>high)
			    {
			      high= time[i];
			      no_of_person=i;  
			    }  
			    namecheck=players[no_of_person];
			    
			  }
			  System.out.println("Last Rank               : "+high+"  Name Of The Person : "+namecheck);

			}
			public void First_Rank(String players[],float time[])
			{ 
			  String namecheck;
			    int no_of_person=0;
			     float low=Integer.MAX_VALUE;
			  for(int i=0;i<time.length;i++)
			  {
			    
			    if(time[i]<low)
			    {
			      low=time[i];
			      no_of_person=i;
			    }
			  }
			  
			  namecheck=players[no_of_person];
			  
			  System.out.println("First Rank              : "+low+" Name of The Person  : "+namecheck);  
			}*/
	


			}
			