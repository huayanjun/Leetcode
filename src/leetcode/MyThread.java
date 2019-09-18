package leetcode;

/**
 * @Author :huayanjun
 * @Data: 2019/8/29 17:10
 */
public class MyThread implements Runnable {

    int n;

    public MyThread(int n){
        this.n=n;
    }
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println(Thread.currentThread().getName()+"----"+"i="+i+";n="+n);
            n++;
        }

    }
}
