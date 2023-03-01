import java.util.*;

public class JobSequence {

    static class Job{
        int deadLine;
        int profit;
        int id;

        public Job(int i,int p,int d){
            deadLine=d;
            profit=p;
            id=i;
        }
    }
    public static void main(String[] args) {
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs=new ArrayList<>();

        for(int i=0;i<jobInfo.length;i++){
            jobs.add(new Job(i, jobInfo[i][1], jobInfo[i][0]));
        }
        //descending order of profit
        Collections.sort(jobs, (obj1,obj2) ->obj2.profit-obj1.profit);

        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadLine>time){
                seq.add(curr.id);
                time++;

            }
        }

        //print seq
        System.out.println("max jobs = "+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}
