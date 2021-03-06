/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pbo;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * Kelas    : IF-1
 * NIM      : 10119036
 * Deskripsi Program :
 */

    public class ServicePrice implements ServiceItem{
    private float priceService, discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }

    public void displayService(){
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#******Service List*******#");
        System.out.println("1. Haircut : "+String.valueOf(getPrice(1)).replaceAll("0.", "")+"k");
        System.out.println("2. Haircut + Hairwas : "+String.valueOf(getPrice(2)).replaceAll("0.", "")+"k");
        System.out.println("3. Hairwas Only : "+String.valueOf(getPrice(3)).replaceAll("0.", "")+"k");
        System.out.println("#*************************#");
        System.out.print("Choose (1/2/3) : ");
    }

    @Override
    public float getPrice(int serviceItem) {
        float price = 0;
        switch (serviceItem){
            case 1 : price = 45000f;
            break;
            case 2 : price = 55000f;
            break;
            case 3 : price = 15000f;
        }
        return price;
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        return statusMember.equals("YES");
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        return discount = isMember ? (float) (0.1 * parServicePrice) : 0;
    }

    public float getTotalPay(float priceService, float discount){
        return priceService - discount;
    }
}
