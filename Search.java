public class Search {
    public static void main(String[] args) {
        int a[]={12,21,32,23,43,49,50,56,76,75};
        int search=50;
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==search){
                System.out.println("Element found: "+i);
                flag=true;
                break;
            }}
     if(flag==false){
        System.out.println("Element not found");
     }


    }}
