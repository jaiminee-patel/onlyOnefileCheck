public class Tv {
    boolean powerStatus;
    int liveChannel;

    public Tv(boolean powerStatus, int liveChannel) {
        this.powerStatus = powerStatus;
        this.liveChannel = liveChannel;
    }
    public boolean getPowerStatus(){
       if(this.powerStatus==true)
           return true;
       else
           return false;
    }

    public void pressPowerButton(){
        if(this.getPowerStatus()==true)
            this.powerStatus=true;
        else
          this.powerStatus=false;
    }
    public void playChannel()
    {
        this.liveChannel=liveChannel;
    }
    public void printDetail(){
        System.out.println("power is "+ this.getPowerStatus() + "Channel is" +this.liveChannel);

    }
}
