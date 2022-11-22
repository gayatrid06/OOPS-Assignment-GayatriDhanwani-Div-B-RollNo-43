public class replacementtest{
    public static void main(String[] args){
            try {
                equipment standardFuelEquipment = new stdequipment("Binnings spade","model01",2017,0.6);
                equipment standardFuelEquipments = new stdequipment("Binnings rake","model02",2019,0.3);
                
                equipment batteryPoweredEquipment = new batterypowerequipment("Havana Chain Saw","model03",2020,2);
                equipment batteryPoweredEquipments = new batterypowerequipment("Botch Mower","model04",2019,1);
                
                equipment fuelEquipment = new fuelpoweredequipment("Nikita Edge Trimmer","ewe",2021,50);
                equipment fuelEquipments = new fuelpoweredequipment("Mugdha Edge Trimmer","ewe",2021,100);
                
                standardFuelEquipment.showDetails();
                standardFuelEquipments.showDetails();
                
                batteryPoweredEquipment.showDetails();
                batteryPoweredEquipments.showDetails();
                
                fuelEquipment.showDetails();
                fuelEquipments.showDetails();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }    
    }
}