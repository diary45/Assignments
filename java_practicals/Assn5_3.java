public class Assn5_3 {

    public static void main(String[] args) {
        String arr[]={"hello","my","wish","is","command"};

        Assn5_3 o=new Assn5_3();
        for(var arri:arr)
        System.out.print(arri+" ");
        o.swap(arr,2,4);
        System.out.println();
        for(var arri:arr)
        System.out.print(arri+" ");



    }
    public <T> void swap(T arr[],int ind1,int ind2){
        T temp;
        temp =arr[ind2];
        arr[ind2]=arr[ind1];
        arr[ind1]=temp;
    }
}
