class Solution{
    public int carFleet(int target,int[] position,int[] speed){
        List<int[]> cars=new ArrayList<>();
        for(int i=0;i<position.length;i++) cars.add(new int[]{position[i],speed[i]});
        double time=0,fleetTime=0;
        int fleets=0;
        cars.sort((a,b)->Integer.compare(a[0],b[0]));
        for(int i=cars.size()-1;i>=0;i--){
            time=(double)(target-cars.get(i)[0])/cars.get(i)[1];
            if(time>fleetTime){
                fleets++;
                fleetTime=time;
            }
        }
        return fleets;
    }
}