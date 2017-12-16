package listLink;

import assgn.Customer;
import assgn.Delivery;
import assgn.DeliveryMen;
import assgn.JianKai.MenuClass;
import assgn.JianKai.aff;
import assgn.Menu;

/**
 *
 * @author Student
 */
public class store {
    
    ListLinkInt<student> stud = new ListLink<>();
    ListLinkInt<aff> aff = new ListLink<>();
    ListLinkInt<DeliveryMen> delMen = new ListLink<>();
    ListLinkInt<MenuClass> menu = new ListLink<>();
    ListLinkInt<Customer> customer = new ListLink<>();
    ListLinkInt<Delivery> del = new ListLink<>();
    
    // keep track user
    Customer curCus = null;
    aff curAff = null;
    DeliveryMen curDelMen = null;
    
    public store(){}
    
    public store(int i){
        DeliveryMen d1 = new DeliveryMen("Nicholas","666","192","Somewhere","01234567",123.00);
        DeliveryMen d2 = new DeliveryMen("Soon Jian Kai","456","999","No where","01899997",223.00);
        DeliveryMen d3 = new DeliveryMen("Ng Poh Hooi","555","456","LoL","01934567",323.00);
        DeliveryMen d4 = new DeliveryMen("Ong Kai Zhi","777","789","Wonder Land","01134567",423.00);
        
        Customer c = new Customer("Name", "HOO LAND", "012378999","email","hello");
        Customer c1 = new Customer("Name1", "no MAN LAND", "014378999","email1","hello1");

        MenuClass mc1 = new MenuClass("F1","asd","asd","asd","11","Available");
        MenuClass mc2 = new MenuClass("F2","asdas","asasd","assd","1111","Available");
        MenuClass mc3 = new MenuClass("F3","asxzd","asxd","axsd","11x","Available");
        MenuClass mc4 = new MenuClass("F4","axsd","asxd","axsd","121","Available");
        menu.add(mc1);
        menu.add(mc2);
        menu.add(mc3);
        menu.add(mc4);
        
        delMen.add(d1);
        delMen.add(d2);
        delMen.add(d3);
        delMen.add(d4);

        customer.add(c);
        customer.add(c1);
    }
    
    public void findAff(String email, String pass){
        
        for(int i = 0;i< aff.getSize();i++)
            if(aff.get(i).getEmail().equals(email) && aff.get(i).getPassword().equals(pass)){
                curAff = aff.get(i);
                break;
            }
        
    }
    
    
    public int determineUser(){
        
        if(curAff != null)
            return 1;
        else if(curCus!= null)
            return 2;
        else if(curDelMen!=null)
            return 3;
        
        return 0;
    }
    

    public ListLinkInt<student> getStud() {
        return stud;
    }

    public void setStud(ListLinkInt<student> stud) {
        this.stud = stud;
    }

    public ListLinkInt<aff> getAff() {
        return aff;
    }

    public void setAff(ListLinkInt<aff> aff) {
        this.aff = aff;
    }

    public ListLinkInt<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(ListLinkInt<Customer> customer) {
        this.customer = customer;
    }

    public ListLinkInt<DeliveryMen> getDelMen() {
        return delMen;
    }

    public void setDelMen(ListLinkInt<DeliveryMen> delMen) {
        this.delMen = delMen;
    }

    public ListLinkInt<MenuClass> getMenu() {
        return menu;
    }

    public void setMenu(ListLinkInt<MenuClass> menu) {
        this.menu = menu;
    }

    public ListLinkInt<Delivery> getDel() {
        return del;
    }

    public void setDel(ListLinkInt<Delivery> del) {
        this.del = del;
    }
}
