public class pratic_38 {
    public static void main(String[] args){
        int a [] = {1,1,1,1};
        System.out.println(allValueTheSame(a));
        int b [] = {83,83,83};
        System.out.println(allValueTheSame(b));
        int c [] = {0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(allValueTheSame(c));
        int d [] = {1,-234356, 1, -234356};
        System.out.println(allValueTheSame(d));
        int e [] = {0,0,0,0,-1};
        System.out.println(allValueTheSame(e));
        int f [] = {432123456};
        System.out.println(allValueTheSame(f));
        int g [] = {-432123456};
        System.out.println(allValueTheSame(g));
        int h [] = {};
        System.out.println(allValueTheSame(h));

    }
    static int allValueTheSame(int[] a){
        if(a.length<=0) return 0;
//        if(a.length==1) return 1;
        for(int i=0; i<a.length; i++){
            for(int j=1; j<a.length; j++){
                if(a[i]!=a[j]) return 0;
            }
        }
        return 1;
    }
}
