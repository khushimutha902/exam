public class java{
    public void main(String[] args){
        int a=5;
        int b=6;
        System.out.println(a+b)
    }
}



































			

			// Final step: Print results when simulation is over
			List<Cloudlet> newList = broker.getCloudletReceivedList();

			CloudSim.stopSimulation();
			printCloudletList(newList);
			Log.printLine("CloudSimExample6 finished!");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			Log.printLine("The simulation has been terminated due to an unexpected error");
		}
	}

