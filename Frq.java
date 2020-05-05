public class Frq{
    public static void main(String[] args) {
        int[] itemsSold = {48,50,37,62,38,70,55,37,64,60};
        double[] wages = new double[itemsSold.length];
        System.out.println(computeBonusThreshold(itemsSold));
        computeWages(10, 1.5, itemsSold, wages);
        for(double d : wages){
            System.out.println(d);
        }
    
    }
    public static double computeBonusThreshold(int[] itemsSold){
        int lowSale = itemsSold[0];
        int highSale = itemsSold[0];
        int sum = 0;
        for(int i : itemsSold){
            if(i<lowSale){
                lowSale = i;
            }
        }
        for(int i : itemsSold){
            if(i>highSale){
                highSale = i;
            }
        }
        for(int i : itemsSold){
            sum += i;
        }
        System.out.println(sum + " " + lowSale + " " + highSale);
        return (sum - lowSale - highSale)/((double)(itemsSold.length-2));
    }
 
    public static void computeWages(double fixedWage, double perItemWage, int[]itemsSold, double[] wages){
        for(int i=0; i<itemsSold.length; i++){
            if(itemsSold[i] > computeBonusThreshold(itemsSold)){
                wages[i] = (fixedWage + perItemWage * itemsSold[i]) * 1.1;
            }else{
                wages[i] = fixedWage + perItemWage * itemsSold[i];
            }
        }
    }
    
}
