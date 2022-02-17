class MyTv2{
    boolean isPowerOn;
    private int channel;
    private int volume;
    private int Prev, temp =0;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void setChannel(int ch){
        this.channel = ch;
        if(Prev == 0){setPrev(ch);}
    }
    void setVolume(int vo){this.volume = vo;}
    public int getChannel() {return channel;}
    public int getVolume() {return volume;}
    void setPrev(int pre){this.Prev = pre;}
    void gotoPrevChannel(){
        this.temp = channel;
        this.channel = Prev;
        this.Prev = temp;
    }
}

class Exerise7_10_11{
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.printf("CH : %d %n",t.getChannel());
        t.setVolume(20);
        System.out.printf("VOL : %d %n",t.getVolume());
        
        t.setChannel(10);
        System.out.printf("CH : %d %n",t.getChannel());
        t.setChannel(20);
        System.out.printf("CH : %d %n",t.getChannel());
    
    
        t.gotoPrevChannel();
        System.out.printf("CH : %d %n",t.getChannel());
        t.gotoPrevChannel();
        System.out.printf("CH : %d %n",t.getChannel());
    


    }
}