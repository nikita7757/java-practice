package If_Else_Basic;
 //Writw a java program t0 calculate the profit or loss
 // input= selling price =1200
 //        cost price= 1000
 // *******************************************************************************

 class Program7 {
    public static void main(String [] args){
        int selling_price = 1200;
        int cost_price = 1000;
        if(selling_price > cost_price){
            System.out.println("profit is = "+ (selling_price - cost_price));
        }
        if(selling_price < cost_price){
            System.out.println("loss is = "+ (cost_price-selling_price));
        }
    }
    
}
