public class ArrayTest1 {

    public static void main(String[] args) {
        double[] mylist = new double[5];
        mylist[0] = 5.6;
        mylist[1] = 4.5;
        mylist[2] = 3.3;
        mylist[3] = 13.2;
        mylist[4] = 4.0;

        //计算总和
        double total  = 0;
        for (int i = 0; i < mylist.length; i++) {
            total += mylist[i];
        }
        System.out.println("total总和为：" + total);


        double[] mylist2 = {1.9, 2.9, 3.4, 3.5};
        //计算总和
        double total2 = 0;
        for (double item : mylist2) {
            total2 += item;
        }
        System.out.println("total2总和为：" + total2);
    }
}