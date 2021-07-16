package chap13.ThisIsJava.practice11;

public class WaitNotifyExample2 {
    public static void main(String[] args) {
        DataBox dataBox = new DataBox();
        ProducerThread producerThread = new ProducerThread(dataBox);
        ConsumerThread consumerThread = new ConsumerThread(dataBox);

        producerThread.start();
        consumerThread.start();
    }
}

class DataBox{
    private String data;

    public synchronized String getData(){
        if(data == null){
            try{
                wait();
            } catch(InterruptedException e){}
        }
        String returnValue = data;
        System.out.println("ConsumerThread가 읽은 데이터 : " + data);
        data = null;
        notify();
        return returnValue;
    }

    public synchronized void setData(String data){
        if(this.data != null){
            try{
                wait();
            } catch(InterruptedException e){}
        }
        this.data = data;
        System.out.println("ProducerThread가 생성한 데이터 : "+data);
        notify();
    }
}

class ProducerThread extends Thread{
    private DataBox dataBox;

    public ProducerThread(DataBox dataBox){
        this.dataBox = dataBox;
    }

    @Override
    public void run(){
        String data = "DATA-";
        for(int i=0;i<3;i++){
            dataBox.setData(data+i);
        }
    }
}

class ConsumerThread extends Thread{
    private DataBox dataBox;

    public ConsumerThread(DataBox dataBox){
        this.dataBox = dataBox;
    }

    @Override
    public void run(){
        for(int i=0;i<3;i++){
            String data = dataBox.getData();
        }
    }
}