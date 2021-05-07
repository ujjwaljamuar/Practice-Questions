package Practice_Questions.TotalOccurrence;

public class Main {
    public static int findTotalOccurrence(int input1,int input2){
        int occ=0;
        for (int i=1;i<=input2;i++){
            int i1=i;

            while(i1!=0){
                int r=i1%10;
                if(r==input1)
                    occ++;
                i1/=10;
            }
        }
        System.out.println(input1+" occurs "+occ+" times between 1 and "+input2+" .");
        return occ;
    }

    public static void main(String[] args) {
        
        findTotalOccurrence(2,40);
    }
}
