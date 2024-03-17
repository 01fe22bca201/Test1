public class Extended extends student {
    void course(){
        String[] subjects={"c==","ml","c#","hello"};
        int[][] marks={{50,80,20}
        };
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                if(marks[i][j]<40){
                    System.out.println("marks less than 40"+subjects[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Extended e= new Extended();
        e.stud_details();
        e.course();
    }
    
}
