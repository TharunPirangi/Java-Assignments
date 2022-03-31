package lambdas-streams;
class Lambda {
	public static void main(String args[]){

		new Thread(new Runnable(){
		    @Override
		    public void run(){
		        System.out.println("New thread created");
		    }
		}).start();
	}
}

// with lambdas
/*
class Test
{
  public static void main(String args[])
  {
    new Thread(()->
       {System.out.println("New thread created");}).start();
  }
}
 */
